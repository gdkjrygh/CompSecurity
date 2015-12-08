// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;

// Referenced classes of package com.google.common.collect:
//            do, di

final class dj extends do
{

    final java.util.Map.Entry a;
    final di b;

    dj(di di, java.util.Map.Entry entry)
    {
        b = di;
        a = entry;
        super();
    }

    public final int getCount()
    {
        return ((Collection)a.getValue()).size();
    }

    public final Object getElement()
    {
        return a.getKey();
    }
}
