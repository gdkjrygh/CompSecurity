// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableList

public static final class rayBasedBuilder extends rayBasedBuilder
{

    public final volatile rayBasedBuilder add(Object obj)
    {
        return add(obj);
    }

    public final volatile ilder add(Object obj)
    {
        return add(obj);
    }

    public final add add(Object obj)
    {
        super.add(obj);
        return this;
    }

    public final volatile ilder addAll(Iterable iterable)
    {
        return addAll(iterable);
    }

    public final volatile ilder addAll(Iterator iterator)
    {
        return addAll(iterator);
    }

    public final addAll addAll(Iterable iterable)
    {
        super.addAll(iterable);
        return this;
    }

    public final rayBasedBuilder.addAll addAll(Iterator iterator)
    {
        super.addAll(iterator);
        return this;
    }

    public final ImmutableList build()
    {
        return ImmutableList.asImmutableList(contents, size);
    }

    public ilder()
    {
        this(4);
    }

    private <init>(int i)
    {
        super(i);
    }
}
