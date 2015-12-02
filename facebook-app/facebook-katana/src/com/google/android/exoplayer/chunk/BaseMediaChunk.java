// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.chunk;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.extractor.DefaultTrackOutput;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;

// Referenced classes of package com.google.android.exoplayer.chunk:
//            MediaChunk, Format

public abstract class BaseMediaChunk extends MediaChunk
{

    public final boolean a;
    private DefaultTrackOutput k;
    private int l;

    public BaseMediaChunk(DataSource datasource, DataSpec dataspec, int i, Format format, long l1, long l2, int j, boolean flag, boolean flag1)
    {
        super(datasource, dataspec, i, format, l1, l2, j, flag);
        a = flag1;
    }

    public final int a()
    {
        return l;
    }

    public final void a(DefaultTrackOutput defaulttrackoutput)
    {
        k = defaulttrackoutput;
        l = defaulttrackoutput.b();
    }

    public abstract MediaFormat b();

    public abstract DrmInitData c();

    protected final DefaultTrackOutput d()
    {
        return k;
    }
}
