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

final class b extends X9ECParametersHolder
{

    b()
    {
    }

    protected final X9ECParameters a()
    {
        Object obj = SECNamedCurves.c("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D");
        BigInteger biginteger2 = ECConstants.f;
        BigInteger biginteger3 = BigInteger.valueOf(5L);
        BigInteger biginteger = SECNamedCurves.c("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7");
        BigInteger biginteger1 = BigInteger.valueOf(1L);
        obj = new org.spongycastle.math.ec.ECCurve.Fp(((BigInteger) (obj)), biginteger2, biginteger3);
        return new X9ECParameters(((ECCurve) (obj)), ((ECCurve) (obj)).a(Hex.a("04A1455B334DF099DF30FC28A169A467E9E47075A90F7E650EB6B7A45C7E089FED7FBA344282CAFBD6F7E319F7C0B0BD59E2CA4BDB556D61A5")), biginteger, biginteger1, null);
    }
}
