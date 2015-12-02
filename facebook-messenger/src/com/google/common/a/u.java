// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            t, bi, q

class u
    implements Iterator
{

    java.util.Map.Entry a;
    final Iterator b;
    final t c;

    u(t t1, Iterator iterator)
    {
        c = t1;
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
        boolean flag;
        if (a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "no calls to next() since the last call to remove()");
        q.a(c.a, ((bi)a.getValue()).d(0));
        b.remove();
        a = null;
    }
}
