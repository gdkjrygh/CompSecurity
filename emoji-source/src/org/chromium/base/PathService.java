// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;


public abstract class PathService
{

    public static final int DIR_MODULE = 3;

    private PathService()
    {
    }

    private static native void nativeOverride(int i, String s);

    public static void override(int i, String s)
    {
        nativeOverride(i, s);
    }
}
