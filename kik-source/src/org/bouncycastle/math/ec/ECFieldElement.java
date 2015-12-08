// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.math.ec;

import java.math.BigInteger;
import java.util.Random;

// Referenced classes of package org.bouncycastle.math.ec:
//            ECConstants, c

public abstract class ECFieldElement
    implements ECConstants
{
    public static class F2m extends ECFieldElement
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
            if (!(ecfieldelement instanceof F2m) || !(ecfieldelement1 instanceof F2m))
            {
                throw new IllegalArgumentException("Field elements are not both instances of ECFieldElement.F2m");
            }
            ecfieldelement = (F2m)ecfieldelement;
            ecfieldelement1 = (F2m)ecfieldelement1;
            if (((F2m) (ecfieldelement)).b != ((F2m) (ecfieldelement1)).b || ((F2m) (ecfieldelement)).c != ((F2m) (ecfieldelement1)).c || ((F2m) (ecfieldelement)).d != ((F2m) (ecfieldelement1)).d || ((F2m) (ecfieldelement)).e != ((F2m) (ecfieldelement1)).e)
            {
                throw new IllegalArgumentException("Field elements are not elements of the same field F2m");
            }
            if (((F2m) (ecfieldelement)).a != ((F2m) (ecfieldelement1)).a)
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
            c1.a(((F2m)ecfieldelement).k, 0);
            return new F2m(b, c, d, e, c1);
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
            ecfieldelement = (F2m)ecfieldelement;
            ecfieldelement = k.b(((F2m) (ecfieldelement)).k, b);
            ecfieldelement.a(b, new int[] {
                c, d, e
            });
            return new F2m(b, c, d, e, ecfieldelement);
        }

        public final ECFieldElement d()
        {
            c c1 = k.c(b);
            c1.a(b, new int[] {
                c, d, e
            });
            return new F2m(b, c, d, e, c1);
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

            return new F2m(b, c, d, e, c3);
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
                if (b != ((F2m) (obj)).b || c != ((F2m) (obj)).c || d != ((F2m) (obj)).d || e != ((F2m) (obj)).e || a != ((F2m) (obj)).a || !k.equals(((F2m) (obj)).k))
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

        public F2m(int i, int j, int i1, int j1, BigInteger biginteger)
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

        private F2m(int i, int j, int i1, int j1, c c1)
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

    public static class Fp extends ECFieldElement
    {

        BigInteger a;
        BigInteger b;

        private static BigInteger[] a(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, BigInteger biginteger3)
        {
            int i = biginteger3.bitLength();
            int k = biginteger3.getLowestSetBit();
            BigInteger biginteger6 = ECConstants.g;
            BigInteger biginteger5 = ECConstants.h;
            BigInteger biginteger9 = ECConstants.g;
            BigInteger biginteger10 = ECConstants.g;
            BigInteger biginteger4 = biginteger1;
            i--;
            while (i >= k + 1) 
            {
                biginteger9 = biginteger9.multiply(biginteger10).mod(biginteger);
                BigInteger biginteger7;
                BigInteger biginteger11;
                if (biginteger3.testBit(i))
                {
                    biginteger10 = biginteger9.multiply(biginteger2).mod(biginteger);
                    biginteger6 = biginteger6.multiply(biginteger4).mod(biginteger);
                    biginteger7 = biginteger4.multiply(biginteger5).subtract(biginteger1.multiply(biginteger9)).mod(biginteger);
                    biginteger5 = biginteger4.multiply(biginteger4).subtract(biginteger10.shiftLeft(1)).mod(biginteger);
                    biginteger4 = biginteger6;
                    biginteger6 = biginteger5;
                    biginteger5 = biginteger10;
                } else
                {
                    biginteger7 = biginteger6.multiply(biginteger5).subtract(biginteger9).mod(biginteger);
                    biginteger6 = biginteger4.multiply(biginteger5).subtract(biginteger1.multiply(biginteger9)).mod(biginteger);
                    biginteger5 = biginteger5.multiply(biginteger5).subtract(biginteger9.shiftLeft(1)).mod(biginteger);
                    biginteger4 = biginteger7;
                    biginteger7 = biginteger5;
                    biginteger5 = biginteger9;
                }
                i--;
                biginteger11 = biginteger6;
                biginteger10 = biginteger5;
                biginteger6 = biginteger4;
                biginteger4 = biginteger11;
                biginteger5 = biginteger7;
            }
            BigInteger biginteger8 = biginteger9.multiply(biginteger10).mod(biginteger);
            biginteger9 = biginteger8.multiply(biginteger2).mod(biginteger);
            biginteger3 = biginteger6.multiply(biginteger5).subtract(biginteger8).mod(biginteger);
            biginteger2 = biginteger4.multiply(biginteger5).subtract(biginteger1.multiply(biginteger8)).mod(biginteger);
            biginteger1 = biginteger8.multiply(biginteger9).mod(biginteger);
            for (int j = 1; j <= k; j++)
            {
                biginteger3 = biginteger3.multiply(biginteger2).mod(biginteger);
                biginteger2 = biginteger2.multiply(biginteger2).subtract(biginteger1.shiftLeft(1)).mod(biginteger);
                biginteger1 = biginteger1.multiply(biginteger1).mod(biginteger);
            }

            return (new BigInteger[] {
                biginteger3, biginteger2
            });
        }

        public final BigInteger a()
        {
            return a;
        }

        public final ECFieldElement a(ECFieldElement ecfieldelement)
        {
            return new Fp(b, a.add(ecfieldelement.a()).mod(b));
        }

        public final int b()
        {
            return b.bitLength();
        }

        public final ECFieldElement b(ECFieldElement ecfieldelement)
        {
            return new Fp(b, a.subtract(ecfieldelement.a()).mod(b));
        }

        public final ECFieldElement c()
        {
            return new Fp(b, a.negate().mod(b));
        }

        public final ECFieldElement c(ECFieldElement ecfieldelement)
        {
            return new Fp(b, a.multiply(ecfieldelement.a()).mod(b));
        }

        public final ECFieldElement d()
        {
            return new Fp(b, a.multiply(a).mod(b));
        }

        public final ECFieldElement d(ECFieldElement ecfieldelement)
        {
            return new Fp(b, a.multiply(ecfieldelement.a().modInverse(b)).mod(b));
        }

        public final ECFieldElement e()
        {
            return new Fp(b, a.modInverse(b));
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
                if (!b.equals(((Fp) (obj)).b) || !a.equals(((Fp) (obj)).a))
                {
                    return false;
                }
            }
            return true;
        }

        public final ECFieldElement f()
        {
            if (!b.testBit(0))
            {
                throw new RuntimeException("not done yet");
            }
            if (b.testBit(1))
            {
                Fp fp = new Fp(b, a.modPow(b.shiftRight(2).add(ECConstants.g), b));
                if (fp.d().equals(this))
                {
                    return fp;
                } else
                {
                    return null;
                }
            }
            BigInteger biginteger = b.subtract(ECConstants.g);
            BigInteger biginteger2 = biginteger.shiftRight(1);
            if (!a.modPow(biginteger2, b).equals(ECConstants.g))
            {
                return null;
            }
            BigInteger biginteger3 = biginteger.shiftRight(2).shiftLeft(1).add(ECConstants.g);
            BigInteger biginteger4 = a;
            BigInteger biginteger5 = biginteger4.shiftLeft(2).mod(b);
            Random random = new Random();
            BigInteger biginteger6;
            do
            {
                BigInteger biginteger1;
                do
                {
                    biginteger1 = new BigInteger(b.bitLength(), random);
                } while (biginteger1.compareTo(b) >= 0 || !biginteger1.multiply(biginteger1).subtract(biginteger5).modPow(biginteger2, b).equals(biginteger));
                BigInteger abiginteger[] = a(b, biginteger1, biginteger4, biginteger3);
                biginteger6 = abiginteger[0];
                abiginteger = abiginteger[1];
                if (abiginteger.multiply(abiginteger).mod(b).equals(biginteger5))
                {
                    biginteger = abiginteger;
                    if (abiginteger.testBit(0))
                    {
                        biginteger = abiginteger.add(b);
                    }
                    biginteger = biginteger.shiftRight(1);
                    return new Fp(b, biginteger);
                }
            } while (biginteger6.equals(ECConstants.g) || biginteger6.equals(biginteger));
            return null;
        }

        public int hashCode()
        {
            return b.hashCode() ^ a.hashCode();
        }

        public Fp(BigInteger biginteger, BigInteger biginteger1)
        {
            a = biginteger1;
            if (biginteger1.compareTo(biginteger) >= 0)
            {
                throw new IllegalArgumentException("x value too large in field element");
            } else
            {
                b = biginteger;
                return;
            }
        }
    }


    public ECFieldElement()
    {
    }

    public abstract BigInteger a();

    public abstract ECFieldElement a(ECFieldElement ecfieldelement);

    public abstract int b();

    public abstract ECFieldElement b(ECFieldElement ecfieldelement);

    public abstract ECFieldElement c();

    public abstract ECFieldElement c(ECFieldElement ecfieldelement);

    public abstract ECFieldElement d();

    public abstract ECFieldElement d(ECFieldElement ecfieldelement);

    public abstract ECFieldElement e();

    public abstract ECFieldElement f();

    public String toString()
    {
        return a().toString(2);
    }
}
