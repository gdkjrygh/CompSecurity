// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;

final class lk
    implements Iterator
{

    final Iterator a;

    lk(Iterator iterator)
    {
        a = iterator;
        super();
    }

    public boolean hasNext()
    {
        return a.hasNext();
    }

    public Object next()
    {
        return ((java.util.Map.Entry)a.next()).getKey();
    }

    public void remove()
    {
        a.remove();
    }
}
