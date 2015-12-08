// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.am;
import com.google.a.b.s;
import com.google.a.d.a;
import com.google.a.d.e;
import com.google.a.d.f;
import com.google.a.k;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.a.b.a:
//            x, c

final class d extends am
{

    final c a;
    private final am b;
    private final s c;

    public d(c c1, k k, Type type, am am1, s s1)
    {
        a = c1;
        super();
        b = new x(k, am1, type);
        c = s1;
    }

    public final Object a(a a1)
    {
        if (a1.f() == e.i)
        {
            a1.j();
            return null;
        }
        Collection collection = (Collection)c.a();
        a1.a();
        for (; a1.e(); collection.add(b.a(a1))) { }
        a1.b();
        return collection;
    }

    public final void a(f f1, Object obj)
    {
        obj = (Collection)obj;
        if (obj == null)
        {
            f1.f();
            return;
        }
        f1.b();
        Object obj1;
        for (obj = ((Collection) (obj)).iterator(); ((Iterator) (obj)).hasNext(); b.a(f1, obj1))
        {
            obj1 = ((Iterator) (obj)).next();
        }

        f1.c();
    }
}
