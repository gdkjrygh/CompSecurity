// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.math.BigInteger;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.ec:
//            ECUtil

public class EC5Util
{

    public EC5Util()
    {
    }

    public static EllipticCurve convertCurve(ECCurve eccurve, byte abyte0[])
    {
        if (eccurve instanceof org.bouncycastle.math.ec.ECCurve.Fp)
        {
            return new EllipticCurve(new ECFieldFp(((org.bouncycastle.math.ec.ECCurve.Fp)eccurve).getQ()), eccurve.getA().toBigInteger(), eccurve.getB().toBigInteger(), null);
        }
        abyte0 = (org.bouncycastle.math.ec.ECCurve.F2m)eccurve;
        if (abyte0.isTrinomial())
        {
            int i = abyte0.getK1();
            return new EllipticCurve(new ECFieldF2m(abyte0.getM(), new int[] {
                i
            }), eccurve.getA().toBigInteger(), eccurve.getB().toBigInteger(), null);
        } else
        {
            int j = abyte0.getK3();
            int k = abyte0.getK2();
            int l = abyte0.getK1();
            return new EllipticCurve(new ECFieldF2m(abyte0.getM(), new int[] {
                j, k, l
            }), eccurve.getA().toBigInteger(), eccurve.getB().toBigInteger(), null);
        }
    }

    public static ECCurve convertCurve(EllipticCurve ellipticcurve)
    {
        Object obj = ellipticcurve.getField();
        BigInteger biginteger = ellipticcurve.getA();
        ellipticcurve = ellipticcurve.getB();
        if (obj instanceof ECFieldFp)
        {
            return new org.bouncycastle.math.ec.ECCurve.Fp(((ECFieldFp)obj).getP(), biginteger, ellipticcurve);
        } else
        {
            obj = (ECFieldF2m)obj;
            int i = ((ECFieldF2m) (obj)).getM();
            int ai[] = ECUtil.convertMidTerms(((ECFieldF2m) (obj)).getMidTermsOfReductionPolynomial());
            return new org.bouncycastle.math.ec.ECCurve.F2m(i, ai[0], ai[1], ai[2], biginteger, ellipticcurve);
        }
    }

    public static org.bouncycastle.math.ec.ECPoint convertPoint(ECParameterSpec ecparameterspec, ECPoint ecpoint, boolean flag)
    {
        return convertPoint(convertCurve(ecparameterspec.getCurve()), ecpoint, flag);
    }

    public static org.bouncycastle.math.ec.ECPoint convertPoint(ECCurve eccurve, ECPoint ecpoint, boolean flag)
    {
        return eccurve.createPoint(ecpoint.getAffineX(), ecpoint.getAffineY(), flag);
    }

    public static ECParameterSpec convertSpec(EllipticCurve ellipticcurve, org.bouncycastle.jce.spec.ECParameterSpec ecparameterspec)
    {
        if (ecparameterspec instanceof ECNamedCurveParameterSpec)
        {
            return new ECNamedCurveSpec(((ECNamedCurveParameterSpec)ecparameterspec).getName(), ellipticcurve, new ECPoint(ecparameterspec.getG().getX().toBigInteger(), ecparameterspec.getG().getY().toBigInteger()), ecparameterspec.getN(), ecparameterspec.getH());
        } else
        {
            return new ECParameterSpec(ellipticcurve, new ECPoint(ecparameterspec.getG().getX().toBigInteger(), ecparameterspec.getG().getY().toBigInteger()), ecparameterspec.getN(), ecparameterspec.getH().intValue());
        }
    }

    public static org.bouncycastle.jce.spec.ECParameterSpec convertSpec(ECParameterSpec ecparameterspec, boolean flag)
    {
        ECCurve eccurve = convertCurve(ecparameterspec.getCurve());
        return new org.bouncycastle.jce.spec.ECParameterSpec(eccurve, convertPoint(eccurve, ecparameterspec.getGenerator(), flag), ecparameterspec.getOrder(), BigInteger.valueOf(ecparameterspec.getCofactor()), ecparameterspec.getCurve().getSeed());
    }
}
