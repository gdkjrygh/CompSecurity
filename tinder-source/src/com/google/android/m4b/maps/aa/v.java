// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.util.Iterator;

abstract class v
    implements Iterator
{

    private Iterator a;

    v(Iterator iterator)
    {
        a = (Iterator)j.a(iterator);
    }

    abstract Object a(Object obj);

    public final boolean hasNext()
    {
        return a.hasNext();
    }

    public final Object next()
    {
        return a(a.next());
    }

    public final void remove()
    {
        a.remove();
    }
}
