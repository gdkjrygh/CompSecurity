// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x9;

import java.math.BigInteger;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.util.encoders.Hex;

// Referenced classes of package org.spongycastle.asn1.x9:
//            X9ECParametersHolder, X9ECParameters

final class u extends X9ECParametersHolder
{

    u()
    {
    }

    protected final X9ECParameters a()
    {
        org.spongycastle.math.ec.ECCurve.Fp fp = new org.spongycastle.math.ec.ECCurve.Fp(new BigInteger("115792089210356248762697446949407573530086143415290314195533631308867097853951"), new BigInteger("ffffffff00000001000000000000000000000000fffffffffffffffffffffffc", 16), new BigInteger("5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", 16));
        return new X9ECParameters(fp, fp.a(Hex.a("036b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296")), new BigInteger("ffffffff00000000ffffffffffffffffbce6faada7179e84f3b9cac2fc632551", 16), BigInteger.valueOf(1L), Hex.a("c49d360886e704936a6678e1139d26b7819f7e90"));
    }
}
