// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.chunk;

import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;
import com.google.android.exoplayer.util.Assertions;

// Referenced classes of package com.google.android.exoplayer.chunk:
//            Chunk, Format

public abstract class MediaChunk extends Chunk
{

    public final long g;
    public final long h;
    public final int i;
    public final boolean j;

    public MediaChunk(DataSource datasource, DataSpec dataspec, int k, Format format, long l, long l1, int i1, boolean flag)
    {
        super(datasource, dataspec, 1, k, format);
        Assertions.a(format);
        g = l;
        h = l1;
        i = i1;
        j = flag;
    }
}
