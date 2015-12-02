// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.chunk;

import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;
import com.google.android.exoplayer.util.Assertions;

// Referenced classes of package com.google.android.exoplayer.chunk:
//            Format

public abstract class Chunk
    implements com.google.android.exoplayer.upstream.Loader.Loadable
{

    public final int b;
    public final int c;
    public final Format d;
    public final DataSpec e;
    protected final DataSource f;

    public Chunk(DataSource datasource, DataSpec dataspec, int i, int j, Format format)
    {
        f = (DataSource)Assertions.a(datasource);
        e = (DataSpec)Assertions.a(dataspec);
        b = i;
        c = j;
        d = format;
    }

    public abstract long e();
}
