// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            q, bi

class v
    implements Iterator
{

    final Iterator a;
    java.util.Map.Entry b;
    int c;
    boolean d;
    final q e;

    v(q q1)
    {
        e = q1;
        super();
        a = q.a(q1).entrySet().iterator();
    }

    public boolean hasNext()
    {
        return c > 0 || a.hasNext();
    }

    public Object next()
    {
        if (c == 0)
        {
            b = (java.util.Map.Entry)a.next();
            c = ((bi)b.getValue()).a();
        }
        c = c - 1;
        d = true;
        return b.getKey();
    }

    public void remove()
    {
        Preconditions.checkState(d, "no calls to next() since the last call to remove()");
        if (((bi)b.getValue()).a() <= 0)
        {
            throw new ConcurrentModificationException();
        }
        if (((bi)b.getValue()).b(-1) == 0)
        {
            a.remove();
        }
        q.b(e);
        d = false;
    }
}
