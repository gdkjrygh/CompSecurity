// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.io.File;
import java.io.FilenameFilter;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.facebook.internal:
//            FileLruCache

class _cls2
{

    private static final String FILE_NAME_PREFIX = "buffer";
    private static final FilenameFilter filterExcludeBufferFiles = new FilenameFilter() {

        public boolean accept(File file, String s)
        {
            return !s.startsWith("buffer");
        }

    };
    private static final FilenameFilter filterExcludeNonBufferFiles = new FilenameFilter() {

        public boolean accept(File file, String s)
        {
            return s.startsWith("buffer");
        }

    };

    static void deleteAll(File file)
    {
        file = file.listFiles(excludeNonBufferFiles());
        if (file != null)
        {
            int j = file.length;
            for (int i = 0; i < j; i++)
            {
                file[i].delete();
            }

        }
    }

    static FilenameFilter excludeBufferFiles()
    {
        return filterExcludeBufferFiles;
    }

    static FilenameFilter excludeNonBufferFiles()
    {
        return filterExcludeNonBufferFiles;
    }

    static File newFile(File file)
    {
        return new File(file, (new StringBuilder()).append("buffer").append(Long.valueOf(FileLruCache.access$300().incrementAndGet()).toString()).toString());
    }


    private _cls2()
    {
    }
}
