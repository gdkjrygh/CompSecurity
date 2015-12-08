// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;

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

    public final BigInteger a()
    {
        return b;
    }

    public final BigInteger b()
    {
        return a;
    }

    public final int c()
    {
        return c;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ElGamalParameters)
        {
            if (((ElGamalParameters) (obj = (ElGamalParameters)obj)).b.equals(b) && ((ElGamalParameters) (obj)).a.equals(a) && ((ElGamalParameters) (obj)).c == c)
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return (b.hashCode() ^ a.hashCode()) + c;
    }
}
