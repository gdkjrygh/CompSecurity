// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.android.stickers;

import com.kik.g.p;
import com.kik.g.r;
import com.kik.n.a.f.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kik.a.d.x;
import org.c.b;

// Referenced classes of package com.kik.android.stickers:
//            c

final class e extends r
{

    final p a;
    final com.kik.android.stickers.c b;

    e(com.kik.android.stickers.c c1, p p1)
    {
        b = c1;
        a = p1;
        super();
    }

    public final void a(Object obj)
    {
        Object obj1 = (Map)obj;
        obj = new ArrayList();
        for (obj1 = ((Map) (obj1)).values().iterator(); ((Iterator) (obj1)).hasNext(); ((List) (obj)).add(new x((c)((Iterator) (obj1)).next()))) { }
        obj = c.a(((List) (obj))).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            x x1 = (x)((Iterator) (obj)).next();
            String s = x1.a();
            if (s != null)
            {
                c.a(b).put(s, x1);
            }
        } while (true);
        obj = b.a();
        for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext(); com.kik.android.stickers.c.b((x)iterator.next())) { }
        a.a(obj);
    }

    public final void a(Throwable throwable)
    {
        com.kik.android.stickers.c.c().b("Failed to load sticker packs", throwable);
        a.a(throwable);
    }
}
