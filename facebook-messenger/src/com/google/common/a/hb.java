// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.ListIterator;

// Referenced classes of package com.google.common.a:
//            hm, gw, ha

class hb
    implements ListIterator
{

    final ListIterator a;
    final ha b;

    hb(ha ha, ListIterator listiterator)
    {
        b = ha;
        a = listiterator;
        super();
    }

    public java.util.Map.Entry a()
    {
        return gw.a((hm)a.next());
    }

    public void a(java.util.Map.Entry entry)
    {
        throw new UnsupportedOperationException();
    }

    public void add(Object obj)
    {
        b((java.util.Map.Entry)obj);
    }

    public java.util.Map.Entry b()
    {
        return gw.a((hm)a.previous());
    }

    public void b(java.util.Map.Entry entry)
    {
        throw new UnsupportedOperationException();
    }

    public boolean hasNext()
    {
        return a.hasNext();
    }

    public boolean hasPrevious()
    {
        return a.hasPrevious();
    }

    public Object next()
    {
        return a();
    }

    public int nextIndex()
    {
        return a.nextIndex();
    }

    public Object previous()
    {
        return b();
    }

    public int previousIndex()
    {
        return a.previousIndex();
    }

    public void remove()
    {
        a.remove();
    }

    public void set(Object obj)
    {
        a((java.util.Map.Entry)obj);
    }
}
