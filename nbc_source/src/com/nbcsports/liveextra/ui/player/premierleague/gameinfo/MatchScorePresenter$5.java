// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.gameinfo;

import rx.functions.Action1;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.gameinfo:
//            MatchScorePresenter, MatchInfoViewModel

class this._cls0
    implements Action1
{

    final MatchScorePresenter this$0;

    public void call(MatchInfoViewModel matchinfoviewmodel)
    {
        if (matchinfoviewmodel == null)
        {
            return;
        } else
        {
            MatchScorePresenter.access$300(MatchScorePresenter.this, matchinfoviewmodel);
            return;
        }
    }

    public volatile void call(Object obj)
    {
        call((MatchInfoViewModel)obj);
    }

    ()
    {
        this$0 = MatchScorePresenter.this;
        super();
    }
}
