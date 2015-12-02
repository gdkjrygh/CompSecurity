// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            g, a

class h
    implements Iterator
{

    java.util.Map.Entry a;
    final Iterator b;
    final g c;

    h(g g1, Iterator iterator)
    {
        c = g1;
        b = iterator;
        super();
    }

    public boolean hasNext()
    {
        return b.hasNext();
    }

    public Object next()
    {
        a = (java.util.Map.Entry)b.next();
        return a.getKey();
    }

    public void remove()
    {
        Object obj;
        boolean flag;
        if (a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        obj = a.getValue();
        b.remove();
        com.google.common.a.a.b(c.a, obj);
    }
}
