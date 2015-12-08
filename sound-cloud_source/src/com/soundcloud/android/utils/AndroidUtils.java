// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.Toast;
import com.soundcloud.java.checks.Preconditions;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.soundcloud.android.utils:
//            ScTextUtils

public final class AndroidUtils
{
    private static class MapValueComparator
        implements Comparator
    {

        Map map;

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((String)obj, (String)obj1);
        }

        public int compare(String s, String s1)
        {
            return ((Integer)map.get(s)).intValue() < ((Integer)map.get(s1)).intValue() ? 1 : -1;
        }

        public MapValueComparator(Map map1)
        {
            map = map1;
        }
    }


    private AndroidUtils()
    {
    }

    public static boolean accessibilityFeaturesAvailable(Context context)
    {
        context = (AccessibilityManager)context.getSystemService("accessibility");
        return context != null && context.isEnabled();
    }

    public static void assertOnUiThread(String s)
    {
        boolean flag;
        if (Looper.getMainLooper().getThread() == Thread.currentThread())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, String.format((new StringBuilder()).append(s).append("[ %s ]").toString(), new Object[] {
            Thread.currentThread()
        }));
    }

    public static boolean doOnce(final Context prefs, final String k, final Runnable fun)
    {
        boolean flag = false;
        k = (new StringBuilder("do.once.")).append(k).toString();
        prefs = PreferenceManager.getDefaultSharedPreferences(prefs);
        if (!prefs.getBoolean(k, false))
        {
            (new _cls1()).start();
            flag = true;
        }
        return flag;
    }

    public static String[] getAccountsByType(Context context, String s)
    {
        context = AccountManager.get(context).getAccountsByType(s);
        s = new String[context.length];
        for (int i = 0; i < s.length; i++)
        {
            s[i] = ((Account) (context[i])).name;
        }

        return s;
    }

    public static int getScreenOrientation(Activity activity)
    {
        activity = activity.getWindowManager().getDefaultDisplay();
        if (activity.getWidth() == activity.getHeight())
        {
            return 3;
        }
        return activity.getWidth() >= activity.getHeight() ? 2 : 1;
    }

    public static boolean isTaskFinished(AsyncTask asynctask)
    {
        return asynctask == null || asynctask.getStatus() == android.os.AsyncTask.Status.FINISHED;
    }

    public static boolean isUserAMonkey()
    {
        boolean flag;
        try
        {
            flag = ActivityManager.isUserAMonkey();
        }
        catch (RuntimeException runtimeexception)
        {
            return true;
        }
        return flag;
    }

    public static String[] listEmails(Context context)
    {
        HashMap hashmap = new HashMap();
        context = AccountManager.get(context).getAccounts();
        int j = context.length;
        int i = 0;
        while (i < j) 
        {
            Object obj = context[i];
            if (ScTextUtils.isEmail(((Account) (obj)).name))
            {
                if (hashmap.get(((Account) (obj)).name) == null)
                {
                    hashmap.put(((Account) (obj)).name, Integer.valueOf(1));
                } else
                {
                    hashmap.put(((Account) (obj)).name, Integer.valueOf(((Integer)hashmap.get(((Account) (obj)).name)).intValue() + 1));
                }
            }
            i++;
        }
        return returnKeysSortedByValue(hashmap);
    }

    public static void logScreenSize(Context context)
    {
        int i = context.getResources().getConfiguration().screenLayout;
    }

    static String[] returnKeysSortedByValue(Map map)
    {
        TreeMap treemap = new TreeMap(new MapValueComparator(map));
        treemap.putAll(map);
        return (String[])treemap.keySet().toArray(new String[map.size()]);
    }

    public static ProgressDialog showProgress(Context context, int i)
    {
        return showProgress(context, i, 0);
    }

    public static ProgressDialog showProgress(Context context, int i, int j)
    {
        ProgressDialog progressdialog = new ProgressDialog(context);
        if (j > 0)
        {
            progressdialog.setTitle(j);
        }
        if (i > 0)
        {
            progressdialog.setMessage(context.getString(i));
        }
        progressdialog.setIndeterminate(false);
        progressdialog.setCancelable(false);
        progressdialog.setOnCancelListener(null);
        progressdialog.show();
        return progressdialog;
    }

    public static transient void showToast(Context context, int i, Object aobj[])
    {
        if (aobj.length > 0)
        {
            context = Toast.makeText(context, context.getString(i, aobj), 1);
        } else
        {
            context = Toast.makeText(context, i, 1);
        }
        context.show();
    }

    public static void showToast(Context context, CharSequence charsequence)
    {
        Toast.makeText(context, charsequence, 1).show();
    }

    private class _cls1 extends Thread
    {

        final Runnable val$fun;
        final String val$k;
        final SharedPreferences val$prefs;

        public final void run()
        {
            fun.run();
            prefs.edit().putBoolean(k, true).apply();
        }

        _cls1()
        {
            fun = runnable;
            prefs = sharedpreferences;
            k = s;
            super();
        }
    }

}
