// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.utils;


public final class DebugUtils
{

    private static final int INDEX = 3;

    public DebugUtils()
    {
    }

    public static String getMethodName()
    {
        String s = null;
        StackTraceElement astacktraceelement[] = Thread.currentThread().getStackTrace();
        StackTraceElement stacktraceelement;
        if (3 < astacktraceelement.length)
        {
            stacktraceelement = astacktraceelement[3];
        } else
        {
            stacktraceelement = null;
        }
        if (stacktraceelement != null)
        {
            s = stacktraceelement.getMethodName();
        }
        return s;
    }
}
