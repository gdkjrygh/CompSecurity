// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.orbit.OrbitPlayerInterface;

public final class ead
    implements eac
{

    private OrbitPlayerInterface a;

    public ead(OrbitPlayerInterface orbitplayerinterface)
    {
        a = orbitplayerinterface;
    }

    public final void a()
    {
        a.togglePaused();
    }

    public final void a(int i)
    {
        a.seekToPosition(i);
    }

    public final void a(String s, int i, boolean flag, String s1, String s2, String s3, String s4)
    {
        a.playPath(s, i, flag, s1, s2, s3, s4);
    }

    public final void a(boolean flag)
    {
        a.setPaused(flag);
    }

    public final void a(String as[])
    {
        a.playPreview(as);
    }

    public final void b()
    {
        a.playNext();
    }

    public final void b(int i)
    {
        a.skipNTracksBackwards(i);
    }

    public final void b(boolean flag)
    {
        a.playPrevious(flag);
    }

    public final void c()
    {
        a.stopPreview();
    }

    public final void c(int i)
    {
        a.skipNTracksForwards(i);
    }
}
