// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.chunk;


// Referenced classes of package com.google.android.exoplayer.chunk:
//            ChunkSampleSource

class a
    implements Runnable
{

    final long a;
    final ChunkSampleSource b;

    public void run()
    {
    }

    (ChunkSampleSource chunksamplesource, long l)
    {
        b = chunksamplesource;
        a = l;
        super();
    }
}
