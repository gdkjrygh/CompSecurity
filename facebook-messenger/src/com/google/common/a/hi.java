// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            hm, hh

class hi
    implements Iterator
{

    final Iterator a;
    final hh b;

    hi(hh hh, Iterator iterator)
    {
        b = hh;
        a = iterator;
        super();
    }

    public boolean hasNext()
    {
        return a.hasNext();
    }

    public Object next()
    {
        return ((hm)a.next()).a;
    }

    public void remove()
    {
        a.remove();
    }
}
