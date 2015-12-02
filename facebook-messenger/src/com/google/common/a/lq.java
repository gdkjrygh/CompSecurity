// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            lr, lp, ln

class lq
    implements Iterator
{

    final Iterator a;
    final lp b;

    lq(lp lp1, Iterator iterator)
    {
        b = lp1;
        a = iterator;
        super();
    }

    public java.util.Map.Entry a()
    {
        return new lr(this, (java.util.Map.Entry)a.next());
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
        b.a.c();
    }
}
