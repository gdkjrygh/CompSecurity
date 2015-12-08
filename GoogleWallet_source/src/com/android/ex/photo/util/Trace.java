// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo.util;


public abstract class Trace
{

    public static void beginSection(String s)
    {
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            android.os.Trace.beginSection(s);
        }
    }

    public static void endSection()
    {
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            android.os.Trace.endSection();
        }
    }
}
