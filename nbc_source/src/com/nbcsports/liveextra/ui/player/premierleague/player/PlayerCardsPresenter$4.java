// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import com.nbcsports.liveextra.ui.player.premierleague.gameinfo.MatchInfoViewModel;
import rx.Subscriber;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.player:
//            PlayerCardsPresenter

class this._cls0 extends Subscriber
{

    final PlayerCardsPresenter this$0;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
        Timber.d(throwable, "", new Object[0]);
    }

    public void onNext(MatchInfoViewModel matchinfoviewmodel)
    {
        if (!hasBinder() || matchinfoviewmodel == null)
        {
            return;
        } else
        {
            ((sBinder)PlayerCardsPresenter.access$600(PlayerCardsPresenter.this)).homeAbbr.set(matchinfoviewmodel.getHome().getAbbr());
            ((amViewModel.getAbbr)PlayerCardsPresenter.access$700(PlayerCardsPresenter.this)).awayAbbr.set(matchinfoviewmodel.getAway().getAbbr());
            ((amViewModel.getAbbr)PlayerCardsPresenter.access$800(PlayerCardsPresenter.this)).homeColor.set(matchinfoviewmodel.getHome().getColor());
            ((amViewModel.getColor)PlayerCardsPresenter.access$900(PlayerCardsPresenter.this)).awayColor.set(matchinfoviewmodel.getAway().getColor());
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((MatchInfoViewModel)obj);
    }

    amViewModel()
    {
        this$0 = PlayerCardsPresenter.this;
        super();
    }
}
