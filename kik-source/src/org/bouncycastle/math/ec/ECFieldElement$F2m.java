// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.math.ec;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.math.ec:
//            ECFieldElement, c

public static class a extends ECFieldElement
{

    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private c k;
    private int l;

    public static void a(ECFieldElement ecfieldelement, ECFieldElement ecfieldelement1)
    {
        if (!(ecfieldelement instanceof a) || !(ecfieldelement1 instanceof a))
        {
            throw new IllegalArgumentException("Field elements are not both instances of ECFieldElement.F2m");
        }
        ecfieldelement = (a)ecfieldelement;
        ecfieldelement1 = (a)ecfieldelement1;
        if (((a) (ecfieldelement)).b != ((b) (ecfieldelement1)).b || ((b) (ecfieldelement)).c != ((c) (ecfieldelement1)).c || ((c) (ecfieldelement)).d != ((d) (ecfieldelement1)).d || ((d) (ecfieldelement)).e != ((e) (ecfieldelement1)).e)
        {
            throw new IllegalArgumentException("Field elements are not elements of the same field F2m");
        }
        if (((e) (ecfieldelement)).a != ((a) (ecfieldelement1)).a)
        {
            throw new IllegalArgumentException("One of the field elements are not elements has incorrect representation");
        } else
        {
            return;
        }
    }

    public final BigInteger a()
    {
        return k.c();
    }

    public final ECFieldElement a(ECFieldElement ecfieldelement)
    {
        c c1 = (c)k.clone();
        c1.a(((k)ecfieldelement).k, 0);
        return new <init>(b, c, d, e, c1);
    }

    public final int b()
    {
        return b;
    }

    public final ECFieldElement b(ECFieldElement ecfieldelement)
    {
        return a(ecfieldelement);
    }

    public final ECFieldElement c()
    {
        return this;
    }

    public final ECFieldElement c(ECFieldElement ecfieldelement)
    {
        ecfieldelement = (a)ecfieldelement;
        ecfieldelement = k.b(((k) (ecfieldelement)).k, b);
        ecfieldelement.a(b, new int[] {
            c, d, e
        });
        return new <init>(b, c, d, e, ecfieldelement);
    }

    public final ECFieldElement d()
    {
        c c1 = k.c(b);
        c1.a(b, new int[] {
            c, d, e
        });
        return new <init>(b, c, d, e, c1);
    }

    public final ECFieldElement d(ECFieldElement ecfieldelement)
    {
        return c(ecfieldelement.e());
    }

    public final ECFieldElement e()
    {
        c c1 = (c)k.clone();
        c c2 = new c(l);
        c2.b(b);
        c2.b(0);
        c2.b(c);
        if (a == 3)
        {
            c2.b(d);
            c2.b(e);
        }
        c c4 = new c(l);
        c4.b(0);
        c c3;
        c c5;
        for (c3 = new c(l); !c1.a(); c3 = c5)
        {
            int j = c1.b() - c2.b();
            c c8 = c4;
            c c7 = c2;
            c c6 = c1;
            int i = j;
            c5 = c3;
            if (j < 0)
            {
                i = -j;
                c5 = c4;
                c6 = c2;
                c7 = c1;
                c8 = c3;
            }
            j = i >> 5;
            i &= 0x1f;
            c6.a(c7.a(i), j);
            c8.a(c5.a(i), j);
            c4 = c8;
            c2 = c7;
            c1 = c6;
        }

        return new <init>(b, c, d, e, c3);
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof e))
            {
                return false;
            }
            obj = (e)obj;
            if (b != ((b) (obj)).b || c != ((c) (obj)).c || d != ((d) (obj)).d || e != ((e) (obj)).e || a != ((a) (obj)).a || !k.equals(((k) (obj)).k))
            {
                return false;
            }
        }
        return true;
    }

    public final ECFieldElement f()
    {
        throw new RuntimeException("Not implemented");
    }

    public int hashCode()
    {
        return k.hashCode() ^ b ^ c ^ d ^ e;
    }

    public (int i, int j, int i1, int j1, BigInteger biginteger)
    {
        l = i + 31 >> 5;
        k = new c(biginteger, l);
        if (i1 == 0 && j1 == 0)
        {
            a = 2;
        } else
        {
            if (i1 >= j1)
            {
                throw new IllegalArgumentException("k2 must be smaller than k3");
            }
            if (i1 <= 0)
            {
                throw new IllegalArgumentException("k2 must be larger than 0");
            }
            a = 3;
        }
        if (biginteger.signum() < 0)
        {
            throw new IllegalArgumentException("x value cannot be negative");
        } else
        {
            b = i;
            c = j;
            d = i1;
            e = j1;
            return;
        }
    }

    private e(int i, int j, int i1, int j1, c c1)
    {
        l = i + 31 >> 5;
        k = c1;
        b = i;
        c = j;
        d = i1;
        e = j1;
        if (i1 == 0 && j1 == 0)
        {
            a = 2;
            return;
        } else
        {
            a = 3;
            return;
        }
    }
}
