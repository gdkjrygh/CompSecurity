// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;

public class GOST3410Parameters
    implements CipherParameters
{

    private BigInteger a;
    private BigInteger b;
    private BigInteger c;

    public GOST3410Parameters(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2)
    {
        a = biginteger;
        b = biginteger1;
        c = biginteger2;
    }

    public final BigInteger a()
    {
        return a;
    }

    public final BigInteger b()
    {
        return b;
    }

    public final BigInteger c()
    {
        return c;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof GOST3410Parameters)
        {
            if (((GOST3410Parameters) (obj = (GOST3410Parameters)obj)).a.equals(a) && ((GOST3410Parameters) (obj)).b.equals(b) && ((GOST3410Parameters) (obj)).c.equals(c))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return a.hashCode() ^ b.hashCode() ^ c.hashCode();
    }
}
