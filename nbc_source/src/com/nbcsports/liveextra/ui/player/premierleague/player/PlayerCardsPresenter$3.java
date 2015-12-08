// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import android.databinding.ObservableArrayList;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
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

    public volatile void onNext(Object obj)
    {
        onNext((List)obj);
    }

    public void onNext(List list)
    {
        if (!hasBinder() || CollectionUtils.isEmpty(list))
        {
            return;
        } else
        {
            ((sBinder)PlayerCardsPresenter.access$400(PlayerCardsPresenter.this)).homePlayers.clear();
            ((homePlayers)PlayerCardsPresenter.access$500(PlayerCardsPresenter.this)).homePlayers.addAll(list);
            return;
        }
    }

    ()
    {
        this$0 = PlayerCardsPresenter.this;
        super();
    }
}
