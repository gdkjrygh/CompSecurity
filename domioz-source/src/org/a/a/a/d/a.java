// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a.d;


public final class a
    implements Cloneable
{

    protected char a[];
    protected int b;
    private String c;

    public a()
    {
        this((byte)0);
    }

    private a(byte byte0)
    {
        a = new char[32];
    }

    public final a a(String s)
    {
_L7:
        if (s != null) goto _L2; else goto _L1
_L1:
        if (c != null) goto _L4; else goto _L3
_L3:
        return this;
_L4:
        s = c;
        continue; /* Loop/switch isn't completed */
_L2:
        int i = s.length();
        if (i <= 0) goto _L3; else goto _L5
_L5:
        int j = b;
        int k = j + i;
        if (k > a.length)
        {
            char ac[] = a;
            a = new char[k * 2];
            System.arraycopy(ac, 0, a, 0, b);
        }
        s.getChars(0, i, a, j);
        b = i + b;
        return this;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final Object clone()
    {
        a a1 = (a)super.clone();
        a1.a = new char[a.length];
        System.arraycopy(a, 0, a1.a, 0, a.length);
        return a1;
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof a)) goto _L2; else goto _L1
_L1:
        a a1;
        a1 = (a)obj;
        if (this == a1)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        if (b == a1.b) goto _L3; else goto _L2
_L2:
        return false;
_L3:
        obj = a;
        char ac[] = a1.a;
        int i = b - 1;
        do
        {
            if (i < 0)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            if (obj[i] != ac[i])
            {
                break;
            }
            i--;
        } while (true);
        if (true) goto _L2; else goto _L4
_L4:
        return true;
    }

    public final int hashCode()
    {
        char ac[] = a;
        int j = 0;
        for (int i = b - 1; i >= 0; i--)
        {
            j = j * 31 + ac[i];
        }

        return j;
    }

    public final String toString()
    {
        return new String(a, 0, b);
    }
}
