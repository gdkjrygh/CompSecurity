// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.trackers;

import me.lyft.android.analytics.IEvent;
import me.lyft.android.analytics.IEventTracker;
import me.lyft.android.analytics.RedshiftTrackerExtra;

// Referenced classes of package me.lyft.android.analytics.trackers:
//            MixpanelWrapper

public class RedshiftEventTracker
    implements IEventTracker
{

    private final MixpanelWrapper mixpanelWrapper;

    RedshiftEventTracker(MixpanelWrapper mixpanelwrapper)
    {
        mixpanelWrapper = mixpanelwrapper;
    }

    private void trackEvent(IEvent ievent)
    {
        mixpanelWrapper.trackEvent(ievent.getName(), ievent.getParameters());
    }

    public void flush()
    {
        mixpanelWrapper.flush();
    }

    public void track(IEvent ievent)
    {
        if ((RedshiftTrackerExtra)ievent.getExtra(me/lyft/android/analytics/RedshiftTrackerExtra) != null)
        {
            trackEvent(ievent);
        }
    }
}
