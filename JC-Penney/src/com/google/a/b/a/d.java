// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.af;
import com.google.a.b.ae;
import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.j;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.a.b.a:
//            y

final class d extends af
{

    private final af a;
    private final ae b;

    public d(j j, Type type, af af1, ae ae1)
    {
        a = new y(j, af1, type);
        b = ae1;
    }

    public Collection a(a a1)
    {
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        }
        Collection collection = (Collection)b.a();
        a1.a();
        for (; a1.e(); collection.add(a.b(a1))) { }
        a1.b();
        return collection;
    }

    public volatile void a(com.google.a.d.d d1, Object obj)
    {
        a(d1, (Collection)obj);
    }

    public void a(com.google.a.d.d d1, Collection collection)
    {
        if (collection == null)
        {
            d1.f();
            return;
        }
        d1.b();
        Object obj;
        for (collection = collection.iterator(); collection.hasNext(); a.a(d1, obj))
        {
            obj = collection.next();
        }

        d1.c();
    }

    public Object b(a a1)
    {
        return a(a1);
    }
}
