// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.breakpad;


public class BreakpadWrapper
{

    private static BreakpadWrapper a = new BreakpadWrapper();

    private BreakpadWrapper()
    {
    }

    public static BreakpadWrapper a()
    {
        return a;
    }

    public static void a(String s)
    {
        init(s);
    }

    private static native void init(String s);

    static 
    {
        System.loadLibrary("BreakpadIntegration");
    }
}
