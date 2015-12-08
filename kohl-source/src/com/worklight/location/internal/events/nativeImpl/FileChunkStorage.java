// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.events.nativeImpl;

import com.worklight.location.internal.events.storage.Chunk;
import com.worklight.location.internal.events.storage.ChunkStringFactory;
import com.worklight.location.internal.events.storage.IChunkStorage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import org.json.JSONException;

public class FileChunkStorage
    implements IChunkStorage
{

    private static final String FILE_PREFIX = "ChunkFile";
    private static final String UTF8 = "UTF-8";
    private long currentIndex;
    private final ChunkStringFactory factory;
    private long startIndex;
    private final File workingDir;

    public FileChunkStorage(File file, ChunkStringFactory chunkstringfactory)
    {
        startIndex = 0L;
        currentIndex = 0L;
        if (!file.exists() || !file.isDirectory())
        {
            throw new IllegalArgumentException("workingDir is not an existing directory");
        }
        workingDir = file;
        if (chunkstringfactory == null)
        {
            throw new IllegalArgumentException("factory is null");
        } else
        {
            factory = chunkstringfactory;
            return;
        }
    }

    private File getFileForIndex(long l)
    {
        return new File(workingDir, (new StringBuilder()).append("ChunkFile").append(l).toString());
    }

    private Chunk loadChunk(long l)
        throws AssertionError
    {
        if (!isEmpty()) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((Chunk) (obj));
_L2:
        Chunk chunk;
        Object obj3;
        obj = null;
        obj3 = null;
        chunk = null;
        Object obj1 = new Scanner(getFileForIndex(l), "UTF-8");
        ((Scanner) (obj1)).useDelimiter("\\A");
        chunk = factory.createChunk(((Scanner) (obj1)).next());
        obj = chunk;
        if (obj1 != null)
        {
            ((Scanner) (obj1)).close();
            return chunk;
        }
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        obj = chunk;
_L8:
        throw new AssertionError(obj1);
        obj1;
_L5:
        if (obj != null)
        {
            ((Scanner) (obj)).close();
        }
        throw obj1;
        obj1;
        obj = obj3;
_L6:
        throw new AssertionError(obj1);
        Object obj2;
        obj2;
        obj = obj1;
        obj1 = obj2;
          goto _L5
        obj2;
        obj = obj1;
        obj1 = obj2;
          goto _L6
        obj2;
        obj = obj1;
        obj1 = obj2;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public Chunk forTestOnly_loadChunk(int i)
    {
        return getChunk((long)i - startIndex);
    }

    public Chunk getChunk(long l)
    {
        Chunk chunk;
        try
        {
            chunk = loadChunk(startIndex + l);
        }
        catch (AssertionError assertionerror)
        {
            return null;
        }
        return chunk;
    }

    public Chunk getFirst()
    {
        return loadChunk(startIndex);
    }

    public long getNumChunks()
    {
        return currentIndex - startIndex;
    }

    public long getNumChunksPersisted()
    {
        return getNumChunks();
    }

    public boolean isEmpty()
    {
        return getNumChunks() == 0L;
    }

    public void purgeAll()
    {
        for (; !isEmpty(); removeFirst()) { }
    }

    public void removeFirst()
    {
        if (isEmpty())
        {
            return;
        } else
        {
            getFileForIndex(startIndex).delete();
            startIndex = startIndex + 1L;
            return;
        }
    }

    public void setMaxmiumMemorySize(long l)
    {
        throw new UnsupportedOperationException();
    }

    public void store(Chunk chunk)
    {
        FileOutputStream fileoutputstream;
        FileOutputStream fileoutputstream1;
        Object obj;
        fileoutputstream1 = null;
        obj = null;
        fileoutputstream = fileoutputstream1;
        long l = currentIndex;
        fileoutputstream = fileoutputstream1;
        currentIndex = 1L + l;
        fileoutputstream = fileoutputstream1;
        File file = getFileForIndex(l);
        fileoutputstream = fileoutputstream1;
        file.createNewFile();
        fileoutputstream = fileoutputstream1;
        fileoutputstream1 = new FileOutputStream(file);
        fileoutputstream1.write(factory.createString(chunk).getBytes("UTF-8"));
        fileoutputstream1.close();
        if (fileoutputstream1 == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        fileoutputstream1.close();
        return;
        chunk;
        throw new AssertionError(chunk);
        chunk;
        fileoutputstream = obj;
_L4:
        throw new AssertionError(chunk);
        chunk;
_L2:
        if (fileoutputstream != null)
        {
            try
            {
                fileoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Chunk chunk)
            {
                throw new AssertionError(chunk);
            }
        }
        throw chunk;
        chunk;
        fileoutputstream = fileoutputstream1;
        if (true) goto _L2; else goto _L1
_L1:
        chunk;
        fileoutputstream = fileoutputstream1;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
