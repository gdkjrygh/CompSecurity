// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.events;

import android.util.Pair;
import com.google.gson.Gson;
import com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline;
import com.nbcsports.liveextra.content.models.overlay.premierleague.PremiereLeagueFeedName;
import com.nbcsports.liveextra.content.overlay.OverlayPollingSubscriber;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.PremierLeaguePollingProvider;
import com.nbcsports.liveextra.ui.player.premierleague.core.TimeUtils;
import com.squareup.okhttp.OkHttpClient;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import rx.Observable;
import rx.functions.Func1;

public class EventsTimelineProvider extends PremierLeaguePollingProvider
{
    public static class MajorEventsTimelineSubscriber extends OverlayPollingSubscriber
    {

        public MajorEventsTimelineSubscriber(OkHttpClient okhttpclient, Gson gson)
        {
            super(okhttpclient, gson, com/nbcsports/liveextra/content/models/overlay/premierleague/MajorEventsTimeline);
        }
    }


    public EventsTimelineProvider(PremierLeagueEngine premierleagueengine, MajorEventsTimelineSubscriber majoreventstimelinesubscriber)
    {
        super(premierleagueengine, majoreventstimelinesubscriber, PremiereLeagueFeedName.MajorEventsTimeline);
    }

    public Observable getEvents()
    {
        return getMajorEventsTimeline().flatMap(new Func1() {

            final EventsTimelineProvider this$0;

            public volatile Object call(Object obj)
            {
                return call((MajorEventsTimeline)obj);
            }

            public Observable call(MajorEventsTimeline majoreventstimeline)
            {
                ArrayList arraylist1 = new ArrayList();
                ArrayList arraylist = arraylist1;
                if (majoreventstimeline != null)
                {
                    arraylist = arraylist1;
                    if (!CollectionUtils.isEmpty(majoreventstimeline.getEvents()))
                    {
                        arraylist = new ArrayList(majoreventstimeline.getEvents());
                    }
                }
                CollectionUtils.filter(arraylist, new Predicate() {

                    final _cls1 this$1;

                    public boolean evaluate(com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent timelineevent)
                    {
                        if (timelineevent != null && 
// JavaClassFileOutputException: get_constant: invalid tag

                    public volatile boolean evaluate(Object obj)
                    {
                        return evaluate((com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent)obj);
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
                return Observable.just(arraylist);
            }

            
            {
                this$0 = EventsTimelineProvider.this;
                super();
            }
        });
    }

    public Observable getInterval()
    {
        return getMajorEventsTimeline().flatMap(new Func1() {

            final EventsTimelineProvider this$0;

            public volatile Object call(Object obj)
            {
                return call((MajorEventsTimeline)obj);
            }

            public Observable call(MajorEventsTimeline majoreventstimeline)
            {
                if (majoreventstimeline != null)
                {
                    majoreventstimeline = new ArrayList(majoreventstimeline.getEvents());
                    CollectionUtils.filter(majoreventstimeline, new Predicate() {

                        final _cls3 this$1;

                        public boolean evaluate(com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent timelineevent)
                        {
                            while (
// JavaClassFileOutputException: get_constant: invalid tag

                        public volatile boolean evaluate(Object obj)
                        {
                            return evaluate((com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent)obj);
                        }

            
            {
                this$1 = _cls3.this;
                super();
            }
                    });
                    if (!majoreventstimeline.isEmpty())
                    {
                        return Observable.just((com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent)majoreventstimeline.get(majoreventstimeline.size() - 1));
                    }
                }
                return null;
            }

            
            {
                this$0 = EventsTimelineProvider.this;
                super();
            }
        }).map(new Func1() {

            final EventsTimelineProvider this$0;

            public Pair call(com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent timelineevent)
            {
                if (timelineevent == null || valueOf.getPlayHead() == null)
                {
                    return new Pair(Integer.valueOf(0), Integer.valueOf(0));
                } else
                {
                    DateTime datetime = valueOf.getPlayHead();
                    int i = Minutes.minutesBetween(DateTime.parse(TimeUtils.normalizeTimestamp(timelineevent.getTmStp())), datetime).getMinutes();
                    return new Pair(Integer.valueOf(timelineevent.getPeriod()), Integer.valueOf(timelineevent.getClock() + i));
                }
            }

            public volatile Object call(Object obj)
            {
                return call((com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent)obj);
            }

            
            {
                this$0 = EventsTimelineProvider.this;
                super();
            }
        });
    }

    public Observable getMajorEventsTimeline()
    {
        return getObservable();
    }

    public void showGoLive(boolean flag)
    {
    }







}
