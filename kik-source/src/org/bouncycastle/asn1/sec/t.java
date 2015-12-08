// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.encoders.Hex;

// Referenced classes of package org.bouncycastle.asn1.sec:
//            SECNamedCurves

final class t extends X9ECParametersHolder
{

    t()
    {
    }

    protected final X9ECParameters a()
    {
        Object obj = ECConstants.f;
        BigInteger biginteger2 = BigInteger.valueOf(1L);
        BigInteger biginteger = SECNamedCurves.c("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5");
        BigInteger biginteger1 = BigInteger.valueOf(4L);
        obj = new org.bouncycastle.math.ec.ECCurve.F2m(239, 158, ((BigInteger) (obj)), biginteger2, biginteger, biginteger1);
        return new X9ECParameters(((ECCurve) (obj)), ((ECCurve) (obj)).a(Hex.a("0429A0B6A887A983E9730988A68727A8B2D126C44CC2CC7B2A6555193035DC76310804F12E549BDB011C103089E73510ACB275FC312A5DC6B76553F0CA")), biginteger, biginteger1, null);
    }
}
