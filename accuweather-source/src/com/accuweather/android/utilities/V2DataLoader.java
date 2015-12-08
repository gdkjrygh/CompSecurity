// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.accuweather.android.models.location.LocationModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.accuweather.android.utilities:
//            PreferenceUtils, Logger

public class V2DataLoader
{

    private static final String STORED_ALIASES_KEY = "stored_aliases";
    private static final String STORED_HOME_LOCCODE = "stored_home";
    private static final String STORED_IS_ALIASED_KEY = "stored_is_aliased";
    private static final String STORED_LOCATIONS_KEY = "stored_locations";
    private static final String STORED_LOCATION_NAMES_KEY = "stored_location_names";

    public V2DataLoader()
    {
    }

    public boolean doV2LocationsExist(Context context)
    {
        context = PreferenceUtils.get(context, "stored_locations", "");
        Logger.i(getClass().getName(), "stored locations in doV2LocationsExist is %s", new Object[] {
            context
        });
        return !TextUtils.isEmpty(context);
    }

    public boolean doV2LocationsNeedConverted(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            LocationModel locationmodel = (LocationModel)list.next();
            if (locationmodel.getLocKey().toLowerCase().contains("cityid") || locationmodel.getKey().toLowerCase().contains("postalcode"))
            {
                return true;
            }
        }

        return false;
    }

    public String getV2HomeLocCode(Context context)
    {
        return PreferenceUtils.get(context, "stored_home", "");
    }

    public ArrayList getV2LocationModels(Context context)
    {
        Logger.i(this, "getV2LocationModels");
        ArrayList arraylist = new ArrayList(Arrays.asList(PreferenceUtils.get(context, "stored_locations", "_").split("_")));
        for (int i = 0; i < arraylist.size(); i++)
        {
            Logger.i(this, "locationCodes in prefs  %s", new Object[] {
                arraylist.get(i)
            });
        }

        ArrayList arraylist2 = new ArrayList(Arrays.asList(PreferenceUtils.get(context, "stored_location_names", "_").split("_")));
        ArrayList arraylist1 = new ArrayList();
        for (int j = 0; j < arraylist2.size(); j++)
        {
            String as[] = ((String)arraylist2.get(j)).split(",");
            arraylist1.add(as[0]);
            Logger.i(this, "locationNames is %s", new Object[] {
                as[0]
            });
        }

        arraylist2 = new ArrayList(Arrays.asList(PreferenceUtils.get(context, "stored_aliases", "_").split("_")));
        for (int k = 0; k < arraylist2.size(); k++)
        {
            Logger.i(this, "locationAliases in prefs is %s", new Object[] {
                arraylist2.get(k)
            });
        }

        ArrayList arraylist4 = new ArrayList(Arrays.asList(PreferenceUtils.get(context, "stored_is_aliased", "_").split("_")));
        for (int l = 0; l < arraylist4.size(); l++)
        {
            Logger.i(this, "isAliasedStringList in prefs is %s", new Object[] {
                arraylist4.get(l)
            });
        }

        ArrayList arraylist3 = new ArrayList();
        for (int i1 = 0; i1 < arraylist4.size(); i1++)
        {
            arraylist3.add(Boolean.valueOf(Boolean.parseBoolean((String)arraylist4.get(i1))));
        }

        arraylist4 = new ArrayList();
        int j1 = 0;
        while (j1 < arraylist.size()) 
        {
            String s = (String)arraylist.get(j1);
            String s1 = (String)arraylist1.get(j1);
            String s2 = PreferenceUtils.get(context, "stored_home", null);
            LocationModel locationmodel = new LocationModel();
            locationmodel.setLocKey(s);
            locationmodel.setLocationName(s1);
            if (arraylist3.size() - 1 >= j1)
            {
                locationmodel.setAliased(((Boolean)arraylist3.get(j1)).booleanValue());
            }
            if (arraylist2.size() - 1 >= j1)
            {
                locationmodel.setAliasName((String)arraylist2.get(j1));
            }
            if (s.equals(s2))
            {
                locationmodel.setHome(true);
            } else
            {
                locationmodel.setHome(false);
            }
            arraylist4.add(locationmodel);
            Logger.i(this, "getV2LocationModels add locationcode is %s and isHome is %b", new Object[] {
                locationmodel.getLocKey(), Boolean.valueOf(locationmodel.isHome())
            });
            j1++;
        }
        return arraylist4;
    }

    public void removeV2Preferences(Context context)
    {
        PreferenceManager.getDefaultSharedPreferences(context).edit().remove("stored_locations").commit();
    }

    public void simulateV2(Context context)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context).edit();
        context.putString("stored_locations", "cityId:335315_postalCode:10001|US_postalCode:30009|US");
        context.putString("stored_location_names", "State College, Pennsylvania_New York, New York (10001)_Alpharetta, Georgia (30009)");
        context.putString("stored_aliases", "New York Alias, New York_Alphraetta, Georgia");
        context.putString("stored_is_aliased", "true_false_true");
        context.putString("stored_home", "cityId:335315");
        context.putBoolean("terms_and_conditions_accepted", true);
        context.commit();
    }
}
