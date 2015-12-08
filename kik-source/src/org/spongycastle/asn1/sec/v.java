// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.sec;

import java.math.BigInteger;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.asn1.x9.X9ECParametersHolder;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.util.encoders.Hex;

// Referenced classes of package org.spongycastle.asn1.sec:
//            SECNamedCurves

final class v extends X9ECParametersHolder
{

    v()
    {
    }

    protected final X9ECParameters a()
    {
        Object obj = BigInteger.valueOf(1L);
        BigInteger biginteger2 = SECNamedCurves.c("027B680AC8B8596DA5A4AF8A19A0303FCA97FD7645309FA2A581485AF6263E313B79A2F5");
        byte abyte0[] = Hex.a("77E2B07370EB0F832A6DD5B62DFC88CD06BB84BE");
        BigInteger biginteger = SECNamedCurves.c("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEF90399660FC938A90165B042A7CEFADB307");
        BigInteger biginteger1 = BigInteger.valueOf(2L);
        obj = new org.spongycastle.math.ec.ECCurve.F2m(283, 5, 7, 12, ((BigInteger) (obj)), biginteger2, biginteger, biginteger1);
        return new X9ECParameters(((ECCurve) (obj)), ((ECCurve) (obj)).a(Hex.a("0405F939258DB7DD90E1934F8C70B0DFEC2EED25B8557EAC9C80E2E198F8CDBECD86B1205303676854FE24141CB98FE6D4B20D02B4516FF702350EDDB0826779C813F0DF45BE8112F4")), biginteger, biginteger1, abyte0);
    }
}
