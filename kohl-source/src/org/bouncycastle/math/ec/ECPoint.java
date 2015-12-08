// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9IntegerConverter;

// Referenced classes of package org.bouncycastle.math.ec:
//            FpNafMultiplier, ECCurve, ECMultiplier, PreCompInfo, 
//            ECFieldElement, WTauNafMultiplier, WNafMultiplier, ECConstants

public abstract class ECPoint
{
    public static class F2m extends ECPoint
    {

        private static void checkPoints(ECPoint ecpoint, ECPoint ecpoint1)
        {
            if (!ecpoint.curve.equals(ecpoint1.curve))
            {
                throw new IllegalArgumentException("Only points on the same curve can be added or subtracted");
            } else
            {
                return;
            }
        }

        public ECPoint add(ECPoint ecpoint)
        {
            checkPoints(this, ecpoint);
            return addSimple((F2m)ecpoint);
        }

        public F2m addSimple(F2m f2m)
        {
            if (isInfinity())
            {
                return f2m;
            }
            if (f2m.isInfinity())
            {
                return this;
            }
            ECFieldElement.F2m f2m1 = (ECFieldElement.F2m)f2m.getX();
            f2m = (ECFieldElement.F2m)f2m.getY();
            if (x.equals(f2m1))
            {
                if (y.equals(f2m))
                {
                    return (F2m)twice();
                } else
                {
                    return (F2m)curve.getInfinity();
                }
            } else
            {
                f2m = (ECFieldElement.F2m)y.add(f2m).divide(x.add(f2m1));
                f2m1 = (ECFieldElement.F2m)f2m.square().add(f2m).add(x).add(f2m1).add(curve.getA());
                f2m = (ECFieldElement.F2m)f2m.multiply(x.add(f2m1)).add(f2m1).add(y);
                return new F2m(curve, f2m1, f2m, withCompression);
            }
        }

        void assertECMultiplier()
        {
            this;
            JVM INSTR monitorenter ;
            if (multiplier != null) goto _L2; else goto _L1
_L1:
            if (!((ECCurve.F2m)curve).isKoblitz()) goto _L4; else goto _L3
_L3:
            multiplier = new WTauNafMultiplier();
_L2:
            this;
            JVM INSTR monitorexit ;
            return;
_L4:
            multiplier = new WNafMultiplier();
            if (true) goto _L2; else goto _L5
_L5:
            Exception exception;
            exception;
            throw exception;
        }

        public byte[] getEncoded()
        {
            if (isInfinity())
            {
                return new byte[1];
            }
            int i = ECPoint.converter.getByteLength(x);
            byte abyte0[] = ECPoint.converter.integerToBytes(getX().toBigInteger(), i);
            if (withCompression)
            {
                byte abyte1[] = new byte[i + 1];
                abyte1[0] = 2;
                if (!getX().toBigInteger().equals(ECConstants.ZERO) && getY().multiply(getX().invert()).toBigInteger().testBit(0))
                {
                    abyte1[0] = 3;
                }
                System.arraycopy(abyte0, 0, abyte1, 1, i);
                return abyte1;
            } else
            {
                byte abyte2[] = ECPoint.converter.integerToBytes(getY().toBigInteger(), i);
                byte abyte3[] = new byte[i + i + 1];
                abyte3[0] = 4;
                System.arraycopy(abyte0, 0, abyte3, 1, i);
                System.arraycopy(abyte2, 0, abyte3, i + 1, i);
                return abyte3;
            }
        }

        public ECPoint negate()
        {
            return new F2m(curve, getX(), getY().add(getX()), withCompression);
        }

        public ECPoint subtract(ECPoint ecpoint)
        {
            checkPoints(this, ecpoint);
            return subtractSimple((F2m)ecpoint);
        }

        public F2m subtractSimple(F2m f2m)
        {
            if (f2m.isInfinity())
            {
                return this;
            } else
            {
                return addSimple((F2m)f2m.negate());
            }
        }

