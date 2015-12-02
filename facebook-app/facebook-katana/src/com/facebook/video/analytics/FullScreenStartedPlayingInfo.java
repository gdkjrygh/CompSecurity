// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;


public class FullScreenStartedPlayingInfo
{

    private final int a = -1;
    private int b;
    private int c;
    private boolean d;
    private boolean e;
    private boolean f;

    public FullScreenStartedPlayingInfo()
    {
        b = 0;
        c = -1;
        d = false;
        e = true;
        f = true;
    }

    private static boolean a(VideoAnalytics.EventTriggerType eventtriggertype)
    {
        return eventtriggertype == VideoAnalytics.EventTriggerType.BY_DIALOG || eventtriggertype == VideoAnalytics.EventTriggerType.BY_FLYOUT;
    }

    public final void a()
    {
        c = -1;
    }

    public final void a(int i)
    {
        b = i;
        c = -1;
    }

    public final void a(boolean flag)
    {
        e = flag;
    }

    public final boolean a(int i, VideoAnalytics.EventTriggerType eventtriggertype)
    {
        return b != i || c == b || a(eventtriggertype);
    }

    public final void b()
    {
        d = false;
    }

    public final void b(int i)
    {
        b = i;
        c = i;
    }

    public final void b(boolean flag)
    {
        f = flag;
    }

    public final void c()
    {
        d = true;
    }

    public final void c(int i)
    {
        c = i;
    }

    public final boolean d()
    {
        return e;
    }

    public final boolean e()
    {
        return f;
    }
}
