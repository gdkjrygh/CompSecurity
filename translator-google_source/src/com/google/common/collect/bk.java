// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;

// Referenced classes of package com.google.common.collect:
//            bl, Lists

public final class bk
{

    public static Object a(Iterable iterable)
    {
        return bl.b(iterable.iterator());
    }

    static Object[] b(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            iterable = (Collection)iterable;
        } else
        {
            iterable = Lists.a(iterable.iterator());
        }
        return iterable.toArray();
    }

    public static Object c(Iterable iterable)
    {
        return bl.c(iterable.iterator());
    }
}
