// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.stats;

import android.util.Pair;
import com.google.gson.Gson;
import com.nbcsports.liveextra.content.models.overlay.premierleague.PremiereLeagueFeedName;
import com.nbcsports.liveextra.content.models.overlay.premierleague.TerritorialBreakdown;
import com.nbcsports.liveextra.content.overlay.OverlayPollingSubscriber;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.PremierLeaguePollingProvider;
import com.nbcsports.liveextra.ui.player.premierleague.events.EventsTimelineProvider;
import com.squareup.okhttp.OkHttpClient;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import rx.Observable;
import rx.functions.Func1;
import rx.functions.Func2;

public class TerritorialBreakdownProvider extends PremierLeaguePollingProvider
{
    public static class TerritorialBreakdownSubscriber extends OverlayPollingSubscriber
    {

        public TerritorialBreakdownSubscriber(OkHttpClient okhttpclient, Gson gson)
        {
            super(okhttpclient, gson, com/nbcsports/liveextra/content/models/overlay/premierleague/TerritorialBreakdown);
        }
    }


    private final EventsTimelineProvider timelineProvider;

    public TerritorialBreakdownProvider(PremierLeagueEngine premierleagueengine, TerritorialBreakdownSubscriber territorialbreakdownsubscriber, EventsTimelineProvider eventstimelineprovider)
    {
        super(premierleagueengine, territorialbreakdownsubscriber, PremiereLeagueFeedName.Territorial);
        timelineProvider = eventstimelineprovider;
    }

    public Observable getCurrentInterval()
    {
        return getObservable().flatMap(new Func1() {

            final TerritorialBreakdownProvider this$0;

            public volatile Object call(Object obj)
            {
                return call((TerritorialBreakdown)obj);
            }

            public Observable call(TerritorialBreakdown territorialbreakdown)
            {
                if (territorialbreakdown == null || CollectionUtils.isEmpty(territorialbreakdown.getTerritorialIntervals()))
                {
                    return null;
                } else
                {
                    return Observable.just(territorialbreakdown.getTerritorialIntervals());
                }
            }

            
            {
                this$0 = TerritorialBreakdownProvider.this;
                super();
            }
        }).withLatestFrom(timelineProvider.getInterval(), new Func2() {

            final TerritorialBreakdownProvider this$0;

            public com.nbcsports.liveextra.content.models.overlay.premierleague.TerritorialBreakdown.TerritorialInterval call(List list, Pair pair)
            {
                if (list != null && ((Integer)pair.first).intValue() != 0 && ((Integer)pair.second).intValue() != 0) goto _L2; else goto _L1
_L1:
                pair = null;
_L4:
                return pair;
_L2:
                int i;
                int j;
                j = (((Integer)pair.second).intValue() / 5) * 5;
                if (((Integer)pair.first).intValue() != 1)
                {
                    break; /* Loop/switch isn't completed */
                }
                i = j;
                if (j > 45)
                {
                    i = 45;
                }
_L5:
                com.nbcsports.liveextra.content.models.overlay.premierleague.TerritorialBreakdown.TerritorialInterval territorialinterval = (com.nbcsports.liveextra.content.models.overlay.premierleague.TerritorialBreakdown.TerritorialInterval)CollectionUtils.find(list, (new StringBuilder()).append("Int").append(i).toString(). new Predicate() {

                    final _cls1 this$1;
                    final String val$intervalTime;

                    public boolean evaluate(com.nbcsports.liveextra.content.models.overlay.premierleague.TerritorialBreakdown.TerritorialInterval territorialinterval)
                    {
                        return territorialinterval.getIntervalType().equals(intervalTime);
                    }

                    public volatile boolean evaluate(Object obj)
                    {
                        return evaluate((com.nbcsports.liveextra.content.models.overlay.premierleague.TerritorialBreakdown.TerritorialInterval)obj);
                    }

            
            {
                this$1 = final__pcls1;
                intervalTime = String.this;
                super();
            }
                });
                pair = territorialinterval;
                if (territorialinterval == null)
                {
                    pair = territorialinterval;
                    if (second.isLive())
                    {
                        pair = territorialinterval;
                        if (list.size() > 0)
                        {
                            return (com.nbcsports.liveextra.content.models.overlay.premierleague.TerritorialBreakdown.TerritorialInterval)list.get(0);
                        }
                    }
                }
                if (true) goto _L4; else goto _L3
_L3:
                i = j;
                if (j > 90)
                {
                    i = 90;
                }
                  goto _L5
                if (true) goto _L4; else goto _L6
_L6:
            }

            public volatile Object call(Object obj, Object obj1)
            {
                return call((List)obj, (Pair)obj1);
            }

            
            {
                this$0 = TerritorialBreakdownProvider.this;
                super();
            }
        });
    }

    public void showGoLive(boolean flag)
    {
    }

}
