// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.encoders.Hex;

// Referenced classes of package org.bouncycastle.asn1.sec:
//            SECNamedCurves

final class h extends X9ECParametersHolder
{

    h()
    {
    }

    protected final X9ECParameters a()
    {
        Object obj = SECNamedCurves.c("003088250CA6E7C7FE649CE85820F7");
        BigInteger biginteger2 = SECNamedCurves.c("00E8BEE4D3E2260744188BE0E9C723");
        byte abyte0[] = Hex.a("10E723AB14D696E6768756151756FEBF8FCB49A9");
        BigInteger biginteger = SECNamedCurves.c("0100000000000000D9CCEC8A39E56F");
        BigInteger biginteger1 = BigInteger.valueOf(2L);
        obj = new org.bouncycastle.math.ec.ECCurve.F2m(113, 9, ((BigInteger) (obj)), biginteger2, biginteger, biginteger1);
        return new X9ECParameters(((ECCurve) (obj)), ((ECCurve) (obj)).a(Hex.a("04009D73616F35F4AB1407D73562C10F00A52830277958EE84D1315ED31886")), biginteger, biginteger1, abyte0);
    }
}
