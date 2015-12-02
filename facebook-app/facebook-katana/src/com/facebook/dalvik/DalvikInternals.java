// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.dalvik;

import com.facebook.soloader.SoLoader;

public class DalvikInternals
{

    public DalvikInternals()
    {
    }

    public static void a(String s)
    {
        String s1 = System.getProperty("java.vm.version");
        if (s1 != null && !s1.startsWith("0.") && !s1.startsWith("1."))
        {
            return;
        } else
        {
            nativeRegisterDalvikStreamWithBreakpad(s);
            return;
        }
    }

    public static native void deleteRecursive(String s);

    public static synchronized native void fixDvmForCrossDexHack();

    public static synchronized native void fixLinearAllocBuffer(int i);

    public static native long getElapsedGcMillis();

    public static native int getOwnerUid(String s);

    public static native long getTotalGcCount();

    public static native void hookSIGSEGV();

    public static native boolean initGcInstrumentation();

    public static native void link(String s, String s1, boolean flag);

    private static native void nativeRegisterDalvikStreamWithBreakpad(String s);

    public static native void noop();

    public static native byte[] readOdexDepBlock(String s);

    static 
    {
        SoLoader.a("fb_dalvik-internals");
    }
}
