// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.trackers;

import com.leanplum.Leanplum;
import me.lyft.android.analytics.IEvent;
import me.lyft.android.analytics.IEventTracker;
import me.lyft.android.analytics.LeanplumTrackerExtra;

public class LeanplumTracker
    implements IEventTracker
{

    public LeanplumTracker()
    {
    }

    private void trackEvent(IEvent ievent)
    {
        LeanplumTrackerExtra leanplumtrackerextra = (LeanplumTrackerExtra)ievent.getExtra(me/lyft/android/analytics/LeanplumTrackerExtra);
        Leanplum.track(ievent.getName(), leanplumtrackerextra.getValue(), leanplumtrackerextra.getInfo(), leanplumtrackerextra.getParameters());
    }

    public void flush()
    {
    }

    public void track(IEvent ievent)
    {
        if ((LeanplumTrackerExtra)ievent.getExtra(me/lyft/android/analytics/LeanplumTrackerExtra) != null)
        {
            trackEvent(ievent);
        }
    }
}
