// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;


public class Base64
{

    private Base64()
    {
    }

    public static byte[] decodeBase64(String s)
    {
        return com.google.api.client.repackaged.org.apache.commons.codec.binary.Base64.decodeBase64(s);
    }

    public static byte[] decodeBase64(byte abyte0[])
    {
        return com.google.api.client.repackaged.org.apache.commons.codec.binary.Base64.decodeBase64(abyte0);
    }

    public static byte[] encodeBase64(byte abyte0[])
    {
        return com.google.api.client.repackaged.org.apache.commons.codec.binary.Base64.encodeBase64(abyte0);
    }

    public static String encodeBase64String(byte abyte0[])
    {
        return com.google.api.client.repackaged.org.apache.commons.codec.binary.Base64.encodeBase64String(abyte0);
    }

    public static byte[] encodeBase64URLSafe(byte abyte0[])
    {
        return com.google.api.client.repackaged.org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(abyte0);
    }

    public static String encodeBase64URLSafeString(byte abyte0[])
    {
        return com.google.api.client.repackaged.org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(abyte0);
    }
}
