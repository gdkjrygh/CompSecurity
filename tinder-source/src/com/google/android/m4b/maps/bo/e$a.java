// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            e, bb

final class <init>
    implements 
{

    private int a;
    private int b;
    private e c;

    public final bb a()
    {
        return (bb)c.a.get(a);
    }

    public final void b()
    {
        b = a;
    }

    public final void c()
    {
        a = b;
    }

    public final boolean hasNext()
    {
        return a < c.a.size();
    }

    public final Object next()
    {
        List list = c.a;
        int i = a;
        a = i + 1;
        return (bb)list.get(i);
    }

    public final void remove()
    {
        throw new UnsupportedOperationException("remove() not supported");
    }

    private tion(e e1)
    {
        c = e1;
        super();
        a = 0;
        b = 0;
    }

    b(e e1, byte byte0)
    {
        this(e1);
    }
}
