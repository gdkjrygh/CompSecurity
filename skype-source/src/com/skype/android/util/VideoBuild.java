// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;


public final class VideoBuild
{

    public static final boolean DEBUG = isDebug();
    public static final boolean INTERNAL = isInternal();
    public static final boolean RELEASE = isRelease();

    private VideoBuild()
    {
    }

    private static native boolean isDebug();

    private static native boolean isInternal();

    private static native boolean isRelease();

}
