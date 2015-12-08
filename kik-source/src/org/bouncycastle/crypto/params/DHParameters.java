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

    private BigInteger a;
    private BigInteger b;
    private BigInteger c;
    private BigInteger d;
    private int e;
    private int f;
    private DHValidationParameters g;

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

    public DHParameters(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, int i, int j)
    {
        this(biginteger, biginteger1, biginteger2, i, j, null, null);
    }

    public DHParameters(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, int i, int j, BigInteger biginteger3, DHValidationParameters dhvalidationparameters)
    {
        if (j != 0)
        {
            if (j >= biginteger.bitLength())
            {
                throw new IllegalArgumentException("when l value specified, it must be less than bitlength(p)");
            }
            if (j < i)
            {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        a = biginteger1;
        b = biginteger;
        c = biginteger2;
        e = i;
        f = j;
        d = biginteger3;
        g = dhvalidationparameters;
    }

    public DHParameters(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, BigInteger biginteger3, DHValidationParameters dhvalidationparameters)
    {
        this(biginteger, biginteger1, biginteger2, 160, 0, biginteger3, dhvalidationparameters);
    }

    private static int getDefaultMParam(int i)
    {
        int j;
        if (i == 0)
        {
            j = 160;
        } else
        {
            j = i;
            if (i >= 160)
            {
                return 160;
            }
        }
        return j;
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
        if (((DHParameters) (obj)).getP().equals(b) && ((DHParameters) (obj)).getG().equals(a))
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
        return a;
    }

    public BigInteger getJ()
    {
        return d;
    }

    public int getL()
    {
        return f;
    }

    public int getM()
    {
        return e;
    }

    public BigInteger getP()
    {
        return b;
    }

    public BigInteger getQ()
    {
        return c;
    }

    public DHValidationParameters getValidationParameters()
    {
        return g;
    }

    public int hashCode()
    {
        int j = getP().hashCode();
        int k = getG().hashCode();
        int i;
        if (getQ() != null)
        {
            i = getQ().hashCode();
        } else
        {
            i = 0;
        }
        return i ^ (k ^ j);
    }
}
