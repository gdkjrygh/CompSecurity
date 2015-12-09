// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.d;

import java.util.Arrays;

public final class a
{

    private static final byte a[];

    public static int a(long l)
    {
        if (l > 0x7fffffffL)
        {
            return 0x7fffffff;
        }
        if (l < 0xffffffff80000000L)
        {
            return 0x80000000;
        } else
        {
            return (int)l;
        }
    }

    static 
    {
        boolean flag = false;
        byte abyte0[] = new byte[128];
        a = abyte0;
        Arrays.fill(abyte0, (byte)-1);
        int i = 0;
        int j;
        do
        {
            j = ((flag) ? 1 : 0);
            if (i > 9)
            {
                break;
            }
            a[i + 48] = (byte)i;
            i++;
        } while (true);
        for (; j <= 26; j++)
        {
            a[j + 65] = (byte)(j + 10);
            a[j + 97] = (byte)(j + 10);
        }

    }
}
