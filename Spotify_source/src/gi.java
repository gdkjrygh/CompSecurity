// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;
import java.util.List;

public final class gi
{

    private final List a;
    private int b;
    private long c;
    private long d;
    private float e;
    private long f;
    private CharSequence g;
    private long h;
    private long i;
    private Bundle j;

    public gi()
    {
        a = new ArrayList();
        i = -1L;
    }

    public gi(PlaybackStateCompat playbackstatecompat)
    {
        a = new ArrayList();
        i = -1L;
        b = PlaybackStateCompat.a(playbackstatecompat);
        c = PlaybackStateCompat.b(playbackstatecompat);
        e = PlaybackStateCompat.c(playbackstatecompat);
        h = PlaybackStateCompat.d(playbackstatecompat);
        d = PlaybackStateCompat.e(playbackstatecompat);
        f = PlaybackStateCompat.f(playbackstatecompat);
        g = PlaybackStateCompat.g(playbackstatecompat);
        if (PlaybackStateCompat.h(playbackstatecompat) != null)
        {
            a.addAll(PlaybackStateCompat.h(playbackstatecompat));
        }
        i = PlaybackStateCompat.i(playbackstatecompat);
        j = PlaybackStateCompat.j(playbackstatecompat);
    }

    public final PlaybackStateCompat a()
    {
        return new PlaybackStateCompat(b, c, d, e, f, g, h, a, i, j, (byte)0);
    }

    public final gi a(int k, long l)
    {
        return a(k, l, 1.0F, SystemClock.elapsedRealtime());
    }

    public final gi a(int k, long l, float f1, long l1)
    {
        b = k;
        c = l;
        h = l1;
        e = f1;
        return this;
    }

    public final gi a(long l)
    {
        f = l;
        return this;
    }
}
