// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.gameinfo;

import rx.Subscriber;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.gameinfo:
//            GameInfoPresenter, GameInformationView, GameInfoViewModel

class this._cls0 extends Subscriber
{

    final GameInfoPresenter this$0;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
        Timber.d(throwable, "", new Object[0]);
    }

    public void onNext(GameInfoViewModel gameinfoviewmodel)
    {
        if (!hasView() || gameinfoviewmodel == null)
        {
            return;
        } else
        {
            ((GameInformationView)GameInfoPresenter.access$000(GameInfoPresenter.this)).bind(gameinfoviewmodel);
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((GameInfoViewModel)obj);
    }

    ()
    {
        this$0 = GameInfoPresenter.this;
        super();
    }
}
