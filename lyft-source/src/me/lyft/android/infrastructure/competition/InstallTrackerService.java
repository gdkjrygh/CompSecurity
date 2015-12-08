// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.competition;

import android.app.Activity;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import me.lyft.android.analytics.studies.AppAnalytics;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.Strings;
import me.lyft.android.infrastructure.activity.ActivityService;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.logging.L;

public class InstallTrackerService extends ActivityService
{

    private IConstantsProvider constantsProvider;
    private IDevice device;

    public InstallTrackerService(IConstantsProvider iconstantsprovider, IDevice idevice)
    {
        constantsProvider = iconstantsprovider;
        device = idevice;
    }

    public void onActivityDestroyed(Activity activity)
    {
        super.onActivityDestroyed(activity);
        try
        {
            activity = constantsProvider.getConstants().getCheckBundleIds();
            if (!activity.isEmpty())
            {
                Object obj = new HashSet();
                ((Set) (obj)).addAll(activity.keySet());
                obj = ((Set) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    String s = (String)((Iterator) (obj)).next();
                    String s1 = (String)activity.get(s);
                    if (!Strings.isNullOrEmpty(s1))
                    {
                        AppAnalytics.trackCompetitiveAppInstalled(s, s1, device.isPackageInstalled(s1));
                    }
                } while (true);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            L.e(activity, "failed to track install", new Object[0]);
        }
    }
}
