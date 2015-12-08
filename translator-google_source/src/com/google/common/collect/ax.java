// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ej, ay

final class ax extends ej
{

    final Iterator a;
    final ImmutableMap.MapViewOfValuesAsSingletonSets._cls1 b;

    ax(ImmutableMap.MapViewOfValuesAsSingletonSets._cls1 _pcls1, Iterator iterator)
    {
        b = _pcls1;
        a = iterator;
        super();
    }

    public final boolean hasNext()
    {
        return a.hasNext();
    }

    public final Object next()
    {
        return new ay(this, (java.util.Map.Entry)a.next());
    }
}
