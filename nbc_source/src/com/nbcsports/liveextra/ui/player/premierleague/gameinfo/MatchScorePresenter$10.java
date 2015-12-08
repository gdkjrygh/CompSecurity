// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.gameinfo;

import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.TimeUtils;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import org.joda.time.Seconds;
import rx.functions.Func1;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.gameinfo:
//            MatchScorePresenter

class this._cls0
    implements Func1
{

    final MatchScorePresenter this$0;

    public volatile Object call(Object obj)
    {
        return call((com.nbcsports.liveextra.content.models.overlay.premierleague.elineEvent)obj);
    }

    public String call(com.nbcsports.liveextra.content.models.overlay.premierleague.elineEvent elineevent)
    {
        if (elineevent == null || MatchScorePresenter.access$700(MatchScorePresenter.this).getPlayHead() == null)
        {
            return "0'";
        }
        if (elineevent.getEventType().equals("EndHalf"))
        {
            if (elineevent.getPeriod() == 1)
            {
                return TimeUtils.getGameTime(elineevent.getPeriod(), elineevent.getClock());
            } else
            {
                return "F";
            }
        }
        DateTime datetime = MatchScorePresenter.access$800(MatchScorePresenter.this).getPlayHead();
        DateTime datetime1 = DateTime.parse(TimeUtils.normalizeTimestamp(elineevent.getTmStp()));
        int j = Minutes.minutesBetween(datetime1, datetime).getMinutes();
        int i = j;
        if (Seconds.secondsBetween(datetime1, datetime).getSeconds() - j * 60 > 45)
        {
            i = j + 1;
        }
        return TimeUtils.getGameTime(elineevent.getPeriod(), elineevent.getClock() + i);
    }

    .TimelineEvent()
    {
        this$0 = MatchScorePresenter.this;
        super();
    }
}
