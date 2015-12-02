// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.chunk;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.extractor.DefaultExtractorInput;
import com.google.android.exoplayer.extractor.ExtractorInput;
import com.google.android.exoplayer.extractor.SeekMap;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;
import com.google.android.exoplayer.util.ParsableByteArray;
import com.google.android.exoplayer.util.Util;

// Referenced classes of package com.google.android.exoplayer.chunk:
//            Chunk, ChunkExtractorWrapper, Format

public final class InitializationChunk extends Chunk
    implements ChunkExtractorWrapper.SingleTrackOutput
{

    private final ChunkExtractorWrapper a;
    private MediaFormat g;
    private DrmInitData h;
    private SeekMap i;
    private volatile int j;
    private volatile boolean k;

    public InitializationChunk(DataSource datasource, DataSpec dataspec, int l, Format format, ChunkExtractorWrapper chunkextractorwrapper)
    {
        super(datasource, dataspec, 2, l, format);
        a = chunkextractorwrapper;
    }

    public final int a(ExtractorInput extractorinput, int l, boolean flag)
    {
        throw new IllegalStateException("Unexpected sample data in initialization chunk");
    }

    public final void a(long l, int i1, int j1, int k1, byte abyte0[])
    {
        throw new IllegalStateException("Unexpected sample data in initialization chunk");
    }

    public final void a(MediaFormat mediaformat)
    {
        g = mediaformat;
    }

    public final void a(DrmInitData drminitdata)
    {
        h = drminitdata;
    }

    public final void a(SeekMap seekmap)
    {
        i = seekmap;
    }

    public final void a(ParsableByteArray parsablebytearray, int l)
    {
        throw new IllegalStateException("Unexpected sample data in initialization chunk");
    }

    public final boolean a()
    {
        return g != null;
    }

    public final MediaFormat b()
    {
        return g;
    }

    public final boolean c()
    {
        return h != null;
    }

    public final DrmInitData d()
    {
        return h;
    }

    public final long e()
    {
        return (long)j;
    }

    public final void f()
    {
        k = true;
    }

    public final boolean g()
    {
        return k;
    }

    public final void h()
    {
        Object obj = Util.a(e, j);
        obj = new DefaultExtractorInput(f, ((DataSpec) (obj)).c, f.a(((DataSpec) (obj))));
        if (j == 0)
        {
            a.a(this);
        }
        int l = 0;
_L1:
        if (l != 0)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        if (k)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        l = a.a(((ExtractorInput) (obj)));
          goto _L1
        j = (int)(((ExtractorInput) (obj)).b() - e.c);
        f.a();
        return;
        Exception exception1;
        exception1;
        j = (int)(((ExtractorInput) (obj)).b() - e.c);
        throw exception1;
        Exception exception;
        exception;
        f.a();
        throw exception;
    }

    public final boolean i()
    {
        return i != null;
    }

    public final SeekMap j()
    {
        return i;
    }
}
