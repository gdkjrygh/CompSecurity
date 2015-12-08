// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerBoxScore;
import org.apache.commons.collections4.CollectionUtils;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.player:
//            PlayerBoxScoreProvider

class this._cls0
    implements Func1
{

    final PlayerBoxScoreProvider this$0;

    public volatile Object call(Object obj)
    {
        return call((PlayerBoxScore)obj);
    }

    public Observable call(PlayerBoxScore playerboxscore)
    {
        if (playerboxscore == null || CollectionUtils.isEmpty(playerboxscore.getStats()))
        {
            return Observable.empty();
        } else
        {
            return Observable.from(playerboxscore.getStats());
        }
    }

    ()
    {
        this$0 = PlayerBoxScoreProvider.this;
        super();
    }
}
