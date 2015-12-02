// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;


public class VideoTimeSpentInfo
{

    public final int a = -1;
    private int b;
    private int c;
    private int d;

    public VideoTimeSpentInfo()
    {
    }

    public final int a()
    {
        return b;
    }

    public final void a(int i)
    {
        c = i;
    }

    public final void a(int i, int j)
    {
        c = i;
        b = j;
        d = -1;
    }

    public final int b()
    {
        return c;
    }

    public final void b(int i)
    {
        b = i;
    }

    public final void b(int i, int j)
    {
        c = j;
        d = i;
    }

    public final void c()
    {
        b = c;
    }

    public final void c(int i)
    {
        c = i;
        d = -1;
    }

    public final void d(int i)
    {
        b = i;
        d = -1;
    }

    public final void e(int i)
    {
        b = i;
        d = -1;
    }
}
