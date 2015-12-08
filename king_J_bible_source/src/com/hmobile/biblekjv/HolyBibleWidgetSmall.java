// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.widget.RemoteViews;
import com.hmobile.common.Utils;
import com.hmobile.model.BookInfo;
import com.hmobile.model.TodayVerseInfo;
import java.text.SimpleDateFormat;
import java.util.Date;

// Referenced classes of package com.hmobile.biblekjv:
//            HolyBibleApplication, MainBookActivity, TodayActivity, WidgetUpdateService

public class HolyBibleWidgetSmall extends AppWidgetProvider
{

    public static String ACTION_WIDGET_CONFIGURE = "ConfigureWidget";
    public static String ACTION_WIDGET_RECEIVER = "ActionReceiverWidget";
    public static final String PREFS_NAME = "MyPrefsFile";
    static int book_id = 1;
    static int chap_id = 1;
    static Intent configIntent;
    static PendingIntent configPendingIntent;
    static boolean isLowLightDarkFont;
    static SharedPreferences settings;
    static int verse_id = 1;
    static int widget_backgroundImage;
    static float widget_fontSize;
    static int widget_fontstyle;
    CountDownTimer countdown;
    private AppWidgetManager m_appmanager;
    int m_widgetid;
    RemoteViews remoteViews;

    public HolyBibleWidgetSmall()
    {
        m_appmanager = null;
    }

    private RemoteViews getRemoteViews(Context context)
    {
        if (remoteViews == null)
        {
            remoteViews = new RemoteViews(context.getPackageName(), 0x7f030038);
        }
        return remoteViews;
    }

    private static TodayVerseInfo getTodayInfo()
    {
        TodayVerseInfo todayverseinfo;
        TodayVerseInfo todayverseinfo1;
        todayverseinfo1 = new TodayVerseInfo();
        todayverseinfo = todayverseinfo1;
        Object obj1 = settings.getString("TodayDate", "");
        todayverseinfo = todayverseinfo1;
        Object obj = new Date();
        todayverseinfo = todayverseinfo1;
        SimpleDateFormat simpledateformat = new SimpleDateFormat("MM/dd/yyyy");
        todayverseinfo = todayverseinfo1;
        obj = simpledateformat.format(((Date) (obj)));
        todayverseinfo = todayverseinfo1;
        if (simpledateformat.parse(((String) (obj))).compareTo(simpledateformat.parse(simpledateformat.format(Long.valueOf(Date.parse(((String) (obj1))))))) != 0)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        todayverseinfo = todayverseinfo1;
        todayverseinfo1.Verse = settings.getString("TodayVerse", "");
        todayverseinfo = todayverseinfo1;
        todayverseinfo1.BookId = settings.getInt("BookCount", 1);
        todayverseinfo = todayverseinfo1;
        todayverseinfo1.ChapterNumber = settings.getInt("ChapterCount", 1);
        todayverseinfo = todayverseinfo1;
        todayverseinfo1.VerseNumber = settings.getInt("VerseCount", 1);
        todayverseinfo = todayverseinfo1;
        obj = todayverseinfo1;
        if (todayverseinfo1.Verse.equalsIgnoreCase(""))
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_280;
        todayverseinfo = todayverseinfo1;
        obj1 = settings.edit();
        todayverseinfo = todayverseinfo1;
        todayverseinfo1 = BookInfo.getTodayVerse();
        todayverseinfo = todayverseinfo1;
        ((android.content.SharedPreferences.Editor) (obj1)).putString("TodayVerse", todayverseinfo1.Verse);
        todayverseinfo = todayverseinfo1;
        ((android.content.SharedPreferences.Editor) (obj1)).putInt("BookCount", todayverseinfo1.BookId);
        todayverseinfo = todayverseinfo1;
        ((android.content.SharedPreferences.Editor) (obj1)).putInt("ChapterCount", todayverseinfo1.ChapterNumber);
        todayverseinfo = todayverseinfo1;
        ((android.content.SharedPreferences.Editor) (obj1)).putInt("VerseCount", todayverseinfo1.VerseNumber);
        todayverseinfo = todayverseinfo1;
        ((android.content.SharedPreferences.Editor) (obj1)).putString("TodayDate", ((String) (obj)));
        todayverseinfo = todayverseinfo1;
        ((android.content.SharedPreferences.Editor) (obj1)).commit();
        return todayverseinfo1;
        Exception exception;
        exception;
        exception.printStackTrace();
        obj = todayverseinfo;
        return ((TodayVerseInfo) (obj));
    }

