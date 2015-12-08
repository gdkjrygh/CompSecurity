// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.location.LocationModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ModelSorter
{

    public ModelSorter()
    {
    }

    private boolean doesKeyRepresentFollowMeLocation(String s, LocationModel locationmodel)
    {
        return "-1".equals(s) || locationmodel != null && locationmodel.getKey().equals(s);
    }

    private List getKeysWithFollowMe(LocationModel locationmodel, List list)
    {
        list = getKeys(list);
        if (locationmodel != null && !list.contains(locationmodel.getKey()))
        {
            list.add(locationmodel.getKey());
        }
        return list;
    }

    private int getNumberOfMapLocations(List list)
    {
        return Math.min(5, list.size());
    }

    private LocationModel getPrimaryLocationForMaps(LocationModel locationmodel, WeatherDataModel weatherdatamodel, List list)
    {
        if (weatherdatamodel != null)
        {
            for (int i = 0; i < list.size(); i++)
            {
                if (((LocationModel)list.get(i)).getKey().equals(weatherdatamodel.getLocationKey()))
                {
                    return (LocationModel)list.get(i);
                }
            }

        }
        return locationmodel;
    }

    private List getPrimarySortedKeys(WeatherDataModel weatherdatamodel, List list)
    {
        list = getKeys(list);
        insertCurrentlyViewedLocationKeyAsFirst(weatherdatamodel, list);
        return list;
    }

    private List getPrimarySortedKeysWithFollowMe(LocationModel locationmodel, WeatherDataModel weatherdatamodel, List list)
    {
        locationmodel = getKeysWithFollowMe(locationmodel, list);
        insertCurrentlyViewedLocationKeyAsFirst(weatherdatamodel, locationmodel);
        return locationmodel;
    }

    private List getPrimarySortedLocationsWithFollowMe(LocationModel locationmodel, WeatherDataModel weatherdatamodel, List list)
    {
        weatherdatamodel = getPrimarySortedKeysWithFollowMe(locationmodel, weatherdatamodel, list);
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < weatherdatamodel.size(); i++)
        {
            LocationModel locationmodel1 = getLocationFromKey((String)weatherdatamodel.get(i), locationmodel, list);
            if (locationmodel1 != null)
            {
                arraylist.add(locationmodel1);
            }
        }

        return arraylist;
    }

    private List getWeatherDataModels(HashMap hashmap, List list)
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < list.size(); i++)
        {
            WeatherDataModel weatherdatamodel = (WeatherDataModel)hashmap.get(list.get(i));
            if (weatherdatamodel != null)
            {
                arraylist.add(weatherdatamodel);
            }
        }

        return arraylist;
    }

    private void insertCurrentlyViewedLocationKeyAsFirst(WeatherDataModel weatherdatamodel, List list)
    {
        if (weatherdatamodel == null) goto _L2; else goto _L1
_L1:
        int i;
        weatherdatamodel = weatherdatamodel.getLocationKey();
        i = 0;
_L7:
        if (i >= list.size()) goto _L2; else goto _L3
_L3:
        if (!((String)list.get(i)).equals(weatherdatamodel)) goto _L5; else goto _L4
_L4:
        list.remove(list.get(i));
        list.add(0, weatherdatamodel);
_L2:
        return;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private boolean isEmptyLocation(LocationModel locationmodel)
    {
        return locationmodel == null || locationmodel.equals(new LocationModel());
    }

    public List getKeys(List list)
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < list.size(); i++)
        {
            arraylist.add(((LocationModel)list.get(i)).getKey());
        }

        return arraylist;
    }

    public List getLocNames(List list)
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < list.size(); i++)
        {
            arraylist.add(LocationModel.toSimpleName(((LocationModel)list.get(i)).getAliasedName()));
        }

        return arraylist;
    }

    public LocationModel getLocationFromAliasedName(String s, List list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (((LocationModel)list.get(i)).getAliasedName().equals(s))
            {
                return (LocationModel)list.get(i);
            }
        }

        for (int j = 0; j < list.size(); j++)
        {
            if (((LocationModel)list.get(j)).getAliasedName().split(",")[0].equals(s))
            {
                return (LocationModel)list.get(j);
            }
        }

        return null;
    }

    public LocationModel getLocationFromKey(String s, LocationModel locationmodel, List list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (((LocationModel)list.get(i)).getKey().equals(s))
            {
                return (LocationModel)list.get(i);
            }
        }

        if (doesKeyRepresentFollowMeLocation(s, locationmodel))
        {
            return locationmodel;
        } else
        {
            return null;
        }
    }

    public List getPrettyNames(List list)
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < list.size(); i++)
        {
            arraylist.add(((LocationModel)list.get(i)).getAliasedName());
        }

        return arraylist;
    }

    public List getPrimarySortedWeatherDataModels(WeatherDataModel weatherdatamodel, List list, HashMap hashmap)
    {
        return getWeatherDataModels(hashmap, getPrimarySortedKeys(weatherdatamodel, list));
    }

    public List getPrimarySortedWeatherDataModelsWithFollowMe(LocationModel locationmodel, WeatherDataModel weatherdatamodel, List list, HashMap hashmap)
    {
        return getWeatherDataModels(hashmap, getPrimarySortedKeysWithFollowMe(locationmodel, weatherdatamodel, list));
    }

    public List getSortedKeysForMaps(LocationModel locationmodel, WeatherDataModel weatherdatamodel, LocationModel locationmodel1, List list)
    {
        List list1 = getPrimarySortedLocationsWithFollowMe(locationmodel, weatherdatamodel, list);
        list = getPrimaryLocationForMaps(locationmodel, weatherdatamodel, list);
        weatherdatamodel = new ArrayList();
        int k = list1.size();
        int i = k;
        if (locationmodel != null)
        {
            i = k;
            if (!list1.contains(locationmodel))
            {
                i = k + 1;
            }
        }
        k = 0;
        while (k < i) 
        {
            if (list != null && !weatherdatamodel.contains(list))
            {
                weatherdatamodel.add(list);
                list1.remove(list);
            } else
            if (!isEmptyLocation(locationmodel1) && !weatherdatamodel.contains(locationmodel1))
            {
                weatherdatamodel.add(locationmodel1);
                list1.remove(locationmodel1);
            } else
            if (locationmodel != null && !weatherdatamodel.contains(locationmodel))
            {
                weatherdatamodel.add(locationmodel);
                list1.remove(locationmodel);
            } else
            if (!list1.isEmpty() && !weatherdatamodel.contains(list1.get(0)))
            {
                weatherdatamodel.add(list1.get(0));
                list1.remove(0);
            }
            k++;
        }
        locationmodel = new ArrayList();
        for (int j = 0; j < getNumberOfMapLocations(weatherdatamodel); j++)
        {
            locationmodel.add(((LocationModel)weatherdatamodel.get(j)).getKey());
        }

        return locationmodel;
    }

    public List getSortedLocationNames(LocationModel locationmodel, List list, HashMap hashmap)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = getLocNames(list).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            WeatherDataModel weatherdatamodel = (WeatherDataModel)hashmap.get(getLocationFromAliasedName(s, list).getKey());
            if (weatherdatamodel != null)
            {
                if (!weatherdatamodel.getLocationKey().equals(locationmodel.getKey()))
                {
                    arraylist.add(s);
                } else
                {
                    arraylist.add(0, s);
                }
            }
        } while (true);
        return arraylist;
    }

    public List sortWeatherDataModels(List list, String s)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            WeatherDataModel weatherdatamodel = (WeatherDataModel)list.next();
            if (weatherdatamodel != null)
            {
                if (!weatherdatamodel.getLocationKey().equals(s))
                {
                    arraylist.add(weatherdatamodel);
                } else
                {
                    arraylist.add(0, weatherdatamodel);
                }
            }
        } while (true);
        return arraylist;
    }
}
