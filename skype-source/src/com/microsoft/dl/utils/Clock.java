// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.utils;


public final class Clock
{

    private Clock()
    {
    }

    public static native long getAbsoluteTime(long l);

    public static native long getDurationUs(long l, long l1);

    public static native long getPlatformTime();
}
