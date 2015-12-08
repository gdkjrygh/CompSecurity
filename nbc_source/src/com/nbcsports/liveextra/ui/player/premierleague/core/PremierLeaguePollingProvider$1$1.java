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

class this._cls1
    implements Predicate
{

    final o this$1;

    public boolean evaluate(com.nbcsports.liveextra.content.models.overlay.premierleague.gSubscriber gsubscriber)
    {
        return gsubscriber.dName().equals(getFeedName());
    }

    public volatile boolean evaluate(Object obj)
    {
        return evaluate((com.nbcsports.liveextra.content.models.overlay.premierleague.)obj);
    }

    l.pollingSubscriber()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/nbcsports/liveextra/ui/player/premierleague/core/PremierLeaguePollingProvider$1

/* anonymous class */
    class PremierLeaguePollingProvider._cls1 extends Subscriber
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
            configurationinfo = (com.nbcsports.liveextra.content.models.overlay.premierleague.ConfigurationInfo.FeedInfo)CollectionUtils.find(configurationinfo.getLiveSources(), new PremierLeaguePollingProvider._cls1._cls1());
            PremierLeaguePollingProvider.access$002(PremierLeaguePollingProvider.this, configurationinfo);
            configureFeedVariables(configurationinfo.getBaseUrl(), configurationinfo.getPollIntervalSeconds());
            OverlayPollingSubscriber overlaypollingsubscriber = getPollingSubscriber();
            boolean flag;
            if (!engine.isLive() && configurationinfo.getFeedParameters().getDate() == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            overlaypollingsubscriber.suppressPoll(flag);
            pollingSubscriber.kick();
            unsubscribe();
        }

        public volatile void onNext(Object obj)
        {
            onNext((ConfigurationInfo)obj);
        }

            
            {
                this$0 = final_premierleaguepollingprovider;
                engine = premierleagueengine;
                pollingSubscriber = OverlayPollingSubscriber.this;
                super();
            }
    }

}
