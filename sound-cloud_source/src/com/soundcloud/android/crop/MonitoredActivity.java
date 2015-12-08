// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crop;

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

abstract class MonitoredActivity extends Activity
{
    public static class LifeCycleAdapter
        implements LifeCycleListener
    {

        public void onActivityCreated(MonitoredActivity monitoredactivity)
        {
        }

        public void onActivityDestroyed(MonitoredActivity monitoredactivity)
        {
        }

        public void onActivityStarted(MonitoredActivity monitoredactivity)
        {
        }

        public void onActivityStopped(MonitoredActivity monitoredactivity)
        {
        }

        public LifeCycleAdapter()
        {
        }
    }

    public static interface LifeCycleListener
    {

        public abstract void onActivityCreated(MonitoredActivity monitoredactivity);

        public abstract void onActivityDestroyed(MonitoredActivity monitoredactivity);

        public abstract void onActivityStarted(MonitoredActivity monitoredactivity);

        public abstract void onActivityStopped(MonitoredActivity monitoredactivity);
    }


    private final ArrayList listeners = new ArrayList();

    MonitoredActivity()
    {
    }

    public void addLifeCycleListener(LifeCycleListener lifecyclelistener)
    {
        if (listeners.contains(lifecyclelistener))
        {
            return;
        } else
        {
            listeners.add(lifecyclelistener);
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        for (bundle = listeners.iterator(); bundle.hasNext(); ((LifeCycleListener)bundle.next()).onActivityCreated(this)) { }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((LifeCycleListener)iterator.next()).onActivityDestroyed(this)) { }
    }

    protected void onStart()
    {
        super.onStart();
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((LifeCycleListener)iterator.next()).onActivityStarted(this)) { }
    }

    protected void onStop()
    {
        super.onStop();
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((LifeCycleListener)iterator.next()).onActivityStopped(this)) { }
    }

    public void removeLifeCycleListener(LifeCycleListener lifecyclelistener)
    {
        listeners.remove(lifecyclelistener);
    }
}
