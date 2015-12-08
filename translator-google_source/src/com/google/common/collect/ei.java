// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.util.Iterator;

abstract class ei
    implements Iterator
{

    final Iterator b;

    ei(Iterator iterator)
    {
        b = (Iterator)p.a(iterator);
    }

    abstract Object a(Object obj);

    public final boolean hasNext()
    {
        return b.hasNext();
    }

    public final Object next()
    {
        return a(b.next());
    }

    public final void remove()
    {
        b.remove();
    }
}
