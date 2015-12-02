// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.chunk;

import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer.chunk:
//            Chunk, Format

public abstract class DataChunk extends Chunk
{

    private byte a[];
    private int g;
    private volatile boolean h;

    public DataChunk(DataSource datasource, DataSpec dataspec, int i, int j, Format format, byte abyte0[])
    {
        super(datasource, dataspec, i, j, format);
        a = abyte0;
    }

    private void b()
    {
        if (a == null)
        {
            a = new byte[16384];
        } else
        if (a.length < g + 16384)
        {
            a = Arrays.copyOf(a, a.length + 16384);
            return;
        }
    }

    protected abstract void a(byte abyte0[], int i);

    public final byte[] a()
    {
        return a;
    }

    public final long e()
    {
        return (long)g;
    }

    public final void f()
    {
        h = true;
    }

    public final boolean g()
    {
        return h;
    }

    public final void h()
    {
        int i = 0;
        f.a(e);
        g = 0;
_L2:
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        int j;
        if (h)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        b();
        j = f.a(a, g, 16384);
        i = j;
        if (j == -1) goto _L2; else goto _L1
_L1:
        g = g + j;
        i = j;
          goto _L2
        Exception exception;
        exception;
        f.a();
        throw exception;
        if (!h)
        {
            a(a, g);
        }
        f.a();
        return;
    }
}
