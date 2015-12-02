// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            hf, hd

class he
    implements Iterator
{

    final Iterator a;
    final hd b;

    he(hd hd, Iterator iterator)
    {
        b = hd;
        a = iterator;
        super();
    }

    public java.util.Map.Entry a()
    {
        return new hf(this, a.next());
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
