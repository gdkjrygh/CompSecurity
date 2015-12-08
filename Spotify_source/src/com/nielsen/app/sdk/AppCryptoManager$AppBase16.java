// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;


public class 
{

    private static final String a = "0123456789ABCDEF";

    private static void a(StringBuffer stringbuffer, byte byte0)
    {
        stringbuffer.append("0123456789ABCDEF".charAt(byte0 >> 4 & 0xf)).append("0123456789ABCDEF".charAt(byte0 & 0xf));
    }

    public static byte[] decodeBytes(String s)
    {
        int j = s.length() / 2;
        byte abyte0[] = new byte[j];
        for (int i = 0; i < j; i++)
        {
            abyte0[i] = Integer.valueOf(s.substring(i * 2, i * 2 + 1), 16).byteValue();
        }

        return abyte0;
    }

    public static String decodeString(String s)
    {
        return new String(decodeBytes(s));
    }

    public static String encode(String s)
    {
        return encode(s.getBytes());
    }

    public static String encode(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return "";
        }
        StringBuffer stringbuffer = new StringBuffer(abyte0.length * 2);
        for (int i = 0; i < abyte0.length; i++)
        {
            a(stringbuffer, abyte0[i]);
        }

        return stringbuffer.toString();
    }

    public ()
    {
    }
}
