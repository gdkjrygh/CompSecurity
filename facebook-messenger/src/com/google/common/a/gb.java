// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.util.Arrays;
import java.util.Collection;

// Referenced classes of package com.google.common.a:
//            ge, gg, ax, gc, 
//            gd, mh

public final class gb
{

    private gb()
    {
    }

    public static Iterable a(Iterable iterable, Function function)
    {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(function);
        return new ge(iterable, function);
    }

    public static Iterable a(Iterable iterable, Iterable iterable1)
    {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(iterable1);
        return c(Arrays.asList(new Iterable[] {
            iterable, iterable1
        }));
    }

    public static Object a(Iterable iterable, Predicate predicate, Object obj)
    {
        return gg.a(iterable.iterator(), predicate, obj);
    }

    public static String a(Iterable iterable)
    {
        return gg.c(iterable.iterator());
    }

    public static boolean a(Collection collection, Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return collection.addAll(ax.a(iterable));
        } else
        {
            return gg.a(collection, iterable.iterator());
        }
    }

    public static Object b(Iterable iterable)
    {
        return gg.d(iterable.iterator());
    }

    public static Iterable c(Iterable iterable)
    {
        Preconditions.checkNotNull(iterable);
        return new gc(iterable);
    }

    static mh d(Iterable iterable)
    {
        return e(iterable);
    }

    private static mh e(Iterable iterable)
    {
        return new gd(iterable.iterator());
    }
}
