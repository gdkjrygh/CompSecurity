// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.math.ec;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.math.ec:
//            ECFieldElement, IntArray

public static class <init> extends ECFieldElement
{

    public static final int GNB = 1;
    public static final int PPB = 3;
    public static final int TPB = 2;
    private int k1;
    private int k2;
    private int k3;
    private int m;
    private int representation;
    private int t;
    private IntArray x;

    public static void checkFieldElements(ECFieldElement ecfieldelement, ECFieldElement ecfieldelement1)
    {
        if (!(ecfieldelement instanceof <init>) || !(ecfieldelement1 instanceof <init>))
        {
            throw new IllegalArgumentException("Field elements are not both instances of ECFieldElement.F2m");
        }
        ecfieldelement = (<init>)ecfieldelement;
        ecfieldelement1 = (<init>)ecfieldelement1;
        if (((<init>) (ecfieldelement)).m != ((m) (ecfieldelement1)).m || ((m) (ecfieldelement)).k1 != ((k1) (ecfieldelement1)).k1 || ((k1) (ecfieldelement)).k2 != ((k2) (ecfieldelement1)).k2 || ((k2) (ecfieldelement)).k3 != ((k3) (ecfieldelement1)).k3)
        {
            throw new IllegalArgumentException("Field elements are not elements of the same field F2m");
        }
        if (((k3) (ecfieldelement)).representation != ((representation) (ecfieldelement1)).representation)
        {
            throw new IllegalArgumentException("One of the field elements are not elements has incorrect representation");
        } else
        {
            return;
        }
    }

    public ECFieldElement add(ECFieldElement ecfieldelement)
    {
        IntArray intarray = (IntArray)x.clone();
        intarray.addShifted((()ecfieldelement).x, 0);
        return new <init>(m, k1, k2, k3, intarray);
    }

    public ECFieldElement divide(ECFieldElement ecfieldelement)
    {
        return multiply(ecfieldelement.invert());
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof rt))
            {
                return false;
            }
            obj = (rt)obj;
            if (m != ((m) (obj)).m || k1 != ((k1) (obj)).k1 || k2 != ((k2) (obj)).k2 || k3 != ((k3) (obj)).k3 || representation != ((representation) (obj)).representation || !x.equals(((x) (obj)).x))
            {
                return false;
            }
        }
        return true;
    }

    public String getFieldName()
    {
        return "F2m";
    }

    public int getFieldSize()
    {
        return m;
    }

    public int getK1()
    {
        return k1;
    }

    public int getK2()
    {
        return k2;
    }

    public int getK3()
    {
        return k3;
    }

    public int getM()
    {
        return m;
    }

    public int getRepresentation()
    {
        return representation;
    }

    public int hashCode()
    {
        return x.hashCode() ^ m ^ k1 ^ k2 ^ k3;
    }

    public ECFieldElement invert()
    {
        IntArray intarray = (IntArray)x.clone();
        IntArray intarray1 = new IntArray(t);
        intarray1.setBit(m);
        intarray1.setBit(0);
        intarray1.setBit(k1);
        if (representation == 3)
        {
            intarray1.setBit(k2);
            intarray1.setBit(k3);
        }
        IntArray intarray3 = new IntArray(t);
        intarray3.setBit(0);
        IntArray intarray2;
        IntArray intarray4;
        for (intarray2 = new IntArray(t); !intarray.isZero(); intarray2 = intarray4)
        {
            int j = intarray.bitLength() - intarray1.bitLength();
            IntArray intarray7 = intarray3;
            IntArray intarray6 = intarray1;
            IntArray intarray5 = intarray;
            int i = j;
            intarray4 = intarray2;
            if (j < 0)
            {
                i = -j;
                intarray4 = intarray3;
                intarray5 = intarray1;
                intarray6 = intarray;
                intarray7 = intarray2;
            }
            j = i >> 5;
            i &= 0x1f;
            intarray5.addShifted(intarray6.shiftLeft(i), j);
            intarray7.addShifted(intarray4.shiftLeft(i), j);
            intarray3 = intarray7;
            intarray1 = intarray6;
            intarray = intarray5;
        }

        return new <init>(m, k1, k2, k3, intarray2);
    }

    public ECFieldElement multiply(ECFieldElement ecfieldelement)
    {
        ecfieldelement = (k3)ecfieldelement;
        ecfieldelement = x.multiply(((x) (ecfieldelement)).x, m);
        ecfieldelement.reduce(m, new int[] {
            k1, k2, k3
        });
        return new <init>(m, k1, k2, k3, ecfieldelement);
    }

    public ECFieldElement negate()
    {
        return this;
    }

    public ECFieldElement sqrt()
    {
        throw new RuntimeException("Not implemented");
    }

    public ECFieldElement square()
    {
        IntArray intarray = x.square(m);
        intarray.reduce(m, new int[] {
            k1, k2, k3
        });
        return new <init>(m, k1, k2, k3, intarray);
    }

    public ECFieldElement subtract(ECFieldElement ecfieldelement)
    {
        return add(ecfieldelement);
    }

    public BigInteger toBigInteger()
    {
        return x.toBigInteger();
    }

    public (int i, int j, int k, int l, BigInteger biginteger)
    {
        t = i + 31 >> 5;
        x = new IntArray(biginteger, t);
        if (k == 0 && l == 0)
        {
            representation = 2;
        } else
        {
            if (k >= l)
            {
                throw new IllegalArgumentException("k2 must be smaller than k3");
            }
            if (k <= 0)
            {
                throw new IllegalArgumentException("k2 must be larger than 0");
            }
            representation = 3;
        }
        if (biginteger.signum() < 0)
        {
            throw new IllegalArgumentException("x value cannot be negative");
        } else
        {
            m = i;
            k1 = j;
            k2 = k;
            k3 = l;
            return;
        }
    }

    private k3(int i, int j, int k, int l, IntArray intarray)
    {
        t = i + 31 >> 5;
        x = intarray;
        m = i;
        k1 = j;
        k2 = k;
        k3 = l;
        if (k == 0 && l == 0)
        {
            representation = 2;
            return;
        } else
        {
            representation = 3;
            return;
        }
    }

    public representation(int i, int j, BigInteger biginteger)
    {
        this(i, j, 0, 0, biginteger);
    }
}
