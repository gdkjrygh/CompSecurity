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

static class r extends X9ECParametersHolder
{

    protected X9ECParameters createParameters()
    {
        Object obj = SECNamedCurves.access$000("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B");
        BigInteger biginteger2 = SECNamedCurves.access$000("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE");
        byte abyte0[] = Hex.decode("10B7B4D696E676875615175137C8A16FD0DA2211");
        BigInteger biginteger = SECNamedCurves.access$000("010000000000000000000000015AAB561B005413CCD4EE99D5");
        BigInteger biginteger1 = BigInteger.valueOf(2L);
        obj = new org.bouncycastle.math.ec.(193, 15, ((BigInteger) (obj)), biginteger2, biginteger, biginteger1);
        return new X9ECParameters(((ECCurve) (obj)), ((ECCurve) (obj)).decodePoint(Hex.decode("0400D9B67D192E0367C803F39E1A7E82CA14A651350AAE617E8F01CE94335607C304AC29E7DEFBD9CA01F596F927224CDECF6C")), biginteger, biginteger1, abyte0);
    }

    r()
    {
    }
}
