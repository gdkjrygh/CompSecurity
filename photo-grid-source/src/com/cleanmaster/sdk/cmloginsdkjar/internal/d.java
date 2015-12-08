// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar.internal;

import java.io.File;
import java.io.FilenameFilter;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar.internal:
//            e, f, FileLruCache

final class d
{

    private static final FilenameFilter a = new e();
    private static final FilenameFilter b = new f();

    static FilenameFilter a()
    {
        return a;
    }

    static void a(File file)
    {
        file = file.listFiles(b);
        if (file != null)
        {
            int j = file.length;
            for (int i = 0; i < j; i++)
            {
                file[i].delete();
            }

        }
    }

    static File b(File file)
    {
        return new File(file, (new StringBuilder("buffer")).append(Long.valueOf(FileLruCache.access$300().incrementAndGet()).toString()).toString());
    }

}
