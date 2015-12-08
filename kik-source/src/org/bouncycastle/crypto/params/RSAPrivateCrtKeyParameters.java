// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.crypto.params:
//            RSAKeyParameters

public class RSAPrivateCrtKeyParameters extends RSAKeyParameters
{

    private BigInteger b;
    private BigInteger c;
    private BigInteger d;
    private BigInteger e;
    private BigInteger f;
    private BigInteger g;

    public RSAPrivateCrtKeyParameters(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, BigInteger biginteger3, BigInteger biginteger4, BigInteger biginteger5, BigInteger biginteger6, 
            BigInteger biginteger7)
    {
        super(true, biginteger, biginteger2);
        b = biginteger1;
        c = biginteger3;
        d = biginteger4;
        e = biginteger5;
        f = biginteger6;
        g = biginteger7;
    }

    public BigInteger getDP()
    {
        return e;
    }

    public BigInteger getDQ()
    {
        return f;
    }

    public BigInteger getP()
    {
        return c;
    }

    public BigInteger getPublicExponent()
    {
        return b;
    }

    public BigInteger getQ()
    {
        return d;
    }

    public BigInteger getQInv()
    {
        return g;
    }
}
