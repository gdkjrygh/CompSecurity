// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x9;

import java.math.BigInteger;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.util.encoders.Hex;

// Referenced classes of package org.spongycastle.asn1.x9:
//            X9ECParametersHolder, X9ECParameters

final class l extends X9ECParametersHolder
{

    l()
    {
    }

    protected final X9ECParameters a()
    {
        org.spongycastle.math.ec.ECCurve.Fp fp = new org.spongycastle.math.ec.ECCurve.Fp(new BigInteger("6277101735386680763835789423207666416083908700390324961279"), new BigInteger("fffffffffffffffffffffffffffffffefffffffffffffffc", 16), new BigInteger("cc22d6dfb95c6b25e49c0d6364a4e5980c393aa21668d953", 16));
        return new X9ECParameters(fp, fp.a(Hex.a("03eea2bae7e1497842f2de7769cfe9c989c072ad696f48034a")), new BigInteger("fffffffffffffffffffffffe5fb1a724dc80418648d8dd31", 16), BigInteger.valueOf(1L), Hex.a("31a92ee2029fd10d901b113e990710f0d21ac6b6"));
    }
}
