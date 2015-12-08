// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.sec;

import java.math.BigInteger;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.asn1.x9.X9ECParametersHolder;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.util.encoders.Hex;

// Referenced classes of package org.spongycastle.asn1.sec:
//            SECNamedCurves

final class n extends X9ECParametersHolder
{

    n()
    {
    }

    protected final X9ECParameters a()
    {
        Object obj = SECNamedCurves.c("07B6882CAAEFA84F9554FF8428BD88E246D2782AE2");
        BigInteger biginteger2 = SECNamedCurves.c("0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9");
        byte abyte0[] = Hex.a("24B7B137C8A14D696E6768756151756FD0DA2E5C");
        BigInteger biginteger = SECNamedCurves.c("03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B");
        BigInteger biginteger1 = BigInteger.valueOf(2L);
        obj = new org.spongycastle.math.ec.ECCurve.F2m(163, 3, 6, 7, ((BigInteger) (obj)), biginteger2, biginteger, biginteger1);
        return new X9ECParameters(((ECCurve) (obj)), ((ECCurve) (obj)).a(Hex.a("040369979697AB43897789566789567F787A7876A65400435EDB42EFAFB2989D51FEFCE3C80988F41FF883")), biginteger, biginteger1, abyte0);
    }
}
