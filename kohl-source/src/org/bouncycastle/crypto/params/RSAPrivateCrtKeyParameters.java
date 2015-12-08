// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.crypto.params:
//            RSAKeyParameters

public class RSAPrivateCrtKeyParameters extends RSAKeyParameters
{

    private BigInteger dP;
    private BigInteger dQ;
    private BigInteger e;
    private BigInteger p;
    private BigInteger q;
    private BigInteger qInv;

    public RSAPrivateCrtKeyParameters(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, BigInteger biginteger3, BigInteger biginteger4, BigInteger biginteger5, BigInteger biginteger6, 
            BigInteger biginteger7)
    {
        super(true, biginteger, biginteger2);
        e = biginteger1;
        p = biginteger3;
        q = biginteger4;
        dP = biginteger5;
        dQ = biginteger6;
        qInv = biginteger7;
    }

    public BigInteger getDP()
    {
        return dP;
    }

    public BigInteger getDQ()
    {
        return dQ;
    }

    public BigInteger getP()
    {
        return p;
    }

    public BigInteger getPublicExponent()
    {
        return e;
    }

    public BigInteger getQ()
    {
        return q;
    }

    public BigInteger getQInv()
    {
        return qInv;
    }
}
