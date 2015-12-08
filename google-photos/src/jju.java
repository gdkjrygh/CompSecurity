// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.AudioTrack;
import android.os.SystemClock;

public class jju
{

    public AudioTrack a;
    public long b;
    public long c;
    public long d;
    private boolean e;
    private int f;
    private long g;
    private long h;
    private long i;

    private jju()
    {
    }

    jju(byte byte0)
    {
        this();
    }

    public final long a()
    {
        if (b != -1L)
        {
            long l = ((SystemClock.elapsedRealtime() * 1000L - b) * (long)f) / 0xf4240L;
            return Math.min(d, l + c);
        }
        int j = a.getPlayState();
        if (j == 1)
        {
            return 0L;
        }
        long l2 = 0xffffffffL & (long)a.getPlaybackHeadPosition();
        long l1 = l2;
        if (e)
        {
            if (j == 2 && l2 == 0L)
            {
                i = g;
            }
            l1 = l2 + i;
        }
        if (g > l1)
        {
            h = h + 1L;
        }
        g = l1;
        return l1 + (h << 32);
    }

    public void a(AudioTrack audiotrack, boolean flag)
    {
        a = audiotrack;
        e = flag;
        b = -1L;
        g = 0L;
        h = 0L;
        i = 0L;
        if (audiotrack != null)
        {
            f = audiotrack.getSampleRate();
        }
    }

    public final long b()
    {
        return (a() * 0xf4240L) / (long)f;
    }

    public boolean c()
    {
        return false;
    }

    public long d()
    {
        throw new UnsupportedOperationException();
    }

    public long e()
    {
        throw new UnsupportedOperationException();
    }
}
