// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.am;
import com.google.a.c.a;
import com.google.a.d.f;
import com.google.a.k;
import java.lang.reflect.Field;

// Referenced classes of package com.google.a.b.a:
//            s, x, p

final class q extends s
{

    final am a;
    final k b;
    final a c;
    final Field d;
    final boolean e;
    final p f;

    q(p p, String s1, boolean flag, boolean flag1, k k1, a a1, Field field, 
            boolean flag2)
    {
        f = p;
        b = k1;
        c = a1;
        d = field;
        e = flag2;
        super(s1, flag, flag1);
        a = b.a(c);
    }

    final void a(com.google.a.d.a a1, Object obj)
    {
        a1 = ((com.google.a.d.a) (a.a(a1)));
        if (a1 != null || !e)
        {
            d.set(obj, a1);
        }
    }

    final void a(f f1, Object obj)
    {
        obj = d.get(obj);
        (new x(b, a, c.b())).a(f1, obj);
    }
}
