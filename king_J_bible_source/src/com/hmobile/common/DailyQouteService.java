// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.common;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import android.preference.PreferenceManager;
import android.widget.RemoteViews;
import com.hmobile.biblekjv.SettingsActivity;
import com.hmobile.biblekjv.TodayActivity;
import com.hmobile.model.BookInfo;
import com.hmobile.model.TodayInfo;
import com.hmobile.model.TodayVerseInfo;
import com.hmobile.model.VerseInfo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// Referenced classes of package com.hmobile.common:
//            CancelNotification, Utils

public class DailyQouteService extends Service
{

    static boolean m_isrunning = false;
    static String phoneid;
    static RemoteViews remoteViews;
    Context con;
    android.content.SharedPreferences.Editor editor;
    SharedPreferences settings;

    public DailyQouteService()
    {
    }

    private void ShowNotification(Context context, String s, String s1)
    {
        Object obj = new Intent(context, com/hmobile/biblekjv/TodayActivity);
        ((Intent) (obj)).setFlags(0x24000000);
        obj = PendingIntent.getActivity(context, 0, ((Intent) (obj)), 0x8000000);
        Object obj1 = new Intent(context, com/hmobile/biblekjv/SettingsActivity);
        ((Intent) (obj1)).setFlags(0x24000000);
        obj1 = PendingIntent.getActivity(context, 0, ((Intent) (obj1)), 0x8000000);
        Intent intent = new Intent(context, com/hmobile/common/CancelNotification);
        intent.putExtra("notificationId", 1);
        context = PendingIntent.getBroadcast(context, 0, intent, 0);
        try
        {
            context = (new android.app.Notification.Builder(this)).setContentText(s1).setContentTitle(s).setSmallIcon(0x7f020065).setContentIntent(((PendingIntent) (obj))).setStyle((new android.app.Notification.BigTextStyle()).bigText(s1)).setTicker(s1).setAutoCancel(true).addAction(0x7f020098, "Settings", ((PendingIntent) (obj1))).addAction(0x7f02005e, "Dismiss", context).build();
            context.defaults = ((Notification) (context)).defaults | 1;
            ((NotificationManager)getSystemService("notification")).notify(1, context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public static void cancelNotification(Context context, int i)
    {
        ((NotificationManager)context.getSystemService("notification")).cancel(i);
    }

    void handleStart(Intent intent, int i)
    {
        Utils.LogInfo("In handleStart ::: ");
        settings = PreferenceManager.getDefaultSharedPreferences(this);
        editor = settings.edit();
        if (settings.getBoolean("is_notification", true)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        obj = new TodayInfo();
        obj.TodayVerse = settings.getString("TodayVerse", "");
        obj.BookName = settings.getString("BookName", "");
        obj.TodayDate = settings.getString("TodayDate", "");
        obj.BookCount = settings.getInt("BookCount", 1);
        obj.ChapterCount = settings.getInt("ChapterCount", 1);
        obj.VerseCount = settings.getInt("VerseCount", 1);
        if (((TodayInfo) (obj)).TodayVerse.equalsIgnoreCase("") || ((TodayInfo) (obj)).TodayDate.equalsIgnoreCase("") || obj == null) goto _L1; else goto _L3
_L3:
        Date date = new Date();
        intent = new SimpleDateFormat("MM/dd/yyyy");
        if (intent.parse(intent.format(date)).compareTo(intent.parse(intent.format(Long.valueOf(Date.parse(((TodayInfo) (obj)).TodayDate))))) != 0)
        {
            break MISSING_BLOCK_LABEL_312;
        }
        intent = VerseInfo.getVerseInfoByVerse(((TodayInfo) (obj)).TodayVerse);
        if (intent == null) goto _L1; else goto _L4
_L4:
        BookInfo bookinfo;
        try
        {
            obj = (new StringBuilder(String.valueOf(BookInfo.getBookNameByBookid(Utils.ConvertToLong(String.valueOf(((VerseInfo) (intent)).BookId))).trim()))).append(" ").append(((VerseInfo) (intent)).ChapterNumber).append(":").append(((VerseInfo) (intent)).VerseNumber).toString();
            ShowNotification(getApplicationContext(), ((String) (obj)), ((VerseInfo) (intent)).Verse);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return;
        }
        obj = BookInfo.getTodayVerse();
        bookinfo = BookInfo.getTodayBook();
        if (obj == null) goto _L1; else goto _L5
_L5:
        editor.putString("TodayVerse", ((TodayVerseInfo) (obj)).Verse);
        editor.putString("BookName", bookinfo.BookName);
        editor.putInt("BookCount", ((TodayVerseInfo) (obj)).BookId);
        editor.putInt("ChapterCount", ((TodayVerseInfo) (obj)).ChapterNumber);
        editor.putInt("VerseCount", ((TodayVerseInfo) (obj)).VerseNumber);
        intent = intent.format(new Date());
        editor.putString("TodayDate", intent);
        editor.putLong("notification_millis", Calendar.getInstance().getTimeInMillis());
        editor.commit();
        if (obj == null) goto _L1; else goto _L6
_L6:
        intent = (new StringBuilder(String.valueOf(BookInfo.getBookNameByBookid(Utils.ConvertToLong(String.valueOf(((TodayVerseInfo) (obj)).BookId))).trim()))).append(" ").append(((TodayVerseInfo) (obj)).ChapterNumber).append(":").append(((TodayVerseInfo) (obj)).VerseNumber).toString();
        ShowNotification(getApplicationContext(), intent, ((TodayVerseInfo) (obj)).Verse);
        return;
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        con = getApplicationContext();
    }

    public void onStart(Intent intent, int i)
    {
        handleStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        handleStart(intent, j);
        intent = intent.getExtras();
        if (intent == null) goto _L2; else goto _L1
_L1:
        intent = intent.getString("do_action");
        if (!intent.equals("Dismiss")) goto _L4; else goto _L3
_L3:
        cancelNotification(getApplicationContext(), 1001);
_L2:
        return 2;
_L4:
        if (intent.equals("Setting"))
        {
            intent = new Intent(getApplicationContext(), com/hmobile/biblekjv/SettingsActivity);
            intent.setFlags(0x10000000);
            startActivity(intent);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

}
