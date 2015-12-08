// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.schedule;

import android.view.View;
import com.nbcsports.liveextra.content.models.overlay.premierleague.Schedule;
import com.nbcsports.liveextra.ui.player.PlayerPresenter;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.PremierLeagueOverlayPresenter;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.schedule:
//            ScheduleProvider, ScheduleViewModel, ScheduleView

public class SchedulePresenter extends PremierLeagueOverlayPresenter
{

    private final ScheduleProvider provider;

    public SchedulePresenter(PremierLeagueEngine premierleagueengine, PlayerPresenter playerpresenter, ScheduleProvider scheduleprovider)
    {
        super(premierleagueengine, playerpresenter);
        provider = scheduleprovider;
    }

    private void loadScores()
    {
        addSubscription(provider.getObservable().flatMap(new Func1() {

            final SchedulePresenter this$0;

            public volatile Object call(Object obj)
            {
                return call((com.nbcsports.liveextra.content.models.overlay.premierleague.Schedule.Collection)obj);
            }

            public Observable call(com.nbcsports.liveextra.content.models.overlay.premierleague.Schedule.Collection collection)
            {
                if (collection == null)
                {
                    return Observable.empty();
                } else
                {
                    collection = new ArrayList(collection);
                    CollectionUtils.filter(collection, new Predicate() {

                        final _cls2 this$1;

                        public boolean evaluate(Schedule schedule)
                        {
                            return !String.valueOf(schedule.getGameId()).equals(
// JavaClassFileOutputException: get_constant: invalid tag

                        public volatile boolean evaluate(Object obj)
                        {
                            return evaluate((Schedule)obj);
                        }

            
            {
                this$1 = _cls2.this;
                super();
            }
                    });
                    return Observable.just(collection);
                }
            }

            
            {
                this$0 = SchedulePresenter.this;
                super();
            }
        }).map(ScheduleViewModel.fromSchedule()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

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
                if (
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = SchedulePresenter.this;
                super();
            }
        }));
    }

    protected void load()
    {
        loadScores();
    }

    public void showGoLive(boolean flag)
    {
    }



}
