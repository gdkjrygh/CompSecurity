// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.j;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kik.a.d.ab;

// Referenced classes of package kik.a.j:
//            q, o

final class r extends com.kik.g.r
{

    final q a;

    r(q q1)
    {
        a = q1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (Map)obj;
        if (((Map) (obj)).size() == 1 && ((Map) (obj)).containsKey(""))
        {
            obj = o.a(a.d, (ab)((Map) (obj)).get(""), a.b, a.c);
            a.d.a(((ab) (obj)).a(), ((ab) (obj)).b(), ((ab) (obj)).c(), null);
        } else
        {
            obj = ((Map) (obj)).values().iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                ab ab1 = (ab)((Iterator) (obj)).next();
                ab1 = o.a(a.d, ab1, a.b, a.c);
                a.d.a(ab1.a(), ab1.b(), ab1.c(), null);
            }
        }
    }
}
