// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.AudioTimestamp;
import android.media.AudioTrack;

public final class azs extends azr
{

    private final AudioTimestamp b = new AudioTimestamp();
    private long c;
    private long d;
    private long e;

    public azs()
    {
        super((byte)0);
    }

    public final void a(AudioTrack audiotrack, boolean flag)
    {
        super.a(audiotrack, flag);
        c = 0L;
        d = 0L;
        e = 0L;
    }

    public final boolean d()
    {
        boolean flag = a.getTimestamp(b);
        if (flag)
        {
            long l = b.framePosition;
            if (d > l)
            {
                c = c + 1L;
            }
            d = l;
            e = l + (c << 32);
        }
        return flag;
    }

    public final long e()
    {
        return b.nanoTime;
    }

    public final long f()
    {
        return e;
    }
}
