// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.a.d;


public final class a
{

    private static final char a[] = "0123456789ABCDEF".toCharArray();

    private static int a(char c)
    {
        if (c >= '0' && c <= '9')
        {
            return c - 48;
        }
        if (c >= 'a' && c <= 'f')
        {
            return (c - 97) + 10;
        } else
        {
            return (c - 65) + 10;
        }
    }

    public static byte[] a(CharSequence charsequence)
    {
        byte abyte0[] = new byte[(charsequence.length() + 1) / 2];
        if (charsequence.length() == 0)
        {
            return abyte0;
        }
        abyte0[0] = 0;
        int j = charsequence.length() % 2;
        int i = 0;
        while (i < charsequence.length()) 
        {
            char c = charsequence.charAt(i);
            boolean flag;
            if (c >= '0' && c <= '9' || c >= 'a' && c <= 'f' || c >= 'A' && c <= 'F')
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                throw new IllegalArgumentException("string contains non-hex chars");
            }
            if (j % 2 == 0)
            {
                abyte0[j >> 1] = (byte)(a(c) << 4);
            } else
            {
                int k = j >> 1;
                byte byte0 = abyte0[k];
                abyte0[k] = (byte)((byte)a(c) + byte0);
            }
            j++;
            i++;
        }
        return abyte0;
    }

}
