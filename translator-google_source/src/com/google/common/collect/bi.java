// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.util.Comparator;

// Referenced classes of package com.google.common.collect:
//            aw, ImmutableSortedMap, ImmutableMap

public final class bi extends aw
{

    private final Comparator c;

    public bi(Comparator comparator)
    {
        c = (Comparator)p.a(comparator);
    }

    public final ImmutableMap a()
    {
        return ImmutableSortedMap.fromEntries(c, false, b, a);
    }

    public final aw a(Object obj, Object obj1)
    {
        super.a(obj, obj1);
        return this;
    }
}
