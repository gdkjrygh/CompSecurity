// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            s, bi, q, jg

class r
    implements Iterator
{

    java.util.Map.Entry a;
    final Iterator b;
    final q c;

    r(q q1, Iterator iterator)
    {
        c = q1;
        b = iterator;
        super();
    }

    public jg a()
    {
        java.util.Map.Entry entry = (java.util.Map.Entry)b.next();
        a = entry;
        return new s(this, entry);
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
        boolean flag;
        if (a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "no calls to next() since the last call to remove()");
        q.a(c, ((bi)a.getValue()).d(0));
        b.remove();
        a = null;
    }
}
