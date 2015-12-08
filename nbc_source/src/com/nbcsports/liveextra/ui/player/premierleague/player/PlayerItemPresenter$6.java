// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import android.databinding.ObservableInt;
import rx.Subscriber;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.player:
//            PlayerItemPresenter

class this._cls0 extends Subscriber
{

    final PlayerItemPresenter this$0;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
        Timber.d(throwable, "", new Object[0]);
    }

    public void onNext(com.nbcsports.liveextra.ui.player.premierleague.gameinfo.mViewModel mviewmodel)
    {
        if (!hasBinder() || mviewmodel == null)
        {
            return;
        } else
        {
            ((sBinder)PlayerItemPresenter.access$900(PlayerItemPresenter.this)).teamColor.set(mviewmodel.getColor());
            ((eamViewModel.getColor)PlayerItemPresenter.access$1000(PlayerItemPresenter.this)).teamId.set(mviewmodel.getTeamId());
            unsubscribe();
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((com.nbcsports.liveextra.ui.player.premierleague.gameinfo.mViewModel)obj);
    }

    eamViewModel()
    {
        this$0 = PlayerItemPresenter.this;
        super();
    }
}
