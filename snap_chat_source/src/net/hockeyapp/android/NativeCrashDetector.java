// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;


public class NativeCrashDetector
{

    public static void a()
    {
        nativeSelfDestruct();
    }

    public static void a(String s)
    {
        if (s == null)
        {
            throw new NullPointerException();
        } else
        {
            nativeSetUpBreakpad(s);
            return;
        }
    }

    private static native void nativeSelfDestruct();

    private static native void nativeSetUpBreakpad(String s);

    static 
    {
        try
        {
            System.loadLibrary("c++_shared");
            System.loadLibrary("Breakpad");
        }
        catch (Throwable throwable) { }
    }
}
