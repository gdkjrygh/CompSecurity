// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.trackers;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import me.lyft.android.analytics.GoogleTrackerExtra;
import me.lyft.android.analytics.IEvent;
import me.lyft.android.analytics.IEventTracker;
import me.lyft.android.analytics.RedshiftTrackerExtra;
import me.lyft.android.logging.L;

public class LogEventTracker
    implements IEventTracker
{

    public LogEventTracker()
    {
    }

    private void appendEvent(StringBuilder stringbuilder, IEvent ievent)
    {
        Map map = ievent.getParameters();
        stringbuilder.append(String.format("event_name: client_%s%n", new Object[] {
            ievent.getName()
        }));
        String s;
        for (ievent = map.keySet().iterator(); ievent.hasNext(); stringbuilder.append(String.format("\t%s: %s%n", new Object[] {
    s, map.get(s)
})))
        {
            s = (String)ievent.next();
        }

    }

    public void flush()
    {
        L.i("flush", new Object[0]);
    }

    public void track(IEvent ievent)
    {
        StringBuilder stringbuilder = new StringBuilder();
        appendEvent(stringbuilder, ievent);
        if ((RedshiftTrackerExtra)ievent.getExtra(me/lyft/android/analytics/RedshiftTrackerExtra) != null)
        {
            stringbuilder.append("Has RedshiftTrackerExtra\n");
        }
        ievent = (GoogleTrackerExtra)ievent.getExtra(me/lyft/android/analytics/GoogleTrackerExtra);
        if (ievent != null)
        {
            stringbuilder.append(String.format("Has GoogleTrackerExtra: category: %s label: %s value: %d%n", new Object[] {
                ievent.getCategory(), ievent.getLabel(), ievent.getValue()
            }));
        }
        L.i(stringbuilder.toString(), new Object[0]);
    }
}
