// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kik.a.d.a.a;

// Referenced classes of package com.kik.l:
//            o, ae

final class ag
    implements y.a
{

    List a;
    String b;
    final Map c;
    final ae d;

    ag(ae ae, Map map)
    {
        d = ae;
        c = map;
        super();
        a = null;
        b = null;
    }

    public final void a(Object obj)
    {
        obj = (o)obj;
        String s = ((o) (obj)).c("content_id");
        if (a == null || !s.equals(b))
        {
            a = (List)c.get(s);
            b = s;
        }
        if (a != null)
        {
            for (Iterator iterator = a.iterator(); iterator.hasNext(); ((o) (obj)).b((a)iterator.next())) { }
        }
    }
}