        public ECPoint twice()
        {
            if (isInfinity())
            {
                return this;
            }
            if (x.toBigInteger().signum() == 0)
            {
                return curve.getInfinity();
            } else
            {
                ECFieldElement.F2m f2m1 = (ECFieldElement.F2m)x.add(y.divide(x));
                ECFieldElement.F2m f2m = (ECFieldElement.F2m)f2m1.square().add(f2m1).add(curve.getA());
                ECFieldElement ecfieldelement = curve.fromBigInteger(ECConstants.ONE);
                f2m1 = (ECFieldElement.F2m)x.square().add(f2m.multiply(f2m1.add(ecfieldelement)));
                return new F2m(curve, f2m, f2m1, withCompression);
            }
        }

        public F2m(ECCurve eccurve, ECFieldElement ecfieldelement, ECFieldElement ecfieldelement1)
        {
            this(eccurve, ecfieldelement, ecfieldelement1, false);
        }

        public F2m(ECCurve eccurve, ECFieldElement ecfieldelement, ECFieldElement ecfieldelement1, boolean flag)
        {
            super(eccurve, ecfieldelement, ecfieldelement1);
            if (ecfieldelement != null && ecfieldelement1 == null || ecfieldelement == null && ecfieldelement1 != null)
            {
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            }
            if (ecfieldelement != null)
            {
                ECFieldElement.F2m.checkFieldElements(x, y);
                if (eccurve != null)
                {
                    ECFieldElement.F2m.checkFieldElements(x, curve.getA());
                }
            }
            withCompression = flag;
        }
    }

    public static class Fp extends ECPoint
    {

        public ECPoint add(ECPoint ecpoint)
        {
            if (isInfinity())
            {
                return ecpoint;
            }
            if (ecpoint.isInfinity())
            {
                return this;
            }
            if (x.equals(ecpoint.x))
            {
                if (y.equals(ecpoint.y))
                {
                    return twice();
                } else
                {
                    return curve.getInfinity();
                }
            } else
            {
                ECFieldElement ecfieldelement = ecpoint.y.subtract(y).divide(ecpoint.x.subtract(x));
                ecpoint = ecfieldelement.square().subtract(x).subtract(ecpoint.x);
                ecfieldelement = ecfieldelement.multiply(x.subtract(ecpoint)).subtract(y);
                return new Fp(curve, ecpoint, ecfieldelement);
            }
        }

