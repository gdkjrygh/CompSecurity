// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.events;

import com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.TimeUtils;
import java.util.ArrayList;
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
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist = arraylist1;
        if (majoreventstimeline != null)
        {
            arraylist = arraylist1;
            if (!CollectionUtils.isEmpty(majoreventstimeline.getEvents()))
            {
                arraylist = new ArrayList(majoreventstimeline.getEvents());
            }
        }
        CollectionUtils.filter(arraylist, new Predicate() {

            final EventsTimelineProvider._cls1 this$1;

            public boolean evaluate(com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent timelineevent)
            {
                if (timelineevent != null && EventsTimelineProvider.access$000(this$0).getPlayHead() != null && timelineevent.getPeriod() != 14)
                {
                    timelineevent = DateTime.parse(TimeUtils.normalizeTimestamp(timelineevent.getTmStp()));
                    if (timelineevent.isBefore(EventsTimelineProvider.access$100(this$0).getPlayHead()) || timelineevent.equals(EventsTimelineProvider.access$200(this$0).getPlayHead()))
                    {
                        return true;
                    }
                }
                return false;
            }

            public volatile boolean evaluate(Object obj)
            {
                return evaluate((com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent)obj);
            }

            
            {
                this$1 = EventsTimelineProvider._cls1.this;
                super();
            }
        });
        return Observable.just(arraylist);
    }

    _cls1.this._cls1()
    {
        this$0 = EventsTimelineProvider.this;
        super();
    }
}
