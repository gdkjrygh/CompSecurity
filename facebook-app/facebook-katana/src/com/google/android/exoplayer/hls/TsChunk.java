// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.hls;

import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.chunk.MediaChunk;
import com.google.android.exoplayer.extractor.DefaultExtractorInput;
import com.google.android.exoplayer.extractor.ExtractorInput;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;
import com.google.android.exoplayer.util.Util;

// Referenced classes of package com.google.android.exoplayer.hls:
//            Aes128DataSource, HlsExtractorWrapper

public final class TsChunk extends MediaChunk
{

    public final HlsExtractorWrapper a;
    private final boolean k;
    private int l;
    private volatile boolean m;

    public TsChunk(DataSource datasource, DataSpec dataspec, int i, Format format, long l1, long l2, int j, boolean flag, HlsExtractorWrapper hlsextractorwrapper, byte abyte0[], byte abyte1[])
    {
        super(a(datasource, abyte0, abyte1), dataspec, i, format, l1, l2, j, flag);
        a = hlsextractorwrapper;
        k = f instanceof Aes128DataSource;
    }

    private static DataSource a(DataSource datasource, byte abyte0[], byte abyte1[])
    {
        if (abyte0 == null || abyte1 == null)
        {
            return datasource;
        } else
        {
            return new Aes128DataSource(datasource, abyte0, abyte1);
        }
    }

    public final long e()
    {
        return (long)l;
    }

    public final void f()
    {
        m = true;
    }

    public final boolean g()
    {
        return m;
    }

    public final void h()
    {
        Object obj;
        boolean flag1 = false;
        boolean flag;
        if (k)
        {
            obj = e;
            int i;
            if (l != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            obj = Util.a(e, l);
            flag = false;
        }
        obj = new DefaultExtractorInput(f, ((DataSpec) (obj)).c, f.a(((DataSpec) (obj))));
        i = ((flag1) ? 1 : 0);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        ((ExtractorInput) (obj)).a(l);
        i = ((flag1) ? 1 : 0);
_L1:
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        if (m)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        i = a.a(((ExtractorInput) (obj)));
          goto _L1
        l = (int)(((ExtractorInput) (obj)).b() - e.c);
        f.a();
        return;
        Exception exception1;
        exception1;
        l = (int)(((ExtractorInput) (obj)).b() - e.c);
        throw exception1;
        Exception exception;
        exception;
        f.a();
        throw exception;
    }
}
