// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.usermedia;

import com.kik.g.p;
import com.kik.g.r;
import com.kik.m.q;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kik.android.util.cq;

// Referenced classes of package com.kik.cards.web.usermedia:
//            d, PhotoPlugin, f

final class e extends r
{

    final String a;
    final d b;

    e(d d1, String s)
    {
        b = d1;
        a = s;
        super();
    }

    public final void a(Object obj)
    {
        Object obj1 = (List)obj;
        obj = new LinkedList();
        LinkedList linkedlist = new LinkedList();
        String s;
        String s1;
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((List) (obj)).add(new PhotoPlugin.b(b.i, s, s1)))
        {
            s = (String)((Iterator) (obj1)).next();
            s1 = cq.a(s);
            linkedlist.add(s1);
        }

        PhotoPlugin.a(b.a, 200, linkedlist);
        obj = new PhotoPlugin.c(b.i, ((List) (obj)), b.e, a, b.f, b.g, b.h, (byte)0);
        PhotoPlugin.b(b.i).a(((java.util.concurrent.Callable) (obj))).a(new f(this));
    }

    public final void b()
    {
        PhotoPlugin.a(b.a, 200, null);
    }

    public final void b(Throwable throwable)
    {
        PhotoPlugin.a(b.a, 500, null);
    }
}
