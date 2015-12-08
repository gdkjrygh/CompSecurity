// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x9;

import java.math.BigInteger;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.util.encoders.Hex;

// Referenced classes of package org.spongycastle.asn1.x9:
//            X9ECParametersHolder, X9ECParameters

final class a extends X9ECParametersHolder
{

    a()
    {
    }

    protected final X9ECParameters a()
    {
        org.spongycastle.math.ec.ECCurve.Fp fp = new org.spongycastle.math.ec.ECCurve.Fp(new BigInteger("6277101735386680763835789423207666416083908700390324961279"), new BigInteger("fffffffffffffffffffffffffffffffefffffffffffffffc", 16), new BigInteger("64210519e59c80e70fa7e9ab72243049feb8deecc146b9b1", 16));
        return new X9ECParameters(fp, fp.a(Hex.a("03188da80eb03090f67cbf20eb43a18800f4ff0afd82ff1012")), new BigInteger("ffffffffffffffffffffffff99def836146bc9b1b4d22831", 16), BigInteger.valueOf(1L), Hex.a("3045AE6FC8422f64ED579528D38120EAE12196D5"));
    }
}
