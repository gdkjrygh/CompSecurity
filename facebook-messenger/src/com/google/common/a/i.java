// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            dz, a, j, b

class i extends dz
{

    final Set a;
    final a b;

    private i(a a1)
    {
        b = a1;
        super();
        a = com.google.common.a.a.b(b).keySet();
    }

    i(a a1, b b1)
    {
        this(a1);
    }

    protected Set a()
    {
        return a;
    }

    protected Collection b()
    {
        return a();
    }

    protected Object c()
    {
        return a();
    }

    public Iterator iterator()
    {
        return new j(this, com.google.common.a.a.a(b).values().iterator());
    }

    public Object[] toArray()
    {
        return f();
    }

    public Object[] toArray(Object aobj[])
    {
        return a(aobj);
    }

    public String toString()
    {
        return e();
    }
}
