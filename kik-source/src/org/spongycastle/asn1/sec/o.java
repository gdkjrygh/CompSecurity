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

final class o extends X9ECParametersHolder
{

    o()
    {
    }

    protected final X9ECParameters a()
    {
        Object obj = BigInteger.valueOf(1L);
        BigInteger biginteger2 = SECNamedCurves.c("020A601907B8C953CA1481EB10512F78744A3205FD");
        byte abyte0[] = Hex.a("85E25BFE5C86226CDB12016F7553F9D0E693A268");
        BigInteger biginteger = SECNamedCurves.c("040000000000000000000292FE77E70C12A4234C33");
        BigInteger biginteger1 = BigInteger.valueOf(2L);
        obj = new org.spongycastle.math.ec.ECCurve.F2m(163, 3, 6, 7, ((BigInteger) (obj)), biginteger2, biginteger, biginteger1);
        return new X9ECParameters(((ECCurve) (obj)), ((ECCurve) (obj)).a(Hex.a("0403F0EBA16286A2D57EA0991168D4994637E8343E3600D51FBC6C71A0094FA2CDD545B11C5C0C797324F1")), biginteger, biginteger1, abyte0);
    }
}
