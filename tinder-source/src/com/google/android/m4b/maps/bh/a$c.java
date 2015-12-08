// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bh;

import com.google.android.m4b.maps.ay.k;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bw.e;
import com.google.android.m4b.maps.cc.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.bh:
//            a

final class e extends e
{

    final List d = new ArrayList();
    private final Long e;
    private a f;

    public final void a(e e1)
    {
        d.add(e1);
    }

    public final void a(d d1)
    {
        d d2;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); com.google.android.m4b.maps.bh.a.b(f, com.google.android.m4b.maps.bh.a.b(f) - d2.c))
        {
            d2 = (c)iterator.next();
            d2.a.c(d1);
            com.google.android.m4b.maps.bh.a.a(f, com.google.android.m4b.maps.bh.a.a(f) - d2.b);
        }

        d.clear();
    }

    protected final void a(Object obj, Object obj1)
    {
        obj = (ac)obj;
        obj1 = (d)obj1;
        super.a(obj, obj1);
        com.google.android.m4b.maps.bh.a.a(f, com.google.android.m4b.maps.bh.a.a(f) - ((f) (obj1)).b);
        com.google.android.m4b.maps.bh.a.b(f, com.google.android.m4b.maps.bh.a.b(f) - ((f) (obj1)).c);
        if (((c) (obj1)).a != null)
        {
            obj1.b = 0;
            obj1.c = 0;
            a(((a) (obj1)));
        }
    }

    public final void c()
    {
        Object obj = new ArrayList(super.a.size());
        com.google.android.m4b.maps.bw.a a1 = b();
        do
        {
            if (!a1.hasNext())
            {
                break;
            }
            com.google.android.m4b.maps.bw.a a2 = a1.a();
            if (a2.a == a.a)
            {
                break;
            }
            a a3 = (a)a2.b;
            q q1 = a3.a;
            if (q1 == null || !q1.a())
            {
                ((List) (obj)).add(a2.a);
            } else
            {
                q1.b(com.google.android.m4b.maps.bm.d.a(e.longValue()));
                com.google.android.m4b.maps.bh.a.a(f, com.google.android.m4b.maps.bh.a.a(f) - a3.b);
                a3.b = 0;
            }
        } while (true);
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); d((ac)((Iterator) (obj)).next())) { }
    }

    public final com.google.android.m4b.maps.bw.d d()
    {
        com.google.android.m4b.maps.bw.d d1 = b();
        if (d1.hasNext())
        {
            return d1.a();
        } else
        {
            return null;
        }
    }

    public final void e()
    {
        com.google.android.m4b.maps.bh.a.c(f);
        long l = k.c();
        a a1 = (f)c(a.a);
        if (a1 == null)
        {
            b(a.a, new <init>(l));
            return;
        } else
        {
            a1.d = l;
            return;
        }
    }

    public (a a1, long l)
    {
        f = a1;
        super(0x7fffffff);
        e = Long.valueOf(l);
    }
}
