// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.gameinfo;

import com.nbcsports.liveextra.content.models.overlay.premierleague.TeamInfo;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.gameinfo:
//            TeamInfoProvider

class val.homeAway
    implements Func1
{

    final TeamInfoProvider this$0;
    final String val$homeAway;

    public volatile Object call(Object obj)
    {
        return call((TeamInfo)obj);
    }

    public Observable call(TeamInfo teaminfo)
    {
        if (val$homeAway.equals("H"))
        {
            teaminfo = teaminfo.getTeamHome();
        } else
        {
            teaminfo = teaminfo.getTeamAway();
        }
        return Observable.just(teaminfo);
    }

    Q()
    {
        this$0 = final_teaminfoprovider;
        val$homeAway = String.this;
        super();
    }
}
