// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.notifications;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.accuweather.android.TermsAndConditionsActivity;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.models.location.LocationSearch;
import com.accuweather.android.models.location.LocationSearchResult;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.DateUtils;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.PartnerCoding;
import com.accuweather.android.utilities.PreferenceUtils;
import com.accuweather.android.utilities.UserPreferences;
import com.accuweather.android.utilities.Utilities;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.accuweather.android.notifications:
//            NotificationWeatherRetriever, NotificationServiceUi, NotificationServiceBootstrapper

public class NotificationService extends Service
    implements com.accuweather.android.utilities.Data.INotificationWeatherDataListener
{
    public static class NotificationBroadcastReceiver extends BroadcastReceiver
    {

        public void onReceive(Context context, Intent intent)
        {
            if (intent != null && intent.getAction() != null)
            {
                intent = intent.getAction();
                if (intent.equals("accuwx.intent.action.REMOVE_NOTIFICATION"))
                {
                    context.stopService(new Intent(context, com/accuweather/android/notifications/NotificationService));
                } else
                if (NotificationService.intentActionMeetsUpdateCriteria(intent, context))
                {
                    context.startService((new Intent(context, com/accuweather/android/notifications/NotificationService)).setAction(intent));
                    return;
                }
            }
        }

        public NotificationBroadcastReceiver()
        {
        }
    }


    public static final String CURRENT_LOCATION = "0";
    public static final String HOME_LOCATION = "1";
    private static final int NOTIFICATION_ID = 0xf423f;
    public static final String OFF = "2";
    private static boolean isConnectionErrorShowing = false;
    private static int mNotifyId;
    private String mCityName;
    private String mCurrentRealFeel;
    private String mCurrentTemperature;
    private int mExpandedNotificationIconResId;
    private NotificationWeatherRetriever mNotificationWeatherRetriever;
    private String mShortText;
    private String mUpdateTime;

    public NotificationService()
    {
        mNotificationWeatherRetriever = new NotificationWeatherRetriever();
    }

    private void buildApi11ConnectionErrorLayout()
    {
        Notification notification = (new android.support.v4.app.NotificationCompat.Builder(this)).setSmallIcon(com.accuweather.android.R.drawable.connection_error_white).setTicker(getString(com.accuweather.android.R.string.NetworkConnectionError)).setContent(buildConnectionErrorContentView()).setContentIntent(getMainAppLaunchPendingIntent("")).build();
        notification.flags = 34;
        ((NotificationManager)getSystemService("notification")).notify(0xf423f, notification);
    }

    private void buildApi11Layout(WeatherDataModel weatherdatamodel)
    {
        weatherdatamodel = (new android.support.v4.app.NotificationCompat.Builder(this)).setSmallIcon(mNotifyId).setTicker(weatherdatamodel.getText()).setContent(buildContentView(weatherdatamodel)).setContentIntent(getMainAppLaunchPendingIntent(getNotificationLocationKey(weatherdatamodel))).build();
        weatherdatamodel.flags = 34;
        ((NotificationManager)getSystemService("notification")).notify(0xf423f, weatherdatamodel);
    }

    private void buildApi4ConnectionErrorLayout()
    {
        Notification notification = new Notification(com.accuweather.android.R.drawable.connection_error_white, getString(com.accuweather.android.R.string.NetworkConnectionError), System.currentTimeMillis());
        notification.flags = 34;
        notification.contentIntent = getMainAppLaunchPendingIntent("");
        notification.contentView = buildConnectionErrorContentView();
        ((NotificationManager)getSystemService("notification")).notify(0xf423f, notification);
    }

    private void buildApi4Layout(WeatherDataModel weatherdatamodel)
    {
        Notification notification = new Notification(mNotifyId, mShortText, System.currentTimeMillis());
        notification.flags = 34;
        notification.contentIntent = getMainAppLaunchPendingIntent(getNotificationLocationKey(weatherdatamodel));
        notification.contentView = buildContentView(weatherdatamodel);
        ((NotificationManager)getSystemService("notification")).notify(0xf423f, notification);
    }

    private RemoteViews buildConnectionErrorContentView()
    {
        RemoteViews remoteviews = new RemoteViews(getPackageName(), com.accuweather.android.R.layout.notification_template_base);
        remoteviews.setImageViewResource(com.accuweather.android.R.id.icon, com.accuweather.android.R.drawable.connection_error_white);
        remoteviews.setTextViewText(com.accuweather.android.R.id.title, getString(com.accuweather.android.R.string.app_name));
        remoteviews.setTextViewText(com.accuweather.android.R.id.text2, getString(com.accuweather.android.R.string.NetworkConnectionError));
        remoteviews.setTextViewText(com.accuweather.android.R.id.time, "");
        remoteviews.setTextViewText(com.accuweather.android.R.id.info, "");
        return remoteviews;
    }

    private RemoteViews buildContentView(WeatherDataModel weatherdatamodel)
    {
        String s = getTemperature();
        Logger.i(this, (new StringBuilder()).append("Temperature to display is ").append(s).toString());
        RemoteViews remoteviews = new RemoteViews(getPackageName(), com.accuweather.android.R.layout.notification_template_base);
        remoteviews.setImageViewBitmap(com.accuweather.android.R.id.icon, NotificationServiceUi.buildBitmap(this, mExpandedNotificationIconResId, weatherdatamodel.getAlertIsActive()));
        remoteviews.setTextViewText(com.accuweather.android.R.id.title, mCityName);
        remoteviews.setTextViewText(com.accuweather.android.R.id.time, (new StringBuilder()).append(getString(com.accuweather.android.R.string.at).toLowerCase()).append(" ").append(mUpdateTime.toUpperCase()).toString());
        remoteviews.setTextViewText(com.accuweather.android.R.id.info, (new StringBuilder()).append(s).append("\260").append(getTemperatureUnit()).toString());
        remoteviews.setTextViewText(com.accuweather.android.R.id.text2, mShortText);
        return remoteviews;
    }

    private static boolean checkNotifyLocation(Context context)
    {
        return PreferenceUtils.get(context, "false", false);
    }

    private String getCityName(WeatherDataModel weatherdatamodel)
    {
        LocationModel locationmodel1 = getData(this).getLocationFromKey(weatherdatamodel.getLocationKey());
        LocationModel locationmodel = locationmodel1;
        if (locationmodel1 == null)
        {
            locationmodel = new LocationModel();
            locationmodel.setLocKey(weatherdatamodel.getLocationKey());
            locationmodel.setLocationName(weatherdatamodel.getCityName());
        }
        return locationmodel.getAliasedName();
    }

    private Data getData(Context context)
    {
        return Data.getInstance(context);
    }

    private PendingIntent getMainAppLaunchPendingIntent(String s)
    {
        Intent intent = new Intent(this, com/accuweather/android/TermsAndConditionsActivity);
        intent.putExtra("location_code", s);
        intent.addFlags(0x10000000);
        return PendingIntent.getActivity(this, 7, intent, 0x10000000);
    }

    private String getNotificationLocationKey(WeatherDataModel weatherdatamodel)
    {
        if (shouldShowGpsLocation())
        {
            return "-1";
        } else
        {
            return weatherdatamodel.getLocationKey();
        }
    }

    private String getNotificationStatusIconId(WeatherDataModel weatherdatamodel)
    {
        int i = Integer.parseInt(getTemperature());
        String s;
        if (i < 0)
        {
            s = "n";
        } else
        {
            s = "p";
        }
        if (!weatherdatamodel.getAlertIsActive() || PartnerCoding.isPreload(this))
        {
            return (new StringBuilder()).append("notify_icon_").append(s).append(Math.abs(i)).toString();
        } else
        {
            return (new StringBuilder()).append("alert_notify_icon_").append(s).append(Math.abs(i)).toString();
        }
    }

    private String getNotificationUpdateTime(WeatherDataModel weatherdatamodel, Context context)
    {
        String s = DateUtils.to12HourTimeWithAmPm(weatherdatamodel.getLocalObservationDateTime(), context.getResources().getConfiguration().locale);
        weatherdatamodel = DateUtils.to24HourTime(weatherdatamodel.getLocalObservationDateTime());
        if (UserPreferences.isTwelveHourFormat(context))
        {
            return s;
        } else
        {
            return weatherdatamodel;
        }
    }

    private String getTemperature()
    {
        if (shouldNotificationDisplayRealfeelInsteadOfTemperature())
        {
            return mCurrentRealFeel;
        } else
        {
            return mCurrentTemperature;
        }
    }

    private String getTemperatureUnit()
    {
        if (UserPreferences.isMetric(this))
        {
            return getString(com.accuweather.android.R.string.C);
        } else
        {
            return getString(com.accuweather.android.R.string.F);
        }
    }

    private WeatherDataModel getWeatherDataModelForNotificationUpdate(List list)
    {
        String s = PreferenceUtils.get(this, "pref_temp_notifications", "2");
        for (int i = 0; i < list.size(); i++)
        {
            WeatherDataModel weatherdatamodel = (WeatherDataModel)list.get(i);
            if (weatherdatamodel != null && (s.equals("0") ? weatherdatamodel.isResultOfGpsSearch() && !TextUtils.isEmpty(weatherdatamodel.getLocationKey()) : s.equals("1") && weatherdatamodel.getLocationKey().equals(getData(this).getHomeLocation().getKey())))
            {
                return weatherdatamodel;
            }
        }

        return null;
    }

    private String getZeroPaddedIconCode(WeatherDataModel weatherdatamodel)
    {
        if (weatherdatamodel.getIconCode().length() > 1)
        {
            return weatherdatamodel.getIconCode();
        } else
        {
            return (new StringBuilder()).append("0").append(weatherdatamodel.getIconCode()).toString();
        }
    }

    private static boolean intentActionMeetsUpdateCriteria(String s, Context context)
    {
        if (isEulaAccepted(context))
        {
            if (PreferenceUtils.getLong(context, "last_updated_time", 0L) == 0L)
            {
                return true;
            }
            if (s.equals("accuwx.intent.action.UPDATE_NOTIFICATION") || checkNotifyLocation(context) || s.equals("android.intent.action.BOOT_COMPLETED") || s.equals("android.intent.action.LOCALE_CHANGED") || s.equals("accuwx.intent.action.UPDATE_METRIC") || s.equals("accuwx.intent.action.DELETE_LOCATION") || s.equals("android.net.conn.CONNECTIVITY_CHANGE") && isConnectionErrorShowing)
            {
                return true;
            }
        }
        return false;
    }

    private static boolean isEulaAccepted(Context context)
    {
        return PreferenceUtils.get(context, "terms_and_conditions_accepted", false);
    }

    public static boolean isNotificationEnabled(Context context)
    {
        return !PreferenceUtils.get(context, "pref_temp_notifications", "2").equals("2");
    }

    private void resetNotifyFlag()
    {
        PreferenceUtils.save(this, "false", false);
    }

    private void saveLastUpdateTime()
    {
        PreferenceUtils.save(this, "last_updated_time", (new Date()).getTime());
    }

    private boolean shouldNotificationDisplayRealfeelInsteadOfTemperature()
    {
        return PreferenceUtils.get(this, "pref_notification_temperature", "0").equals("1");
    }

    private boolean shouldShowGpsLocation()
    {
        return PreferenceUtils.get(this, "pref_temp_notifications", "2").equals("0");
    }

    private boolean shouldShowHomeLocation()
    {
        return PreferenceUtils.get(this, "pref_temp_notifications", "2").equals("1");
    }

    private void showTemperatureNotificationUi(WeatherDataModel weatherdatamodel)
    {
        mCityName = getCityName(weatherdatamodel);
        mCurrentTemperature = (new StringBuilder()).append(weatherdatamodel.getTemperature()).append("").toString();
        mCurrentRealFeel = (new StringBuilder()).append(weatherdatamodel.getRealfeel()).append("").toString();
        mShortText = weatherdatamodel.getText();
        mExpandedNotificationIconResId = Utilities.getDrawableId((new StringBuilder()).append("icon_white_").append(getZeroPaddedIconCode(weatherdatamodel)).toString());
        mNotifyId = Utilities.getDrawableId(getNotificationStatusIconId(weatherdatamodel));
        mUpdateTime = getNotificationUpdateTime(weatherdatamodel, this);
        if (Utilities.isHoneycombOrGreater())
        {
            buildApi11Layout(weatherdatamodel);
        } else
        {
            buildApi4Layout(weatherdatamodel);
        }
        isConnectionErrorShowing = false;
    }

    private void updateHomeLocation()
    {
        LocationModel locationmodel = getData(this).getHomeLocation();
        if (!TextUtils.isEmpty(locationmodel.getLocKey()))
        {
            updateWeatherForNonGps(locationmodel.getLocKey());
        }
    }

    private void updateNotification()
    {
        String s = PreferenceUtils.get(this, "pref_temp_notifications", "2");
        if (s.equals("1"))
        {
            updateHomeLocation();
        } else
        {
            if (s.equals("0"))
            {
                mNotificationWeatherRetriever.findFollowMeLocation(this);
                return;
            }
            if (s.equals("2"))
            {
                isConnectionErrorShowing = false;
                return;
            }
        }
    }

    private void updateWeatherForGps(String s)
    {
        mNotificationWeatherRetriever.retrieveWeatherForFollowMe(this, s);
    }

    private void updateWeatherForNonGps(String s)
    {
        mNotificationWeatherRetriever.retrieveWeather(this, s);
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        getData(this).registerWeatherDataListener(this);
        if (isNotificationEnabled(this))
        {
            sendBroadcast(new Intent("accuwx.intent.action.UPDATE_NOTIFICATION"));
            return;
        } else
        {
            stopSelf();
            return;
        }
    }

    public void onDestroy()
    {
        getData(this).unregisterWeatherDataListener(this);
        super.onDestroy();
    }

    public void onError(Exception exception)
    {
    }

    public void onGpsSearchCompleted(LocationSearch locationsearch, List list)
    {
        if (shouldShowGpsLocation() && locationsearch != null && !locationsearch.isEmpty())
        {
            updateWeatherForGps(((LocationSearchResult)locationsearch.get(0)).getKey());
        }
    }

    public void onHomeLocationChanged()
    {
        if (shouldShowHomeLocation())
        {
            updateHomeLocation();
        }
    }

    public void onLocationSearchCompleted(LocationSearch locationsearch, List list)
    {
    }

    public void onNotificationConnectionError()
    {
        if (isNotificationEnabled(this))
        {
            if (Utilities.isHoneycombOrGreater())
            {
                buildApi11ConnectionErrorLayout();
            } else
            {
                buildApi4ConnectionErrorLayout();
            }
            isConnectionErrorShowing = true;
        }
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        if (intent != null && intent.getAction() != null && intentActionMeetsUpdateCriteria(intent.getAction(), this))
        {
            updateNotification();
            saveLastUpdateTime();
            if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction()))
            {
                NotificationServiceBootstrapper.bootstrap(this);
            }
        }
        return 1;
    }

    public void onWeatherCallCompleted(List list, List list1)
    {
        if (!isNotificationEnabled(this))
        {
            stopSelf();
        } else
        {
            list = getWeatherDataModelForNotificationUpdate(list);
            if (list != null)
            {
                isConnectionErrorShowing = false;
                resetNotifyFlag();
                if (!TextUtils.isEmpty(list.getCityName()))
                {
                    showTemperatureNotificationUi(list);
                    return;
                }
            }
        }
    }


}
