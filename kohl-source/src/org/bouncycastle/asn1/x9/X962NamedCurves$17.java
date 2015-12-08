// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.encoders.Hex;

// Referenced classes of package org.bouncycastle.asn1.x9:
//            X9ECParametersHolder, X962NamedCurves, X9ECParameters

static class r extends X9ECParametersHolder
{

    protected X9ECParameters createParameters()
    {
        BigInteger biginteger = new BigInteger("1555555555555555555555555555553C6F2885259C31E3FCDF154624522D", 16);
        BigInteger biginteger1 = BigInteger.valueOf(6L);
        org.bouncycastle.math.ec.r r = new org.bouncycastle.math.ec.r(239, 36, new BigInteger("4230017757A767FAE42398569B746325D45313AF0766266479B75654E65F", 16), new BigInteger("5037EA654196CFF0CD82B2C14A2FCF2E3FF8775285B545722F03EACDB74B", 16), biginteger, biginteger1);
        return new X9ECParameters(r, r.decodePoint(Hex.decode("0228F9D04E900069C8DC47A08534FE76D2B900B7D7EF31F5709F200C4CA205")), biginteger, biginteger1, null);
    }

    r()
    {
    }
}
