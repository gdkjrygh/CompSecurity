// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import java.util.Iterator;

// Referenced classes of package com.pandora.radio.data:
//            StationRecommendations, StationRecommendation

class a
    implements Iterator
{

    final StationRecommendations a;
    private a b;
    private a c;

    public StationRecommendation a()
    {
        if (b.hasNext())
        {
            return b.a();
        } else
        {
            return c.a();
        }
    }

    public boolean hasNext()
    {
        return b.hasNext() || c.hasNext();
    }

    public Object next()
    {
        return a();
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }

    (StationRecommendations stationrecommendations)
    {
        a = stationrecommendations;
        super();
        b = a.c();
        c = a.d();
    }
}
