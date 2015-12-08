// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.math.ec;

import java.math.BigInteger;
import java.util.Random;

// Referenced classes of package org.bouncycastle.math.ec:
//            ECConstants, IntArray

public abstract class ECFieldElement
    implements ECConstants
{
    public static class F2m extends ECFieldElement
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
            if (!(ecfieldelement instanceof F2m) || !(ecfieldelement1 instanceof F2m))
            {
                throw new IllegalArgumentException("Field elements are not both instances of ECFieldElement.F2m");
            }
            ecfieldelement = (F2m)ecfieldelement;
            ecfieldelement1 = (F2m)ecfieldelement1;
            if (((F2m) (ecfieldelement)).m != ((F2m) (ecfieldelement1)).m || ((F2m) (ecfieldelement)).k1 != ((F2m) (ecfieldelement1)).k1 || ((F2m) (ecfieldelement)).k2 != ((F2m) (ecfieldelement1)).k2 || ((F2m) (ecfieldelement)).k3 != ((F2m) (ecfieldelement1)).k3)
            {
                throw new IllegalArgumentException("Field elements are not elements of the same field F2m");
            }
            if (((F2m) (ecfieldelement)).representation != ((F2m) (ecfieldelement1)).representation)
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
            intarray.addShifted(((F2m)ecfieldelement).x, 0);
            return new F2m(m, k1, k2, k3, intarray);
        }

        public ECFieldElement divide(ECFieldElement ecfieldelement)
        {
            return multiply(ecfieldelement.invert());
        }

        public boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof F2m))
                {
                    return false;
                }
                obj = (F2m)obj;
                if (m != ((F2m) (obj)).m || k1 != ((F2m) (obj)).k1 || k2 != ((F2m) (obj)).k2 || k3 != ((F2m) (obj)).k3 || representation != ((F2m) (obj)).representation || !x.equals(((F2m) (obj)).x))
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

            return new F2m(m, k1, k2, k3, intarray2);
        }

        public ECFieldElement multiply(ECFieldElement ecfieldelement)
        {
            ecfieldelement = (F2m)ecfieldelement;
            ecfieldelement = x.multiply(((F2m) (ecfieldelement)).x, m);
            ecfieldelement.reduce(m, new int[] {
                k1, k2, k3
            });
            return new F2m(m, k1, k2, k3, ecfieldelement);
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
            return new F2m(m, k1, k2, k3, intarray);
        }

        public ECFieldElement subtract(ECFieldElement ecfieldelement)
        {
            return add(ecfieldelement);
        }

        public BigInteger toBigInteger()
        {
            return x.toBigInteger();
        }

        public F2m(int i, int j, int k, int l, BigInteger biginteger)
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

        private F2m(int i, int j, int k, int l, IntArray intarray)
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

        public F2m(int i, int j, BigInteger biginteger)
        {
            this(i, j, 0, 0, biginteger);
        }
    }

    public static class Fp extends ECFieldElement
    {

        BigInteger q;
        BigInteger x;

        private static BigInteger[] lucasSequence(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, BigInteger biginteger3)
        {
            int i = biginteger3.bitLength();
            int k = biginteger3.getLowestSetBit();
            BigInteger biginteger6 = ECConstants.ONE;
            BigInteger biginteger5 = ECConstants.TWO;
            BigInteger biginteger8 = ECConstants.ONE;
            BigInteger biginteger7 = ECConstants.ONE;
            i--;
            BigInteger biginteger4 = biginteger1;
            while (i >= k + 1) 
            {
                biginteger8 = biginteger8.multiply(biginteger7).mod(biginteger);
                BigInteger biginteger10;
                BigInteger biginteger11;
                if (biginteger3.testBit(i))
                {
                    BigInteger biginteger9 = biginteger8.multiply(biginteger2).mod(biginteger);
                    biginteger6 = biginteger6.multiply(biginteger4).mod(biginteger);
                    biginteger5 = biginteger4.multiply(biginteger5).subtract(biginteger1.multiply(biginteger8)).mod(biginteger);
                    biginteger7 = biginteger4.multiply(biginteger4).subtract(biginteger9.shiftLeft(1)).mod(biginteger);
                    biginteger4 = biginteger6;
                    biginteger6 = biginteger5;
                    biginteger5 = biginteger9;
                } else
                {
                    biginteger6 = biginteger6.multiply(biginteger5).subtract(biginteger8).mod(biginteger);
                    biginteger7 = biginteger4.multiply(biginteger5).subtract(biginteger1.multiply(biginteger8)).mod(biginteger);
                    biginteger5 = biginteger5.multiply(biginteger5).subtract(biginteger8.shiftLeft(1)).mod(biginteger);
                    biginteger4 = biginteger6;
                    biginteger6 = biginteger5;
                    biginteger5 = biginteger8;
                }
                i--;
                biginteger10 = biginteger7;
                biginteger11 = biginteger6;
                biginteger7 = biginteger5;
                biginteger6 = biginteger4;
                biginteger4 = biginteger10;
                biginteger5 = biginteger11;
            }
            biginteger7 = biginteger8.multiply(biginteger7).mod(biginteger);
            biginteger8 = biginteger7.multiply(biginteger2).mod(biginteger);
            biginteger2 = biginteger6.multiply(biginteger5).subtract(biginteger7).mod(biginteger);
            biginteger3 = biginteger4.multiply(biginteger5).subtract(biginteger1.multiply(biginteger7)).mod(biginteger);
            biginteger4 = biginteger7.multiply(biginteger8).mod(biginteger);
            biginteger1 = biginteger2;
            biginteger2 = biginteger3;
            biginteger3 = biginteger4;
            for (int j = 1; j <= k; j++)
            {
                biginteger1 = biginteger1.multiply(biginteger2).mod(biginteger);
                biginteger2 = biginteger2.multiply(biginteger2).subtract(biginteger3.shiftLeft(1)).mod(biginteger);
                biginteger3 = biginteger3.multiply(biginteger3).mod(biginteger);
            }

            return (new BigInteger[] {
                biginteger1, biginteger2
            });
        }

        public ECFieldElement add(ECFieldElement ecfieldelement)
        {
            return new Fp(q, x.add(ecfieldelement.toBigInteger()).mod(q));
        }

        public ECFieldElement divide(ECFieldElement ecfieldelement)
        {
            return new Fp(q, x.multiply(ecfieldelement.toBigInteger().modInverse(q)).mod(q));
        }

        public boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof Fp))
                {
                    return false;
                }
                obj = (Fp)obj;
                if (!q.equals(((Fp) (obj)).q) || !x.equals(((Fp) (obj)).x))
                {
                    return false;
                }
            }
            return true;
        }

        public String getFieldName()
        {
            return "Fp";
        }

        public int getFieldSize()
        {
            return q.bitLength();
        }

        public BigInteger getQ()
        {
            return q;
        }

        public int hashCode()
        {
            return q.hashCode() ^ x.hashCode();
        }

        public ECFieldElement invert()
        {
            return new Fp(q, x.modInverse(q));
        }

        public ECFieldElement multiply(ECFieldElement ecfieldelement)
        {
            return new Fp(q, x.multiply(ecfieldelement.toBigInteger()).mod(q));
        }

        public ECFieldElement negate()
        {
            return new Fp(q, x.negate().mod(q));
        }

        public ECFieldElement sqrt()
        {
            Fp fp = null;
            if (!q.testBit(0))
            {
                throw new RuntimeException("not done yet");
            }
            if (q.testBit(1))
            {
                fp = new Fp(q, x.modPow(q.shiftRight(2).add(ECConstants.ONE), q));
                if (!fp.square().equals(this))
                {
                    fp = null;
                }
            } else
            {
                BigInteger biginteger3 = q.subtract(ECConstants.ONE);
                BigInteger biginteger4 = biginteger3.shiftRight(1);
                if (x.modPow(biginteger4, q).equals(ECConstants.ONE))
                {
                    BigInteger biginteger = biginteger3.shiftRight(2).shiftLeft(1).add(ECConstants.ONE);
                    BigInteger biginteger5 = x;
                    BigInteger biginteger6 = biginteger5.shiftLeft(2).mod(q);
                    Random random = new Random();
                    BigInteger biginteger7;
                    do
                    {
                        BigInteger biginteger2;
                        do
                        {
                            biginteger2 = new BigInteger(q.bitLength(), random);
                        } while (biginteger2.compareTo(q) >= 0 || !biginteger2.multiply(biginteger2).subtract(biginteger6).modPow(biginteger4, q).equals(biginteger3));
                        BigInteger abiginteger[] = lucasSequence(q, biginteger2, biginteger5, biginteger);
                        biginteger7 = abiginteger[0];
                        abiginteger = abiginteger[1];
                        if (abiginteger.multiply(abiginteger).mod(q).equals(biginteger6))
                        {
                            BigInteger biginteger1 = abiginteger;
                            if (abiginteger.testBit(0))
                            {
                                biginteger1 = abiginteger.add(q);
                            }
                            biginteger1 = biginteger1.shiftRight(1);
                            return new Fp(q, biginteger1);
                        }
                    } while (biginteger7.equals(ECConstants.ONE) || biginteger7.equals(biginteger3));
                    return null;
                }
            }
            return fp;
        }

        public ECFieldElement square()
        {
            return new Fp(q, x.multiply(x).mod(q));
        }

        public ECFieldElement subtract(ECFieldElement ecfieldelement)
        {
            return new Fp(q, x.subtract(ecfieldelement.toBigInteger()).mod(q));
        }

        public BigInteger toBigInteger()
        {
            return x;
        }

        public Fp(BigInteger biginteger, BigInteger biginteger1)
        {
            x = biginteger1;
            if (biginteger1.compareTo(biginteger) >= 0)
            {
                throw new IllegalArgumentException("x value too large in field element");
            } else
            {
                q = biginteger;
                return;
            }
        }
    }


    public ECFieldElement()
    {
    }

    public abstract ECFieldElement add(ECFieldElement ecfieldelement);

    public abstract ECFieldElement divide(ECFieldElement ecfieldelement);

    public abstract String getFieldName();

    public abstract int getFieldSize();

    public abstract ECFieldElement invert();

    public abstract ECFieldElement multiply(ECFieldElement ecfieldelement);

    public abstract ECFieldElement negate();

    public abstract ECFieldElement sqrt();

    public abstract ECFieldElement square();

    public abstract ECFieldElement subtract(ECFieldElement ecfieldelement);

    public abstract BigInteger toBigInteger();

    public String toString()
    {
        return toBigInteger().toString(2);
    }
}
