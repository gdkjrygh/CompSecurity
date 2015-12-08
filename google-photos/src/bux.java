// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaFormat;

public final class bux
{

    long a;
    buz b;
    private final but c;
    private final clb d;
    private final buy e;
    private final dfl f;
    private int g;
    private MediaFormat h;

    public bux(but but, clb clb, buy buy, dfl dfl)
    {
        g = -1;
        c = but;
        d = clb;
        e = buy;
        f = dfl;
    }

    public final buv a()
    {
        return new buv(c, d, e, f, g, h, a, b);
    }

    public final bux a(int i, MediaFormat mediaformat)
    {
        g = b.a(i, "trackIndex", null);
        h = (MediaFormat)b.a(mediaformat, "mediaFormat", null);
        return this;
    }
}
