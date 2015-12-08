// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.services;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.nbcsports.liveextra.ApplicationComponent;
import com.nbcsports.liveextra.content.FavoriteService;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.library.api.models.NbcDate;
import com.phunware.nbc.sochi.MainNavigationContentActivity;
import com.phunware.nbc.sochi.NBCSportsApplication;
import com.phunware.nbc.sochi.system.NBCSystem;
import java.util.Iterator;
import java.util.List;
import timber.log.Timber;

public class FavoriteReminderService extends IntentService
{

    public static final String ACTION_NOTIFY_START = "com.phunware.nbc.sochi.action.NOTIFY_START";
    public static final String ACTION_SCHEDULE_FAVORITES = "com.phunware.nbc.sochi.action.SCHEDULE_FAVORITES";
    public static final int EVENT_ALERT_INTERVAL_15MINUTES = 2;
    public static final int EVENT_ALERT_INTERVAL_30MINUTES = 3;
    public static final int EVENT_ALERT_INTERVAL_NONE = 0;
    public static final int EVENT_ALERT_INTERVAL_STARTUP = 1;
    public static final String EVENT_ID = "EVENT_ID";
    public static final long MILLI_FIFTEEN_MINUTES = 0xdbba0L;
    public static final long MILLI_ONE_MINUTE = 60000L;
    public static final long MILLI_THIRTY_MINUTES = 0x1b7740L;
    public static final int NOTIFICATION_ID = 100;
    public static final String TITLE = "TITLE";
    FavoriteService favorites;

    public FavoriteReminderService()
    {
        super("FavoriteReminderService");
    }

    private int getInterval(int i)
    {
        switch (i)
        {
        case 0: // '\0'
        default:
            return 0;

        case 1: // '\001'
            return 1;

        case 2: // '\002'
            return 2;

        case 3: // '\003'
            return 3;
        }
    }

    private void scheduleAlarm(long l, String s, String s1)
    {
        Intent intent = new Intent("com.phunware.nbc.sochi.action.NOTIFY_START", null, this, com/phunware/nbc/sochi/services/FavoriteReminderService);
        intent.putExtra("EVENT_ID", s1);
        intent.putExtra("TITLE", s);
        s = PendingIntent.getService(this, 0, intent, 0x8000000);
        ((AlarmManager)getSystemService("alarm")).set(0, l, s);
        Timber.d("Scheduled", new Object[0]);
    }

    private void showNotification(String s, String s1)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "NBC Live Extra";
        }
        s1 = new android.support.v4.app.NotificationCompat.Builder(this);
        s1.setOnlyAlertOnce(true);
        s1.setContentTitle("NBC Live Extra");
        s1.setContentText(s2);
        s1.setAutoCancel(true);
        s1.setDefaults(-1);
        s1.setSmallIcon(0x7f0200b3);
        Intent intent = new Intent(this, com/phunware/nbc/sochi/MainNavigationContentActivity);
        intent.putExtra("EVENT_ID", s);
        s1.setContentIntent(PendingIntent.getActivity(this, 0, intent, 0x10000000));
        ((NotificationManager)getSystemService("notification")).notify(s2, 100, s1.build());
    }

    private void updateFavoritesReminders(int i)
    {
        if (i == 0)
        {
            Timber.d("Setting is 0, stopping service", new Object[0]);
            stopSelf();
        } else
        {
            NBCSystem.getInstance();
            long l1 = System.currentTimeMillis();
            Object obj = favorites.getAllFavorites();
            if (obj != null && ((List) (obj)).size() != 0)
            {
                obj = ((List) (obj)).iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    Asset asset = (Asset)((Iterator) (obj)).next();
                    long l = 0L;
                    if (i > 1)
                    {
                        if (i == 2)
                        {
                            l = 0xdbba0L;
                        }
                        if (i == 3)
                        {
                            l = 0x1b7740L;
                        }
                        long l2 = asset.getStart().getTime();
                        if (l1 < l2 - l - 60000L)
                        {
                            String s = asset.getCoalescedEventId();
                            scheduleAlarm(l2 - l, asset.getTitle(), s);
                        }
                    }
                }
            }
        }
    }

    public void onCreate()
    {
        super.onCreate();
        NBCSportsApplication.component().inject(this);
    }

    protected void onHandleIntent(Intent intent)
    {
        String s = intent.getAction();
        if (s != null && "com.phunware.nbc.sochi.action.NOTIFY_START".equals(s))
        {
            String s1 = intent.getStringExtra("TITLE");
            intent = intent.getStringExtra("EVENT_ID");
            Timber.d((new StringBuilder()).append("Showing notification for: ").append(s1).toString(), new Object[0]);
            showNotification(intent, s1);
            return;
        }
        intent = PreferenceManager.getDefaultSharedPreferences(this).getString("event_alert_interval", null);
        int i = 1;
        if (intent != null)
        {
            try
            {
                i = Integer.parseInt(intent);
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                i = 0;
            }
        }
        Timber.d((new StringBuilder()).append("").append(i).toString(), new Object[0]);
        updateFavoritesReminders(getInterval(i));
    }
}
