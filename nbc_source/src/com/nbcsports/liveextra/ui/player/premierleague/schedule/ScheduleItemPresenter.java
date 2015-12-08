// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.schedule;

import android.view.View;
import com.nbcsports.liveextra.ui.core.BasePresenter;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.schedule:
//            ScheduleViewModel, ScheduleService, ScheduleItemView

public class ScheduleItemPresenter extends BasePresenter
{

    private final ScheduleService service;
    private ScheduleViewModel viewModel;

    public ScheduleItemPresenter(ScheduleService scheduleservice)
    {
        service = scheduleservice;
    }

    protected void load()
    {
        if (viewModel == null)
        {
            return;
        } else
        {
            addSubscription(service.getEventListing(viewModel.gameId).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

                final ScheduleItemPresenter this$0;

                public void onCompleted()
                {
                }

                public void onError(Throwable throwable)
                {
                    Timber.d(throwable, "Error setting splash data", new Object[0]);
                }

                public void onNext(SplashData.EventListing eventlisting)
                {
                    if (!hasView() || 
// JavaClassFileOutputException: get_constant: invalid tag

                public volatile void onNext(Object obj)
                {
                    onNext((SplashData.EventListing)obj);
                }

            
            {
                this$0 = ScheduleItemPresenter.this;
                super();
            }
            }));
            return;
        }
    }

    public void setViewModel(ScheduleViewModel scheduleviewmodel)
    {
        viewModel = scheduleviewmodel;
        if (hasView())
        {
            load();
        }
    }



}
