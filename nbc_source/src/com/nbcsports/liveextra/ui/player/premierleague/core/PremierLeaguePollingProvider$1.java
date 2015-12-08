// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.core;

import com.nbcsports.liveextra.content.models.overlay.premierleague.ConfigurationInfo;
import com.nbcsports.liveextra.content.overlay.OverlayPollingSubscriber;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import rx.Subscriber;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.core:
//            PremierLeaguePollingProvider

class val.pollingSubscriber extends Subscriber
{

    final PremierLeaguePollingProvider this$0;
    final PremierLeagueEngine val$engine;
    final OverlayPollingSubscriber val$pollingSubscriber;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
        Timber.d(throwable, "", new Object[0]);
    }

    public void onNext(ConfigurationInfo configurationinfo)
    {
        if (configurationinfo == null)
        {
            return;
        }
        configurationinfo = (com.nbcsports.liveextra.content.models.overlay.premierleague.ingSubscriber)CollectionUtils.find(configurationinfo.getLiveSources(), new Predicate() {

            final PremierLeaguePollingProvider._cls1 this$1;

            public boolean evaluate(com.nbcsports.liveextra.content.models.overlay.premierleague.ConfigurationInfo.FeedInfo feedinfo)
            {
                return feedinfo.getFeedName().equals(getFeedName());
            }

            public volatile boolean evaluate(Object obj)
            {
                return evaluate((com.nbcsports.liveextra.content.models.overlay.premierleague.ConfigurationInfo.FeedInfo)obj);
            }

            
            {
                this$1 = PremierLeaguePollingProvider._cls1.this;
                super();
            }
        });
        PremierLeaguePollingProvider.access$002(PremierLeaguePollingProvider.this, configurationinfo);
        configureFeedVariables(configurationinfo.aseUrl(), configurationinfo.ollIntervalSeconds());
        OverlayPollingSubscriber overlaypollingsubscriber = getPollingSubscriber();
        boolean flag;
        if (!val$engine.isLive() && configurationinfo.eedParameters().tDate() == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        overlaypollingsubscriber.suppressPoll(flag);
        val$pollingSubscriber.kick();
        unsubscribe();
    }

    public volatile void onNext(Object obj)
    {
        onNext((ConfigurationInfo)obj);
    }

    _cls1.this._cls1()
    {
        this$0 = final_premierleaguepollingprovider;
        val$engine = premierleagueengine;
        val$pollingSubscriber = OverlayPollingSubscriber.this;
        super();
    }
}
