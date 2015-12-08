// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;

public class ECNamedCurveSpec extends ECParameterSpec
{

    private String a;

    public ECNamedCurveSpec(String s, EllipticCurve ellipticcurve, ECPoint ecpoint, BigInteger biginteger, BigInteger biginteger1)
    {
        super(ellipticcurve, ecpoint, biginteger, biginteger1.intValue());
        a = s;
    }

    public ECNamedCurveSpec(String s, ECCurve eccurve, org.bouncycastle.math.ec.ECPoint ecpoint, BigInteger biginteger, BigInteger biginteger1, byte abyte0[])
    {
        if (eccurve instanceof org.bouncycastle.math.ec.ECCurve.Fp)
        {
            eccurve = new EllipticCurve(new ECFieldFp(((org.bouncycastle.math.ec.ECCurve.Fp)eccurve).e()), eccurve.c().a(), eccurve.d().a(), abyte0);
        } else
        {
            org.bouncycastle.math.ec.ECCurve.F2m f2m = (org.bouncycastle.math.ec.ECCurve.F2m)eccurve;
            if (f2m.i())
            {
                int i = f2m.j();
                eccurve = new EllipticCurve(new ECFieldF2m(f2m.h(), new int[] {
                    i
                }), eccurve.c().a(), eccurve.d().a(), abyte0);
            } else
            {
                int j = f2m.l();
                int k = f2m.k();
                int l = f2m.j();
                eccurve = new EllipticCurve(new ECFieldF2m(f2m.h(), new int[] {
                    j, k, l
                }), eccurve.c().a(), eccurve.d().a(), abyte0);
            }
        }
        super(eccurve, new ECPoint(ecpoint.b().a(), ecpoint.c().a()), biginteger, biginteger1.intValue());
        a = s;
    }

    public final String a()
    {
        return a;
    }
}
