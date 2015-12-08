// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.encoders.Hex;

// Referenced classes of package org.bouncycastle.asn1.x9:
//            X9ECParametersHolder, X962NamedCurves, X9ECParameters

static class r extends X9ECParametersHolder
{

    protected X9ECParameters createParameters()
    {
        BigInteger biginteger = new BigInteger("0101BAF95C9723C57B6C21DA2EFF2D5ED588BDD5717E212F9D", 16);
        BigInteger biginteger1 = BigInteger.valueOf(65096L);
        org.bouncycastle.math.ec.r r = new org.bouncycastle.math.ec.r(208, 1, 2, 83, new BigInteger("0", 16), new BigInteger("00C8619ED45A62E6212E1160349E2BFA844439FAFC2A3FD1638F9E", 16), biginteger, biginteger1);
        return new X9ECParameters(r, r.decodePoint(Hex.decode("0289FDFBE4ABE193DF9559ECF07AC0CE78554E2784EB8C1ED1A57A")), biginteger, biginteger1, null);
    }

    r()
    {
    }
}
