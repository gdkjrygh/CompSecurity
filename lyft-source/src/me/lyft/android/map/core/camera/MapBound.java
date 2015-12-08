// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.core.camera;

import java.util.List;

// Referenced classes of package me.lyft.android.map.core.camera:
//            IMapBound

public class MapBound
    implements IMapBound
{

    private int height;
    private List locationList;
    private int padding;
    private int width;

    public MapBound(List list, int i, int j, int k)
    {
        locationList = list;
        width = i;
        height = j;
        padding = k;
    }

    public int getHeight()
    {
        return height;
    }

    public List getLocationList()
    {
        return locationList;
    }

    public int getPadding()
    {
        return padding;
    }

    public int getWidth()
    {
        return width;
    }

    public boolean isNull()
    {
        return false;
    }
}
