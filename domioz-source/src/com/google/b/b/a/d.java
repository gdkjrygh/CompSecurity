// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.al;
import com.google.b.b.ae;
import com.google.b.d.a;
import com.google.b.d.c;
import com.google.b.k;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.b.b.a:
//            y

final class d extends al
{

    private final al a;
    private final ae b;

    public d(k k, Type type, al al1, ae ae1)
    {
        a = new y(k, al1, type);
        b = ae1;
    }

    public final Object a(a a1)
    {
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        }
        Collection collection = (Collection)b.a();
        a1.a();
        for (; a1.e(); collection.add(a.a(a1))) { }
        a1.b();
        return collection;
    }

    public final void a(com.google.b.d.d d1, Object obj)
    {
        obj = (Collection)obj;
        if (obj == null)
        {
            d1.f();
            return;
        }
        d1.b();
        Object obj1;
        for (obj = ((Collection) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a.a(d1, obj1))
        {
            obj1 = ((Iterator) (obj)).next();
        }

        d1.c();
    }
}
