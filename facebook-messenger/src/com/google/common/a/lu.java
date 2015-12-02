// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            lt, lj, eq

class lu
    implements Iterator
{

    final Iterator a;
    final lt b;

    lu(lt lt1)
    {
        b = lt1;
        super();
        a = b.a.a.keySet().iterator();
    }

    public java.util.Map.Entry a()
    {
        Object obj = a.next();
        return new eq(obj, b.a.b(obj));
    }

    public boolean hasNext()
    {
        return a.hasNext();
    }

    public Object next()
    {
        return a();
    }

    public void remove()
    {
        a.remove();
    }
}
