// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.playbyplay;

import com.nbcsports.liveextra.content.models.overlay.premierleague.Plays;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.TimeUtils;
import java.util.ArrayList;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import org.joda.time.DateTime;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.playbyplay:
//            PlayByPlayProvider

class this._cls0
    implements Func1
{

    final PlayByPlayProvider this$0;

    public volatile Object call(Object obj)
    {
        return call((Plays)obj);
    }

    public Observable call(Plays plays)
    {
        if (plays == null || CollectionUtils.isEmpty(plays.getPlays()))
        {
            return Observable.empty();
        } else
        {
            plays = new ArrayList(plays.getPlays());
            CollectionUtils.filter(plays, new Predicate() {

                final PlayByPlayProvider._cls1 this$1;

                public boolean evaluate(com.nbcsports.liveextra.content.models.overlay.premierleague.Plays.PlayByPlay playbyplay)
                {
                    while (PlayByPlayProvider.access$000(this$0).getPlayHead() == null || playbyplay.getPeriod() == 14) 
                    {
                        return false;
                    }
                    return DateTime.parse(TimeUtils.normalizeTimestamp(playbyplay.getTimeStamp())).isBefore(PlayByPlayProvider.access$100(this$0).getPlayHead());
                }

                public volatile boolean evaluate(Object obj)
                {
                    return evaluate((com.nbcsports.liveextra.content.models.overlay.premierleague.Plays.PlayByPlay)obj);
                }

            
            {
                this$1 = PlayByPlayProvider._cls1.this;
                super();
            }
            });
            return Observable.just(plays);
        }
    }

    _cls1.this._cls1()
    {
        this$0 = PlayByPlayProvider.this;
        super();
    }
}
