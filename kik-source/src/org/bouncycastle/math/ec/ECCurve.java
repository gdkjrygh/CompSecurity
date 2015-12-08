// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.math.ec;

import java.math.BigInteger;
import java.util.Random;

// Referenced classes of package org.bouncycastle.math.ec:
//            ECFieldElement, ECPoint, ECConstants, f

public abstract class ECCurve
{
    public static class F2m extends ECCurve
    {

        private int c;
        private int d;
        private int e;
        private int f;
        private BigInteger g;
        private BigInteger h;
        private ECPoint.F2m i;
        private byte j;
        private BigInteger k[];

        private ECFieldElement a(ECFieldElement ecfieldelement)
        {
            ECFieldElement.F2m f2m = new ECFieldElement.F2m(c, d, e, f, ECConstants.f);
            if (ecfieldelement.a().equals(ECConstants.f))
            {
                return f2m;
            }
            Random random = new Random();
            Object obj;
            do
            {
                ECFieldElement.F2m f2m1 = new ECFieldElement.F2m(c, d, e, f, new BigInteger(c, random));
                int i1 = 1;
                ECFieldElement ecfieldelement1 = ecfieldelement;
                obj = f2m;
                for (; i1 <= c - 1; i1++)
                {
                    ecfieldelement1 = ecfieldelement1.d();
                    obj = ((ECFieldElement) (obj)).d().a(ecfieldelement1.c(f2m1));
                    ecfieldelement1 = ecfieldelement1.a(ecfieldelement);
                }

                if (!ecfieldelement1.a().equals(ECConstants.f))
                {
                    return null;
                }
            } while (((ECFieldElement) (obj)).d().a(((ECFieldElement) (obj))).a().equals(ECConstants.f));
            return ((ECFieldElement) (obj));
        }

        private ECPoint a(byte abyte0[], int i1)
        {
            int j1 = 0;
            ECFieldElement.F2m f2m = new ECFieldElement.F2m(c, d, e, f, new BigInteger(1, abyte0));
            Object obj;
            if (f2m.a().equals(ECConstants.f))
            {
                abyte0 = (ECFieldElement.F2m)b;
                i1 = 0;
                do
                {
                    obj = abyte0;
                    if (i1 >= c - 1)
                    {
                        break;
                    }
                    abyte0 = abyte0.d();
                    i1++;
                } while (true);
            } else
            {
                abyte0 = a(f2m.a(a).a(b.c(f2m.d().e())));
                if (abyte0 == null)
                {
                    throw new RuntimeException("Invalid point compression");
                }
                if (abyte0.a().testBit(0))
                {
                    j1 = 1;
                }
                if (j1 != i1)
                {
                    abyte0 = abyte0.a(new ECFieldElement.F2m(c, d, e, f, ECConstants.g));
                }
                obj = f2m.c(abyte0);
            }
            return new ECPoint.F2m(this, f2m, ((ECFieldElement) (obj)));
        }

        public final int a()
        {
            return c;
        }

        public final ECFieldElement a(BigInteger biginteger)
        {
            return new ECFieldElement.F2m(c, d, e, f, biginteger);
        }

        public final ECPoint a(BigInteger biginteger, BigInteger biginteger1, boolean flag)
        {
            return new ECPoint.F2m(this, a(biginteger), a(biginteger1), flag);
        }

        public final ECPoint a(byte abyte0[])
        {
            switch (abyte0[0])
            {
            case 1: // '\001'
            case 5: // '\005'
            default:
                throw new RuntimeException((new StringBuilder("Invalid point encoding 0x")).append(Integer.toString(abyte0[0], 16)).toString());

            case 0: // '\0'
                if (abyte0.length > 1)
                {
                    throw new RuntimeException("Invalid point encoding");
                } else
                {
                    return i;
                }

            case 2: // '\002'
            case 3: // '\003'
                byte abyte1[] = new byte[abyte0.length - 1];
                System.arraycopy(abyte0, 1, abyte1, 0, abyte1.length);
                if (abyte0[0] == 2)
                {
                    return a(abyte1, 0);
                } else
                {
                    return a(abyte1, 1);
                }

            case 4: // '\004'
            case 6: // '\006'
            case 7: // '\007'
                byte abyte2[] = new byte[(abyte0.length - 1) / 2];
                byte abyte3[] = new byte[(abyte0.length - 1) / 2];
                System.arraycopy(abyte0, 1, abyte2, 0, abyte2.length);
                System.arraycopy(abyte0, abyte2.length + 1, abyte3, 0, abyte3.length);
                return new ECPoint.F2m(this, new ECFieldElement.F2m(c, d, e, f, new BigInteger(1, abyte2)), new ECFieldElement.F2m(c, d, e, f, new BigInteger(1, abyte3)), false);
            }
        }

        public final ECPoint b()
        {
            return i;
        }

        public final boolean e()
        {
            return g != null && h != null && (a.a().equals(ECConstants.f) || a.a().equals(ECConstants.g)) && b.a().equals(ECConstants.g);
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
                if (c != ((F2m) (obj)).c || d != ((F2m) (obj)).d || e != ((F2m) (obj)).e || f != ((F2m) (obj)).f || !a.equals(((F2m) (obj)).a) || !b.equals(((F2m) (obj)).b))
                {
                    return false;
                }
            }
            return true;
        }

        final byte f()
        {
            this;
            JVM INSTR monitorenter ;
            byte byte0;
            if (j == 0)
            {
                j = org.bouncycastle.math.ec.f.a(this);
            }
            byte0 = j;
            this;
            JVM INSTR monitorexit ;
            return byte0;
            Exception exception;
            exception;
            throw exception;
        }

