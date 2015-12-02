// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.support;


public class NativeUtils
{

    private static boolean a = false;

    public static boolean a()
    {
        if (!a)
        {
            try
            {
                System.loadLibrary("NativeUtils");
                a = true;
            }
            catch (UnsatisfiedLinkError unsatisfiedlinkerror) { }
        }
        return a;
    }

    public static native byte[] getEncryptByte(byte abyte0[]);

    public static native String getEncryptString(String s);

}
