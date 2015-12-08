// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.math.ec;

import java.math.BigInteger;
import java.util.Random;

// Referenced classes of package org.bouncycastle.math.ec:
//            ECFieldElement, ECPoint, ECConstants, Tnaf

public abstract class ECCurve
{
    public static class F2m extends ECCurve
    {

        private BigInteger h;
        private ECPoint.F2m infinity;
        private int k1;
        private int k2;
        private int k3;
        private int m;
        private byte mu;
        private BigInteger n;
        private BigInteger si[];

        private ECPoint decompressPoint(byte abyte0[], int i)
        {
            int j = 0;
            ECFieldElement.F2m f2m = new ECFieldElement.F2m(m, k1, k2, k3, new BigInteger(1, abyte0));
            Object obj;
            if (f2m.toBigInteger().equals(ECConstants.ZERO))
            {
                abyte0 = (ECFieldElement.F2m)b;
                i = 0;
                do
                {
                    obj = abyte0;
                    if (i >= m - 1)
                    {
                        break;
                    }
                    abyte0 = abyte0.square();
                    i++;
                } while (true);
            } else
            {
                abyte0 = solveQuadradicEquation(f2m.add(a).add(b.multiply(f2m.square().invert())));
                if (abyte0 == null)
                {
                    throw new RuntimeException("Invalid point compression");
                }
                if (abyte0.toBigInteger().testBit(0))
                {
                    j = 1;
                }
                if (j != i)
                {
                    abyte0 = abyte0.add(new ECFieldElement.F2m(m, k1, k2, k3, ECConstants.ONE));
                }
                obj = f2m.multiply(abyte0);
            }
            return new ECPoint.F2m(this, f2m, ((ECFieldElement) (obj)));
        }

        private ECFieldElement solveQuadradicEquation(ECFieldElement ecfieldelement)
        {
            ECFieldElement.F2m f2m = new ECFieldElement.F2m(m, k1, k2, k3, ECConstants.ZERO);
            if (ecfieldelement.toBigInteger().equals(ECConstants.ZERO))
            {
                return f2m;
            }
            Random random = new Random();
            Object obj;
            do
            {
                ECFieldElement.F2m f2m1 = new ECFieldElement.F2m(m, k1, k2, k3, new BigInteger(m, random));
                int i = 1;
                ECFieldElement ecfieldelement1 = ecfieldelement;
                obj = f2m;
                for (; i <= m - 1; i++)
                {
                    ecfieldelement1 = ecfieldelement1.square();
                    obj = ((ECFieldElement) (obj)).square().add(ecfieldelement1.multiply(f2m1));
                    ecfieldelement1 = ecfieldelement1.add(ecfieldelement);
                }

                if (!ecfieldelement1.toBigInteger().equals(ECConstants.ZERO))
                {
                    return null;
                }
            } while (((ECFieldElement) (obj)).square().add(((ECFieldElement) (obj))).toBigInteger().equals(ECConstants.ZERO));
            return ((ECFieldElement) (obj));
        }

        public ECPoint createPoint(BigInteger biginteger, BigInteger biginteger1, boolean flag)
        {
            return new ECPoint.F2m(this, fromBigInteger(biginteger), fromBigInteger(biginteger1), flag);
        }