        final BigInteger[] g()
        {
            this;
            JVM INSTR monitorenter ;
            BigInteger abiginteger[];
            if (k == null)
            {
                k = org.bouncycastle.math.ec.f.b(this);
            }
            abiginteger = k;
            this;
            JVM INSTR monitorexit ;
            return abiginteger;
            Exception exception;
            exception;
            throw exception;
        }

        public final int h()
        {
            return c;
        }

        public int hashCode()
        {
            return a.hashCode() ^ b.hashCode() ^ c ^ d ^ e ^ f;
        }

        public final boolean i()
        {
            return e == 0 && f == 0;
        }

        public final int j()
        {
            return d;
        }

        public final int k()
        {
            return e;
        }

        public final int l()
        {
            return f;
        }

        public final BigInteger m()
        {
            return h;
        }

        public F2m(int i1, int j1, int k1, int l1, BigInteger biginteger, BigInteger biginteger1)
        {
            this(i1, j1, k1, l1, biginteger, biginteger1, null, null);
        }

        public F2m(int i1, int j1, int k1, int l1, BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, 
                BigInteger biginteger3)
        {
            j = 0;
            k = null;
            c = i1;
            d = j1;
            e = k1;
            f = l1;
            g = biginteger2;
            h = biginteger3;
            if (j1 == 0)
            {
                throw new IllegalArgumentException("k1 must be > 0");
            }
            if (k1 == 0)
            {
                if (l1 != 0)
                {
                    throw new IllegalArgumentException("k3 must be 0 if k2 == 0");
                }
            } else
            {
                if (k1 <= j1)
                {
                    throw new IllegalArgumentException("k2 must be > k1");
                }
                if (l1 <= k1)
                {
                    throw new IllegalArgumentException("k3 must be > k2");
                }
            }
            a = a(biginteger);
            b = a(biginteger1);
            i = new ECPoint.F2m(this, null, null);
        }

        public F2m(int i1, int j1, BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, BigInteger biginteger3)
        {
            this(i1, j1, 0, 0, biginteger, biginteger1, biginteger2, biginteger3);
        }
    }

    public static class Fp extends ECCurve
    {

        BigInteger c;
        ECPoint.Fp d;

        public final int a()
        {
            return c.bitLength();
        }

        public final ECFieldElement a(BigInteger biginteger)
        {
            return new ECFieldElement.Fp(c, biginteger);
        }

        public final ECPoint a(BigInteger biginteger, BigInteger biginteger1, boolean flag)
        {
            return new ECPoint.Fp(this, a(biginteger), a(biginteger1), flag);
        }

        public final ECPoint a(byte abyte0[])
        {
            int i = 0;
            switch (abyte0[0])
            {
            case 1: // '\001'
            case 5: // '\005'
            default:
                throw new RuntimeException((new StringBuilder("Invalid point encoding 0x")).append(Integer.toString(abyte0[0], 16)).toString());

            case 0: // '\0'
                if (abyte0.length > 1)
                {
                    throw new RuntimeException("Invalid point encoding");
                } else
                {
                    return d;
                }

            case 2: // '\002'
            case 3: // '\003'
                byte byte0 = abyte0[0];
                byte abyte1[] = new byte[abyte0.length - 1];
                System.arraycopy(abyte0, 1, abyte1, 0, abyte1.length);
                abyte0 = new ECFieldElement.Fp(c, new BigInteger(1, abyte1));
                ECFieldElement ecfieldelement = abyte0.c(abyte0.d().a(a)).a(b).f();
                if (ecfieldelement == null)
                {
                    throw new RuntimeException("Invalid point compression");
                }
                if (ecfieldelement.a().testBit(0))
                {
                    i = 1;
                }
                if (i == (byte0 & 1))
                {
                    return new ECPoint.Fp(this, abyte0, ecfieldelement, true);
                } else
                {
                    return new ECPoint.Fp(this, abyte0, new ECFieldElement.Fp(c, c.subtract(ecfieldelement.a())), true);
                }

            case 4: // '\004'
            case 6: // '\006'
            case 7: // '\007'
                byte abyte2[] = new byte[(abyte0.length - 1) / 2];
                byte abyte3[] = new byte[(abyte0.length - 1) / 2];
                System.arraycopy(abyte0, 1, abyte2, 0, abyte2.length);
                System.arraycopy(abyte0, abyte2.length + 1, abyte3, 0, abyte3.length);
                return new ECPoint.Fp(this, new ECFieldElement.Fp(c, new BigInteger(1, abyte2)), new ECFieldElement.Fp(c, new BigInteger(1, abyte3)));
            }
        }

        public final ECPoint b()
        {
            return d;
        }

        public final BigInteger e()
        {
            return c;
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
                if (!c.equals(((Fp) (obj)).c) || !a.equals(((Fp) (obj)).a) || !b.equals(((Fp) (obj)).b))
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            return a.hashCode() ^ b.hashCode() ^ c.hashCode();
        }

        public Fp(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2)
        {
            c = biginteger;
            a = a(biginteger1);
            b = a(biginteger2);
            d = new ECPoint.Fp(this, null, null);
        }
    }


    ECFieldElement a;
    ECFieldElement b;

    public ECCurve()
    {
    }

    public abstract int a();

    public abstract ECFieldElement a(BigInteger biginteger);

    public abstract ECPoint a(BigInteger biginteger, BigInteger biginteger1, boolean flag);

    public abstract ECPoint a(byte abyte0[]);

    public abstract ECPoint b();

    public final ECFieldElement c()
    {
        return a;
    }

    public final ECFieldElement d()
    {
        return b;
    }
}
