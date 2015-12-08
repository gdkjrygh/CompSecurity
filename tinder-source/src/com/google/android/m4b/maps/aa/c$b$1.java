// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            c

final class b
    implements Iterator
{

    private java.util.try a;
    private Iterator b;
    private c c;

    public final boolean hasNext()
    {
        return b.hasNext();
    }

    public final Object next()
    {
        a = (java.util.try)b.next();
        return a.getKey();
    }

    public final void remove()
    {
        Collection collection;
        boolean flag;
        if (a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.b(flag, "no calls to next() since the last call to remove()");
        collection = (Collection)a.getValue();
        b.remove();
        com.google.android.m4b.maps.aa.c.b(c.c, collection.size());
        collection.clear();
    }

    ( , Iterator iterator)
    {
        c = ;
        b = iterator;
        super();
    }
}
