// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.af;
import com.google.a.c.a;
import com.google.a.d.d;
import com.google.a.j;
import java.lang.reflect.Field;

// Referenced classes of package com.google.a.b.a:
//            t, q, y

class r extends t
{

    final af a;
    final j b;
    final Field c;
    final a d;
    final boolean e;
    final q f;

    r(q q1, String s, boolean flag, boolean flag1, j j, Field field, a a1, 
            boolean flag2)
    {
        f = q1;
        b = j;
        c = field;
        d = a1;
        e = flag2;
        super(s, flag, flag1);
        a = com.google.a.b.a.q.a(f, b, c, d);
    }

    void a(com.google.a.d.a a1, Object obj)
    {
        a1 = ((com.google.a.d.a) (a.b(a1)));
        if (a1 != null || !e)
        {
            c.set(obj, a1);
        }
    }

    void a(d d1, Object obj)
    {
        obj = c.get(obj);
        (new y(b, a, d.b())).a(d1, obj);
    }

    public boolean a(Object obj)
    {
        while (!h || c.get(obj) == obj) 
        {
            return false;
        }
        return true;
    }
}
