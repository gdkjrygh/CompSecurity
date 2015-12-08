// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;


public class StringUtils
{

    public static final String LINE_SEPARATOR = System.getProperty("line.separator");

    private StringUtils()
    {
    }

    public static byte[] getBytesUtf8(String s)
    {
        return com.google.api.client.repackaged.org.apache.commons.codec.binary.StringUtils.getBytesUtf8(s);
    }

    public static String newStringUtf8(byte abyte0[])
    {
        return com.google.api.client.repackaged.org.apache.commons.codec.binary.StringUtils.newStringUtf8(abyte0);
    }

}
