// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.hls;

import com.google.android.exoplayer.chunk.DataChunk;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;
import java.util.Arrays;

class g extends DataChunk
{

    public final String a;
    public final int g;
    private byte h[];

    protected final void a(byte abyte0[], int i)
    {
        h = Arrays.copyOf(abyte0, i);
    }

    public final byte[] b()
    {
        return h;
    }

    public (DataSource datasource, DataSpec dataspec, byte abyte0[], String s, int i)
    {
        super(datasource, dataspec, 3, 0, null, abyte0);
        a = s;
        g = i;
    }
}
