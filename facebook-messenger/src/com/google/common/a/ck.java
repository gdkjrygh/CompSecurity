// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.AbstractSet;
import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            bj, cj

final class ck extends AbstractSet
{

    final bj a;

    ck(bj bj1)
    {
        a = bj1;
        super();
    }

    public void clear()
    {
        a.clear();
    }

    public boolean contains(Object obj)
    {
        return a.containsKey(obj);
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public Iterator iterator()
    {
        return new cj(a);
    }

    public boolean remove(Object obj)
    {
        return a.remove(obj) != null;
    }

    public int size()
    {
        return a.size();
    }
}
