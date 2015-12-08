// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x9;

import java.math.BigInteger;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.util.encoders.Hex;

// Referenced classes of package org.spongycastle.asn1.x9:
//            X9ECParametersHolder, X9ECParameters

final class s extends X9ECParametersHolder
{

    s()
    {
    }

    protected final X9ECParameters a()
    {
        org.spongycastle.math.ec.ECCurve.Fp fp = new org.spongycastle.math.ec.ECCurve.Fp(new BigInteger("883423532389192164791648750360308885314476597252960362792450860609699839"), new BigInteger("7fffffffffffffffffffffff7fffffffffff8000000000007ffffffffffc", 16), new BigInteger("617fab6832576cbbfed50d99f0249c3fee58b94ba0038c7ae84c8c832f2c", 16));
        return new X9ECParameters(fp, fp.a(Hex.a("0238af09d98727705120c921bb5e9e26296a3cdcf2f35757a0eafd87b830e7")), new BigInteger("7fffffffffffffffffffffff800000cfa7e8594377d414c03821bc582063", 16), BigInteger.valueOf(1L), Hex.a("e8b4011604095303ca3b8099982be09fcb9ae616"));
    }
}
