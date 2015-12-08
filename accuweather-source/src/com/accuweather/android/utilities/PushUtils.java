// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import android.content.Context;
import android.widget.Toast;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.alert.AlertModel;
import com.accuweather.android.models.location.LocationModel;
import com.urbanairship.UAirship;
import com.urbanairship.push.PushManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

// Referenced classes of package com.accuweather.android.utilities:
//            Utilities, PreferenceUtils, Data, Logger

public class PushUtils
{

    private static final String ON = "0";

    public PushUtils()
    {
    }

    public static String createAlertUrl(WeatherDataModel weatherdatamodel)
    {
        String s = Locale.getDefault().getLanguage();
        String s1 = weatherdatamodel.getCountry();
        String s2 = weatherdatamodel.getCityName();
        weatherdatamodel = weatherdatamodel.getLocationKey();
        return (new StringBuilder()).append("http://m.accuweather.com/").append(s).append("/").append(s1).append("/").append(s2).append("/").append(weatherdatamodel).append("/weather-warnings/").append(weatherdatamodel).toString();
    }

    public static String getAlertLink(List list, Context context)
    {
        if (Utilities.isScreenSizeLargeOrGreater(context))
        {
            return ((AlertModel)list.get(0)).getTraditionalLink();
        } else
        {
            return ((AlertModel)list.get(0)).getMobileLink();
        }
    }

    public static String getLocationKeyFromPushTag(String s)
    {
        if (s != null)
        {
            return s.replace("cityId:", "");
        } else
        {
            return null;
        }
    }

    public static String getPostalCodeFromPushTag(String s)
    {
        if (s != null)
        {
            String s1 = s.replace("postalCode:", "");
            int i = s1.indexOf("|");
            s = s1;
            if (i != -1)
            {
                s = s1.substring(0, i);
            }
            return s;
        } else
        {
            return null;
        }
    }

    public static String getPushTag(LocationModel locationmodel)
    {
        if (locationmodel.getType().equalsIgnoreCase("postalcode"))
        {
            return (new StringBuilder()).append("postalCode:").append(locationmodel.getPostalCode()).append("|").append(locationmodel.getCountryId()).toString();
        } else
        {
            return (new StringBuilder()).append("cityId:").append(locationmodel.getLocKey()).toString();
        }
    }

    private static boolean isPushEnabled(Context context)
    {
        return PreferenceUtils.get(context, "pref_push_notification", "").equals("0");
    }

    public static boolean isStartingFromPush(Context context)
    {
        return PreferenceUtils.get(context, "from_push_alert", false);
    }

    private static void registerPushForLocation(String s, Context context)
    {
        s = Data.getInstance(context).getLocationFromKey(s);
        if (s != null)
        {
            s = getPushTag(s);
            Logger.i(com/accuweather/android/utilities/PushUtils.getName(), (new StringBuilder()).append("pushTag is ").append(s).toString());
            context = new HashSet();
            context.add(s);
            UAirship.shared().getPushManager().setTags(context);
        }
    }

    private static void showPushEnabledToast(Context context, String s)
    {
        context = Toast.makeText(context, context.getString(com.accuweather.android.R.string.EnabledAlertNotifications_PlaceName).replace("{Place name}", s), 1);
        context.setGravity(81, context.getXOffset() / 2, context.getYOffset() / 2);
        context.show();
    }

    private static void showPushSwitchedToast(Context context, String s)
    {
        context = Toast.makeText(context, context.getString(com.accuweather.android.R.string.SwitchedAlertNotifications_Location).replace("{location}", s), 1);
        context.setGravity(17, context.getXOffset() / 2, context.getYOffset() / 2);
        context.show();
    }

    public static void updatePush(Context context, String s, String s1)
    {
label0:
        {
            if (Utilities.shouldShowPush(context) && isPushEnabled(context))
            {
                if (PreferenceUtils.get(context, "push_notification_value_is_set", false))
                {
                    break label0;
                }
                registerPushForLocation(s, context);
                showPushEnabledToast(context, s1);
                s = new HashMap();
                s.put("push_notification_value_is_set", Boolean.valueOf(true));
                s.put("previous_home_location", s1);
                PreferenceUtils.save(context, s);
            }
            return;
        }
        String s2 = PreferenceUtils.get(context, "previous_home_location", null);
        if (s2 == null || !s2.equalsIgnoreCase(s1))
        {
            PreferenceUtils.save(context, "previous_home_location", s1);
            showPushSwitchedToast(context, s1);
        }
        registerPushForLocation(s, context);
    }
}
