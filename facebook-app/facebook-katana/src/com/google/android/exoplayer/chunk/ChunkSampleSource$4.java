// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.chunk;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.chunk:
//            ChunkSampleSource

class a
    implements Runnable
{

    final IOException a;
    final ChunkSampleSource b;

    public void run()
    {
    }

    (ChunkSampleSource chunksamplesource, IOException ioexception)
    {
        b = chunksamplesource;
        a = ioexception;
        super();
    }
}
