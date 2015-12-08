// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.util;

import com.google.common.base.Preconditions;

public final class Hex
{

    static final char LOWER[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };
    static final char UPPER[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F'
    };

    public static byte[] decode(String s)
        throws IllegalArgumentException
    {
        int k = s.length();
        byte abyte0[];
        int i;
        int j;
        boolean flag;
        if (k % 2 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "String not of even length: %s", new Object[] {
            s
        });
        abyte0 = new byte[k / 2];
        j = 0;
        i = 0;
        while (j < k) 
        {
            char c = s.charAt(j);
            char c1 = s.charAt(j + 1);
            int l = Character.digit(c, 16);
            int i1 = Character.digit(c1, 16);
            if (l != -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Invalid character: '%s'", new Object[] {
                String.valueOf(c)
            });
            if (i1 != -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Invalid character: '%s'", new Object[] {
                String.valueOf(c1)
            });
            abyte0[i] = (byte)(l << 4 | i1);
            j += 2;
            i++;
        }
        return abyte0;
    }

    private static String doEncode(byte abyte0[], char ac[])
    {
        StringBuilder stringbuilder = new StringBuilder(abyte0.length << 1);
        int j = abyte0.length;
        for (int i = 0; i < j; i++)
        {
            byte byte0 = abyte0[i];
            stringbuilder.append(ac[(byte0 & 0xf0) >> 4]).append(ac[byte0 & 0xf]);
        }

        return stringbuilder.toString();
    }

    public static String encode(byte abyte0[])
    {
        return doEncode(abyte0, LOWER);
    }

}
