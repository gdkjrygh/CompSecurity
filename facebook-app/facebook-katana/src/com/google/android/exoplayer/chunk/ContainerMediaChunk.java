// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.chunk;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.extractor.DefaultExtractorInput;
import com.google.android.exoplayer.extractor.DefaultTrackOutput;
import com.google.android.exoplayer.extractor.ExtractorInput;
import com.google.android.exoplayer.extractor.SeekMap;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;
import com.google.android.exoplayer.util.ParsableByteArray;
import com.google.android.exoplayer.util.Util;

// Referenced classes of package com.google.android.exoplayer.chunk:
//            BaseMediaChunk, ChunkExtractorWrapper, Format

public class ContainerMediaChunk extends BaseMediaChunk
    implements ChunkExtractorWrapper.SingleTrackOutput
{

    private final ChunkExtractorWrapper k;
    private final long l;
    private MediaFormat m;
    private DrmInitData n;
    private volatile int o;
    private volatile boolean p;

    public ContainerMediaChunk(DataSource datasource, DataSpec dataspec, int i, Format format, long l1, long l2, int j, boolean flag, long l3, ChunkExtractorWrapper chunkextractorwrapper, MediaFormat mediaformat, 
            DrmInitData drminitdata, boolean flag1)
    {
        super(datasource, dataspec, i, format, l1, l2, j, flag, flag1);
        k = chunkextractorwrapper;
        l = l3;
        m = mediaformat;
        n = drminitdata;
    }

    public final int a(ExtractorInput extractorinput, int i, boolean flag)
    {
        return d().a(extractorinput, i, flag);
    }

    public final void a(long l1, int i, int j, int i1, byte abyte0[])
    {
        d().a(l + l1, i, j, i1, abyte0);
    }

    public final void a(MediaFormat mediaformat)
    {
        m = mediaformat;
    }

    public final void a(DrmInitData drminitdata)
    {
        n = drminitdata;
    }

    public final void a(SeekMap seekmap)
    {
    }

    public final void a(ParsableByteArray parsablebytearray, int i)
    {
        d().a(parsablebytearray, i);
    }

    public final MediaFormat b()
    {
        return m;
    }

    public final DrmInitData c()
    {
        return n;
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
        Object obj = Util.a(e, o);
        obj = new DefaultExtractorInput(f, ((DataSpec) (obj)).c, f.a(((DataSpec) (obj))));
        if (o == 0)
        {
            k.a(this);
        }
        int i = 0;
_L1:
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        if (p)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        i = k.a(((ExtractorInput) (obj)));
          goto _L1
        o = (int)(((ExtractorInput) (obj)).b() - e.c);
        f.a();
        return;
        Exception exception1;
        exception1;
        o = (int)(((ExtractorInput) (obj)).b() - e.c);
        throw exception1;
        Exception exception;
        exception;
        f.a();
        throw exception;
    }
}
