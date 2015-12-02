// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vk.sdk;


public class 
{

    public static native byte[] constByteEncrypt_native(byte abyte0[], int i, int j);

    public static native String decrypt_native(String s, int i);

    static 
    {
        System.loadLibrary("mobisec");
    }

    public ()
    {
    }
}
