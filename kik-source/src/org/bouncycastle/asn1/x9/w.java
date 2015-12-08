// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.encoders.Hex;

// Referenced classes of package org.bouncycastle.asn1.x9:
//            X9ECParametersHolder, X9ECParameters

final class w extends X9ECParametersHolder
{

    w()
    {
    }

    protected final X9ECParameters a()
    {
        BigInteger biginteger = new BigInteger("03FFFFFFFFFFFFFFFFFFFDF64DE1151ADBB78F10A7", 16);
        BigInteger biginteger1 = BigInteger.valueOf(2L);
        org.bouncycastle.math.ec.ECCurve.F2m f2m = new org.bouncycastle.math.ec.ECCurve.F2m(163, 1, 2, 8, new BigInteger("0108B39E77C4B108BED981ED0E890E117C511CF072", 16), new BigInteger("0667ACEB38AF4E488C407433FFAE4F1C811638DF20", 16), biginteger, biginteger1);
        return new X9ECParameters(f2m, f2m.a(Hex.a("030024266E4EB5106D0A964D92C4860E2671DB9B6CC5")), biginteger, biginteger1, null);
    }
}
