// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view.exo;

import com.google.android.exoplayer.chunk.Format;

public class PlaybackPreferences
{

    private boolean a;
    private boolean b;
    private com.facebook.video.analytics.VideoAnalytics.PlayerType c;
    private Format d;
    private boolean e;
    private String f;

    public PlaybackPreferences()
    {
        a = false;
        b = false;
        c = com.facebook.video.analytics.VideoAnalytics.PlayerType.INLINE_PLAYER;
        d = null;
        e = false;
        f = null;
    }

    public final void a(com.facebook.video.analytics.VideoAnalytics.PlayerType playertype)
    {
        this;
        JVM INSTR monitorenter ;
        c = playertype;
        this;
        JVM INSTR monitorexit ;
        return;
        playertype;
        throw playertype;
    }

    public final void a(Format format)
    {
        this;
        JVM INSTR monitorenter ;
        d = format;
        this;
        JVM INSTR monitorexit ;
        return;
        format;
        throw format;
    }

    public final void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        f = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        a = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final com.facebook.video.analytics.VideoAnalytics.PlayerType b()
    {
        this;
        JVM INSTR monitorenter ;
        com.facebook.video.analytics.VideoAnalytics.PlayerType playertype = c;
        this;
        JVM INSTR monitorexit ;
        return playertype;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        e = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final Format c()
    {
        this;
        JVM INSTR monitorenter ;
        Format format = d;
        this;
        JVM INSTR monitorexit ;
        return format;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean d()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final String e()
    {
        this;
        JVM INSTR monitorenter ;
        String s = f;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }
}
