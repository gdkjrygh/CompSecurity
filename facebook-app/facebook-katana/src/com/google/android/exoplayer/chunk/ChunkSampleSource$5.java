// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.chunk;


// Referenced classes of package com.google.android.exoplayer.chunk:
//            ChunkSampleSource

class b
    implements Runnable
{

    final long a;
    final long b;
    final ChunkSampleSource c;

    public void run()
    {
    }

    (ChunkSampleSource chunksamplesource, long l, long l1)
    {
        c = chunksamplesource;
        a = l;
        b = l1;
        super();
    }
}
