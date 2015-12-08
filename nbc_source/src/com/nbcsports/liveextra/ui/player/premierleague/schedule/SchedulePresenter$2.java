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

class this._cls0
    implements Func1
{

    final SchedulePresenter this$0;

    public volatile Object call(Object obj)
    {
        return call((com.nbcsports.liveextra.content.models.overlay.premierleague.)obj);
    }

    public Observable call(com.nbcsports.liveextra.content.models.overlay.premierleague. )
    {
        if ( == null)
        {
            return Observable.empty();
        } else
        {
             = new ArrayList();
            CollectionUtils.filter(, new Predicate() {

                final SchedulePresenter._cls2 this$1;

                public boolean evaluate(Schedule schedule)
                {
                    return !String.valueOf(schedule.getGameId()).equals(SchedulePresenter.access$200(this$0).getGameId());
                }

                public volatile boolean evaluate(Object obj)
                {
                    return evaluate((Schedule)obj);
                }

            
            {
                this$1 = SchedulePresenter._cls2.this;
                super();
            }
            });
            return Observable.just();
        }
    }

    _cls1.this._cls1()
    {
        this$0 = SchedulePresenter.this;
        super();
    }
}
