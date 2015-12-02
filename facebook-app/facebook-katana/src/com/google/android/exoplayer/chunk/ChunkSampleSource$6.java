// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.chunk;


// Referenced classes of package com.google.android.exoplayer.chunk:
//            ChunkSampleSource, Format

class c
    implements Runnable
{

    final Format a;
    final int b;
    final long c;
    final ChunkSampleSource d;

    public void run()
    {
        ChunkSampleSource.b(d).a(ChunkSampleSource.a(d), a, b, ChunkSampleSource.c(c));
    }

    entListener(ChunkSampleSource chunksamplesource, Format format, int i, long l)
    {
        d = chunksamplesource;
        a = format;
        b = i;
        c = l;
        super();
    }
}
