// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.events.storage;


// Referenced classes of package com.worklight.location.internal.events.storage:
//            Chunk

public interface IChunkStorage
{

    public abstract Chunk getChunk(long l);

    public abstract Chunk getFirst();

    public abstract long getNumChunks();

    public abstract long getNumChunksPersisted();

    public abstract boolean isEmpty();

    public abstract void purgeAll();

    public abstract void removeFirst();

    public abstract void setMaxmiumMemorySize(long l);

    public abstract void store(Chunk chunk);
}