        public ECPoint decodePoint(byte abyte0[])
        {
            switch (abyte0[0])
            {
            case 1: // '\001'
            case 5: // '\005'
            default:
                throw new RuntimeException((new StringBuilder()).append("Invalid point encoding 0x").append(Integer.toString(abyte0[0], 16)).toString());

            case 0: // '\0'
                if (abyte0.length > 1)
                {
                    throw new RuntimeException("Invalid point encoding");
                } else
                {
                    return getInfinity();
                }

            case 2: // '\002'
            case 3: // '\003'
                byte abyte1[] = new byte[abyte0.length - 1];
                System.arraycopy(abyte0, 1, abyte1, 0, abyte1.length);
                if (abyte0[0] == 2)
                {
                    return decompressPoint(abyte1, 0);
                } else
                {
                    return decompressPoint(abyte1, 1);
                }

            case 4: // '\004'
            case 6: // '\006'
            case 7: // '\007'
                byte abyte2[] = new byte[(abyte0.length - 1) / 2];
                byte abyte3[] = new byte[(abyte0.length - 1) / 2];
                System.arraycopy(abyte0, 1, abyte2, 0, abyte2.length);
                System.arraycopy(abyte0, abyte2.length + 1, abyte3, 0, abyte3.length);
                return new ECPoint.F2m(this, new ECFieldElement.F2m(m, k1, k2, k3, new BigInteger(1, abyte2)), new ECFieldElement.F2m(m, k1, k2, k3, new BigInteger(1, abyte3)), false);
            }
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
                if (m != ((F2m) (obj)).m || k1 != ((F2m) (obj)).k1 || k2 != ((F2m) (obj)).k2 || k3 != ((F2m) (obj)).k3 || !a.equals(((F2m) (obj)).a) || !b.equals(((F2m) (obj)).b))
                {
                    return false;
                }
            }
            return true;
        }

        public ECFieldElement fromBigInteger(BigInteger biginteger)
        {
            return new ECFieldElement.F2m(m, k1, k2, k3, biginteger);
        }

        public int getFieldSize()
        {
            return m;
        }

        public BigInteger getH()
        {
            return h;
        }

        public ECPoint getInfinity()
        {
            return infinity;
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

        byte getMu()
        {
            this;
            JVM INSTR monitorenter ;
            byte byte0;
            if (mu == 0)
            {
                mu = Tnaf.getMu(this);
            }
            byte0 = mu;
            this;
            JVM INSTR monitorexit ;
            return byte0;
            Exception exception;
            exception;
            throw exception;
        }

        public BigInteger getN()
        {
            return n;
        }

        BigInteger[] getSi()
        {
            this;
            JVM INSTR monitorenter ;
            BigInteger abiginteger[];
            if (si == null)
            {
                si = Tnaf.getSi(this);
            }
            abiginteger = si;
            this;
            JVM INSTR monitorexit ;
            return abiginteger;
            Exception exception;
            exception;
            throw exception;
        }

        public int hashCode()
        {
            return a.hashCode() ^ b.hashCode() ^ m ^ k1 ^ k2 ^ k3;
        }

        public boolean isKoblitz()
        {
            return n != null && h != null && (a.toBigInteger().equals(ECConstants.ZERO) || a.toBigInteger().equals(ECConstants.ONE)) && b.toBigInteger().equals(ECConstants.ONE);
        }

        public boolean isTrinomial()
        {
            return k2 == 0 && k3 == 0;
        }

        public F2m(int i, int j, int k, int l, BigInteger biginteger, BigInteger biginteger1)
        {
            this(i, j, k, l, biginteger, biginteger1, null, null);
        }

        public F2m(int i, int j, int k, int l, BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, 
                BigInteger biginteger3)
        {
            mu = 0;
            si = null;
            m = i;
            k1 = j;
            k2 = k;
            k3 = l;
            n = biginteger2;
            h = biginteger3;
            if (j == 0)
            {
                throw new IllegalArgumentException("k1 must be > 0");
            }
            if (k == 0)
            {
                if (l != 0)
                {
                    throw new IllegalArgumentException("k3 must be 0 if k2 == 0");
                }
            } else
            {
                if (k <= j)
                {
                    throw new IllegalArgumentException("k2 must be > k1");
                }
                if (l <= k)
                {
                    throw new IllegalArgumentException("k3 must be > k2");
                }
            }
            a = fromBigInteger(biginteger);
            b = fromBigInteger(biginteger1);
            infinity = new ECPoint.F2m(this, null, null);
        }

        public F2m(int i, int j, BigInteger biginteger, BigInteger biginteger1)
        {
            this(i, j, 0, 0, biginteger, biginteger1, null, null);
        }

        public F2m(int i, int j, BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, BigInteger biginteger3)
        {
            this(i, j, 0, 0, biginteger, biginteger1, biginteger2, biginteger3);
        }
    }

