// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.support.webview;

import android.util.Log;

public class 
{

    public static native String decrypt_native(String s, int i);

    public static void testLogv(String s)
    {
        Log.v("cheatecore", s);
    }

    public static void testLogw(String s)
    {
        Log.w("cheatecore", s);
    }

    static 
    {
        System.loadLibrary("mobisec");
    }

    public ()
    {
    }
}
