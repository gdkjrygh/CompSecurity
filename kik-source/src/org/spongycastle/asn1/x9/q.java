// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x9;

import java.math.BigInteger;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.util.encoders.Hex;

// Referenced classes of package org.spongycastle.asn1.x9:
//            X9ECParametersHolder, X9ECParameters

final class q extends X9ECParametersHolder
{

    q()
    {
    }

    protected final X9ECParameters a()
    {
        org.spongycastle.math.ec.ECCurve.Fp fp = new org.spongycastle.math.ec.ECCurve.Fp(new BigInteger("6277101735386680763835789423207666416083908700390324961279"), new BigInteger("fffffffffffffffffffffffffffffffefffffffffffffffc", 16), new BigInteger("22123dc2395a05caa7423daeccc94760a7d462256bd56916", 16));
        return new X9ECParameters(fp, fp.a(Hex.a("027d29778100c65a1da1783716588dce2b8b4aee8e228f1896")), new BigInteger("ffffffffffffffffffffffff7a62d031c83f4294f640ec13", 16), BigInteger.valueOf(1L), Hex.a("c469684435deb378c4b65ca9591e2a5763059a2e"));
    }
}
