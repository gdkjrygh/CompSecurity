// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.nio.charset.Charset;

public class NativeStringConvert
{

    private static final String LOG_TAG = "SkypeJNI";
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    public NativeStringConvert()
    {
    }

    public static byte[][] ConvertArrToNativeByteArr(String as[])
    {
        if (as == null)
        {
            throw new NullPointerException("ConvertArrToNativeByteArr received null argument");
        }
        byte abyte0[][] = new byte[as.length][];
        for (int i = 0; i < as.length; i++)
        {
            abyte0[i] = ConvertToNativeBytes(as[i]);
        }

        return abyte0;
    }

    public static String ConvertFromNativeBytes(byte abyte0[])
    {
        if (abyte0[0] != 0)
        {
            return new String(abyte0, UTF_8);
        } else
        {
            return "";
        }
    }

    public static String[] ConvertFromNativeStringArray(byte abyte0[][])
    {
        String as[] = new String[abyte0.length];
        for (int i = 0; i < abyte0.length; i++)
        {
            as[i] = ConvertFromNativeBytes(abyte0[i]);
        }

        return as;
    }

    public static byte[] ConvertToNativeBytes(String s)
    {
        if (s == null)
        {
            throw new NullPointerException("ConvertToNativeBytes received null argument");
        }
        byte abyte0[] = (new StringBuilder()).append(s).append('\0').toString().getBytes(UTF_8);
        s = abyte0;
        if (abyte0 == null)
        {
            s = new byte[1];
            s[0] = 0;
        }
        return s;
    }

}
