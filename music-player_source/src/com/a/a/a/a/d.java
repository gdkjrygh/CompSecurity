// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a.a;

import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.a.a.a.a:
//            c

final class d
    implements Runnable
{

    final c a;

    d(c c1)
    {
        a = c1;
        super();
    }

    public final void run()
    {
        int i = 0;
        File afile[] = a.a.listFiles();
        if (afile != null)
        {
            int k = afile.length;
            int j = 0;
            for (; i < k; i++)
            {
                File file = afile[i];
                j += a.b(file);
                c.a(a).put(file, Long.valueOf(file.lastModified()));
            }

            c.b(a).set(j);
        }
    }
}
