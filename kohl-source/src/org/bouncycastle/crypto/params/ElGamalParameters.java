// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

public class ElGamalParameters
    implements CipherParameters
{

    private BigInteger g;
    private int l;
    private BigInteger p;

    public ElGamalParameters(BigInteger biginteger, BigInteger biginteger1)
    {
        this(biginteger, biginteger1, 0);
    }

    public ElGamalParameters(BigInteger biginteger, BigInteger biginteger1, int i)
    {
        g = biginteger1;
        p = biginteger;
        l = i;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ElGamalParameters)
        {
            if (((ElGamalParameters) (obj = (ElGamalParameters)obj)).getP().equals(p) && ((ElGamalParameters) (obj)).getG().equals(g) && ((ElGamalParameters) (obj)).getL() == l)
            {
                return true;
            }
        }
        return false;
    }

    public BigInteger getG()
    {
        return g;
    }

    public int getL()
    {
        return l;
    }

    public BigInteger getP()
    {
        return p;
    }

    public int hashCode()
    {
        return (getP().hashCode() ^ getG().hashCode()) + l;
    }
}
