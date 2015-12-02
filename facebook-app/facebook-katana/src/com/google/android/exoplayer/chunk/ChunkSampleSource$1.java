// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.chunk;


// Referenced classes of package com.google.android.exoplayer.chunk:
//            Format, ChunkSampleSource

class f
    implements Runnable
{

    final long a;
    final int b;
    final int c;
    final Format d;
    final long e;
    final long f;
    final ChunkSampleSource g;

    public void run()
    {
    }

    (ChunkSampleSource chunksamplesource, long l, int i, int j, Format format, long l1, long l2)
    {
        g = chunksamplesource;
        a = l;
        b = i;
        c = j;
        d = format;
        e = l1;
        f = l2;
        super();
    }
}
