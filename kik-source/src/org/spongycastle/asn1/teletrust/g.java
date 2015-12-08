// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.teletrust;

import java.math.BigInteger;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.asn1.x9.X9ECParametersHolder;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.util.encoders.Hex;

final class g extends X9ECParametersHolder
{

    g()
    {
    }

    protected final X9ECParameters a()
    {
        org.spongycastle.math.ec.ECCurve.Fp fp = new org.spongycastle.math.ec.ECCurve.Fp(new BigInteger("E95E4A5F737059DC60DFC7AD95B3D8139515620F", 16), new BigInteger("E95E4A5F737059DC60DFC7AD95B3D8139515620C", 16), new BigInteger("7A556B6DAE535B7B51ED2C4D7DAA7A0B5C55F380", 16));
        return new X9ECParameters(fp, fp.a(Hex.a("04B199B13B9B34EFC1397E64BAEB05ACC265FF2378ADD6718B7C7C1961F0991B842443772152C9E0AD")), new BigInteger("E95E4A5F737059DC60DF5991D45029409E60FC09", 16), new BigInteger("01", 16));
    }
}
