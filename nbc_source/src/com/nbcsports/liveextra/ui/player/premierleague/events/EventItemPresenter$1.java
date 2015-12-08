// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.events;

import android.databinding.ObservableField;
import com.nbcsports.liveextra.ui.player.premierleague.player.PlayerBioViewModel;
import rx.Subscriber;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.events:
//            EventItemPresenter

class line.TimelineEvent extends Subscriber
{

    final EventItemPresenter this$0;
    final com.nbcsports.liveextra.content.models.overlay.premierleague.imelineEvent val$event;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
        Timber.d(throwable, "Error setting event view", new Object[0]);
    }

    public void onNext(com.nbcsports.liveextra.content.models.overlay.premierleague.imelineEvent imelineevent)
    {
        if (!hasBinder() || imelineevent == null)
        {
            return;
        } else
        {
            imelineevent = PlayerBioViewModel.fromPlayer(imelineevent);
            EventItemPresenter.access$002(EventItemPresenter.this, EventItemPresenter.access$100(EventItemPresenter.this, val$event));
            ((val.event)EventItemPresenter.access$300(EventItemPresenter.this)).time.set(EventItemPresenter.access$200(EventItemPresenter.this, val$event));
            ((val.event)EventItemPresenter.access$400(EventItemPresenter.this)).firstName.set(imelineevent.getFirstName());
            ((tFirstName)EventItemPresenter.access$500(EventItemPresenter.this)).lastName.set(imelineevent.getLastName());
            ((tLastName)EventItemPresenter.access$600(EventItemPresenter.this)).position.set(((PlayerBioViewModel) (imelineevent)).position);
            unsubscribe();
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((com.nbcsports.liveextra.content.models.overlay.premierleague.)obj);
    }

    line.TimelineEvent()
    {
        this$0 = final_eventitempresenter;
        val$event = com.nbcsports.liveextra.content.models.overlay.premierleague.imelineEvent.this;
        super();
    }
}
