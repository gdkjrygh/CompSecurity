// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android.heatmaps;

import java.util.Collection;

// Referenced classes of package com.google.maps.android.heatmaps:
//            HeatmapTileProvider, Gradient

public static class opacity
{

    private Collection data;
    private Gradient gradient;
    private double opacity;
    private int radius;

    public HeatmapTileProvider build()
    {
        if (data == null)
        {
            throw new IllegalStateException("No input data: you must use either .data or .weightedData before building");
        } else
        {
            return new HeatmapTileProvider(this, null);
        }
    }

    public data data(Collection collection)
    {
        return weightedData(HeatmapTileProvider.access$000(collection));
    }

    public _cls00 gradient(Gradient gradient1)
    {
        gradient = gradient1;
        return this;
    }

    public gradient opacity(double d)
    {
        opacity = d;
        if (opacity < 0.0D || opacity > 1.0D)
        {
            throw new IllegalArgumentException("Opacity must be in range [0, 1]");
        } else
        {
            return this;
        }
    }

    public opacity radius(int i)
    {
        radius = i;
        if (radius < 10 || radius > 50)
        {
            throw new IllegalArgumentException("Radius not within bounds.");
        } else
        {
            return this;
        }
    }

    public radius weightedData(Collection collection)
    {
        data = collection;
        if (data.isEmpty())
        {
            throw new IllegalArgumentException("No input points.");
        } else
        {
            return this;
        }
    }





    public ()
    {
        radius = 20;
        gradient = HeatmapTileProvider.DEFAULT_GRADIENT;
        opacity = 0.69999999999999996D;
    }
}
