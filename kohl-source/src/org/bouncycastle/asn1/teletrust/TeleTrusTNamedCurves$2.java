// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.teletrust;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.encoders.Hex;

// Referenced classes of package org.bouncycastle.asn1.teletrust:
//            TeleTrusTNamedCurves

static class  extends X9ECParametersHolder
{

    protected X9ECParameters createParameters()
    {
        org.bouncycastle.math.ec.rves._cls2 _lcls2 = new org.bouncycastle.math.ec.rves._cls2(new BigInteger("E95E4A5F737059DC60DFC7AD95B3D8139515620F", 16), new BigInteger("E95E4A5F737059DC60DFC7AD95B3D8139515620C", 16), new BigInteger("7A556B6DAE535B7B51ED2C4D7DAA7A0B5C55F380", 16));
        return new X9ECParameters(_lcls2, _lcls2.decodePoint(Hex.decode("04B199B13B9B34EFC1397E64BAEB05ACC265FF2378ADD6718B7C7C1961F0991B842443772152C9E0AD")), new BigInteger("E95E4A5F737059DC60DF5991D45029409E60FC09", 16), new BigInteger("01", 16));
    }

    ()
    {
    }
}
