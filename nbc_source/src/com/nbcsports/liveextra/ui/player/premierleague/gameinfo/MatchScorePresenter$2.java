// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.gameinfo;

import com.nbcsports.liveextra.content.models.overlay.premierleague.GameInfo;
import rx.functions.Func1;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.gameinfo:
//            MatchScorePresenter

class this._cls0
    implements Func1
{

    final MatchScorePresenter this$0;

    public Integer call(GameInfo gameinfo)
    {
        if (gameinfo == null)
        {
            return null;
        } else
        {
            return Integer.valueOf(gameinfo.getWeek());
        }
    }

    public volatile Object call(Object obj)
    {
        return call((GameInfo)obj);
    }

    ()
    {
        this$0 = MatchScorePresenter.this;
        super();
    }
}
