// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.gps;

import android.content.Context;
import com.accuweather.android.models.location.GeoPosition;
import com.accuweather.android.utilities.DataIOException;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.PersistanceUtils;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GeocoderCache
{
    private static class CoordinatesCacheMap extends LinkedHashMap
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

        public CoordinatesCacheMap()
        {
            MAX_VALUE = 10;
            keyIndex = new LinkedList();
        }
    }


    private static final String GEOCODER_CACHE_PREFERENCES_KEY = "accuweather_geocoder_cache";
    private static GeocoderCache instance;
    private Context context;
    private CoordinatesCacheMap coordinatesToAddressesMap;

    private GeocoderCache(Context context1)
    {
        coordinatesToAddressesMap = new CoordinatesCacheMap();
        context = context1;
        try
        {
            context1 = (CoordinatesCacheMap)PersistanceUtils.getObjectFromFile("accuweather_geocoder_cache", com/accuweather/android/services/gps/GeocoderCache$CoordinatesCacheMap, context1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context1)
        {
            Logger.e(getClass().getName(), "Error getting address models from file", context1);
            return;
        }
        if (context1 == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        coordinatesToAddressesMap = context1;
    }

    public static GeocoderCache getInstance(Context context1)
    {
        if (instance == null)
        {
            instance = new GeocoderCache(context1);
        }
        return instance;
    }

    private Double round(Double double1)
    {
        return Double.valueOf((new BigDecimal(double1.doubleValue())).setScale(3, RoundingMode.HALF_UP).doubleValue());
    }

    public List getAddresses(GeoPosition geoposition)
    {
        if (geoposition.getLatitude() != null && geoposition.getLongitude() != null)
        {
            geoposition.setLatitude(round(geoposition.getLatitude()));
            geoposition.setLongitude(round(geoposition.getLongitude()));
            if (coordinatesToAddressesMap.containsKey(geoposition))
            {
                return (List)coordinatesToAddressesMap.get(geoposition);
            }
        }
        return null;
    }

    public void putAddresses(GeoPosition geoposition, List list)
    {
        geoposition.setLatitude(round(geoposition.getLatitude()));
        geoposition.setLongitude(round(geoposition.getLongitude()));
        GeoPosition geoposition1 = coordinatesToAddressesMap.getLast();
        if (geoposition1 != null && geoposition1.equals(geoposition))
        {
            break MISSING_BLOCK_LABEL_67;
        }
        coordinatesToAddressesMap.put(geoposition, list);
        PersistanceUtils.saveObjectToFile("accuweather_geocoder_cache", coordinatesToAddressesMap, context);
        return;
        geoposition;
        geoposition.printStackTrace();
        return;
    }
}
