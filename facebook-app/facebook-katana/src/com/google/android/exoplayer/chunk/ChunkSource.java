// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.chunk;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.TrackInfo;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.chunk:
//            Chunk, ChunkOperationHolder

public interface ChunkSource
{

    public abstract TrackInfo a();

    public abstract void a(MediaFormat mediaformat);

    public abstract void a(Chunk chunk);

    public abstract void a(List list, long l, long l1, ChunkOperationHolder chunkoperationholder);

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();
}
