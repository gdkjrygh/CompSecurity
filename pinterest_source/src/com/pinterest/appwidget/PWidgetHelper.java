// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.appwidget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.base.Application;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import java.util.ArrayList;

// Referenced classes of package com.pinterest.appwidget:
//            PWidgetService, SwitcherActivity, PWidgetProvider

public class PWidgetHelper
{

    private static final int CODE_HOME = 6;
    private static final int CODE_LOGIN = 3;
    private static final int CODE_META = 0;
    private static final int CODE_PROFILE = 2;
    private static final int CODE_SEARCH = 1;
    private static final int CODE_SIGNUP = 4;
    private static final int CODE_WELCOME = 5;
    public static final int UNKNOWN = -1;

    public PWidgetHelper()
    {
    }

    public static Intent addSource(Intent intent)
    {
        intent.putExtra("com.pinterest.EXTRA_SOURCE", "HOME_WIDGET");
        ActivityHelper.setSingleClearTop(intent);
        return intent;
    }

    public static Intent getHomeIntent(Context context)
    {
        return getSwitcherIntent(context, "VALUE_HOME");
    }

    public static PendingIntent getHomePending(Context context)
    {
        return PendingIntent.getActivity(context, 6, getHomeIntent(context), 0x8000000);
    }

    public static int getLastWidgetId()
    {
        return Preferences.persisted().getInt("appWidgetId", 0);
    }

    public static Intent getLoginIntent(Context context)
    {
        return getSwitcherIntent(context, "VALUE_LOGIN");
    }

    public static PendingIntent getLoginPending(Context context)
    {
        return PendingIntent.getActivity(context, 3, getLoginIntent(context), 0x8000000);
    }

    public static PendingIntent getPhotoPending(Context context)
    {
        context = ActivityHelper.getCreatePinIntent(context);
        context.putExtra("com.pinterest.EXTRA_SOURCE", "com.pinterest.EXTRA_SOURCE_CAMERA");
        return PendingIntent.getActivity(Application.context(), 0, context, 0x8000000);
    }

    public static Intent getProfileIntent(Context context)
    {
        return getSwitcherIntent(context, "VALUE_PROFILE");
    }

    public static PendingIntent getProfilePending(Context context)
    {
        return PendingIntent.getActivity(context, 2, getProfileIntent(context), 0x8000000);
    }

    public static Intent getSearchIntent(Context context)
    {
        return getSwitcherIntent(context, "VALUE_SEARCH");
    }

    public static PendingIntent getSearchPending(Context context)
    {
        return PendingIntent.getActivity(context, 1, getSearchIntent(context), 0x8000000);
    }

    public static Intent getServiceIntent(Context context, int i)
    {
        context = new Intent(context, com/pinterest/appwidget/PWidgetService);
        context.putExtra("appWidgetId", i);
        return context;
    }

    public static PendingIntent getServicePending(Context context, int i)
    {
        Intent intent = getServiceIntent(context, i);
        intent.putExtra("com.pinterest.EXTRA_MANUAL_UPDATE", true);
        return PendingIntent.getService(context, 0, intent, 0x8000000);
    }

    public static Intent getSignupIntent(Context context)
    {
        return getSwitcherIntent(context, "VALUE_SIGNUP");
    }

    public static PendingIntent getSignupPending(Context context)
    {
        return PendingIntent.getActivity(context, 4, getSignupIntent(context), 0x8000000);
    }

    public static Intent getSwitcherIntent(Context context)
    {
        return getSwitcherIntent(context, null);
    }

    public static Intent getSwitcherIntent(Context context, String s)
    {
        context = new Intent(context, com/pinterest/appwidget/SwitcherActivity);
        if (s != null)
        {
            context.putExtra("com.pinterest.EXTRA_REDIRECT", s);
        }
        return context;
    }

    public static PendingIntent getSwitcherPending(Context context)
    {
        return PendingIntent.getActivity(context, 0, getSwitcherIntent(context), 0x8000000);
    }

    public static Intent getWelcomeIntent(Context context)
    {
        return getSwitcherIntent(context, "VALUE_WELCOME");
    }

    public static PendingIntent getWelcomePending(Context context)
    {
        return PendingIntent.getActivity(context, 5, getWelcomeIntent(context), 0x8000000);
    }

    public static int[] getWidgetIds(Context context)
    {
        return AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context.getApplicationContext(), com/pinterest/appwidget/PWidgetProvider));
    }

    public static void notifyWidgetStateChange(Context context)
    {
        notifyWidgetStateChange(context, -1);
    }

    public static void notifyWidgetStateChange(Context context, int i)
    {
        notifyWidgetStateChange(context, i, -1);
    }

    public static void notifyWidgetStateChange(Context context, int i, int j)
    {
        int ai[] = getWidgetIds(context);
        Intent intent = new Intent(context, com/pinterest/appwidget/PWidgetProvider);
        intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
        intent.putExtra("appWidgetIds", ai);
        ArrayList arraylist = new ArrayList();
        Bundle bundle = new Bundle();
        if (i != -1)
        {
            bundle.putInt("com.pinterest.EXTRA_NOTIF_COUNT", i);
            bundle.putBoolean("com.pinterest.EXTRA_ONLY_UPDATE_NOTIF", true);
        }
        if (j != -1)
        {
            bundle.putInt("com.pinterest.EXTRA_UPDATE_WIDGET_LOADING", j);
        }
        if (bundle.size() > 0)
        {
            arraylist.add(bundle);
        }
        intent.putParcelableArrayListExtra("customExtras", arraylist);
        context.sendBroadcast(intent);
    }

    public static void setLastWidgetId(int i)
    {
        Preferences.persisted().set("appWidgetId", i);
    }
}
