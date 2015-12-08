// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.al;
import com.google.b.c.a;
import com.google.b.d.d;
import com.google.b.k;
import java.lang.reflect.Field;

// Referenced classes of package com.google.b.b.a:
//            t, q, y

final class r extends t
{

    final al a;
    final k b;
    final Field c;
    final a d;
    final boolean e;
    final q f;

    r(q q1, String s, boolean flag, boolean flag1, k k, Field field, a a1, 
            boolean flag2)
    {
        f = q1;
        b = k;
        c = field;
        d = a1;
        e = flag2;
        super(s, flag, flag1);
        a = com.google.b.b.a.q.a(f, b, c, d);
    }

    final void a(com.google.b.d.a a1, Object obj)
    {
        a1 = ((com.google.b.d.a) (a.a(a1)));
        if (a1 != null || !e)
        {
            c.set(obj, a1);
        }
    }

    final void a(d d1, Object obj)
    {
        obj = c.get(obj);
        (new y(b, a, d.getType())).a(d1, obj);
    }
}
