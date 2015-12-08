// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.events;

import android.util.Pair;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.TimeUtils;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import rx.functions.Func1;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.events:
//            EventsTimelineProvider

class this._cls0
    implements Func1
{

    final EventsTimelineProvider this$0;

    public Pair call(com.nbcsports.liveextra.content.models.overlay.premierleague.ineEvent ineevent)
    {
        if (ineevent == null || EventsTimelineProvider.access$300(EventsTimelineProvider.this).getPlayHead() == null)
        {
            return new Pair(Integer.valueOf(0), Integer.valueOf(0));
        } else
        {
            DateTime datetime = EventsTimelineProvider.access$400(EventsTimelineProvider.this).getPlayHead();
            int i = Minutes.minutesBetween(DateTime.parse(TimeUtils.normalizeTimestamp(ineevent.getTmStp())), datetime).getMinutes();
            return new Pair(Integer.valueOf(ineevent.getPeriod()), Integer.valueOf(ineevent.getClock() + i));
        }
    }

    public volatile Object call(Object obj)
    {
        return call((com.nbcsports.liveextra.content.models.overlay.premierleague.ineEvent)obj);
    }

    .TimelineEvent()
    {
        this$0 = EventsTimelineProvider.this;
        super();
    }
}
