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
    private BigInteger p;
    private BigInteger q;
    private GOST3410ValidationParameters validation;

    public GOST3410Parameters(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2)
    {
        p = biginteger;
        q = biginteger1;
        a = biginteger2;
    }

    public GOST3410Parameters(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, GOST3410ValidationParameters gost3410validationparameters)
    {
        a = biginteger2;
        p = biginteger;
        q = biginteger1;
        validation = gost3410validationparameters;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof GOST3410Parameters)
        {
            if (((GOST3410Parameters) (obj = (GOST3410Parameters)obj)).getP().equals(p) && ((GOST3410Parameters) (obj)).getQ().equals(q) && ((GOST3410Parameters) (obj)).getA().equals(a))
            {
                return true;
            }
        }
        return false;
    }

    public BigInteger getA()
    {
        return a;
    }

    public BigInteger getP()
    {
        return p;
    }

    public BigInteger getQ()
    {
        return q;
    }

    public GOST3410ValidationParameters getValidationParameters()
    {
        return validation;
    }

    public int hashCode()
    {
        return p.hashCode() ^ q.hashCode() ^ a.hashCode();
    }
}
