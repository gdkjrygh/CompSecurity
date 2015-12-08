// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

public class ECDomainParameters
    implements ECConstants
{

    ECCurve a;
    byte b[];
    ECPoint c;
    BigInteger d;
    BigInteger e;

    public ECDomainParameters(ECCurve eccurve, ECPoint ecpoint, BigInteger biginteger)
    {
        a = eccurve;
        c = ecpoint;
        d = biginteger;
        e = g;
        b = null;
    }

    public ECDomainParameters(ECCurve eccurve, ECPoint ecpoint, BigInteger biginteger, BigInteger biginteger1)
    {
        a = eccurve;
        c = ecpoint;
        d = biginteger;
        e = biginteger1;
        b = null;
    }

    public ECDomainParameters(ECCurve eccurve, ECPoint ecpoint, BigInteger biginteger, BigInteger biginteger1, byte abyte0[])
    {
        a = eccurve;
        c = ecpoint;
        d = biginteger;
        e = biginteger1;
        b = abyte0;
    }

    public ECCurve getCurve()
    {
        return a;
    }

    public ECPoint getG()
    {
        return c;
    }

    public BigInteger getH()
    {
        return e;
    }

    public BigInteger getN()
    {
        return d;
    }

    public byte[] getSeed()
    {
        return b;
    }
}
