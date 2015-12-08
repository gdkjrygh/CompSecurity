// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.ae;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.a.b:
//            db, bl

final class cz extends db
{

    final Set a;
    final ae b;
    final Set c;

    cz(Set set, ae ae, Set set1)
    {
        a = set;
        b = ae;
        c = set1;
        super((byte)0);
    }

    public final boolean contains(Object obj)
    {
        return a.contains(obj) && c.contains(obj);
    }

    public final boolean containsAll(Collection collection)
    {
        return a.containsAll(collection) && c.containsAll(collection);
    }

    public final boolean isEmpty()
    {
        return !iterator().hasNext();
    }

    public final Iterator iterator()
    {
        return bl.a(a.iterator(), b);
    }

    public final int size()
    {
        return bl.b(iterator());
    }
}
