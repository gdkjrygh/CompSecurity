// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.gps;

import com.accuweather.android.models.location.GeoPosition;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.accuweather.android.services.gps:
//            GeocoderCache

private static class keyIndex extends LinkedHashMap
{

    private static final long serialVersionUID = 1L;
    private int MAX_VALUE;
    private LinkedList keyIndex;

    private void addKeyToIndex(GeoPosition geoposition)
    {
        keyIndex.addLast(geoposition);
    }

    public GeoPosition get(int i)
    {
        return (GeoPosition)keyIndex.get(i);
    }

    public GeoPosition getLast()
    {
        if (!keyIndex.isEmpty())
        {
            return (GeoPosition)keyIndex.getLast();
        } else
        {
            return null;
        }
    }

    public volatile Object put(Object obj, Object obj1)
    {
        return put((GeoPosition)obj, (List)obj1);
    }

    public List put(GeoPosition geoposition, List list)
    {
        if (keyIndex.size() == MAX_VALUE)
        {
            remove((GeoPosition)keyIndex.getFirst());
        }
        addKeyToIndex(geoposition);
        return (List)super.put(geoposition, list);
    }

    public void putAll(Map map)
    {
        GeoPosition geoposition;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); put(geoposition, (List)map.get(geoposition)))
        {
            geoposition = (GeoPosition)iterator.next();
        }

    }

    public volatile Object remove(Object obj)
    {
        return remove(obj);
    }

    public List remove(Object obj)
    {
        keyIndex.remove(obj);
        return (List)super.remove(obj);
    }

    public ()
    {
        MAX_VALUE = 10;
        keyIndex = new LinkedList();
    }
}
