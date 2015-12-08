// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.gameinfo;

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

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.gameinfo:
//            MatchScorePresenter

class this._cls1
    implements Predicate
{

    final imelineEvent this$1;

    public boolean evaluate(com.nbcsports.liveextra.content.models.overlay.premierleague.ineEvent ineevent)
    {
        while (MatchScorePresenter.access$900(_fld0).getPlayHead() == null || ineevent.getPeriod() == 14) 
        {
            return false;
        }
        return DateTime.parse(TimeUtils.normalizeTimestamp(ineevent.getTmStp())).isBefore(MatchScorePresenter.access$1000(_fld0).getPlayHead());
    }

    public volatile boolean evaluate(Object obj)
    {
        return evaluate((com.nbcsports.liveextra.content.models.overlay.premierleague.ineEvent)obj);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/nbcsports/liveextra/ui/player/premierleague/gameinfo/MatchScorePresenter$11

/* anonymous class */
    class MatchScorePresenter._cls11
        implements Func1
    {

        final MatchScorePresenter this$0;

        public volatile Object call(Object obj)
        {
            return call((MajorEventsTimeline)obj);
        }

        public Observable call(MajorEventsTimeline majoreventstimeline)
        {
            if (majoreventstimeline == null)
            {
                return null;
            }
            majoreventstimeline = new ArrayList(majoreventstimeline.getEvents());
            CollectionUtils.filter(majoreventstimeline, new MatchScorePresenter._cls11._cls1());
            if (majoreventstimeline.isEmpty())
            {
                return Observable.just(null);
            } else
            {
                return Observable.just((com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent)majoreventstimeline.get(majoreventstimeline.size() - 1));
            }
        }

            
            {
                this$0 = MatchScorePresenter.this;
                super();
            }
    }

}
