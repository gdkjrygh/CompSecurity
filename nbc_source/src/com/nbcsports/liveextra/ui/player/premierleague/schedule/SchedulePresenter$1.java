// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.schedule;

import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import rx.Subscriber;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.schedule:
//            SchedulePresenter, ScheduleView

class this._cls0 extends Subscriber
{

    final SchedulePresenter this$0;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
        Timber.d(throwable, "Error retrieving schedule", new Object[0]);
    }

    public volatile void onNext(Object obj)
    {
        onNext((List)obj);
    }

    public void onNext(List list)
    {
        if (SchedulePresenter.access$000(SchedulePresenter.this) == null || CollectionUtils.isEmpty(list))
        {
            return;
        } else
        {
            ((ScheduleView)SchedulePresenter.access$100(SchedulePresenter.this)).update(list);
            return;
        }
    }

    ()
    {
        this$0 = SchedulePresenter.this;
        super();
    }
}
