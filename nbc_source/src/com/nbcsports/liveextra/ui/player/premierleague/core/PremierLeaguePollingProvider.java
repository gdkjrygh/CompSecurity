// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.core;

import android.net.Uri;
import com.nbcsports.liveextra.content.models.overlay.premierleague.ConfigurationInfo;
import com.nbcsports.liveextra.content.overlay.OverlayPollingProvider;
import com.nbcsports.liveextra.content.overlay.OverlayPollingSubscriber;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import org.joda.time.DateTime;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import timber.log.Timber;

public abstract class PremierLeaguePollingProvider extends OverlayPollingProvider
    implements com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine.Listener
{

    private final Subscription configSubscription;
    protected final PremierLeagueEngine engine;
    private com.nbcsports.liveextra.content.models.overlay.premierleague.ConfigurationInfo.FeedInfo feedInfo;

    public PremierLeaguePollingProvider(final PremierLeagueEngine engine, final OverlayPollingSubscriber pollingSubscriber, String s)
    {
        super(pollingSubscriber, s);
        this.engine = engine;
        engine.addListener(this);
        configSubscription = engine.getConfiguration().subscribe(new Subscriber() {

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
                configurationinfo = (com.nbcsports.liveextra.content.models.overlay.premierleague.ConfigurationInfo.FeedInfo)CollectionUtils.find(configurationinfo.getLiveSources(), new Predicate() {

                    final _cls1 this$1;

                    public boolean evaluate(com.nbcsports.liveextra.content.models.overlay.premierleague.ConfigurationInfo.FeedInfo feedinfo)
                    {
                        return feedinfo.getFeedName().equals(getFeedName());
                    }

                    public volatile boolean evaluate(Object obj)
                    {
                        return evaluate((com.nbcsports.liveextra.content.models.overlay.premierleague.ConfigurationInfo.FeedInfo)obj);
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
                feedInfo = configurationinfo;
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
                this$0 = PremierLeaguePollingProvider.this;
                engine = premierleagueengine;
                pollingSubscriber = overlaypollingsubscriber;
                super();
            }
        });
    }

    protected void finalize()
        throws Throwable
    {
        super.finalize();
        if (configSubscription != null)
        {
            configSubscription.unsubscribe();
        }
        engine.removeListener(this);
    }

    public Observable getObservable()
    {
        this;
        JVM INSTR monitorenter ;
        Observable observable = super.getObservable();
        this;
        JVM INSTR monitorexit ;
        return observable;
        Exception exception;
        exception;
        throw exception;
    }

    public String getUrl()
    {
        android.net.Uri.Builder builder = getUrlBuilder();
        if (builder == null)
        {
            return null;
        } else
        {
            return builder.build().toString();
        }
    }

    protected android.net.Uri.Builder getUrlBuilder()
    {
        android.net.Uri.Builder builder;
        if (pollingUrl == null)
        {
            builder = null;
        } else
        {
            android.net.Uri.Builder builder1 = Uri.parse(pollingUrl).buildUpon();
            com.nbcsports.liveextra.content.models.overlay.premierleague.ConfigurationInfo.FeedParams feedparams = feedInfo.getFeedParameters();
            builder1.appendQueryParameter("callback", "");
            if (feedparams.getGameId() != null)
            {
                builder1.appendQueryParameter("GameID", engine.getGameId());
            }
            builder = builder1;
            if (feedparams.getDate() != null)
            {
                DateTime datetime = engine.getPlayHead();
                if (datetime == null)
                {
                    Timber.d((new StringBuilder()).append("Playhead is null, cannot continue retrieving ").append(getPollingSubscriber().getResultClass().getSimpleName()).toString(), new Object[0]);
                    return null;
                } else
                {
                    builder1.appendQueryParameter("dt", datetime.withSecondOfMinute((datetime.getSecondOfMinute() / 30) * 30).secondOfMinute().roundFloorCopy().toString());
                    return builder1;
                }
            }
        }
        return builder;
    }

    public void onSeek()
    {
    }

    public void onSeekComplete()
    {
        getPollingSubscriber().kick();
    }

    public void showGoLive(boolean flag)
    {
    }


/*
    static com.nbcsports.liveextra.content.models.overlay.premierleague.ConfigurationInfo.FeedInfo access$002(PremierLeaguePollingProvider premierleaguepollingprovider, com.nbcsports.liveextra.content.models.overlay.premierleague.ConfigurationInfo.FeedInfo feedinfo)
    {
        premierleaguepollingprovider.feedInfo = feedinfo;
        return feedinfo;
    }

*/
}
