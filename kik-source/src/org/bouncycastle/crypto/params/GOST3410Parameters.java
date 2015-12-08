// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

// Referenced classes of package org.bouncycastle.crypto.params:
//            GOST3410ValidationParameters

public class GOST3410Parameters
    implements CipherParameters
{

    private BigInteger a;
    private BigInteger b;
    private BigInteger c;
    private GOST3410ValidationParameters d;

    public GOST3410Parameters(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2)
    {
        a = biginteger;
        b = biginteger1;
        c = biginteger2;
    }

    public GOST3410Parameters(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, GOST3410ValidationParameters gost3410validationparameters)
    {
        c = biginteger2;
        a = biginteger;
        b = biginteger1;
        d = gost3410validationparameters;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof GOST3410Parameters)
        {
            if (((GOST3410Parameters) (obj = (GOST3410Parameters)obj)).getP().equals(a) && ((GOST3410Parameters) (obj)).getQ().equals(b) && ((GOST3410Parameters) (obj)).getA().equals(c))
            {
                return true;
            }
        }
        return false;
    }

    public BigInteger getA()
    {
        return c;
    }

    public BigInteger getP()
    {
        return a;
    }

    public BigInteger getQ()
    {
        return b;
    }

    public GOST3410ValidationParameters getValidationParameters()
    {
        return d;
    }

    public int hashCode()
    {
        return a.hashCode() ^ b.hashCode() ^ c.hashCode();
    }
}
