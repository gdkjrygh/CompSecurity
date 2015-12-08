// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            bb, ImmutableListMultimap, ImmutableMultimap

public final class av extends bb
{

    public av()
    {
    }

    public final ImmutableListMultimap a()
    {
        return (ImmutableListMultimap)super.b();
    }

    public final av a(Object obj, Object obj1)
    {
        super.b(obj, obj1);
        return this;
    }

    public final ImmutableMultimap b()
    {
        return (ImmutableListMultimap)super.b();
    }

    public final bb b(Object obj, Object obj1)
    {
        return a(obj, obj1);
    }
}
