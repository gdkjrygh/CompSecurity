// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.crypto.params:
//            AsymmetricKeyParameter

public class NaccacheSternKeyParameters extends AsymmetricKeyParameter
{

    int b;
    private BigInteger c;
    private BigInteger d;

    public NaccacheSternKeyParameters(boolean flag, BigInteger biginteger, BigInteger biginteger1, int i)
    {
        super(flag);
        c = biginteger;
        d = biginteger1;
        b = i;
    }

    public BigInteger getG()
    {
        return c;
    }

    public int getLowerSigmaBound()
    {
        return b;
    }

    public BigInteger getModulus()
    {
        return d;
    }
}
