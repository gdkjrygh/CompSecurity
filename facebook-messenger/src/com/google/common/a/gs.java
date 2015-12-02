// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            gr

class gs
    implements Iterator
{

    java.util.Map.Entry a;
    final Iterator b;
    final gr c;

    gs(gr gr1, Iterator iterator)
    {
        c = gr1;
        b = iterator;
        super();
    }

    public java.util.Map.Entry a()
    {
        a = (java.util.Map.Entry)b.next();
        return a;
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
        b.remove();
        c.c(a.getKey(), a.getValue());
    }
}
