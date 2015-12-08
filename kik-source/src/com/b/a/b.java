// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;


public final class b
{

    public static final byte a[];
    public static final b b;
    private final byte c[];
    private volatile int d;

    private b(byte abyte0[])
    {
        d = 0;
        c = abyte0;
    }

    static b a(byte abyte0[])
    {
        return new b(abyte0);
    }

    public static b a(byte abyte0[], int i, int j)
    {
        byte abyte1[] = new byte[j];
        System.arraycopy(abyte0, i, abyte1, 0, j);
        return new b(abyte1);
    }

    public static b b(byte abyte0[])
    {
        return a(abyte0, 0, abyte0.length);
    }

    final byte[] a()
    {
        return c;
    }

    public final int b()
    {
        return c.length;
    }

    public final byte[] c()
    {
        int i = c.length;
        byte abyte0[] = new byte[i];
        System.arraycopy(c, 0, abyte0, 0, i);
        return abyte0;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj == this) goto _L2; else goto _L1
_L1:
        boolean flag = flag1;
        if (!(obj instanceof b)) goto _L4; else goto _L3
_L3:
        b b1;
        int j;
        b1 = (b)obj;
        j = c.length;
        if (j == b1.c.length) goto _L6; else goto _L5
_L5:
        int i = 0;
_L8:
        flag = flag1;
        if (i == 0) goto _L4; else goto _L2
_L2:
        flag = true;
_L4:
        return flag;
_L6:
        obj = c;
        byte abyte0[] = b1.c;
        i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            if (obj[i] != abyte0[i])
            {
                i = 0;
                continue; /* Loop/switch isn't completed */
            }
            i++;
        } while (true);
        i = 1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final int hashCode()
    {
        int i = d;
        int k = i;
        if (i == 0)
        {
            byte abyte0[] = c;
            int l = c.length;
            k = 0;
            int j;
            byte byte0;
            for (j = l; k < l; j = byte0 + j * 31)
            {
                byte0 = abyte0[k];
                k++;
            }

            k = j;
            if (j == 0)
            {
                k = 1;
            }
            d = k;
        }
        return k;
    }

    public final String toString()
    {
        return w.a.a(c);
    }

    static 
    {
        a = new byte[0];
        b = new b(a);
    }
}
