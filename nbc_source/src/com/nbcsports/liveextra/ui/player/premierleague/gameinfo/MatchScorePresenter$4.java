// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.gameinfo;

import rx.Subscriber;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.gameinfo:
//            MatchScorePresenter, MatchScoreView, MatchInfoViewModel

class this._cls0 extends Subscriber
{

    final MatchScorePresenter this$0;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
        Timber.d(throwable, "", new Object[0]);
    }

    public void onNext(MatchInfoViewModel matchinfoviewmodel)
    {
        if (!hasView())
        {
            return;
        } else
        {
            ((MatchScoreView)MatchScorePresenter.access$200(MatchScorePresenter.this)).bindTeamInfo(matchinfoviewmodel);
            unsubscribe();
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((MatchInfoViewModel)obj);
    }

    ()
    {
        this$0 = MatchScorePresenter.this;
        super();
    }
}
