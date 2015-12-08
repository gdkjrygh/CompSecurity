// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.i;

import com.kik.g.as;
import com.kik.n.a.b.e;
import com.kik.n.a.b.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package kik.a.i:
//            a, c, d

final class b
    implements as
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public final Object a(Object obj)
    {
        obj = (Map)obj;
        kik.a.i.a.a(a, new ArrayList());
        kik.a.i.a.a(a, ((Map) (obj)));
        ArrayList arraylist = new ArrayList();
        Object obj1 = new ArrayList();
        ((List) (obj1)).addAll(((Map) (obj)).entrySet());
        Collections.sort(((List) (obj1)), new c(this));
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext();)
        {
            obj = (java.util.Map.Entry)((Iterator) (obj1)).next();
            Object obj2 = (e)((java.util.Map.Entry) (obj)).getValue();
            kik.a.i.a.a(a).add(((java.util.Map.Entry) (obj)).getKey());
            obj2 = ((e) (obj2)).b().iterator();
            while (((Iterator) (obj2)).hasNext()) 
            {
                Object obj3 = (g)((Iterator) (obj2)).next();
                if (obj3 == null)
                {
                    obj = null;
                } else
                {
                    obj = ((g) (obj3)).g();
                    String s = ((g) (obj3)).c();
                    String s1 = ((g) (obj3)).d();
                    String s2 = ((g) (obj3)).e();
                    obj3 = ((g) (obj3)).f();
                    long l;
                    if (obj3 == null)
                    {
                        l = 0L;
                    } else
                    {
                        l = ((Long) (obj3)).longValue();
                    }
                    obj = new h.a(((String) (obj)), s, s1, s2, Long.valueOf(l).longValue());
                }
                arraylist.add(obj);
            }
        }

        Collections.sort(arraylist, new d(this));
        return arraylist;
    }
}
