// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.SampleHolder;
import com.google.android.exoplayer.upstream.Allocator;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.util.ParsableByteArray;

// Referenced classes of package com.google.android.exoplayer.extractor:
//            TrackOutput, RollingSampleBuffer, ExtractorInput

public class DefaultTrackOutput
    implements TrackOutput
{

    private final RollingSampleBuffer a;
    private final SampleHolder b = new SampleHolder(0);
    private boolean c;
    private long d;
    private long e;
    private volatile long f;
    private volatile MediaFormat g;

    public DefaultTrackOutput(Allocator allocator)
    {
        a = new RollingSampleBuffer(allocator);
        c = true;
        d = 0x8000000000000000L;
        e = 0x8000000000000000L;
        f = 0x8000000000000000L;
    }

    private boolean h()
    {
        boolean flag = a.a(b);
        boolean flag1 = flag;
        if (c)
        {
            do
            {
                flag1 = flag;
                if (!flag)
                {
                    break;
                }
                flag1 = flag;
                if (b.c())
                {
                    break;
                }
                a.d();
                flag = a.a(b);
            } while (true);
        }
        while (!flag1 || e != 0x8000000000000000L && b.e >= e) 
        {
            return false;
        }
        return true;
    }

    public final int a(ExtractorInput extractorinput, int i, boolean flag)
    {
        return a.a(extractorinput, i, flag);
    }

    public final int a(DataSource datasource, int i, boolean flag)
    {
        return a.a(datasource, i, flag);
    }

    public final void a()
    {
        a.a();
        c = true;
        d = 0x8000000000000000L;
        e = 0x8000000000000000L;
        f = 0x8000000000000000L;
    }

    public final void a(int i)
    {
        a.a(i);
        long l;
        if (a.a(b))
        {
            l = b.e;
        } else
        {
            l = 0x8000000000000000L;
        }
        f = l;
    }

    public final void a(long l)
    {
        while (a.a(b) && b.e < l) 
        {
            a.d();
            c = true;
        }
        d = 0x8000000000000000L;
    }

    public void a(long l, int i, int j, int k, byte abyte0[])
    {
        f = Math.max(f, l);
        a.a(l, i, a.e() - (long)j - (long)k, j, abyte0);
    }

    public final void a(MediaFormat mediaformat)
    {
        g = mediaformat;
    }

    public final void a(ParsableByteArray parsablebytearray, int i)
    {
        a.a(parsablebytearray, i);
    }

    public final boolean a(SampleHolder sampleholder)
    {
        if (!h())
        {
            return false;
        } else
        {
            a.b(sampleholder);
            c = false;
            d = sampleholder.e;
            return true;
        }
    }

    public final boolean a(DefaultTrackOutput defaulttrackoutput)
    {
        if (e != 0x8000000000000000L)
        {
            return true;
        }
        long l;
        if (a.a(b))
        {
            l = b.e;
        } else
        {
            l = d + 1L;
        }
        for (defaulttrackoutput = defaulttrackoutput.a; defaulttrackoutput.a(b) && (b.e < l || !b.c()); defaulttrackoutput.d()) { }
        if (defaulttrackoutput.a(b))
        {
            e = b.e;
            return true;
        } else
        {
            return false;
        }
    }

    public final int b()
    {
        return a.b();
    }

    public final boolean b(long l)
    {
        return a.a(l);
    }

    public final int c()
    {
        return a.c();
    }

    public final boolean d()
    {
        return g != null;
    }

    public final MediaFormat e()
    {
        return g;
    }

    public final long f()
    {
        return f;
    }

    public final boolean g()
    {
        return !h();
    }
}
