// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.io.File;
import java.io.FilenameFilter;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.facebook.internal:
//            ad, ae, y

final class ac
{

    private static final FilenameFilter a = new ad();
    private static final FilenameFilter b = new ae();

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
        return new File(file, (new StringBuilder("buffer")).append(Long.valueOf(y.b().incrementAndGet()).toString()).toString());
    }

}
