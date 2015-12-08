// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.Utilities;
import com.accuweather.android.widgets.AL_WidgetProviderFollowMe;
import com.accuweather.android.widgets.WidgetProviderHoloDark;
import com.accuweather.android.widgets.WidgetProviderHoloLight;
import com.accuweather.android.widgets.minutecast.AL_WidgetProvider;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class GAWidgetReceiver extends BroadcastReceiver
{

    public static final String TAG = "GAWidget";
    private static AsyncTask mTask;

    public GAWidgetReceiver()
    {
    }

    private int checkActiveWidgets(Context context, int ai[], ComponentName componentname, AppWidgetManager appwidgetmanager)
    {
        context = getListWidgetSaved(context, componentname);
        int k = 0;
        int i = 0;
        if (!context.isEmpty())
        {
            int j = 0;
            do
            {
                k = i;
                if (j >= ai.length)
                {
                    break;
                }
                k = i;
                if (context.containsKey(Integer.valueOf(ai[j])))
                {
                    k = i + 1;
                }
                j++;
                i = k;
            } while (true);
        }
        return k;
    }

    private long getLastTimeTrigger(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getLong("last_time_trigger_new", 0L);
    }

    private HashMap getListRemaining(Context context)
    {
        String s = PreferenceManager.getDefaultSharedPreferences(context).getString("list_provider_remaining_new", null);
        context = null;
        if (s != null)
        {
            context = (HashMap)(new Gson()).fromJson(s, (new TypeToken() {

                final GAWidgetReceiver this$0;

            
            {
                this$0 = GAWidgetReceiver.this;
                super();
            }
            }).getType());
        }
        return context;
    }

    private HashMap getListWidgetSaved(Context context, ComponentName componentname)
    {
        if (componentname.getClassName().equals(com/accuweather/android/widgets/WidgetProviderHoloLight.getName()) || componentname.getClassName().equals(com/accuweather/android/widgets/WidgetProviderHoloDark.getName()))
        {
            return Data.getInstance(context).getResizableWidgetIdMap();
        }
        if (componentname.getClassName().equals(com/accuweather/android/widgets/minutecast/AL_WidgetProvider.getName()))
        {
            return Data.getInstance(context).getALWidgetIdMap();
        } else
        {
            return Data.getInstance(context).getALFollowMeWidgetIdMap();
        }
    }

    private long getNextTimeTrackingInterval(Context context)
    {
        Calendar calendar = Calendar.getInstance();
        long l = System.currentTimeMillis();
        long l1 = getLastTimeTrigger(context);
        if (l1 > l)
        {
            calendar.setTimeInMillis(l1);
        } else
        {
            calendar.setTimeInMillis(l);
            calendar.add(2, 1);
        }
        setLastTimeTrigger(context, calendar.getTimeInMillis());
        Logger.i("GAWidget", (new StringBuilder()).append("LastTimeTrigger: ").append(getStringTime(calendar.getTimeInMillis())).toString());
        return calendar.getTimeInMillis() - l;
    }

    private int getNumberTimeRetryError(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("key_number_time_retry_new", 0);
    }

    public static String getStringTime(long l)
    {
        return (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())).format(Long.valueOf(l));
    }

    public static String getStringTriggerTime(long l)
    {
        return getStringTime(System.currentTimeMillis() + l);
    }

    private boolean isMaximumRetry(Context context, int i)
    {
        return i >= 10;
    }

    private boolean isRetryError(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("retry_error_new", false);
    }

    private void onPrepareResetAlarmService(Context context)
    {
        onResetDataForNextTime(context);
        resetGAWidgetAlarmService(context, getNextTimeTrackingInterval(context));
    }

    private void onResetDataForNextTime(Context context)
    {
        setFlagRetryError(context, false);
        setListRemaining(context, null);
        setNumberTimeRetryError(context, 0);
    }

    private void onStart(Context context)
    {
        boolean flag = isRetryError(context);
        if (Utilities.isConnected(context))
        {
            onStartWorkingTask(flag, context);
            return;
        }
        HashMap hashmap = getListRemaining(context);
        if (hashmap == null || hashmap.isEmpty())
        {
            setListRemaining(context, getListWidgetQuantityCurrent(context));
        }
        setFlagRetryError(context, true);
    }

    private void onStartWorkingTask(boolean flag, Context context)
    {
        cancelAlarm(context);
        setFlagRetryError(context, false);
        if (flag)
        {
            int i = getNumberTimeRetryError(context);
            Logger.i("GAWidget", (new StringBuilder()).append("timeRetry: ").append(i).toString());
            if (isMaximumRetry(context, i))
            {
                Logger.e("GAWidget", "Maximum time retry allowed - Rest alarm Service to next month ");
                onPrepareResetAlarmService(context);
                return;
            }
            setNumberTimeRetryError(context, i + 1);
        }
        startTask(context, flag);
    }

    private void reloadDataIfRequired(Context context)
    {
        Data.getInstance(context).loadData();
    }

    private void setFlagRetryError(Context context, boolean flag)
    {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("retry_error_new", flag).commit();
    }

    private void setLastTimeTrigger(Context context, long l)
    {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putLong("last_time_trigger_new", l).commit();
    }

    private void setListRemaining(Context context, HashMap hashmap)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("setListRemaining :");
        Object obj;
        if (hashmap != null)
        {
            obj = Integer.valueOf(hashmap.size());
        } else
        {
            obj = null;
        }
        Logger.i("GAWidget", stringbuilder.append(obj).toString());
        if (hashmap != null)
        {
            String s;
            for (obj = hashmap.keySet().iterator(); ((Iterator) (obj)).hasNext(); Logger.d("GAWidget", (new StringBuilder()).append(s).append(" : ").append(hashmap.get(s)).toString()))
            {
                s = (String)((Iterator) (obj)).next();
            }

        }
        context = PreferenceManager.getDefaultSharedPreferences(context);
        if (hashmap != null && hashmap.size() > 0)
        {
            hashmap = (new Gson()).toJson(hashmap);
            context.edit().putString("list_provider_remaining_new", hashmap).commit();
            return;
        } else
        {
            context.edit().remove("list_provider_remaining_new").commit();
            return;
        }
    }

    private void setNumberTimeRetryError(Context context, int i)
    {
        Logger.i("GAWidget", (new StringBuilder()).append("setNumberTimeRetryError: ").append(i).toString());
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("key_number_time_retry_new", i).commit();
    }

    private void startTask(final Context context, boolean flag)
    {
        if (mTask != null)
        {
            mTask.cancel(true);
            mTask = null;
        }
        mTask = new AsyncTask() {

            final GAWidgetReceiver this$0;
            final Context val$context;

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((Boolean[])aobj);
            }

            protected transient Void doInBackground(Boolean aboolean[])
            {
                onDoInBackground(aboolean[0].booleanValue(), context);
                return null;
            }

            
            {
                this$0 = GAWidgetReceiver.this;
                context = context1;
                super();
            }
        };
        mTask.execute(new Boolean[] {
            Boolean.valueOf(flag), null, null
        });
    }

    public void cancelAlarm(Context context)
    {
        Logger.i("GAWidget", "GA Widget alarm service called");
        ((AlarmManager)context.getSystemService("alarm")).cancel(PendingIntent.getBroadcast(context, 0, new Intent("com.accuweather.android.widget.ga.fire_beacon"), 0x8000000));
    }

    public boolean fireTheBeacon(String s)
    {
        s = "http://www.accuweather.com/get/beacon?account=UA-28728915-16&path=%2Fwidget%2FWIDGET_TYPE&event_info=Widget_Monthly_Count;WIDGET_TYPE".replaceAll("WIDGET_TYPE", s);
        boolean flag = false;
        boolean flag3 = false;
        boolean flag2 = false;
        boolean flag1 = flag3;
        int i;
        try
        {
            s = (HttpURLConnection)(new URL(s)).openConnection();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.e("GAWidget", (new StringBuilder()).append("IOException: ").append(s.getMessage()).toString());
            return flag1;
        }
        flag1 = flag3;
        s.connect();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        flag1 = flag3;
        i = s.getResponseCode();
        flag1 = flag3;
        Logger.d("GAWidget", (new StringBuilder()).append("StatusCode: ").append(i).toString());
        flag = flag2;
        if (i == 200)
        {
            flag = true;
        }
        flag1 = flag;
        s.disconnect();
        return flag;
    }

    protected List getListComponentWidgetProvider(Context context)
    {
        ArrayList arraylist = new ArrayList();
        ComponentName componentname = new ComponentName(context, com/accuweather/android/widgets/minutecast/AL_WidgetProvider);
        ComponentName componentname1 = new ComponentName(context, com/accuweather/android/widgets/AL_WidgetProviderFollowMe);
        ComponentName componentname2 = new ComponentName(context, com/accuweather/android/widgets/WidgetProviderHoloDark);
        context = new ComponentName(context, com/accuweather/android/widgets/WidgetProviderHoloLight);
        arraylist.add(componentname);
        arraylist.add(componentname1);
        arraylist.add(componentname2);
        arraylist.add(context);
        return arraylist;
    }

    protected HashMap getListWidgetQuantityCurrent(Context context)
    {
        reloadDataIfRequired(context);
        HashMap hashmap = new HashMap();
        AppWidgetManager appwidgetmanager = AppWidgetManager.getInstance(context);
        Object obj = getListComponentWidgetProvider(context);
        if (!((List) (obj)).isEmpty())
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                ComponentName componentname = (ComponentName)((Iterator) (obj)).next();
                int i = checkActiveWidgets(context, appwidgetmanager.getAppWidgetIds(componentname), componentname, appwidgetmanager);
                if (i > 0)
                {
                    hashmap.put(getWidgetType(componentname), Integer.valueOf(i));
                }
            } while (true);
        }
        return hashmap;
    }

    protected String getWidgetType(ComponentName componentname)
    {
        String s = null;
        if (componentname.getClassName().equals(com/accuweather/android/widgets/WidgetProviderHoloDark.getName()))
        {
            s = "Holo_dark";
        } else
        {
            if (componentname.getClassName().equals(com/accuweather/android/widgets/WidgetProviderHoloLight.getName()))
            {
                return "Holo_light";
            }
            if (componentname.getClassName().equals(com/accuweather/android/widgets/minutecast/AL_WidgetProvider.getName()))
            {
                return "MinuteCast";
            }
            if (componentname.getClassName().equals(com/accuweather/android/widgets/AL_WidgetProviderFollowMe.getName()))
            {
                return "Clock";
            }
        }
        return s;
    }

    protected void onDoInBackground(boolean flag, Context context)
    {
        Logger.i("GAWidget", (new StringBuilder()).append("doingBackground: ").append(flag).toString());
        HashMap hashmap;
        HashMap hashmap1;
        if (flag)
        {
            hashmap = getListRemaining(context);
        } else
        {
            hashmap = getListWidgetQuantityCurrent(context);
        }
        hashmap1 = null;
        if (!hashmap.isEmpty())
        {
            hashmap1 = startFireBeacon(hashmap);
        }
        if (hashmap1 == null || hashmap1.isEmpty())
        {
            onPrepareResetAlarmService(context);
            return;
        } else
        {
            setListRemaining(context, hashmap1);
            resetGAWidgetAlarmService(context, 0x1d4c0L);
            setFlagRetryError(context, true);
            return;
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null)
        {
            intent = intent.getAction();
            Logger.i("GAWidget", (new StringBuilder()).append("onReceive: ").append(intent).toString());
            if (intent != null)
            {
                if (intent.equals("android.intent.action.BOOT_COMPLETED") || intent.equals("com.accuweather.android.widget.ga.reset"))
                {
                    onPrepareResetAlarmService(context);
                } else
                {
                    if (intent.equals("android.net.conn.CONNECTIVITY_CHANGE"))
                    {
                        if (isRetryError(context) && Utilities.isConnected(context))
                        {
                            onStart(context);
                            return;
                        } else
                        {
                            Logger.d("GAWidget", (new StringBuilder()).append("Network changed but not retry - isRetry:").append(isRetryError(context)).append(" - isConnected: ").append(Utilities.isConnected(context)).toString());
                            return;
                        }
                    }
                    if (intent.equals("com.accuweather.android.widget.ga.fire_beacon"))
                    {
                        Logger.i("GAWidget", (new StringBuilder()).append("Time: ").append(getStringTime(System.currentTimeMillis())).toString());
                        onStart(context);
                        return;
                    }
                }
            }
        }
    }

    public void resetGAWidgetAlarmService(Context context, long l)
    {
        Logger.i("GAWidget", (new StringBuilder()).append("resetGAWidgetAlarm: ").append(getStringTime(System.currentTimeMillis())).toString());
        long l1 = SystemClock.elapsedRealtime();
        Logger.d("GAWidget", (new StringBuilder()).append("TriggerTime: ").append(getStringTriggerTime(l)).toString());
        ((AlarmManager)context.getSystemService("alarm")).setRepeating(2, l1 + l, l, PendingIntent.getBroadcast(context, 0, new Intent("com.accuweather.android.widget.ga.fire_beacon"), 0));
    }

    public HashMap startFireBeacon(HashMap hashmap)
    {
        Logger.i("GAWidget", "------------------Start Fire Beacon----------------------");
        HashMap hashmap1 = new HashMap();
        int i = 0;
        Iterator iterator = hashmap.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            int l = ((Integer)hashmap.get(s)).intValue();
            int j = l;
            int i1 = i + l;
            Logger.d("GAWidget", (new StringBuilder()).append("\twidgetType:").append(s).toString());
            for (i = 0; i < l;)
            {
                int k = j;
                if (fireTheBeacon(s))
                {
                    k = j - 1;
                }
                i++;
                j = k;
            }

            i = i1;
            if (j > 0)
            {
                hashmap1.put(s, Integer.valueOf(j));
                i = i1 - j;
            }
        } while (true);
        Logger.d("GAWidget", (new StringBuilder()).append("Completed fire the beacon - total times success:").append(i).toString());
        return hashmap1;
    }
}
