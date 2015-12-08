// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x9;

import java.math.BigInteger;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.util.encoders.Hex;

// Referenced classes of package org.spongycastle.asn1.x9:
//            X9ECParametersHolder, X9ECParameters

final class d extends X9ECParametersHolder
{

    d()
    {
    }

    protected final X9ECParameters a()
    {
        BigInteger biginteger = new BigInteger("40000000000000000000000004A20E90C39067C893BBB9A5", 16);
        BigInteger biginteger1 = BigInteger.valueOf(2L);
        org.spongycastle.math.ec.ECCurve.F2m f2m = new org.spongycastle.math.ec.ECCurve.F2m(191, 9, new BigInteger("2866537B676752636A68F56554E12640276B649EF7526267", 16), new BigInteger("2E45EF571F00786F67B0081B9495A3D95462F5DE0AA185EC", 16), biginteger, biginteger1);
        return new X9ECParameters(f2m, f2m.a(Hex.a("0236B3DAF8A23206F9C4F299D7B21A9C369137F2C84AE1AA0D")), biginteger, biginteger1, Hex.a("4E13CA542744D696E67687561517552F279A8C84"));
    }
}
