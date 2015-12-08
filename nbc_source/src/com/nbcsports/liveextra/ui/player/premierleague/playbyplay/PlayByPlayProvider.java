// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.playbyplay;

import com.google.gson.Gson;
import com.nbcsports.liveextra.content.models.overlay.premierleague.Plays;
import com.nbcsports.liveextra.content.models.overlay.premierleague.PremiereLeagueFeedName;
import com.nbcsports.liveextra.content.overlay.OverlayPollingSubscriber;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.PremierLeaguePollingProvider;
import com.nbcsports.liveextra.ui.player.premierleague.core.TimeUtils;
import com.squareup.okhttp.OkHttpClient;
import java.util.ArrayList;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import org.joda.time.DateTime;
import rx.Observable;
import rx.functions.Func1;

public class PlayByPlayProvider extends PremierLeaguePollingProvider
{
    public static class PlayByPlaySubscriber extends OverlayPollingSubscriber
    {

        public PlayByPlaySubscriber(OkHttpClient okhttpclient, Gson gson)
        {
            super(okhttpclient, gson, com/nbcsports/liveextra/content/models/overlay/premierleague/Plays);
        }
    }


    public PlayByPlayProvider(PremierLeagueEngine premierleagueengine, PlayByPlaySubscriber playbyplaysubscriber)
    {
        super(premierleagueengine, playbyplaysubscriber, PremiereLeagueFeedName.Plays);
    }

    public Observable getPlayByPlay()
    {
        return getPlays().flatMap(new Func1() {

            final PlayByPlayProvider this$0;

            public volatile Object call(Object obj)
            {
                return call((Plays)obj);
            }

            public Observable call(Plays plays)
            {
                if (plays == null || CollectionUtils.isEmpty(plays.getPlays()))
                {
                    return Observable.empty();
                } else
                {
                    plays = new ArrayList(plays.getPlays());
                    CollectionUtils.filter(plays, new Predicate() {

                        final _cls1 this$1;

                        public boolean evaluate(com.nbcsports.liveextra.content.models.overlay.premierleague.Plays.PlayByPlay playbyplay)
                        {
                            while (
// JavaClassFileOutputException: get_constant: invalid tag

                        public volatile boolean evaluate(Object obj)
                        {
                            return evaluate((com.nbcsports.liveextra.content.models.overlay.premierleague.Plays.PlayByPlay)obj);
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    });
                    return Observable.just(plays);
                }
            }

            
            {
                this$0 = PlayByPlayProvider.this;
                super();
            }
        });
    }

    public Observable getPlays()
    {
        return getObservable();
    }

    public void showGoLive(boolean flag)
    {
    }


}