        void assertECMultiplier()
        {
            this;
            JVM INSTR monitorenter ;
            if (multiplier == null)
            {
                multiplier = new WNafMultiplier();
            }
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public byte[] getEncoded()
        {
            if (isInfinity())
            {
                return new byte[1];
            }
            int i = ECPoint.converter.getByteLength(x);
            if (withCompression)
            {
                byte byte0;
                byte abyte0[];
                byte abyte2[];
                if (getY().toBigInteger().testBit(0))
                {
                    byte0 = 3;
                } else
                {
                    byte0 = 2;
                }
                abyte0 = ECPoint.converter.integerToBytes(getX().toBigInteger(), i);
                abyte2 = new byte[abyte0.length + 1];
                abyte2[0] = byte0;
                System.arraycopy(abyte0, 0, abyte2, 1, abyte0.length);
                return abyte2;
            } else
            {
                byte abyte1[] = ECPoint.converter.integerToBytes(getX().toBigInteger(), i);
                byte abyte3[] = ECPoint.converter.integerToBytes(getY().toBigInteger(), i);
                byte abyte4[] = new byte[abyte1.length + abyte3.length + 1];
                abyte4[0] = 4;
                System.arraycopy(abyte1, 0, abyte4, 1, abyte1.length);
                System.arraycopy(abyte3, 0, abyte4, abyte1.length + 1, abyte3.length);
                return abyte4;
            }
        }

        public ECPoint negate()
        {
            return new Fp(curve, x, y.negate(), withCompression);
        }

        public ECPoint subtract(ECPoint ecpoint)
        {
            if (ecpoint.isInfinity())
            {
                return this;
            } else
            {
                return add(ecpoint.negate());
            }
        }

        public ECPoint twice()
        {
            if (isInfinity())
            {
                return this;
            }
            if (y.toBigInteger().signum() == 0)
            {
                return curve.getInfinity();
            } else
            {
                ECFieldElement ecfieldelement = curve.fromBigInteger(BigInteger.valueOf(2L));
                ECFieldElement ecfieldelement1 = curve.fromBigInteger(BigInteger.valueOf(3L));
                ecfieldelement1 = x.square().multiply(ecfieldelement1).add(curve.a).divide(y.multiply(ecfieldelement));
                ecfieldelement = ecfieldelement1.square().subtract(x.multiply(ecfieldelement));
                ecfieldelement1 = ecfieldelement1.multiply(x.subtract(ecfieldelement)).subtract(y);
                return new Fp(curve, ecfieldelement, ecfieldelement1, withCompression);
            }
        }

        public Fp(ECCurve eccurve, ECFieldElement ecfieldelement, ECFieldElement ecfieldelement1)
        {
            this(eccurve, ecfieldelement, ecfieldelement1, false);
        }

        public Fp(ECCurve eccurve, ECFieldElement ecfieldelement, ECFieldElement ecfieldelement1, boolean flag)
        {
            super(eccurve, ecfieldelement, ecfieldelement1);
            if (ecfieldelement != null && ecfieldelement1 == null || ecfieldelement == null && ecfieldelement1 != null)
            {
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            } else
            {
                withCompression = flag;
                return;
            }
        }
    }


    private static X9IntegerConverter converter = new X9IntegerConverter();
    ECCurve curve;
    protected ECMultiplier multiplier;
    protected PreCompInfo preCompInfo;
    protected boolean withCompression;
    ECFieldElement x;
    ECFieldElement y;

    protected ECPoint(ECCurve eccurve, ECFieldElement ecfieldelement, ECFieldElement ecfieldelement1)
    {
        multiplier = null;
        preCompInfo = null;
        curve = eccurve;
        x = ecfieldelement;
        y = ecfieldelement1;
    }

    public abstract ECPoint add(ECPoint ecpoint);

    void assertECMultiplier()
    {
        this;
        JVM INSTR monitorenter ;
        if (multiplier == null)
        {
            multiplier = new FpNafMultiplier();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ECPoint))
            {
                return false;
            }
            obj = (ECPoint)obj;
            if (isInfinity())
            {
                return ((ECPoint) (obj)).isInfinity();
            }
            if (!x.equals(((ECPoint) (obj)).x) || !y.equals(((ECPoint) (obj)).y))
            {
                return false;
            }
        }
        return true;
    }

    public ECCurve getCurve()
    {
        return curve;
    }

    public abstract byte[] getEncoded();

    public ECFieldElement getX()
    {
        return x;
    }

    public ECFieldElement getY()
    {
        return y;
    }

    public int hashCode()
    {
        if (isInfinity())
        {
            return 0;
        } else
        {
            return x.hashCode() ^ y.hashCode();
        }
    }

    public boolean isCompressed()
    {
        return withCompression;
    }

    public boolean isInfinity()
    {
        return x == null && y == null;
    }

    public ECPoint multiply(BigInteger biginteger)
    {
        if (biginteger.signum() < 0)
        {
            throw new IllegalArgumentException("The multiplicator cannot be negative");
        }
        if (isInfinity())
        {
            return this;
        }
        if (biginteger.signum() == 0)
        {
            return curve.getInfinity();
        } else
        {
            assertECMultiplier();
            return multiplier.multiply(this, biginteger, preCompInfo);
        }
    }

    public abstract ECPoint negate();

    void setPreCompInfo(PreCompInfo precompinfo)
    {
        preCompInfo = precompinfo;
    }

    public abstract ECPoint subtract(ECPoint ecpoint);

    public abstract ECPoint twice();


}
