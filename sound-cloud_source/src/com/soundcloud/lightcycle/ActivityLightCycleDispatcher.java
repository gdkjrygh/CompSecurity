// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.lightcycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.soundcloud.lightcycle:
//            ActivityLightCycle, LightCycleDispatcher

public class ActivityLightCycleDispatcher
    implements ActivityLightCycle, LightCycleDispatcher
{

    private final Set activityLightCycles = new HashSet();

    public ActivityLightCycleDispatcher()
    {
    }

    public void bind(ActivityLightCycle activitylightcycle)
    {
        activityLightCycles.add(activitylightcycle);
    }

    public volatile void bind(Object obj)
    {
        bind((ActivityLightCycle)obj);
    }

    public void onCreate(Activity activity, Bundle bundle)
    {
        for (Iterator iterator = activityLightCycles.iterator(); iterator.hasNext(); ((ActivityLightCycle)iterator.next()).onCreate(activity, bundle)) { }
    }

    public void onDestroy(Activity activity)
    {
        for (Iterator iterator = activityLightCycles.iterator(); iterator.hasNext(); ((ActivityLightCycle)iterator.next()).onDestroy(activity)) { }
    }

    public void onNewIntent(Activity activity, Intent intent)
    {
        for (Iterator iterator = activityLightCycles.iterator(); iterator.hasNext(); ((ActivityLightCycle)iterator.next()).onNewIntent(activity, intent)) { }
    }

    public boolean onOptionsItemSelected(Activity activity, MenuItem menuitem)
    {
        for (Iterator iterator = activityLightCycles.iterator(); iterator.hasNext();)
        {
            if (((ActivityLightCycle)iterator.next()).onOptionsItemSelected(activity, menuitem))
            {
                return true;
            }
        }

        return false;
    }

    public void onPause(Activity activity)
    {
        for (Iterator iterator = activityLightCycles.iterator(); iterator.hasNext(); ((ActivityLightCycle)iterator.next()).onPause(activity)) { }
    }

    public void onRestoreInstanceState(Activity activity, Bundle bundle)
    {
        for (Iterator iterator = activityLightCycles.iterator(); iterator.hasNext(); ((ActivityLightCycle)iterator.next()).onRestoreInstanceState(activity, bundle)) { }
    }

    public void onResume(Activity activity)
    {
        for (Iterator iterator = activityLightCycles.iterator(); iterator.hasNext(); ((ActivityLightCycle)iterator.next()).onResume(activity)) { }
    }

    public void onSaveInstanceState(Activity activity, Bundle bundle)
    {
        for (Iterator iterator = activityLightCycles.iterator(); iterator.hasNext(); ((ActivityLightCycle)iterator.next()).onSaveInstanceState(activity, bundle)) { }
    }

    public void onStart(Activity activity)
    {
        for (Iterator iterator = activityLightCycles.iterator(); iterator.hasNext(); ((ActivityLightCycle)iterator.next()).onStart(activity)) { }
    }

    public void onStop(Activity activity)
    {
        for (Iterator iterator = activityLightCycles.iterator(); iterator.hasNext(); ((ActivityLightCycle)iterator.next()).onStop(activity)) { }
    }
}
