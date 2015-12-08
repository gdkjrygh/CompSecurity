// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x9;

import java.math.BigInteger;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.util.encoders.Hex;

// Referenced classes of package org.spongycastle.asn1.x9:
//            X9ECParametersHolder, X9ECParameters

final class m extends X9ECParametersHolder
{

    m()
    {
    }

    protected final X9ECParameters a()
    {
        BigInteger biginteger = new BigInteger("0101D556572AABAC800101D556572AABAC8001022D5C91DD173F8FB561DA6899164443051D", 16);
        BigInteger biginteger1 = BigInteger.valueOf(65070L);
        org.spongycastle.math.ec.ECCurve.F2m f2m = new org.spongycastle.math.ec.ECCurve.F2m(304, 1, 2, 11, new BigInteger("00FD0D693149A118F651E6DCE6802085377E5F882D1B510B44160074C1288078365A0396C8E681", 16), new BigInteger("00BDDB97E555A50A908E43B01C798EA5DAA6788F1EA2794EFCF57166B8C14039601E55827340BE", 16), biginteger, biginteger1);
        return new X9ECParameters(f2m, f2m.a(Hex.a("02197B07845E9BE2D96ADB0F5F3C7F2CFFBD7A3EB8B6FEC35C7FD67F26DDF6285A644F740A2614")), biginteger, biginteger1, null);
    }
}
