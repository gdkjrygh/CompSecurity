// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.filter;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.base.Supplier;
import com.google.common.collect.ListMultimap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.android.apps.wallet.filter:
//            FilteredActivity, ActivityFilter

public class ActivityFilterPipeline
{

    private static final String TAG = com/google/android/apps/wallet/filter/ActivityFilterPipeline.getSimpleName();
    private final ListMultimap activityFilters;

    ActivityFilterPipeline(ListMultimap listmultimap)
    {
        activityFilters = listmultimap;
    }

    private Collection getFilterGroup(Activity activity)
    {
        Object obj = (FilteredActivity)activity.getClass().getAnnotation(com/google/android/apps/wallet/filter/FilteredActivity);
        if (obj == null)
        {
            throw new IllegalArgumentException(String.valueOf(activity.getClass().getName()).concat(" missing FilteredActivity annotation"));
        }
        if (((FilteredActivity) (obj)).group().equals("NONE"))
        {
            return new ArrayList();
        }
        if (!activityFilters.containsKey(((FilteredActivity) (obj)).group()))
        {
            activity = String.valueOf(activity.getClass().getName());
            obj = ((FilteredActivity) (obj)).group();
            String s = String.valueOf(activityFilters.keySet());
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(activity).length() + 49 + String.valueOf(obj).length() + String.valueOf(s).length())).append(activity).append(" has invalid group attribute: ").append(((String) (obj))).append(" valid groups are: ").append(s).toString());
        } else
        {
            return activityFilters.get(((FilteredActivity) (obj)).group());
        }
    }

    public final void onActivityResult(Activity activity, int i, int j, Intent intent)
    {
        for (activity = getFilterGroup(activity).iterator(); activity.hasNext(); activity.next()) { }
    }

    public final void onAttachFragment(Activity activity, Fragment fragment)
    {
        for (activity = getFilterGroup(activity).iterator(); activity.hasNext(); ((ActivityFilter)activity.next()).onAttachFragment(fragment)) { }
    }

    public final void onConfigurationChanged(Activity activity, Configuration configuration)
    {
        for (activity = getFilterGroup(activity).iterator(); activity.hasNext(); activity.next()) { }
    }

    public final Intent onCreate(Activity activity, Bundle bundle, Supplier supplier)
    {
        for (Iterator iterator = getFilterGroup(activity).iterator(); iterator.hasNext();)
        {
            activity = (ActivityFilter)iterator.next();
            Intent intent = activity.onCreate(bundle);
            if (intent != null)
            {
                intent.putExtra("ActivityFilterSourceIntent", (Parcelable)supplier.get());
                bundle = TAG;
                activity = String.valueOf(activity.getClass().getSimpleName());
                if (activity.length() != 0)
                {
                    activity = "Filtered by: ".concat(activity);
                } else
                {
                    activity = new String("Filtered by: ");
                }
                WLog.d(bundle, activity);
                return intent;
            }
        }

        return null;
    }

    public final boolean onCreateOptionsMenu(Activity activity, Menu menu)
    {
        boolean flag = false;
        for (activity = getFilterGroup(activity).iterator(); activity.hasNext();)
        {
            activity.next();
            flag |= ActivityFilter.onCreateOptionsMenu(menu);
        }

        return flag;
    }

    public final void onDestroy(Activity activity)
    {
        for (activity = getFilterGroup(activity).iterator(); activity.hasNext(); ((ActivityFilter)activity.next()).onDestroy()) { }
    }

    public final boolean onOptionsMenuSelected(Activity activity, MenuItem menuitem)
    {
        for (activity = getFilterGroup(activity).iterator(); activity.hasNext();)
        {
            if (((ActivityFilter)activity.next()).onOptionsMenuSelected(menuitem))
            {
                return true;
            }
        }

        return false;
    }

    public final void onPause(Activity activity)
    {
        for (activity = getFilterGroup(activity).iterator(); activity.hasNext(); ((ActivityFilter)activity.next()).onPause()) { }
    }

    public final void onPostCreate(Activity activity, Bundle bundle)
    {
        for (activity = getFilterGroup(activity).iterator(); activity.hasNext(); ((ActivityFilter)activity.next()).onPostCreate(bundle)) { }
    }

    public final void onPostResume(Activity activity)
    {
        for (activity = getFilterGroup(activity).iterator(); activity.hasNext(); ((ActivityFilter)activity.next()).onPostResume()) { }
    }

    public final boolean onPrepareOptionsMenu(Activity activity, Menu menu)
    {
        boolean flag = false;
        for (activity = getFilterGroup(activity).iterator(); activity.hasNext();)
        {
            flag |= ((ActivityFilter)activity.next()).onPrepareOptionsMenu(menu);
        }

        return flag;
    }

    public final void onResume(Activity activity)
    {
        Iterator iterator = getFilterGroup(activity).iterator();
        do
        {
            ActivityFilter activityfilter;
label0:
            {
                if (iterator.hasNext())
                {
                    activityfilter = (ActivityFilter)iterator.next();
                    if (!activity.isFinishing())
                    {
                        break label0;
                    }
                }
                return;
            }
            activityfilter.onResume();
        } while (true);
    }

    public final void onStart(Activity activity)
    {
        for (activity = getFilterGroup(activity).iterator(); activity.hasNext(); ((ActivityFilter)activity.next()).onStart()) { }
    }

    public final void onStop(Activity activity)
    {
        for (activity = getFilterGroup(activity).iterator(); activity.hasNext(); activity.next()) { }
    }

}
