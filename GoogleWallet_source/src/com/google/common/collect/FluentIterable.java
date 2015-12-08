// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            Iterables

public abstract class FluentIterable
    implements Iterable
{

    private final Iterable iterable = this;

    protected FluentIterable()
    {
    }

    public String toString()
    {
        return Iterables.toString(iterable);
    }
}
