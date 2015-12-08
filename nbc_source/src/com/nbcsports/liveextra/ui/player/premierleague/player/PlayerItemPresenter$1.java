// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import android.databinding.ObservableBoolean;
import com.nbcsports.liveextra.ui.player.premierleague.events.EventViewModel;
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

    public void onNext(com.nbcsports.liveextra.content.models.overlay.premierleague.melineEvent melineevent)
    {
        if (!hasBinder() || melineevent == null)
        {
            return;
        }
        if (melineevent.getType().contains("Red") || melineevent.getType().contains(EventViewModel.SECOND_YELLOW_CARD))
        {
            ((YELLOW_CARD)PlayerItemPresenter.access$000(PlayerItemPresenter.this)).redCard.set(true);
            ((redCard)PlayerItemPresenter.access$100(PlayerItemPresenter.this)).yellowCard.set(false);
            return;
        }
        if (melineevent.getType().contains("Yellow"))
        {
            ((ype)PlayerItemPresenter.access$200(PlayerItemPresenter.this)).redCard.set(false);
            ((redCard)PlayerItemPresenter.access$300(PlayerItemPresenter.this)).yellowCard.set(true);
            return;
        } else
        {
            ((yellowCard)PlayerItemPresenter.access$400(PlayerItemPresenter.this)).redCard.set(false);
            ((redCard)PlayerItemPresenter.access$500(PlayerItemPresenter.this)).yellowCard.set(false);
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((com.nbcsports.liveextra.content.models.overlay.premierleague.melineEvent)obj);
    }

    ine.TimelineEvent()
    {
        this$0 = PlayerItemPresenter.this;
        super();
    }
}
