// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.math.ec;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.math.ec:
//            ECConstants

final class e
{

    private final BigInteger a;
    private final int b;

    public e(BigInteger biginteger, int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("scale may not be negative");
        } else
        {
            a = biginteger;
            b = i;
            return;
        }
    }

    private e(e e1)
    {
        a = e1.a;
        b = e1.b;
    }

    private BigInteger c()
    {
        return a.shiftRight(b);
    }

    public final BigInteger a()
    {
        e e1 = new e(ECConstants.g, 1);
        int i = b;
        if (i < 0)
        {
            throw new IllegalArgumentException("scale may not be negative");
        }
        if (i == e1.b)
        {
            e1 = new e(e1);
        } else
        {
            e1 = new e(e1.a.shiftLeft(i - e1.b), i);
        }
        return a(e1).c();
    }

    public final e a(BigInteger biginteger)
    {
        return new e(a.subtract(biginteger.shiftLeft(b)), b);
    }

    public final e a(e e1)
    {
        if (b != e1.b)
        {
            throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
        } else
        {
            return new e(a.add(e1.a), b);
        }
    }

    public final int b()
    {
        return b;
    }

    public final int b(BigInteger biginteger)
    {
        return a.compareTo(biginteger.shiftLeft(b));
    }

    public final e b(e e1)
    {
        return a(new e(e1.a.negate(), e1.b));
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof e))
            {
                return false;
            }
            obj = (e)obj;
            if (!a.equals(((e) (obj)).a) || b != ((e) (obj)).b)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return a.hashCode() ^ b;
    }

    public final String toString()
    {
        if (b == 0)
        {
            return a.toString();
        }
        BigInteger biginteger = c();
        Object obj1 = a.subtract(biginteger.shiftLeft(b));
        Object obj = obj1;
        if (a.signum() == -1)
        {
            obj = ECConstants.g.shiftLeft(b).subtract(((BigInteger) (obj1)));
        }
        obj1 = biginteger;
        if (biginteger.signum() == -1)
        {
            obj1 = biginteger;
            if (!((BigInteger) (obj)).equals(ECConstants.f))
            {
                obj1 = biginteger.add(ECConstants.g);
            }
        }
        obj1 = ((BigInteger) (obj1)).toString();
        char ac[] = new char[b];
        obj = ((BigInteger) (obj)).toString(2);
        int k = ((String) (obj)).length();
        int l = b - k;
        for (int i = 0; i < l; i++)
        {
            ac[i] = '0';
        }

        for (int j = 0; j < k; j++)
        {
            ac[l + j] = ((String) (obj)).charAt(j);
        }

        obj = new String(ac);
        obj1 = new StringBuffer(((String) (obj1)));
        ((StringBuffer) (obj1)).append(".");
        ((StringBuffer) (obj1)).append(((String) (obj)));
        return ((StringBuffer) (obj1)).toString();
    }
}
