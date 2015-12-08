// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.core.polyline;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package me.lyft.android.map.core.polyline:
//            IPolylineOptions

public class PolylineOptions
    implements IPolylineOptions
{

    private int color;
    private List locations;
    private float width;

    private PolylineOptions()
    {
        locations = new ArrayList();
        width = 0.0F;
        color = 0;
    }

    public static IPolylineOptions create()
    {
        return new PolylineOptions();
    }

    public IPolylineOptions addAll(List list)
    {
        locations.addAll(list);
        return this;
    }

    public IPolylineOptions color(int i)
    {
        color = i;
        return this;
    }

    public int getColor()
    {
        return color;
    }

    public List getLocations()
    {
        return locations;
    }

    public float getWidth()
    {
        return width;
    }

    public IPolylineOptions width(float f)
    {
        width = f;
        return this;
    }
}
