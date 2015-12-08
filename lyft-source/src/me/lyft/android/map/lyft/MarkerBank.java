// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.lyft;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import me.lyft.android.common.Iterables;
import me.lyft.android.map.core.IMap;
import me.lyft.android.map.core.markers.MarkerOptions;
import me.lyft.android.map.lyft.markers.Marker;

public class MarkerBank
{

    Map markerTypeMap;

    public MarkerBank()
    {
        markerTypeMap = new HashMap();
    }

    private Map deDupeMarkers(IMap imap, Map map, List list)
    {
        HashMap hashmap = new HashMap();
        HashMap hashmap1 = new HashMap(map);
        map.clear();
        map = list.iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            list = (MarkerOptions)map.next();
            String s = list.getMarkerId();
            if (hashmap1.containsKey(s))
            {
                hashmap.put(s, hashmap1.remove(s));
            } else
            if (!hashmap.containsKey(s))
            {
                me.lyft.android.map.core.markers.IMarker imarker = imap.addMarker(list);
                hashmap.put(list.getMarkerId(), list.create(imarker));
            }
        } while (true);
        removeMarkersFromMap(hashmap1.values());
        return hashmap;
    }

    private void removeMarkersFromMap(Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext(); ((Marker)collection.next()).remove()) { }
    }

    private Map replaceMarkersWithType(IMap imap, Class class1, List list)
    {
        Map map;
        if (markerTypeMap.containsKey(class1))
        {
            map = (Map)markerTypeMap.remove(class1);
        } else
        {
            map = Collections.emptyMap();
        }
        imap = deDupeMarkers(imap, map, list);
        markerTypeMap.put(class1, imap);
        return getMarkersByType(class1);
    }

    public Marker createMarker(IMap imap, MarkerOptions markeroptions)
    {
        Class class1 = markeroptions.getMarkerType();
        Object obj;
        if (markerTypeMap.containsKey(class1))
        {
            obj = (Map)markerTypeMap.remove(class1);
        } else
        {
            obj = new HashMap();
        }
        if (((Map) (obj)).containsKey(markeroptions.getMarkerId()))
        {
            markerTypeMap.put(class1, obj);
            return (Marker)((Map) (obj)).get(markeroptions.getMarkerId());
        } else
        {
            imap = markeroptions.create(imap.addMarker(markeroptions));
            ((Map) (obj)).put(markeroptions.getMarkerId(), imap);
            markerTypeMap.put(class1, obj);
            return imap;
        }
    }

    public Map createMarkers(IMap imap, List list)
    {
        if (list.isEmpty())
        {
            return Collections.emptyMap();
        } else
        {
            return replaceMarkersWithType(imap, ((MarkerOptions)Iterables.firstOrDefault(list)).getMarkerType(), list);
        }
    }

    public Map getMarkerMap()
    {
        return new HashMap(markerTypeMap);
    }

    public final Map getMarkersByType(Class class1)
    {
        if (markerTypeMap.containsKey(class1))
        {
            return new HashMap((Map)markerTypeMap.get(class1));
        } else
        {
            return Collections.emptyMap();
        }
    }

    public void remove(Class class1)
    {
        if (!markerTypeMap.containsKey(class1))
        {
            return;
        }
        for (Iterator iterator = ((Map)markerTypeMap.get(class1)).entrySet().iterator(); iterator.hasNext(); ((Marker)((java.util.Map.Entry)iterator.next()).getValue()).remove()) { }
        markerTypeMap.remove(class1);
    }

    public void removeAll()
    {
        Map map;
        for (Iterator iterator = markerTypeMap.entrySet().iterator(); iterator.hasNext(); map.clear())
        {
            map = (Map)((java.util.Map.Entry)iterator.next()).getValue();
            for (Iterator iterator1 = map.entrySet().iterator(); iterator1.hasNext(); ((Marker)((java.util.Map.Entry)iterator1.next()).getValue()).remove()) { }
        }

        markerTypeMap.clear();
    }
}
