// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.AudioTimestamp;
import android.media.AudioTrack;

final class jjv extends jju
{

    private final AudioTimestamp e = new AudioTimestamp();
    private long f;
    private long g;
    private long h;

    public jjv()
    {
        super((byte)0);
    }

    public final void a(AudioTrack audiotrack, boolean flag)
    {
        super.a(audiotrack, flag);
        f = 0L;
        g = 0L;
        h = 0L;
    }

    public final boolean c()
    {
        boolean flag = a.getTimestamp(e);
        if (flag)
        {
            long l = e.framePosition;
            if (g > l)
            {
                f = f + 1L;
            }
            g = l;
            h = l + (f << 32);
        }
        return flag;
    }

    public final long d()
    {
        return e.nanoTime;
    }

    public final long e()
    {
        return h;
    }
}
