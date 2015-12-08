// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import b.a.a.a.d;
import java.io.File;

// Referenced classes of package com.a.a.c:
//            d, x, g, D

final class C
    implements Runnable
{

    final x a;

    C(x x1)
    {
        a = x1;
        super();
    }

    public final void run()
    {
        x x1 = a;
        File afile[] = x.a(a, d.a);
        File file = new File(x1.g.g(), "invalidClsFiles");
        if (file.exists())
        {
            if (file.isDirectory())
            {
                File afile2[] = file.listFiles();
                int k = afile2.length;
                for (int i = 0; i < k; i++)
                {
                    afile2[i].delete();
                }

            }
            file.delete();
        }
        int i1 = afile.length;
        for (int j = 0; j < i1; j++)
        {
            Object obj = afile[j];
            d.a();
            (new StringBuilder("Found invalid session part file: ")).append(obj);
            obj = new D(x1, x.a(((File) (obj))));
            d.a();
            File afile1[] = x1.a(((java.io.FilenameFilter) (obj)));
            int j1 = afile1.length;
            for (int l = 0; l < j1; l++)
            {
                File file1 = afile1[l];
                d.a();
                (new StringBuilder("Deleting session file: ")).append(file1);
                file1.delete();
            }

        }

    }
}