    public static void updateWidget(RemoteViews remoteviews, Context context, AppWidgetManager appwidgetmanager)
    {
        if (appwidgetmanager == null)
        {
            return;
        }
        context = HolyBibleApplication.getContext();
        TodayVerseInfo todayverseinfo = getTodayInfo();
        if (todayverseinfo != null)
        {
            book_id = todayverseinfo.BookId;
            chap_id = todayverseinfo.ChapterNumber;
            verse_id = todayverseinfo.VerseNumber;
            settings = PreferenceManager.getDefaultSharedPreferences(context);
            isLowLightDarkFont = settings.getBoolean("widget_low_light", false);
            widget_fontstyle = settings.getInt("widget_font_style", 0);
            widget_fontSize = settings.getInt("widget_font_size", 16);
            SpannableString spannablestring = new SpannableString(todayverseinfo.Verse);
            spannablestring.setSpan(new StyleSpan(widget_fontstyle), 0, todayverseinfo.Verse.length(), 18);
            if (isLowLightDarkFont)
            {
                remoteviews.setTextColor(0x7f0e00ac, 0xff000000);
                remoteviews.setTextColor(0x7f0e013c, 0xff000000);
                widget_backgroundImage = 0x7f0200ae;
            } else
            {
                remoteviews.setTextColor(0x7f0e00ac, -1);
                remoteviews.setTextColor(0x7f0e013c, -1);
                widget_backgroundImage = 0x7f0200b0;
            }
            remoteviews.setInt(0x7f0e0139, "setBackgroundResource", widget_backgroundImage);
            remoteviews.setTextViewText(0x7f0e00ac, spannablestring);
            remoteviews.setFloat(0x7f0e00ac, "setTextSize", widget_fontSize);
            remoteviews.setTextViewText(0x7f0e013c, (new StringBuilder(String.valueOf(BookInfo.getBookNameByBookid(todayverseinfo.BookId)))).append(" ").append(todayverseinfo.ChapterNumber).append(":").append(todayverseinfo.VerseNumber).toString());
            configIntent = new Intent(context, com/hmobile/biblekjv/MainBookActivity);
            configIntent.putExtra("book_id", book_id);
            configIntent.putExtra("chap_id", chap_id);
            configIntent.putExtra("verse_id", verse_id);
            configIntent.putExtra("isFromWidget", true);
            configIntent.setFlags(0x4000000);
            configIntent.setAction(ACTION_WIDGET_CONFIGURE);
            configPendingIntent = PendingIntent.getActivity(context, 0, configIntent, 0x8000000);
        } else
        {
            remoteviews.setTextViewText(0x7f0e00ac, "Please check your internet connection");
            configIntent = new Intent(context, com/hmobile/biblekjv/TodayActivity);
            configIntent.setAction(ACTION_WIDGET_CONFIGURE);
            configPendingIntent = PendingIntent.getActivity(context, 0, configIntent, 0);
        }
        remoteviews.setOnClickPendingIntent(0x7f0e0139, configPendingIntent);
        context = new ComponentName(context, com/hmobile/biblekjv/HolyBibleWidgetSmall);
        if (appwidgetmanager != null)
        {
            Utils.LogInfo("AppWidgetMAnager GOT");
            appwidgetmanager.updateAppWidget(context, remoteviews);
            return;
        } else
        {
            Utils.LogInfo("AppWidgetMAnager is null");
            return;
        }
    }

    public void onDeleted(Context context, int ai[])
    {
        super.onDeleted(context, ai);
    }

    public void onDisabled(Context context)
    {
        PendingIntent pendingintent = PendingIntent.getService(context, 0, new Intent(context, com/hmobile/biblekjv/WidgetUpdateService), 0);
        ((AlarmManager)context.getSystemService("alarm")).cancel(pendingintent);
        super.onDisabled(context);
    }

    public void onReceive(Context context, Intent intent)
    {
        settings = PreferenceManager.getDefaultSharedPreferences(context);
        remoteViews = getRemoteViews(context);
        updateWidget(remoteViews, context, m_appmanager);
        super.onReceive(context, intent);
    }

    public void onUpdate(Context context, AppWidgetManager appwidgetmanager, int ai[])
    {
        settings = PreferenceManager.getDefaultSharedPreferences(context);
        m_appmanager = appwidgetmanager;
        m_widgetid = ai[0];
        appwidgetmanager.updateAppWidget(ai, getRemoteViews(context));
        super.onUpdate(context, appwidgetmanager, ai);
    }

}
