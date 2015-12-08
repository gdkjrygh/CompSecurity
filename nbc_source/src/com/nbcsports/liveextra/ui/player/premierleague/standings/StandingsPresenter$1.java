// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.standings;

import java.util.List;
import rx.Subscriber;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.standings:
//            StandingsPresenter, StandingsView

class this._cls0 extends Subscriber
{

    final StandingsPresenter this$0;

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
        if (StandingsPresenter.access$000(StandingsPresenter.this) == null || list == null)
        {
            return;
        } else
        {
            ((StandingsView)StandingsPresenter.access$100(StandingsPresenter.this)).bind(list);
            return;
        }
    }

    ()
    {
        this$0 = StandingsPresenter.this;
        super();
    }
}
