// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import ctz;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableList

class c extends ImmutableList
{

    private transient int b;
    private transient int c;
    final ImmutableList this$0;

    public final ImmutableList a(int i, int j)
    {
        ctz.a(i, j, c);
        return ImmutableList.this.a(b + i, b + j);
    }

    final boolean e()
    {
        return true;
    }

    public Object get(int i)
    {
        ctz.a(i, c);
        return ImmutableList.this.get(b + i);
    }

    public Iterator iterator()
    {
        return super.a();
    }

    public ListIterator listIterator()
    {
        return a(0);
    }

    public ListIterator listIterator(int i)
    {
        return super.a(i);
    }

    public int size()
    {
        return c;
    }

    public List subList(int i, int j)
    {
        return a(i, j);
    }

    (int i, int j)
    {
        this$0 = ImmutableList.this;
        super();
        b = i;
        c = j;
    }
}
