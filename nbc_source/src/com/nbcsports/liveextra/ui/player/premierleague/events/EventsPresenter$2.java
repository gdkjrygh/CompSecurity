// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.events;

import java.util.List;
import rx.Subscriber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.events:
//            EventsPresenter, EventsView

class this._cls0 extends Subscriber
{

    final EventsPresenter this$0;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
    }

    public volatile void onNext(Object obj)
    {
        onNext((List)obj);
    }

    public void onNext(List list)
    {
        if (!hasView() || list == null)
        {
            return;
        } else
        {
            ((EventsView)EventsPresenter.access$300(EventsPresenter.this)).update(list);
            return;
        }
    }

    ()
    {
        this$0 = EventsPresenter.this;
        super();
    }
}
