// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ej, ImmutableMultimap, ImmutableMap, ImmutableSet, 
//            bl

abstract class bd extends ej
{

    final Iterator b;
    Object c;
    Iterator d;
    final ImmutableMultimap e;

    private bd(ImmutableMultimap immutablemultimap)
    {
        e = immutablemultimap;
        super();
        b = e.asMap().entrySet().iterator();
        c = null;
        d = bl.a();
    }

    bd(ImmutableMultimap immutablemultimap, byte byte0)
    {
        this(immutablemultimap);
    }

    abstract Object a(Object obj, Object obj1);

    public boolean hasNext()
    {
        return b.hasNext() || d.hasNext();
    }

    public Object next()
    {
        if (!d.hasNext())
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)b.next();
            c = entry.getKey();
            d = ((Collection)entry.getValue()).iterator();
        }
        return a(c, d.next());
    }
}
