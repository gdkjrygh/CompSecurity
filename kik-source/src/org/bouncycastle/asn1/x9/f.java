// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.encoders.Hex;

// Referenced classes of package org.bouncycastle.asn1.x9:
//            X9ECParametersHolder, X9ECParameters

final class f extends X9ECParametersHolder
{

    f()
    {
    }

    protected final X9ECParameters a()
    {
        BigInteger biginteger = new BigInteger("155555555555555555555555610C0B196812BFB6288A3EA3", 16);
        BigInteger biginteger1 = BigInteger.valueOf(6L);
        org.bouncycastle.math.ec.ECCurve.F2m f2m = new org.bouncycastle.math.ec.ECCurve.F2m(191, 9, new BigInteger("6C01074756099122221056911C77D77E77A777E7E7E77FCB", 16), new BigInteger("71FE1AF926CF847989EFEF8DB459F66394D90F32AD3F15E8", 16), biginteger, biginteger1);
        return new X9ECParameters(f2m, f2m.a(Hex.a("03375D4CE24FDE434489DE8746E71786015009E66E38A926DD")), biginteger, biginteger1, null);
    }
}
