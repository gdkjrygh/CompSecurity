// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.dash;

import com.google.android.exoplayer.dash.mpd.RangedUri;
import com.google.android.exoplayer.extractor.ChunkIndex;

// Referenced classes of package com.google.android.exoplayer.dash:
//            DashSegmentIndex

final class DashWrappingSegmentIndex
    implements DashSegmentIndex
{

    private final ChunkIndex a;
    private final String b;
    private final long c;

    public DashWrappingSegmentIndex(ChunkIndex chunkindex, String s, long l)
    {
        a = chunkindex;
        b = s;
        c = l;
    }

    public final int a()
    {
        return 0;
    }

    public final int a(long l)
    {
        return a.a(l - c);
    }

    public final long a(int i)
    {
        return a.e[i] + c;
    }

    public final int b()
    {
        return a.a - 1;
    }

    public final long b(int i)
    {
        return a.d[i];
    }

    public final RangedUri c(int i)
    {
        return new RangedUri(b, null, a.c[i], a.b[i]);
    }

    public final boolean c()
    {
        return true;
    }
}
