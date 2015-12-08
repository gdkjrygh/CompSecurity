// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.AudioTrack;

public class azr
{

    protected AudioTrack a;
    private boolean b;
    private int c;
    private long d;
    private long e;
    private long f;

    private azr()
    {
    }

    public azr(byte byte0)
    {
        this();
    }

    public void a(AudioTrack audiotrack, boolean flag)
    {
        a = audiotrack;
        b = flag;
        d = 0L;
        e = 0L;
        f = 0L;
        if (audiotrack != null)
        {
            c = audiotrack.getSampleRate();
        }
    }

    public final boolean a()
    {
        return bej.a <= 22 && b && a.getPlayState() == 2 && a.getPlaybackHeadPosition() == 0;
    }

    public final long b()
    {
        long l;
        long l1;
        l1 = 0xffffffffL & (long)a.getPlaybackHeadPosition();
        l = l1;
        if (bej.a > 22) goto _L2; else goto _L1
_L1:
        l = l1;
        if (!b) goto _L2; else goto _L3
_L3:
        if (a.getPlayState() != 1) goto _L5; else goto _L4
_L4:
        d = l1;
_L7:
        l = l1 + f;
_L2:
        if (d > l)
        {
            e = e + 1L;
        }
        d = l;
        return l + (e << 32);
_L5:
        if (a.getPlayState() == 2 && l1 == 0L)
        {
            f = d;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final long c()
    {
        return (b() * 0xf4240L) / (long)c;
    }

    public boolean d()
    {
        return false;
    }

    public long e()
    {
        throw new UnsupportedOperationException();
    }

    public long f()
    {
        throw new UnsupportedOperationException();
    }
}
