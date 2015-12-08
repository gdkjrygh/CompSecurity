// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.gameinfo;

import com.nbcsports.liveextra.content.models.overlay.premierleague.TeamBoxScore;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.gameinfo:
//            TeamBoxScoreProvider

class this._cls0
    implements Func1
{

    final TeamBoxScoreProvider this$0;

    public volatile Object call(Object obj)
    {
        return call((TeamBoxScore)obj);
    }

    public Observable call(TeamBoxScore teamboxscore)
    {
        if (teamboxscore == null)
        {
            return null;
        } else
        {
            return Observable.just(teamboxscore.getScores());
        }
    }

    ()
    {
        this$0 = TeamBoxScoreProvider.this;
        super();
    }
}
