// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view.exo;

import com.facebook.debug.log.BLog;
import com.google.android.exoplayer.MediaFormatHolder;
import com.google.android.exoplayer.SampleHolder;
import com.google.android.exoplayer.SampleSource;
import com.google.android.exoplayer.TrackInfo;
import com.google.android.exoplayer.util.Assertions;
import java.io.IOException;

// Referenced classes of package com.facebook.video.view.exo:
//            SampleExtractor

public final class DefaultSampleSource
    implements SampleSource, com.google.android.exoplayer.SampleSource.SampleSourceReader
{

    private static final Class a = com/facebook/video/view/exo/DefaultSampleSource;
    private final SampleExtractor b;
    private TrackInfo c[];
    private boolean d;
    private int e;
    private int f[];
    private boolean g[];
    private long h;

    public DefaultSampleSource(SampleExtractor sampleextractor, int i)
    {
        b = (SampleExtractor)Assertions.a(sampleextractor);
        e = i;
    }

    private void a(long l, boolean flag)
    {
        if (flag || h != l)
        {
            h = l;
            for (int i = 0; i < f.length; i++)
            {
                if (f[i] != 0)
                {
                    g[i] = true;
                }
            }

        }
    }

    public final int a(int i, long l, MediaFormatHolder mediaformatholder, SampleHolder sampleholder, boolean flag)
    {
        Assertions.b(d);
        boolean flag1;
        if (f[i] != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Assertions.b(flag1);
        if (g[i])
        {
            g[i] = false;
            return -5;
        }
        if (flag)
        {
            return -2;
        }
        if (f[i] != 2)
        {
            b.a(i, mediaformatholder);
            f[i] = 2;
            return -4;
        }
        h = -1L;
        try
        {
            i = b.a(i, sampleholder);
        }
        // Misplaced declaration of an exception variable
        catch (MediaFormatHolder mediaformatholder)
        {
            return -2;
        }
        return i;
    }

    public final TrackInfo a(int i)
    {
        Assertions.b(d);
        return c[i];
    }

    public final void a(int i, long l)
    {
        boolean flag1 = true;
        Assertions.b(d);
        boolean flag;
        if (f[i] == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        f[i] = 1;
        if (l != 0L)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        a(l, flag);
    }

    public final boolean a(long l)
    {
        if (d)
        {
            return true;
        }
        try
        {
            if (b.a())
            {
                d = true;
                c = b.b();
                f = new int[c.length];
                g = new boolean[c.length];
            }
        }
        catch (IOException ioexception)
        {
            BLog.b(a, "IOException in prepare", ioexception);
        }
        return d;
    }

    public final int b()
    {
        Assertions.b(d);
        return c.length;
    }

    public final void b(int i)
    {
        Assertions.b(d);
        boolean flag;
        if (f[i] != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        g[i] = false;
        f[i] = 0;
    }

    public final void b(long l)
    {
        Assertions.b(d);
        a(l, false);
    }

    public final boolean b(int i, long l)
    {
        return true;
    }

    public final void c()
    {
    }

    public final long d()
    {
        Assertions.b(d);
        return b.c();
    }

    public final void e()
    {
        int i;
        boolean flag;
        if (e > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        i = e - 1;
        e = i;
        if (i == 0)
        {
            b.d();
        }
    }

    public final com.google.android.exoplayer.SampleSource.SampleSourceReader f_()
    {
        return this;
    }

}
