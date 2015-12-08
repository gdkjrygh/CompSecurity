// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

// Referenced classes of package org.bouncycastle.crypto.params:
//            DSAValidationParameters

public class DSAParameters
    implements CipherParameters
{

    private BigInteger a;
    private BigInteger b;
    private BigInteger c;
    private DSAValidationParameters d;

    public DSAParameters(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2)
    {
        a = biginteger2;
        c = biginteger;
        b = biginteger1;
    }

    public DSAParameters(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, DSAValidationParameters dsavalidationparameters)
    {
        a = biginteger2;
        c = biginteger;
        b = biginteger1;
        d = dsavalidationparameters;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DSAParameters)
        {
            if (((DSAParameters) (obj = (DSAParameters)obj)).getP().equals(c) && ((DSAParameters) (obj)).getQ().equals(b) && ((DSAParameters) (obj)).getG().equals(a))
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

    public BigInteger getP()
    {
        return c;
    }

    public BigInteger getQ()
    {
        return b;
    }

    public DSAValidationParameters getValidationParameters()
    {
        return d;
    }

    public int hashCode()
    {
        return getP().hashCode() ^ getQ().hashCode() ^ getG().hashCode();
    }
}
