// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics.security;


public class BinTools
{

    public static final String hex = "0123456789abcdef";

    public BinTools()
    {
    }

    public static String bin2hex(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return "";
        }
        StringBuffer stringbuffer = new StringBuffer(abyte0.length * 2);
        int i = 0;
        do
        {
            if (i >= abyte0.length)
            {
                return stringbuffer.toString();
            }
            int j = (abyte0[i] + 256) % 256;
            stringbuffer.append("0123456789abcdef".charAt(j / 16 & 0xf));
            stringbuffer.append("0123456789abcdef".charAt(j % 16 & 0xf));
            i++;
        } while (true);
    }

    public static int hex2bin(char c)
    {
        if (c >= '0' && c <= '9')
        {
            return c - 48;
        }
        if (c >= 'A' && c <= 'F')
        {
            return (c - 65) + 10;
        }
        if (c >= 'a' && c <= 'f')
        {
            return (c - 97) + 10;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Input string may only contain hex digits, but found '")).append(c).append("'").toString());
        }
    }

    public static byte[] hex2bin(String s)
    {
        String s1 = s;
        int i;
        int j;
        if (s == null)
        {
            s1 = "";
        } else
        if (s.length() % 2 != 0)
        {
            s1 = (new StringBuilder("0")).append(s).toString();
        }
        s = new byte[s1.length() / 2];
        j = 0;
        i = 0;
        do
        {
            if (j >= s1.length())
            {
                return s;
            }
            int k = j + 1;
            char c = s1.charAt(j);
            j = k + 1;
            char c1 = s1.charAt(k);
            s[i] = (byte)(hex2bin(c) * 16 + hex2bin(c1));
            i++;
        } while (true);
    }

    public static void main(String args[])
    {
        args = new byte[256];
        int i = 0;
        String s = 0;
        do
        {
            if (i >= 256)
            {
                args = bin2hex(args);
                byte byte0;
                if (!args.equals(bin2hex(hex2bin(args))))
                {
                    throw new AssertionError("Mismatch");
                } else
                {
                    return;
                }
            }
            byte0 = (byte)(s + 1);
            args[i] = s;
            i++;
            s = byte0;
        } while (true);
    }
}
