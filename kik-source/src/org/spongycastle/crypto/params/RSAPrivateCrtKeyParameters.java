// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import java.math.BigInteger;

// Referenced classes of package org.spongycastle.crypto.params:
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

    public final BigInteger d()
    {
        return b;
    }

    public final BigInteger e()
    {
        return c;
    }

    public final BigInteger f()
    {
        return d;
    }

    public final BigInteger g()
    {
        return e;
    }

    public final BigInteger h()
    {
        return f;
    }

    public final BigInteger i()
    {
        return g;
    }
}
