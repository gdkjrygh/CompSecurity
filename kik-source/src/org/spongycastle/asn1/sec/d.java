// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.sec;

import java.math.BigInteger;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.asn1.x9.X9ECParametersHolder;
import org.spongycastle.math.ec.ECConstants;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.util.encoders.Hex;

// Referenced classes of package org.spongycastle.asn1.sec:
//            SECNamedCurves

final class d extends X9ECParametersHolder
{

    d()
    {
    }

    protected final X9ECParameters a()
    {
        Object obj = SECNamedCurves.c("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F");
        BigInteger biginteger2 = ECConstants.f;
        BigInteger biginteger3 = BigInteger.valueOf(7L);
        BigInteger biginteger = SECNamedCurves.c("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141");
        BigInteger biginteger1 = BigInteger.valueOf(1L);
        obj = new org.spongycastle.math.ec.ECCurve.Fp(((BigInteger) (obj)), biginteger2, biginteger3);
        return new X9ECParameters(((ECCurve) (obj)), ((ECCurve) (obj)).a(Hex.a("0479BE667EF9DCBBAC55A06295CE870B07029BFCDB2DCE28D959F2815B16F81798483ADA7726A3C4655DA4FBFC0E1108A8FD17B448A68554199C47D08FFB10D4B8")), biginteger, biginteger1, null);
    }
}
