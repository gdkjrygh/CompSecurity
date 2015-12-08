// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.math.ec.ECConstants;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECPoint;

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

    public final ECCurve a()
    {
        return a;
    }

    public final ECPoint b()
    {
        return c;
    }

    public final BigInteger c()
    {
        return d;
    }

    public final BigInteger d()
    {
        return e;
    }

    public final byte[] e()
    {
        return b;
    }
}
