// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import android.databinding.ObservableField;
import java.util.Map;
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
        Timber.d(throwable, "Error loading formation", new Object[0]);
    }

    public volatile void onNext(Object obj)
    {
        onNext((Map)obj);
    }

    public void onNext(Map map)
    {
        if (!hasBinder() || map == null)
        {
            return;
        } else
        {
            ((sBinder)PlayerCardsPresenter.access$000(PlayerCardsPresenter.this)).homeFormation.set(map.get("H"));
            ((homeFormation)PlayerCardsPresenter.access$100(PlayerCardsPresenter.this)).awayFormation.set(map.get("A"));
            return;
        }
    }

    ()
    {
        this$0 = PlayerCardsPresenter.this;
        super();
    }
}
