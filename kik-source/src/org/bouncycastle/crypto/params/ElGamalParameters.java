// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

public class ElGamalParameters
    implements CipherParameters
{

    private BigInteger a;
    private BigInteger b;
    private int c;

    public ElGamalParameters(BigInteger biginteger, BigInteger biginteger1)
    {
        this(biginteger, biginteger1, 0);
    }

    public ElGamalParameters(BigInteger biginteger, BigInteger biginteger1, int i)
    {
        a = biginteger1;
        b = biginteger;
        c = i;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ElGamalParameters)
        {
            if (((ElGamalParameters) (obj = (ElGamalParameters)obj)).getP().equals(b) && ((ElGamalParameters) (obj)).getG().equals(a) && ((ElGamalParameters) (obj)).getL() == c)
            {
                return true;
            }
        }
        return false;
    }

    public BigInteger getG()
    {
        return a;
    }

    public int getL()
    {
        return c;
    }

    public BigInteger getP()
    {
        return b;
    }

    public int hashCode()
    {
        return (getP().hashCode() ^ getG().hashCode()) + c;
    }
}
