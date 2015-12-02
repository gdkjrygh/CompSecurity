// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Function;
import java.util.Iterator;

final class gp
    implements Iterator
{

    final Iterator a;
    final Function b;

    gp(Iterator iterator, Function function)
    {
        a = iterator;
        b = function;
        super();
    }

    public boolean hasNext()
    {
        return a.hasNext();
    }

    public Object next()
    {
        Object obj = a.next();
        return b.apply(obj);
    }

    public void remove()
    {
        a.remove();
    }
}
