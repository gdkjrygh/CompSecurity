// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.chunk;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.extractor.DefaultTrackOutput;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;
import com.google.android.exoplayer.util.ParsableByteArray;
import com.google.android.exoplayer.util.Util;

// Referenced classes of package com.google.android.exoplayer.chunk:
//            BaseMediaChunk, Format

public final class SingleSampleMediaChunk extends BaseMediaChunk
{

    private final MediaFormat k;
    private final DrmInitData l;
    private final byte m[];
    private boolean n;
    private volatile int o;
    private volatile boolean p;

    public SingleSampleMediaChunk(DataSource datasource, DataSpec dataspec, int i, Format format, long l1, long l2, int j, boolean flag, MediaFormat mediaformat, DrmInitData drminitdata, byte abyte0[])
    {
        super(datasource, dataspec, i, format, l1, l2, j, flag, true);
        k = mediaformat;
        l = drminitdata;
        m = abyte0;
    }

    public final MediaFormat b()
    {
        return k;
    }

    public final DrmInitData c()
    {
        return l;
    }

    public final long e()
    {
        return (long)o;
    }

    public final void f()
    {
        p = true;
    }

    public final boolean g()
    {
        return p;
    }

    public final void h()
    {
        DataSpec dataspec;
        int i;
        i = 0;
        if (!n)
        {
            if (m != null)
            {
                d().a(new ParsableByteArray(m), m.length);
            }
            n = true;
        }
        dataspec = Util.a(e, o);
        f.a(dataspec);
_L1:
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        o = i + o;
        i = d().a(f, 0x7fffffff, true);
          goto _L1
        int j = o;
        i = j;
        if (m != null)
        {
            i = j + m.length;
        }
        d().a(g, 1, i, 0, null);
        f.a();
        return;
        Exception exception;
        exception;
        f.a();
        throw exception;
    }
}
