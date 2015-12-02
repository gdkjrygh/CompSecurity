// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            e, c, a

class d
    implements Iterator
{

    java.util.Map.Entry a;
    final Iterator b;
    final c c;

    d(c c1, Iterator iterator)
    {
        c = c1;
        b = iterator;
        super();
    }

    public java.util.Map.Entry a()
    {
        a = (java.util.Map.Entry)b.next();
        return new e(this, a);
    }

    public boolean hasNext()
    {
        return b.hasNext();
    }

    public Object next()
    {
        return a();
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
        com.google.common.a.a.b(c.b, obj);
    }
}
