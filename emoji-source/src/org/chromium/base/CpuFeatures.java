// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;


public abstract class CpuFeatures
{

    public CpuFeatures()
    {
    }

    public static int getCount()
    {
        return nativeGetCoreCount();
    }

    public static long getMask()
    {
        return nativeGetCpuFeatures();
    }

    private static native int nativeGetCoreCount();

    private static native long nativeGetCpuFeatures();
}
