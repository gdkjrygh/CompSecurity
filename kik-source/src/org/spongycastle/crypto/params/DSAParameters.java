// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;

// Referenced classes of package org.spongycastle.crypto.params:
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

    public final BigInteger a()
    {
        return c;
    }

    public final BigInteger b()
    {
        return b;
    }

    public final BigInteger c()
    {
        return a;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DSAParameters)
        {
            if (((DSAParameters) (obj = (DSAParameters)obj)).c.equals(c) && ((DSAParameters) (obj)).b.equals(b) && ((DSAParameters) (obj)).a.equals(a))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return c.hashCode() ^ b.hashCode() ^ a.hashCode();
    }
}
