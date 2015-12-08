// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableSet

public static final class rrayBasedBuilder extends rrayBasedBuilder
{

    private rrayBasedBuilder addAll(Iterable iterable)
    {
        super.addAll(iterable);
        return this;
    }

    private rrayBasedBuilder.addAll addAll(Iterator iterator)
    {
        super.addAll(iterator);
        return this;
    }

    public final volatile rrayBasedBuilder add(Object obj)
    {
        return add(obj);
    }

    public final volatile uilder add(Object obj)
    {
        return add(obj);
    }

    public final add add(Object obj)
    {
        super.add(obj);
        return this;
    }

    public final volatile uilder addAll(Iterable iterable)
    {
        return addAll(iterable);
    }

    public final volatile uilder addAll(Iterator iterator)
    {
        return addAll(iterator);
    }

    public final ImmutableSet build()
    {
        ImmutableSet immutableset = ImmutableSet.access$000(size, contents);
        size = immutableset.size();
        return immutableset;
    }

    public uilder()
    {
        this(4);
    }

    private <init>(int i)
    {
        super(i);
    }
}
