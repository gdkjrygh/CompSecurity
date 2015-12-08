// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.events.nativeImpl;

import com.worklight.location.internal.events.storage.ChunkStorage;
import com.worklight.location.internal.events.storage.ChunkStringFactory;
import com.worklight.location.internal.events.storage.IChunkStorage;
import com.worklight.location.internal.events.storage.IPersistentStorageManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;

// Referenced classes of package com.worklight.location.internal.events.nativeImpl:
//            FileLockResources, FileChunkStorage

public class FilePersistentStorageManager
    implements IPersistentStorageManager
{

    private final Collection lockResources = new ArrayList();
    private final long maximumMemorySize;
    private final File workingDir;

    public FilePersistentStorageManager(File file, long l)
    {
        if (!file.exists() || !file.isDirectory())
        {
            throw new IllegalArgumentException("workingDir is not an existing directory");
        }
        workingDir = file;
        if (l <= 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("maximumMemorySize must be a positive integer, was ").append(l).toString());
        } else
        {
            maximumMemorySize = l;
            return;
        }
    }

    public static boolean deleteDirectory(File file)
    {
        if (file.exists())
        {
            File afile[] = file.listFiles();
            if (afile != null)
            {
                int j = afile.length;
                int i = 0;
                while (i < j) 
                {
                    File file1 = afile[i];
                    if (file1.isDirectory())
                    {
                        deleteDirectory(file1);
                    } else
                    {
                        file1.delete();
                    }
                    i++;
                }
            }
        }
        return file.delete();
    }

    private static FileLockResources tryLockDirectory(File file)
    {
        try
        {
            file = new File(file, ".filelock");
            if (!file.exists())
            {
                file.createNewFile();
            }
            file = new FileOutputStream(file);
            FileChannel filechannel = file.getChannel();
            file = new FileLockResources(file, filechannel, filechannel.lock());
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw new AssertionError(file);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return null;
        }
        return file;
    }

    void clearAll()
        throws Exception
    {
        for (Iterator iterator = lockResources.iterator(); iterator.hasNext(); ((FileLockResources)iterator.next()).close()) { }
        lockResources.clear();
        System.gc();
        Thread.sleep(10L);
        File afile[] = workingDir.listFiles();
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            deleteDirectory(afile[i]);
        }

    }

    public void clearOldPersistentData()
    {
        File afile[] = workingDir.listFiles();
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            File file = afile[i];
            FileLockResources filelockresources = tryLockDirectory(file);
            if (filelockresources != null)
            {
                filelockresources.close();
                deleteDirectory(file);
            }
        }

    }

    public IChunkStorage createStorage()
    {
        File file = new File(workingDir, UUID.randomUUID().toString());
        file.mkdir();
        FileLockResources filelockresources = tryLockDirectory(file);
        if (filelockresources == null)
        {
            throw new AssertionError("Could not lock the file");
        } else
        {
            lockResources.add(filelockresources);
            return new ChunkStorage(maximumMemorySize, new FileChunkStorage(file, new ChunkStringFactory()));
        }
    }
}
