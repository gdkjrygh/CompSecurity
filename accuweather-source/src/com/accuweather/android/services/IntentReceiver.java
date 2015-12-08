// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.accuweather.android.MainActivity;
import com.accuweather.android.TermsAndConditionsActivity;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.PushUtils;
import com.urbanairship.UAirship;
import com.urbanairship.push.BaseIntentReceiver;
import com.urbanairship.push.PushManager;
import com.urbanairship.push.PushMessage;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IntentReceiver extends BaseIntentReceiver
{

    private static final String CITYID_EXTRA_KEY = "cityidtag";
    private static final String POSTALCODE_EXTRA_KEY = "postalcodetag";
    private Intent intent;

    public IntentReceiver()
    {
    }

    private Intent buildStartFromPushIntent()
    {
        Intent intent1 = new Intent("android.intent.action.MAIN");
        UAirship.shared();
        intent1.setClass(UAirship.getApplicationContext(), com/accuweather/android/TermsAndConditionsActivity);
        intent1.setFlags(0x14000000);
        return intent1;
    }

    private LocationModel getCityIdLocationModel(Context context, String s)
    {
        s = PushUtils.getLocationKeyFromPushTag(s);
        context = Data.getInstance(context).getLocationFromKey(s);
        if (context != null && context.isHome())
        {
            return context;
        } else
        {
            return null;
        }
    }

    private String getLastLocationTagFromSet(Set set)
    {
        String s = "";
        Iterator iterator = set.iterator();
        for (set = s; iterator.hasNext(); set = (String)iterator.next()) { }
        return set;
    }

    private LocationModel getLocationModelForPush(Intent intent1, Context context)
    {
        Object obj = intent1.getStringExtra("cityidtag");
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = getCityIdLocationModel(context, ((String) (obj)));
        if (obj == null) goto _L2; else goto _L3
_L3:
        intent1 = ((Intent) (obj));
_L5:
        return intent1;
_L2:
        intent1 = intent1.getStringExtra("postalcodetag");
        if (intent1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        context = getPostalCodeLocationModel(context, intent1);
        intent1 = context;
        if (context != null) goto _L5; else goto _L4
_L4:
        return null;
    }

    private LocationModel getPostalCodeLocationModel(Context context, String s)
    {
        s = s.split(",");
        context = Data.getInstance(context).getLocations();
        int k = s.length;
        for (int i = 0; i < k; i++)
        {
            String s1 = PushUtils.getPostalCodeFromPushTag(s[i]);
            for (int j = 0; j < context.size(); j++)
            {
                LocationModel locationmodel = (LocationModel)context.get(j);
                if ("PostalCode".equals(locationmodel.getType()) && locationmodel.getPostalCode().equals(s1) && locationmodel.isHome())
                {
                    return locationmodel;
                }
            }

        }

        return null;
    }

    private void logPushExtras(Intent intent1)
    {
        if (Logger.isDebugEnabled())
        {
            try
            {
                Logger.d(getClass().getName(), (new StringBuilder()).append("In logPushExtras(), alias = ").append(UAirship.shared().getPushManager().getAlias()).append(", GcmId = ").append(UAirship.shared().getPushManager().getGcmId()).append(", ChannelId = ").append(UAirship.shared().getPushManager().getChannelId()).append(", generatedIntNotificationId = ").append("com.urbanairship.push.NOTIFICATION_ID").append(", channelId = ").append("com.urbanairship.push.EXTRA_CHANNEL_ID").toString());
                if (intent1.getExtras() != null)
                {
                    String s;
                    String s1;
                    for (Iterator iterator = intent1.getExtras().keySet().iterator(); iterator.hasNext(); Logger.i(getClass().getName(), (new StringBuilder()).append("Push Notification Extra: [").append(s).append(" : ").append(s1).append("]").toString()))
                    {
                        s = (String)iterator.next();
                        s1 = intent1.getStringExtra(s);
                    }

                }
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent1) { }
        }
    }

    private void onHomeLocationChanged(Context context)
    {
        LocationModel locationmodel = Data.getInstance(context).getHomeLocation();
        if (locationmodel != null)
        {
            PushUtils.updatePush(context, locationmodel.getLocKey(), locationmodel.getAliasedName());
        }
    }

    private void onNotificationOpened(Context context, Intent intent1)
    {
        Logger.d(getClass().getName(), (new StringBuilder()).append("User clicked notification. Message: ").append(intent1.getStringExtra("com.urbanairship.push.ALERT")).toString());
        logPushExtras(intent1);
        intent1 = getLastLocationTagFromSet(UAirship.shared().getPushManager().getTags());
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("from_push_alert", true).putString("push_city_tag", intent1).commit();
        context.startActivity(buildStartFromPushIntent());
    }

    private void onUpdateMetric(Context context)
    {
        Logger.d(getClass().getName(), "update metric intentReceiver");
        Intent intent1 = new Intent(context, com/accuweather/android/MainActivity);
        intent1.addFlags(0x10000000);
        intent1.putExtra("pref_temp_units", "UpdateMetric");
        context.startActivity(intent1);
    }

    protected void onBackgroundPushReceived(Context context, PushMessage pushmessage)
    {
        Log.i(getClass().getName(), (new StringBuilder()).append("Received background push message: ").append(pushmessage).toString());
    }

    protected void onChannelRegistrationFailed(Context context)
    {
        Log.i(getClass().getName(), "Channel registration failed.");
    }

    protected void onChannelRegistrationSucceeded(Context context, String s)
    {
        Log.i(getClass().getName(), (new StringBuilder()).append("Channel registration updated. Channel Id:").append(s).append(".").toString());
    }

    protected boolean onNotificationActionOpened(Context context, PushMessage pushmessage, int i, String s, boolean flag)
    {
        Log.i(getClass().getName(), (new StringBuilder()).append("User clicked notification button. Button ID: ").append(s).append(" Alert: ").append(pushmessage.getAlert()).toString());
        return false;
    }

    protected boolean onNotificationOpened(Context context, PushMessage pushmessage, int i)
    {
        Log.i(getClass().getName(), (new StringBuilder()).append("User clicked notification. Alert: ").append(pushmessage.getAlert()).toString());
        Logger.d(getClass().getName(), (new StringBuilder()).append("User clicked notification. Message: ").append(pushmessage.getAlert()).toString());
        logPushExtras(intent);
        pushmessage = getLastLocationTagFromSet(UAirship.shared().getPushManager().getTags());
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("from_push_alert", true).putString("push_city_tag", pushmessage).commit();
        context.startActivity(buildStartFromPushIntent());
        return false;
    }

    protected void onPushReceived(Context context, PushMessage pushmessage, int i)
    {
        Log.i(getClass().getName(), (new StringBuilder()).append("Received push notification. Alert: ").append(pushmessage.getAlert()).append(". Notification ID: ").append(i).toString());
        logPushExtras(intent);
        String s = intent.getStringExtra("cityidtag");
        String s1 = intent.getStringExtra("postalcodetag");
        if (!TextUtils.isEmpty(s) || !TextUtils.isEmpty(s1))
        {
            LocationModel locationmodel = getLocationModelForPush(intent, context);
            if (locationmodel == null)
            {
                ((NotificationManager)context.getSystemService("notification")).cancel(i);
                if (Logger.isDebugEnabled())
                {
                    Logger.d(getClass().getName(), "onPushReceived(), bad push was received and was cancelled!");
                }
            }
            if (Logger.isDebugEnabled())
            {
                context = pushmessage.getAlert();
                pushmessage = getLastLocationTagFromSet(UAirship.shared().getPushManager().getTags());
                String s2 = PushUtils.getLocationKeyFromPushTag(pushmessage);
                Logger.d(getClass().getName(), (new StringBuilder()).append("onPushReceived(): PushManager locationTag = ").append(pushmessage).append(", PushManager locationKey = ").append(s2).append(", alert = ").append(context).append(", modelForPush = ").append(locationmodel).toString());
            }
        }
    }

    public void onReceive(Context context, Intent intent1)
    {
        Logger.d(getClass().getName(), (new StringBuilder()).append("Received intent: ").append(intent1).toString());
        intent = intent1;
        intent1 = intent1.getAction();
        if ("accuwx.intent.action.UPDATE_METRIC".equals(intent1))
        {
            onUpdateMetric(context);
        } else
        if ("com.accuweather.android.action.HOME_LOCATION_CHANGED".equals(intent1))
        {
            onHomeLocationChanged(context);
            return;
        }
    }
}
