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

final class ad extends X9ECParametersHolder
{

    ad()
    {
    }

    protected final X9ECParameters a()
    {
        Object obj = SECNamedCurves.c("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF");
        BigInteger biginteger2 = SECNamedCurves.c("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC");
        BigInteger biginteger3 = SECNamedCurves.c("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45");
        byte abyte0[] = Hex.a("1053CDE42C14D696E67687561517533BF3F83345");
        BigInteger biginteger = SECNamedCurves.c("0100000000000000000001F4C8F927AED3CA752257");
        BigInteger biginteger1 = BigInteger.valueOf(1L);
        obj = new org.spongycastle.math.ec.ECCurve.Fp(((BigInteger) (obj)), biginteger2, biginteger3);
        return new X9ECParameters(((ECCurve) (obj)), ((ECCurve) (obj)).a(Hex.a("044A96B5688EF573284664698968C38BB913CBFC8223A628553168947D59DCC912042351377AC5FB32")), biginteger, biginteger1, abyte0);
    }
}
