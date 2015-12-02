// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.chunk;


// Referenced classes of package com.google.android.exoplayer.chunk:
//            Format, ChunkSampleSource

class h
    implements Runnable
{

    final long a;
    final int b;
    final int c;
    final Format d;
    final long e;
    final long f;
    final long g;
    final long h;
    final ChunkSampleSource i;

    public void run()
    {
    }

    (ChunkSampleSource chunksamplesource, long l, int j, int k, Format format, long l1, long l2, long l3, long l4)
    {
        i = chunksamplesource;
        a = l;
        b = j;
        c = k;
        d = format;
        e = l1;
        f = l2;
        g = l3;
        h = l4;
        super();
    }
}
