// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.util;


public abstract class c
{

    private static final byte a[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 43, 47
    };
    private static final byte b[];

    public static String a(String s)
    {
        String s1 = "";
        byte abyte0[] = s.getBytes("UTF-8");
        s = abyte0;
_L2:
        int j;
        j = (3 - s.length % 3) % 3;
        byte abyte1[] = a(s.length + j, ((byte []) (s)));
        int i = 0;
        s = s1;
        for (; i < abyte1.length; i += 3)
        {
            int k = (abyte1[i] << 16) + (abyte1[i + 1] << 8) + abyte1[i + 2];
            s = (new StringBuilder()).append(s).append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(k >> 18 & 0x3f)).append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(k >> 12 & 0x3f)).append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(k >> 6 & 0x3f)).append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(k & 0x3f)).toString();
        }

        break; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        s = s.getBytes();
        if (true) goto _L2; else goto _L1
_L1:
        return b((new StringBuilder()).append(s.substring(0, s.length() - j)).append("==".substring(0, j)).toString()).trim();
    }

    public static byte[] a(int i, byte abyte0[])
    {
        byte abyte1[] = new byte[i];
        System.arraycopy(abyte0, 0, abyte1, 0, abyte0.length);
        return abyte1;
    }

    public static String b(String s)
    {
        String s1 = "";
        for (int i = 0; i < s.length(); i += 76)
        {
            s1 = (new StringBuilder()).append(s1).append(s.substring(i, Math.min(s.length(), i + 76))).toString();
            s1 = (new StringBuilder()).append(s1).append("\r\n").toString();
        }

        return s1;
    }

    static 
    {
        b = new byte[128];
        for (int i = 0; i < 128; i++)
        {
            b[i] = -1;
        }

        for (int j = 65; j <= 90; j++)
        {
            b[j] = (byte)(j - 65);
        }

        for (int k = 97; k <= 122; k++)
        {
            b[k] = (byte)((k - 97) + 26);
        }

        for (int l = 48; l <= 57; l++)
        {
            b[l] = (byte)((l - 48) + 52);
        }

        b[43] = 62;
        b[47] = 63;
    }
}
