// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            gt, gr

class gu
    implements Iterator
{

    Object a;
    final Iterator b;
    final gt c;

    gu(gt gt1, Iterator iterator)
    {
        c = gt1;
        b = iterator;
        super();
    }

    public boolean hasNext()
    {
        return b.hasNext();
    }

    public Object next()
    {
        a = b.next();
        return a;
    }

    public void remove()
    {
        b.remove();
        c.c.b.remove(c.a(a));
    }
}
