// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.common;


public class NativeUtils
{

    public static boolean a = false;

    public NativeUtils()
    {
    }

    public static native void init(String s, String s1);

    static 
    {
        try
        {
            System.loadLibrary("pgtools");
        }
        catch (Throwable throwable)
        {
            throwable.printStackTrace();
            a = true;
        }
    }
}
