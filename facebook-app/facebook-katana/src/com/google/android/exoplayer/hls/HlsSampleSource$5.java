// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.hls;

import com.google.android.exoplayer.chunk.Format;

// Referenced classes of package com.google.android.exoplayer.hls:
//            HlsSampleSource

class c
    implements Runnable
{

    final Format a;
    final int b;
    final long c;
    final HlsSampleSource d;

    public void run()
    {
        HlsSampleSource.b(d).a(HlsSampleSource.a(d), a, b, HlsSampleSource.c(c));
    }

    entListener(HlsSampleSource hlssamplesource, Format format, int i, long l)
    {
        d = hlssamplesource;
        a = format;
        b = i;
        c = l;
        super();
    }
}
