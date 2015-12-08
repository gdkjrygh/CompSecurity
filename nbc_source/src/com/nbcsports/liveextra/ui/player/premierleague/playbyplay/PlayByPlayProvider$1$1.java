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

class this._cls1
    implements Predicate
{

    final evaluate this$1;

    public boolean evaluate(com.nbcsports.liveextra.content.models.overlay.premierleague.is._cls1 _pcls1)
    {
        while (PlayByPlayProvider.access$000(_fld0).getPlayHead() == null || _pcls1.iod() == 14) 
        {
            return false;
        }
        return DateTime.parse(TimeUtils.normalizeTimestamp(_pcls1.eStamp())).isBefore(PlayByPlayProvider.access$100(_fld0).getPlayHead());
    }

    public volatile boolean evaluate(Object obj)
    {
        return evaluate((com.nbcsports.liveextra.content.models.overlay.premierleague.aluate)obj);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/nbcsports/liveextra/ui/player/premierleague/playbyplay/PlayByPlayProvider$1

/* anonymous class */
    class PlayByPlayProvider._cls1
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
                CollectionUtils.filter(plays, new PlayByPlayProvider._cls1._cls1());
                return Observable.just(plays);
            }
        }

            
            {
                this$0 = PlayByPlayProvider.this;
                super();
            }
    }

}