    public static class Fp extends ECCurve
    {

        ECPoint.Fp infinity;
        BigInteger q;

        public ECPoint createPoint(BigInteger biginteger, BigInteger biginteger1, boolean flag)
        {
            return new ECPoint.Fp(this, fromBigInteger(biginteger), fromBigInteger(biginteger1), flag);
        }

        public ECPoint decodePoint(byte abyte0[])
        {
            int i = 0;
            switch (abyte0[0])
            {
            case 1: // '\001'
            case 5: // '\005'
            default:
                throw new RuntimeException((new StringBuilder()).append("Invalid point encoding 0x").append(Integer.toString(abyte0[0], 16)).toString());

            case 0: // '\0'
                if (abyte0.length > 1)
                {
                    throw new RuntimeException("Invalid point encoding");
                } else
                {
                    return getInfinity();
                }

            case 2: // '\002'
            case 3: // '\003'
                byte byte0 = abyte0[0];
                byte abyte1[] = new byte[abyte0.length - 1];
                System.arraycopy(abyte0, 1, abyte1, 0, abyte1.length);
                abyte0 = new ECFieldElement.Fp(q, new BigInteger(1, abyte1));
                ECFieldElement ecfieldelement = abyte0.multiply(abyte0.square().add(a)).add(b).sqrt();
                if (ecfieldelement == null)
                {
                    throw new RuntimeException("Invalid point compression");
                }
                if (ecfieldelement.toBigInteger().testBit(0))
                {
                    i = 1;
                }
                if (i == (byte0 & 1))
                {
                    return new ECPoint.Fp(this, abyte0, ecfieldelement, true);
                } else
                {
                    return new ECPoint.Fp(this, abyte0, new ECFieldElement.Fp(q, q.subtract(ecfieldelement.toBigInteger())), true);
                }

            case 4: // '\004'
            case 6: // '\006'
            case 7: // '\007'
                byte abyte2[] = new byte[(abyte0.length - 1) / 2];
                byte abyte3[] = new byte[(abyte0.length - 1) / 2];
                System.arraycopy(abyte0, 1, abyte2, 0, abyte2.length);
                System.arraycopy(abyte0, abyte2.length + 1, abyte3, 0, abyte3.length);
                return new ECPoint.Fp(this, new ECFieldElement.Fp(q, new BigInteger(1, abyte2)), new ECFieldElement.Fp(q, new BigInteger(1, abyte3)));
            }
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
                if (!q.equals(((Fp) (obj)).q) || !a.equals(((Fp) (obj)).a) || !b.equals(((Fp) (obj)).b))
                {
                    return false;
                }
            }
            return true;
        }

        public ECFieldElement fromBigInteger(BigInteger biginteger)
        {
            return new ECFieldElement.Fp(q, biginteger);
        }

        public int getFieldSize()
        {
            return q.bitLength();
        }

        public ECPoint getInfinity()
        {
            return infinity;
        }

        public BigInteger getQ()
        {
            return q;
        }

        public int hashCode()
        {
            return a.hashCode() ^ b.hashCode() ^ q.hashCode();
        }

        public Fp(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2)
        {
            q = biginteger;
            a = fromBigInteger(biginteger1);
            b = fromBigInteger(biginteger2);
            infinity = new ECPoint.Fp(this, null, null);
        }
    }


    ECFieldElement a;
    ECFieldElement b;

    public ECCurve()
    {
    }

    public abstract ECPoint createPoint(BigInteger biginteger, BigInteger biginteger1, boolean flag);

    public abstract ECPoint decodePoint(byte abyte0[]);

    public abstract ECFieldElement fromBigInteger(BigInteger biginteger);

    public ECFieldElement getA()
    {
        return a;
    }

    public ECFieldElement getB()
    {
        return b;
    }

    public abstract int getFieldSize();

    public abstract ECPoint getInfinity();
}
