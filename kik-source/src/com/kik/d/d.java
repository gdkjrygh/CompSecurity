// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.d;

import java.io.File;
import java.util.Arrays;
import org.c.b;
import org.c.c;

public class d
    implements Runnable
{

    private static final b a = org.c.c.a(com/kik/d/d);
    private final File b;
    private final int c;
    private volatile boolean d;

    public d(File file, int i)
    {
        d = false;
        b = file;
        c = i;
    }

    public void run()
    {
        int j = 0;
        d = false;
        if (!b.isDirectory())
        {
            a.b("Not a directory");
        } else
        {
            String as[] = b.list();
            if (as.length < c)
            {
                a.a("Not deleting {} files", Integer.valueOf(as.length));
                d = true;
                return;
            }
            Arrays.sort(as);
            int l = as.length;
            int i1 = c;
            for (int i = 0; i < l - i1;)
            {
                int k = j;
                if (!(new File(b, as[i])).delete())
                {
                    k = j + 1;
                }
                i++;
                j = k;
            }

            if (j == 0)
            {
                d = true;
                return;
            }
        }
    }

}
