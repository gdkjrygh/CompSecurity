// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.stats;

import android.databinding.ObservableArrayList;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import rx.Subscriber;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.stats:
//            StatsPresenter

class this._cls0 extends Subscriber
{

    final StatsPresenter this$0;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
        Timber.d(throwable, "Error setting stats", new Object[0]);
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
            ((sBinder)StatsPresenter.access$900(StatsPresenter.this)).statsList.clear();
            ((statsList)StatsPresenter.access$1000(StatsPresenter.this)).statsList.addAll(list);
            return;
        }
    }

    ()
    {
        this$0 = StatsPresenter.this;
        super();
    }
}
