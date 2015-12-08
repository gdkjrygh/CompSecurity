// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.j;

import com.b.a.n;
import com.kik.g.r;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kik.a.h.o;

// Referenced classes of package kik.a.j:
//            o

final class s extends r
{

    final String a;
    final kik.a.j.o b;

    s(kik.a.j.o o1, String s1)
    {
        b = o1;
        a = s1;
        super();
    }

    public final void a(Object obj)
    {
        Iterator iterator = ((Map)obj).entrySet().iterator();
        while (iterator.hasNext()) 
        {
            Object obj1 = (java.util.Map.Entry)iterator.next();
            obj = "(null)";
            if (obj1 != null)
            {
                Object obj2 = (n)((java.util.Map.Entry) (obj1)).getValue();
                if (obj2 != null)
                {
                    obj = o.a(((n) (obj2)));
                    obj2 = (String)((java.util.Map.Entry) (obj1)).getKey();
                    (new StringBuilder()).append(((String) (obj2))).append(" (").append(((String) (obj))).append(")");
                }
            } else
            {
                (new StringBuilder("Deleting key \"")).append(a).append(".").append((String)((java.util.Map.Entry) (obj1)).getKey()).append("\"");
                b.a(a, (String)((java.util.Map.Entry) (obj1)).getKey(), null);
            }
            obj1 = (String)((java.util.Map.Entry) (obj1)).getKey();
            (new StringBuilder()).append(((String) (obj1))).append(" (").append(((String) (obj))).append(")");
        }
    }
}
