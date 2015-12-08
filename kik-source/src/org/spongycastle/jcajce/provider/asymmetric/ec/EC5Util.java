// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.ec;

import java.math.BigInteger;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import org.spongycastle.jce.spec.ECNamedCurveParameterSpec;
import org.spongycastle.jce.spec.ECNamedCurveSpec;
import org.spongycastle.jce.spec.ECParameterSpec;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECFieldElement;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.ec:
//            ECUtil

public class EC5Util
{

    public EC5Util()
    {
    }

    public static java.security.spec.ECParameterSpec a(EllipticCurve ellipticcurve, ECParameterSpec ecparameterspec)
    {
        if (ecparameterspec instanceof ECNamedCurveParameterSpec)
        {
            return new ECNamedCurveSpec(((ECNamedCurveParameterSpec)ecparameterspec).a(), ellipticcurve, new ECPoint(ecparameterspec.c().b().a(), ecparameterspec.c().c().a()), ecparameterspec.d(), ecparameterspec.e());
        } else
        {
            return new java.security.spec.ECParameterSpec(ellipticcurve, new ECPoint(ecparameterspec.c().b().a(), ecparameterspec.c().c().a()), ecparameterspec.d(), ecparameterspec.e().intValue());
        }
    }

    public static EllipticCurve a(ECCurve eccurve)
    {
        if (eccurve instanceof org.spongycastle.math.ec.ECCurve.Fp)
        {
            return new EllipticCurve(new ECFieldFp(((org.spongycastle.math.ec.ECCurve.Fp)eccurve).e()), eccurve.c().a(), eccurve.d().a(), null);
        }
        org.spongycastle.math.ec.ECCurve.F2m f2m = (org.spongycastle.math.ec.ECCurve.F2m)eccurve;
        if (f2m.i())
        {
            int i = f2m.j();
            return new EllipticCurve(new ECFieldF2m(f2m.h(), new int[] {
                i
            }), eccurve.c().a(), eccurve.d().a(), null);
        } else
        {
            int j = f2m.l();
            int k = f2m.k();
            int l = f2m.j();
            return new EllipticCurve(new ECFieldF2m(f2m.h(), new int[] {
                j, k, l
            }), eccurve.c().a(), eccurve.d().a(), null);
        }
    }

    public static ECParameterSpec a(java.security.spec.ECParameterSpec ecparameterspec, boolean flag)
    {
        ECCurve eccurve = a(ecparameterspec.getCurve());
        return new ECParameterSpec(eccurve, a(eccurve, ecparameterspec.getGenerator(), flag), ecparameterspec.getOrder(), BigInteger.valueOf(ecparameterspec.getCofactor()), ecparameterspec.getCurve().getSeed());
    }

    public static ECCurve a(EllipticCurve ellipticcurve)
    {
        Object obj = ellipticcurve.getField();
        BigInteger biginteger = ellipticcurve.getA();
        ellipticcurve = ellipticcurve.getB();
        if (obj instanceof ECFieldFp)
        {
            return new org.spongycastle.math.ec.ECCurve.Fp(((ECFieldFp)obj).getP(), biginteger, ellipticcurve);
        } else
        {
            obj = (ECFieldF2m)obj;
            int i = ((ECFieldF2m) (obj)).getM();
            int ai[] = ECUtil.a(((ECFieldF2m) (obj)).getMidTermsOfReductionPolynomial());
            return new org.spongycastle.math.ec.ECCurve.F2m(i, ai[0], ai[1], ai[2], biginteger, ellipticcurve);
        }
    }

    public static org.spongycastle.math.ec.ECPoint a(java.security.spec.ECParameterSpec ecparameterspec, ECPoint ecpoint)
    {
        return a(a(ecparameterspec.getCurve()), ecpoint, false);
    }

    public static org.spongycastle.math.ec.ECPoint a(ECCurve eccurve, ECPoint ecpoint, boolean flag)
    {
        return eccurve.a(ecpoint.getAffineX(), ecpoint.getAffineY(), flag);
    }
}
