// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.AbstractSet;
import java.util.Iterator;

// Referenced classes of package com.google.a.b:
//            v, z

final class y extends AbstractSet
{

    final v a;

    private y(v v1)
    {
        a = v1;
        super();
    }

    y(v v1, byte byte0)
    {
        this(v1);
    }

    public final void clear()
    {
        a.clear();
    }

    public final boolean contains(Object obj)
    {
        return a.containsKey(obj);
    }

    public final Iterator iterator()
    {
        return new z(this);
    }

    public final boolean remove(Object obj)
    {
        int i = v.b(a);
        a.remove(obj);
        return v.b(a) != i;
    }

    public final int size()
    {
        return v.b(a);
    }
}
