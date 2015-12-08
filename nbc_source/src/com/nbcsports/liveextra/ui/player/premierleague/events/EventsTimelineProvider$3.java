// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.events;

import com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.TimeUtils;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import org.joda.time.DateTime;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.events:
//            EventsTimelineProvider

class this._cls0
    implements Func1
{

    final EventsTimelineProvider this$0;

    public volatile Object call(Object obj)
    {
        return call((MajorEventsTimeline)obj);
    }

    public Observable call(MajorEventsTimeline majoreventstimeline)
    {
        if (majoreventstimeline != null)
        {
            majoreventstimeline = new ArrayList(majoreventstimeline.getEvents());
            CollectionUtils.filter(majoreventstimeline, new Predicate() {

                final EventsTimelineProvider._cls3 this$1;

                public boolean evaluate(com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent timelineevent)
                {
                    while (EventsTimelineProvider.access$500(this$0).getPlayHead() == null || timelineevent.getPeriod() == 14) 
                    {
                        return false;
                    }
                    return DateTime.parse(TimeUtils.normalizeTimestamp(timelineevent.getTmStp())).isBefore(EventsTimelineProvider.access$600(this$0).getPlayHead());
                }

                public volatile boolean evaluate(Object obj)
                {
                    return evaluate((com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent)obj);
                }

            
            {
                this$1 = EventsTimelineProvider._cls3.this;
                super();
            }
            });
            if (!majoreventstimeline.isEmpty())
            {
                return Observable.just((com.nbcsports.liveextra.content.models.overlay.premierleague.ineEvent)majoreventstimeline.get(majoreventstimeline.size() - 1));
            }
        }
        return null;
    }

    _cls1.this._cls1()
    {
        this$0 = EventsTimelineProvider.this;
        super();
    }
}
