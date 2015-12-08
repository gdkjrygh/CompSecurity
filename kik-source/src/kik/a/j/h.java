// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.j;

import com.kik.g.p;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package kik.a.j:
//            a

final class h
    implements Runnable
{

    final p a;
    final a b;

    h(a a1, p p1)
    {
        b = a1;
        a = p1;
        super();
    }

    public final void run()
    {
        ArrayList arraylist = new ArrayList();
        if (kik.a.j.a.a(b).exists())
        {
            File afile[] = kik.a.j.a.a(b).listFiles();
            int j = afile.length;
            for (int i = 0; i < j; i++)
            {
                String s = afile[i].getName();
                if (!s.startsWith("."))
                {
                    arraylist.add(s);
                }
            }

            a.a(arraylist);
        }
    }
}
