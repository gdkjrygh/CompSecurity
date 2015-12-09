// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package a.a:
//            gw

final class gx
    implements Runnable
{

    final gw a;

    gx(gw gw1)
    {
        a = gw1;
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
                a.c.put(file, Long.valueOf(file.lastModified()));
            }

            a.b.set(j);
        }
    }
}
