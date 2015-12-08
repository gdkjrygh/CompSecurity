// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.events.storage;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.worklight.location.internal.events.storage:
//            IChunkStorage, Chunk

public class ChunkStorage
    implements IChunkStorage
{

    private final List closedChunks = new ArrayList();
    private long currentMemSize;
    private long maxMemSize;
    private final IChunkStorage persistentStorage;

    public ChunkStorage(long l, IChunkStorage ichunkstorage)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Maximum memory size must be a positive integer: ").append(l).toString());
        }
        maxMemSize = l;
        if (ichunkstorage == null)
        {
            throw new IllegalArgumentException("persistentStorage is null");
        } else
        {
            persistentStorage = ichunkstorage;
            return;
        }
    }

    private void fillFromPersistentToMemory()
    {
        do
        {
            Chunk chunk;
label0:
            {
                if (!persistentStorage.isEmpty())
                {
                    chunk = persistentStorage.getFirst();
                    if (closedChunks.isEmpty() || currentMemSize + chunk.currentChunkSize() <= maxMemSize)
                    {
                        break label0;
                    }
                }
                return;
            }
            closedChunks.add(chunk);
            persistentStorage.removeFirst();
            currentMemSize = currentMemSize + chunk.currentChunkSize();
        } while (true);
    }

    public IChunkStorage forTestOnly_getPersistentStorage()
    {
        return persistentStorage;
    }

    public Chunk getChunk(long l)
    {
        if (l < 0L)
        {
            return null;
        }
        if (l < (long)closedChunks.size())
        {
            return (Chunk)closedChunks.get((int)l);
        } else
        {
            return persistentStorage.getChunk(l - (long)closedChunks.size());
        }
    }

    public Chunk getFirst()
    {
        if (!closedChunks.isEmpty())
        {
            return (Chunk)closedChunks.get(0);
        } else
        {
            return persistentStorage.getFirst();
        }
    }

    public long getNumChunks()
    {
        return (long)closedChunks.size() + persistentStorage.getNumChunks();
    }

    public long getNumChunksPersisted()
    {
        return persistentStorage.getNumChunks();
    }

    public boolean isEmpty()
    {
        return closedChunks.isEmpty() && persistentStorage.isEmpty();
    }

    public void purgeAll()
    {
        closedChunks.clear();
        persistentStorage.purgeAll();
    }

    public void removeFirst()
    {
        if (!closedChunks.isEmpty())
        {
            Chunk chunk = (Chunk)closedChunks.remove(0);
            currentMemSize = currentMemSize - chunk.currentChunkSize();
        } else
        {
            persistentStorage.removeFirst();
        }
        fillFromPersistentToMemory();
    }

    public void setMaxmiumMemorySize(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Maximum memory size must be a non-negative integer, received: ").append(l).toString());
        }
        maxMemSize = l;
        if (currentMemSize > l)
        {
            while (closedChunks.size() > 1) 
            {
                Chunk chunk = (Chunk)closedChunks.remove(closedChunks.size() - 1);
                persistentStorage.store(chunk);
                currentMemSize = currentMemSize - chunk.currentChunkSize();
            }
        } else
        {
            fillFromPersistentToMemory();
        }
    }

    public void store(Chunk chunk)
    {
        if (!persistentStorage.isEmpty() || currentMemSize + chunk.currentChunkSize() > maxMemSize)
        {
            persistentStorage.store(chunk);
            return;
        } else
        {
            closedChunks.add(chunk);
            currentMemSize = currentMemSize + chunk.currentChunkSize();
            return;
        }
    }
}
