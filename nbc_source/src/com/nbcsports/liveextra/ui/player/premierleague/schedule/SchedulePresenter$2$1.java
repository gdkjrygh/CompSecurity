// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.schedule;

import com.nbcsports.liveextra.content.models.overlay.premierleague.Schedule;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import java.util.ArrayList;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.schedule:
//            SchedulePresenter

class this._cls1
    implements Predicate
{

    final evaluate this$1;

    public boolean evaluate(Schedule schedule)
    {
        return !String.valueOf(schedule.getGameId()).equals(SchedulePresenter.access$200(_fld0).getGameId());
    }

    public volatile boolean evaluate(Object obj)
    {
        return evaluate((Schedule)obj);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/nbcsports/liveextra/ui/player/premierleague/schedule/SchedulePresenter$2

/* anonymous class */
    class SchedulePresenter._cls2
        implements Func1
    {

        final SchedulePresenter this$0;

        public volatile Object call(Object obj)
        {
            return call((com.nbcsports.liveextra.content.models.overlay.premierleague.Schedule.Collection)obj);
        }

        public Observable call(com.nbcsports.liveextra.content.models.overlay.premierleague.Schedule.Collection collection)
        {
            if (collection == null)
            {
                return Observable.empty();
            } else
            {
                collection = new ArrayList(collection);
                CollectionUtils.filter(collection, new SchedulePresenter._cls2._cls1());
                return Observable.just(collection);
            }
        }

            
            {
                this$0 = SchedulePresenter.this;
                super();
            }
    }

}
