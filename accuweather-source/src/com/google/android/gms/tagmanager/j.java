// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


class j
{

    public static byte[] bE(String s)
    {
        int k = s.length();
        if (k % 2 != 0)
        {
            throw new IllegalArgumentException("purported base16 string has odd number of characters");
        }
        byte abyte0[] = new byte[k / 2];
        for (int i = 0; i < k; i += 2)
        {
            int l = Character.digit(s.charAt(i), 16);
            int i1 = Character.digit(s.charAt(i + 1), 16);
            if (l == -1 || i1 == -1)
            {
                throw new IllegalArgumentException("purported base16 string has illegal char");
            }
            abyte0[i / 2] = (byte)((l << 4) + i1);
        }

        return abyte0;
    }

    public static String d(byte abyte0[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        int k = abyte0.length;
        for (int i = 0; i < k; i++)
        {
            byte byte0 = abyte0[i];
            if ((byte0 & 0xf0) == 0)
            {
                stringbuilder.append("0");
            }
            stringbuilder.append(Integer.toHexString(byte0 & 0xff));
        }

        return stringbuilder.toString().toUpperCase();
    }
}
