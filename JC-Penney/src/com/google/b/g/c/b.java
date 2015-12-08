// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.g.c;

import java.lang.reflect.Array;

public final class b
{

    private final byte a[][];
    private final int b;
    private final int c;

    public b(int i, int j)
    {
        a = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            j, i
        });
        b = i;
        c = j;
    }

    public byte a(int i, int j)
    {
        return a[j][i];
    }

    public int a()
    {
        return c;
    }

    public void a(byte byte0)
    {
        for (int i = 0; i < c; i++)
        {
            for (int j = 0; j < b; j++)
            {
                a[i][j] = byte0;
            }

        }

    }

    public void a(int i, int j, int k)
    {
        a[j][i] = (byte)k;
    }

    public void a(int i, int j, boolean flag)
    {
        byte abyte0[] = a[j];
        if (flag)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        abyte0[i] = (byte)j;
    }

    public int b()
    {
        return b;
    }

    public byte[][] c()
    {
        return a;
    }

    public String toString()
    {
        StringBuilder stringbuilder;
        int i;
        stringbuilder = new StringBuilder(b * 2 * c + 2);
        i = 0;
_L5:
        int j;
        if (i >= c)
        {
            break; /* Loop/switch isn't completed */
        }
        j = 0;
_L2:
        if (j >= b)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        switch (a[i][j])
        {
        default:
            stringbuilder.append("  ");
            break;

        case 0: // '\0'
            break; /* Loop/switch isn't completed */

        case 1: // '\001'
            break MISSING_BLOCK_LABEL_96;
        }
_L3:
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        stringbuilder.append(" 0");
          goto _L3
        stringbuilder.append(" 1");
          goto _L3
        stringbuilder.append('\n');
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        return stringbuilder.toString();
    }
}
