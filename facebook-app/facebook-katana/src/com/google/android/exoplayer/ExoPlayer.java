// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;


// Referenced classes of package com.google.android.exoplayer:
//            TrackRenderer

public interface ExoPlayer
{

    public abstract int a();

    public abstract void a(int i, boolean flag);

    public abstract void a(long l);

    public abstract void a(ExoPlayerComponent exoplayercomponent, int i, Object obj);

    public abstract void a(Listener listener);

    public abstract void a(boolean flag);

    public transient abstract void a(TrackRenderer atrackrenderer[]);

    public abstract void b(ExoPlayerComponent exoplayercomponent, int i, Object obj);

    public abstract void b(Listener listener);

    public abstract boolean b();

    public abstract void c();

    public abstract void d();

    public abstract long e();

    public abstract long f();

    public abstract long g();

    public abstract int h();
}
