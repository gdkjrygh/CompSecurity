// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.encoders.Hex;

// Referenced classes of package org.bouncycastle.asn1.sec:
//            SECNamedCurves

static class er extends X9ECParametersHolder
{

    protected X9ECParameters createParameters()
    {
        Object obj = SECNamedCurves.access$000("DB7C2ABF62E35E668076BEAD208B");
        BigInteger biginteger2 = SECNamedCurves.access$000("6127C24C05F38A0AAAF65C0EF02C");
        BigInteger biginteger3 = SECNamedCurves.access$000("51DEF1815DB5ED74FCC34C85D709");
        byte abyte0[] = Hex.decode("002757A1114D696E6768756151755316C05E0BD4");
        BigInteger biginteger = SECNamedCurves.access$000("36DF0AAFD8B8D7597CA10520D04B");
        BigInteger biginteger1 = BigInteger.valueOf(4L);
        obj = new org.bouncycastle.math.ec.(((BigInteger) (obj)), biginteger2, biginteger3);
        return new X9ECParameters(((ECCurve) (obj)), ((ECCurve) (obj)).decodePoint(Hex.decode("044BA30AB5E892B4E1649DD0928643ADCD46F5882E3747DEF36E956E97")), biginteger, biginteger1, abyte0);
    }

    er()
    {
    }
}
