// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Predicate;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            kp, gg

final class kn extends kp
{

    final Set a;
    final Predicate b;
    final Set c;

    kn(Set set, Predicate predicate, Set set1)
    {
        a = set;
        b = predicate;
        c = set1;
        super(null);
    }

    public boolean contains(Object obj)
    {
        return a.contains(obj) && !c.contains(obj);
    }

    public boolean isEmpty()
    {
        return c.containsAll(a);
    }

    public Iterator iterator()
    {
        return gg.a(a.iterator(), b);
    }

    public int size()
    {
        return gg.b(iterator());
    }
}
