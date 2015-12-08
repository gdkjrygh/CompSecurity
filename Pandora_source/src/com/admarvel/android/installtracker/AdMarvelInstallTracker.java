// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.installtracker;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;

// Referenced classes of package com.admarvel.android.installtracker:
//            AdMarvelInstallTrackerAsyncTask, AdMarvelInstallTrackerCleanupAsyncTask, PostAPI4Version

public class AdMarvelInstallTracker
{
    private class AdMarvelInstallTrackerCleanupAsyncTaskPostAPI11
        implements Runnable
    {

        final AdMarvelInstallTracker this$0;

        public void run()
        {
            (new AdMarvelInstallTrackerCleanupAsyncTask()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[] {
                null
            });
        }

        private AdMarvelInstallTrackerCleanupAsyncTaskPostAPI11()
        {
            this$0 = AdMarvelInstallTracker.this;
            super();
        }

        AdMarvelInstallTrackerCleanupAsyncTaskPostAPI11(AdMarvelInstallTrackerCleanupAsyncTaskPostAPI11 admarvelinstalltrackercleanupasynctaskpostapi11)
        {
            this();
        }
    }


    private final AdMarvelInstallTrackerAsyncTask adMarvelInstallTrackerAsyncTask;

    public AdMarvelInstallTracker(Context context)
    {
        adMarvelInstallTrackerAsyncTask = new AdMarvelInstallTrackerAsyncTask(context);
        if (getAndroidSDKVersion() >= 11)
        {
            (new Handler()).post(new AdMarvelInstallTrackerCleanupAsyncTaskPostAPI11(null));
            return;
        } else
        {
            (new AdMarvelInstallTrackerCleanupAsyncTask()).execute(new Object[] {
                null
            });
            return;
        }
    }

    public static int getAndroidSDKVersion()
    {
        if (android.os.Build.VERSION.RELEASE.contains("1.5"))
        {
            return 3;
        } else
        {
            return PostAPI4Version.getAndroidOSVersion();
        }
    }

    public void registerTrackingEvent()
    {
        adMarvelInstallTrackerAsyncTask.execute(new Object[] {
            null
        });
    }
}
