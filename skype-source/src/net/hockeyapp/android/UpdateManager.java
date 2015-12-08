// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.res.Configuration;
import android.content.res.Resources;

// Referenced classes of package net.hockeyapp.android:
//            CheckUpdateTask, UpdateManagerListener

public class UpdateManager
{

    private static CheckUpdateTask updateTask = null;

    public UpdateManager()
    {
    }

    private static boolean dialogShown(Activity activity)
    {
        return activity.getFragmentManager().findFragmentByTag("hockey_update_dialog") != null;
    }

    public static Boolean fragmentsSupported()
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
        NoClassDefFoundError noclassdeffounderror;
        noclassdeffounderror;
        return Boolean.valueOf(false);
    }

    public static void register(Activity activity, String s)
    {
        register(activity, s, null);
    }

    public static void register(Activity activity, String s, UpdateManagerListener updatemanagerlistener)
    {
        if (fragmentsSupported().booleanValue() && dialogShown(activity))
        {
            return;
        }
        if (updateTask == null || updateTask.getStatus() == android.os.AsyncTask.Status.FINISHED)
        {
            activity = new CheckUpdateTask(activity, "https://rink.hockeyapp.net/", s, updatemanagerlistener);
            updateTask = activity;
            activity.execute(new String[0]);
            return;
        } else
        {
            updateTask.attach(activity);
            return;
        }
    }

    public static Boolean runsOnTablet(Activity activity)
    {
        activity = activity.getResources().getConfiguration();
        boolean flag;
        if ((((Configuration) (activity)).screenLayout & 0xf) == 3 || (((Configuration) (activity)).screenLayout & 0xf) == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

}
