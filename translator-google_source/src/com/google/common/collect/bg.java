// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ap, ImmutableSet, aq

public class bg extends ap
{

    public bg()
    {
        this((byte)0);
    }

    private bg(byte byte0)
    {
    }

    public ImmutableSet a()
    {
        ImmutableSet immutableset = ImmutableSet.access$000(b, a);
        b = immutableset.size();
        return immutableset;
    }

    public ap a(Object obj)
    {
        return c(obj);
    }

    public aq a(Iterator iterator)
    {
        return b(iterator);
    }

    public aq a(Object aobj[])
    {
        return b(aobj);
    }

    public aq b(Object obj)
    {
        return c(obj);
    }

    public bg b(Iterator iterator)
    {
        super.a(iterator);
        return this;
    }

    public transient bg b(Object aobj[])
    {
        super.a(aobj);
        return this;
    }

    public bg c(Object obj)
    {
        super.a(obj);
        return this;
    }
}
