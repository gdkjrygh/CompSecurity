// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ej, ImmutableEnumMap, Maps

final class ar extends ej
{

    final ImmutableEnumMap._cls2 a;
    private final Iterator b;

    ar(ImmutableEnumMap._cls2 _pcls2)
    {
        a = _pcls2;
        super();
        b = ImmutableEnumMap.access$000(a.this$0).entrySet().iterator();
    }

    public final boolean hasNext()
    {
        return b.hasNext();
    }

    public final Object next()
    {
        java.util.Map.Entry entry = (java.util.Map.Entry)b.next();
        return Maps.a(entry.getKey(), entry.getValue());
    }
}
