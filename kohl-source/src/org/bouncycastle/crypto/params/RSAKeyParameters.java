// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.crypto.params:
//            AsymmetricKeyParameter

public class RSAKeyParameters extends AsymmetricKeyParameter
{

    private BigInteger exponent;
    private BigInteger modulus;

    public RSAKeyParameters(boolean flag, BigInteger biginteger, BigInteger biginteger1)
    {
        super(flag);
        modulus = biginteger;
        exponent = biginteger1;
    }

    public BigInteger getExponent()
    {
        return exponent;
    }

    public BigInteger getModulus()
    {
        return modulus;
    }
}
