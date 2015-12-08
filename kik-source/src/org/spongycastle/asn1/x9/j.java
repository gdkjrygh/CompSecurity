// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x9;

import java.math.BigInteger;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.util.encoders.Hex;

// Referenced classes of package org.spongycastle.asn1.x9:
//            X9ECParametersHolder, X9ECParameters

final class j extends X9ECParametersHolder
{

    j()
    {
    }

    protected final X9ECParameters a()
    {
        BigInteger biginteger = new BigInteger("0CCCCCCCCCCCCCCCCCCCCCCCCCCCCCAC4912D2D9DF903EF9888B8A0E4CFF", 16);
        BigInteger biginteger1 = BigInteger.valueOf(10L);
        org.spongycastle.math.ec.ECCurve.F2m f2m = new org.spongycastle.math.ec.ECCurve.F2m(239, 36, new BigInteger("01238774666A67766D6676F778E676B66999176666E687666D8766C66A9F", 16), new BigInteger("6A941977BA9F6A435199ACFC51067ED587F519C5ECB541B8E44111DE1D40", 16), biginteger, biginteger1);
        return new X9ECParameters(f2m, f2m.a(Hex.a("0370F6E9D04D289C4E89913CE3530BFDE903977D42B146D539BF1BDE4E9C92")), biginteger, biginteger1, null);
    }
}
