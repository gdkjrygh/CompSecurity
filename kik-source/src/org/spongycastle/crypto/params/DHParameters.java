// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;

// Referenced classes of package org.spongycastle.crypto.params:
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

    public DHParameters(BigInteger biginteger, BigInteger biginteger1, int i)
    {
        char c1 = '\240';
        int j = c1;
        if (i != 0)
        {
            j = c1;
            if (i < 160)
            {
                j = i;
            }
        }
        this(biginteger, biginteger1, null, j, i, null);
    }

    private DHParameters(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, int i, int j, BigInteger biginteger3)
    {
        if (j != 0)
        {
            if (BigInteger.valueOf(2L ^ (long)(j - 1)).compareTo(biginteger) == 1)
            {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
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
        g = null;
    }

    public DHParameters(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, BigInteger biginteger3)
    {
        this(biginteger, biginteger1, biginteger2, 160, 0, biginteger3);
    }

    public final BigInteger a()
    {
        return b;
    }

    public final BigInteger b()
    {
        return a;
    }

    public final BigInteger c()
    {
        return c;
    }

    public final int d()
    {
        return e;
    }

    public final int e()
    {
        return f;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DHParameters) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        obj = (DHParameters)obj;
        if (c == null) goto _L4; else goto _L3
_L3:
        if (!c.equals(((DHParameters) (obj)).c))
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
        if (((DHParameters) (obj)).b.equals(b) && ((DHParameters) (obj)).a.equals(a))
        {
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (((DHParameters) (obj)).c == null) goto _L6; else goto _L5
_L5:
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L7
_L7:
        return false;
    }

    public int hashCode()
    {
        int j = b.hashCode();
        int k = a.hashCode();
        int i;
        if (c != null)
        {
            i = c.hashCode();
        } else
        {
            i = 0;
        }
        return i ^ (k ^ j);
    }
}
