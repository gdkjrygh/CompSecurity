// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

// Referenced classes of package org.bouncycastle.crypto.params:
//            DHValidationParameters

public class DHParameters
    implements CipherParameters
{

    private static final int DEFAULT_MINIMUM_LENGTH = 160;
    private BigInteger g;
    private BigInteger j;
    private int l;
    private int m;
    private BigInteger p;
    private BigInteger q;
    private DHValidationParameters validation;

    public DHParameters(BigInteger biginteger, BigInteger biginteger1)
    {
        this(biginteger, biginteger1, null, 0);
    }

    public DHParameters(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2)
    {
        this(biginteger, biginteger1, biginteger2, 0);
    }

    public DHParameters(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, int i)
    {
        this(biginteger, biginteger1, biginteger2, getDefaultMParam(i), i, null, null);
    }

    public DHParameters(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, int i, int k)
    {
        this(biginteger, biginteger1, biginteger2, i, k, null, null);
    }

    public DHParameters(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, int i, int k, BigInteger biginteger3, DHValidationParameters dhvalidationparameters)
    {
        if (k != 0)
        {
            if (BigInteger.valueOf(2L ^ (long)(k - 1)).compareTo(biginteger) == 1)
            {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (k < i)
            {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        g = biginteger1;
        p = biginteger;
        q = biginteger2;
        m = i;
        l = k;
        j = biginteger3;
        validation = dhvalidationparameters;
    }

    public DHParameters(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, BigInteger biginteger3, DHValidationParameters dhvalidationparameters)
    {
        this(biginteger, biginteger1, biginteger2, 160, 0, biginteger3, dhvalidationparameters);
    }

    private static int getDefaultMParam(int i)
    {
        if (i == 0)
        {
            return 160;
        }
        if (i >= 160)
        {
            i = 160;
        }
        return i;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DHParameters) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        obj = (DHParameters)obj;
        if (getQ() == null) goto _L4; else goto _L3
_L3:
        if (!getQ().equals(((DHParameters) (obj)).getQ()))
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
        if (((DHParameters) (obj)).getP().equals(p) && ((DHParameters) (obj)).getG().equals(g))
        {
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (((DHParameters) (obj)).getQ() == null) goto _L6; else goto _L5
_L5:
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L7
_L7:
        return false;
    }

    public BigInteger getG()
    {
        return g;
    }

    public BigInteger getJ()
    {
        return j;
    }

    public int getL()
    {
        return l;
    }

    public int getM()
    {
        return m;
    }

    public BigInteger getP()
    {
        return p;
    }

    public BigInteger getQ()
    {
        return q;
    }

    public DHValidationParameters getValidationParameters()
    {
        return validation;
    }

    public int hashCode()
    {
        int k = getP().hashCode();
        int i1 = getG().hashCode();
        int i;
        if (getQ() != null)
        {
            i = getQ().hashCode();
        } else
        {
            i = 0;
        }
        return i ^ (i1 ^ k);
    }
}
