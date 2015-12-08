// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.encoders.Hex;

// Referenced classes of package org.bouncycastle.asn1.x9:
//            X9ECParametersHolder, X9ECParameters

final class t extends X9ECParametersHolder
{

    t()
    {
    }

    protected final X9ECParameters a()
    {
        org.bouncycastle.math.ec.ECCurve.Fp fp = new org.bouncycastle.math.ec.ECCurve.Fp(new BigInteger("883423532389192164791648750360308885314476597252960362792450860609699839"), new BigInteger("7fffffffffffffffffffffff7fffffffffff8000000000007ffffffffffc", 16), new BigInteger("255705fa2a306654b1f4cb03d6a750a30c250102d4988717d9ba15ab6d3e", 16));
        return new X9ECParameters(fp, fp.a(Hex.a("036768ae8e18bb92cfcf005c949aa2c6d94853d0e660bbf854b1c9505fe95a")), new BigInteger("7fffffffffffffffffffffff7fffff975deb41b3a6057c3c432146526551", 16), BigInteger.valueOf(1L), Hex.a("7d7374168ffe3471b60a857686a19475d3bfa2ff"));
    }
}
