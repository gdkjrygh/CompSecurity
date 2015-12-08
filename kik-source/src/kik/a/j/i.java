// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.j;

import com.kik.g.p;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kik.a.d.ab;

// Referenced classes of package kik.a.j:
//            a

final class i
    implements Runnable
{

    final List a;
    final p b;
    final a c;

    i(a a1, List list, p p1)
    {
        c = a1;
        a = list;
        b = p1;
        super();
    }

    public final void run()
    {
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (ab)iterator.next();
            obj = kik.a.j.a.b(((ab) (obj)).a(), ((ab) (obj)).b());
            File file = new File(kik.a.j.a.b(c), ((String) (obj)));
            if (file.exists())
            {
                file.delete();
            }
            obj = (new StringBuilder("_")).append(((String) (obj))).toString();
            obj = new File(kik.a.j.a.b(c), ((String) (obj)));
            if (((File) (obj)).exists())
            {
                ((File) (obj)).delete();
            }
        } while (true);
        b.a(a);
    }
}
