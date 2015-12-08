// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.apptentive.android.sdk.GlobalInfo;
import com.apptentive.android.sdk.Log;
import java.util.List;

// Referenced classes of package com.apptentive.android.sdk.util:
//            Util

public class ActivityUtil
{

    public ActivityUtil()
    {
    }

    public static Class getActivityClassFromName(String s)
    {
        Class class2 = null;
        Class class1 = class2;
        if (!Util.isEmpty(s))
        {
            try
            {
                class1 = Class.forName(s);
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                classnotfoundexception = class2;
            }
        }
        class2 = class1;
        if (class1 != null)
        {
            class2 = class1;
            if (!android/app/Activity.isAssignableFrom(class1))
            {
                class2 = null;
            }
        }
        if (class2 == null)
        {
            Log.e("Class %s does not exist.", new Object[] {
                s
            });
        }
        return class2;
    }

    public static boolean isApplicationBroughtToBackground(Activity activity)
    {
        Object obj = (ActivityManager)activity.getSystemService("activity");
        ActivityInfo aactivityinfo[];
        ActivityInfo activityinfo;
        int j;
        boolean flag;
        try
        {
            obj = ((ActivityManager) (obj)).getRunningTasks(1);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            if (GlobalInfo.isAppDebuggable)
            {
                throw activity;
            } else
            {
                Log.e("Missing required permission: \"android.permission.GET_TASKS\".", activity, new Object[0]);
                return false;
            }
        }
        if (obj == null || ((List) (obj)).isEmpty()) goto _L2; else goto _L1
_L1:
        obj = ((android.app.ActivityManager.RunningTaskInfo)((List) (obj)).get(0)).topActivity;
        int i;
        try
        {
            aactivityinfo = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 1).activities;
            j = aactivityinfo.length;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            Log.e("Package name not found: %s", namenotfoundexception, new Object[] {
                activity.getPackageName()
            });
            return false;
        }
        i = 0;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        activityinfo = aactivityinfo[i];
        flag = ((ComponentName) (obj)).getClassName().equals(activityinfo.name);
        if (flag)
        {
            return false;
        }
        i++;
        if (true) goto _L3; else goto _L2
_L3:
        break MISSING_BLOCK_LABEL_66;
_L2:
        return true;
    }

    public static boolean isCurrentActivityMainActivity(Activity activity)
    {
        boolean flag1 = false;
        SharedPreferences sharedpreferences = activity.getSharedPreferences("APPTENTIVE", 0);
        String s = activity.getComponentName().getClassName();
        String s1 = sharedpreferences.getString("mainActivityName", null);
        activity = s1;
        if (s1 == null)
        {
            activity = s;
            sharedpreferences.edit().putString("mainActivityName", activity).commit();
        }
        boolean flag = flag1;
        if (s != null)
        {
            flag = flag1;
            if (s.equals(activity))
            {
                flag = true;
            }
        }
        return flag;
    }
}
