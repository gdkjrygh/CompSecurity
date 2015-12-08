// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.events;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import com.nbcsports.liveextra.ui.player.AbstractPresenterListener;
import com.nbcsports.liveextra.ui.player.PlayerPresenter;
import com.nbcsports.liveextra.ui.player.PlayerPresenterListener;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.PremierLeagueOverlayBindingPresenter;
import com.nbcsports.liveextra.ui.player.premierleague.core.TimeUtils;
import com.nbcsports.liveextra.ui.player.premierleague.gameinfo.TeamInfoProvider;
import com.nbcsports.liveextra.ui.player.premierleague.player.PlayerBioViewModel;
import com.nbcsports.liveextra.ui.player.premierleague.player.PlayerInfoProvider;
import org.joda.time.DateTime;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import timber.log.Timber;

public class EventItemPresenter extends PremierLeagueOverlayBindingPresenter
{

    private com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent event;
    private final PlayerInfoProvider playerProvider;
    private AbstractPresenterListener presenterListener;
    private final TeamInfoProvider teamProvider;
    private DateTime timestamp;

    public EventItemPresenter(PremierLeagueEngine premierleagueengine, PlayerPresenter playerpresenter, TeamInfoProvider teaminfoprovider, PlayerInfoProvider playerinfoprovider)
    {
        super(premierleagueengine, playerpresenter);
        teamProvider = teaminfoprovider;
        playerProvider = playerinfoprovider;
    }

    private void bindGameEvent(com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent timelineevent)
    {
        if (!hasBinder())
        {
            return;
        } else
        {
            ((EventItemView.Binder)binder).time.set(getGameTime(timelineevent));
            ((EventItemView.Binder)binder).isStart.set(timelineevent.getEventType().equals("StartHalf"));
            return;
        }
    }

    private void bindPlayerEvent(final com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent event)
    {
        addSubscription(playerProvider.getPlayer(event.getPid()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

            final EventItemPresenter this$0;
            final com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent val$event;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
                Timber.d(throwable, "Error setting event view", new Object[0]);
            }

            public void onNext(com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerInfo.Player player)
            {
                if (!hasBinder() || player == null)
                {
                    return;
                } else
                {
                    player = PlayerBioViewModel.fromPlayer(player);
                    timestamp = getTimeStamp(event);
                    ((EventItemView.Binder)fromPlayer).time.set(getGameTime(event));
                    ((EventItemView.Binder)fromPlayer).firstName.set(player.getFirstName());
                    ((EventItemView.Binder)fromPlayer).lastName.set(player.getLastName());
                    ((EventItemView.Binder)fromPlayer).position.set(((PlayerBioViewModel) (player)).position);
                    unsubscribe();
                    return;
                }
            }

            public volatile void onNext(Object obj)
            {
                onNext((com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerInfo.Player)obj);
            }

            
            {
                this$0 = EventItemPresenter.this;
                event = timelineevent;
                super();
            }
        }));
    }

    private void bindTeam(com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent timelineevent)
    {
        addSubscription(teamProvider.getTeam(timelineevent.getHa()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

            final EventItemPresenter this$0;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
                Timber.d(throwable, "Error setting team on event view", new Object[0]);
            }

            public void onNext(com.nbcsports.liveextra.content.models.overlay.premierleague.TeamInfo.Team team)
            {
                if (!hasBinder() || team == null)
                {
                    return;
                } else
                {
                    team = com.nbcsports.liveextra.ui.player.premierleague.gameinfo.MatchInfoViewModel.TeamViewModel.fromTeam(team);
                    ((EventItemView.Binder)access$700).teamAbbr.set(team.getAbbr());
                    ((EventItemView.Binder)access$700).teamIcon.set(team.getIcon());
                    unsubscribe();
                    return;
                }
            }

            public volatile void onNext(Object obj)
            {
                onNext((com.nbcsports.liveextra.content.models.overlay.premierleague.TeamInfo.Team)obj);
            }

            
            {
                this$0 = EventItemPresenter.this;
                super();
            }
        }));
    }

    private String getGameTime(com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent timelineevent)
    {
        return TimeUtils.getGameTime(timelineevent.getPeriod(), timelineevent.getClock());
    }

    private DateTime getTimeStamp(com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent timelineevent)
    {
        if (timelineevent.getPeriod() == 14)
        {
            return null;
        } else
        {
            return DateTime.parse(TimeUtils.normalizeTimestamp(timelineevent.getTmStp()));
        }
    }

    protected PlayerPresenterListener getPresenterListener()
    {
        if (presenterListener == null)
        {
            presenterListener = new AbstractPresenterListener() {

                final EventItemPresenter this$0;

                public void onAdBreakComplete()
                {
                    super.onAdBreakComplete();
                    if (!hasBinder())
                    {
                        return;
                    } else
                    {
                        ((EventItemView.Binder)
// JavaClassFileOutputException: get_constant: invalid tag

                public void onAdBreakStart()
                {
                    onAdBreakStart();
                    if (!hasBinder())
                    {
                        return;
                    } else
                    {
                        ((EventItemView.Binder)
// JavaClassFileOutputException: get_constant: invalid tag

                public void onPlayComplete()
                {
                    onPlayComplete();
                    if (!hasBinder())
                    {
                        return;
                    } else
                    {
                        ((EventItemView.Binder)
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = EventItemPresenter.this;
                super();
            }
            };
        }
        return presenterListener;
    }

    public void load()
    {
        String s;
        byte byte0;
        if (event == null)
        {
            return;
        }
        s = event.getEventType();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 48
    //                   -125692011: 89
    //                   57044878: 103;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_103;
_L4:
        switch (byte0)
        {
        default:
            bindPlayerEvent(event);
            bindTeam(event);
            return;

        case 0: // '\0'
        case 1: // '\001'
            bindGameEvent(event);
            break;
        }
        break MISSING_BLOCK_LABEL_125;
_L2:
        if (s.equals("StartHalf"))
        {
            byte0 = 0;
        }
          goto _L4
        if (s.equals("EndHalf"))
        {
            byte0 = 1;
        }
          goto _L4
    }

    public void seek()
    {
        if (timestamp == null)
        {
            timestamp = engine.getEncoderStartTime();
        }
        engine.seekTo(timestamp);
    }

    public void setEvent(com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent timelineevent)
    {
        event = timelineevent;
        if (hasBinder())
        {
            load();
        }
    }

    public volatile void takeView(android.databinding.Observable observable)
    {
        takeView((EventItemView.Binder)observable);
    }

    public void takeView(EventItemView.Binder binder)
    {
        takeView(binder);
        binder = binder.isSeekEnabled;
        boolean flag;
        if (!playerPresenter.isInAdBreak())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        binder.set(flag);
    }


/*
    static DateTime access$002(EventItemPresenter eventitempresenter, DateTime datetime)
    {
        eventitempresenter.timestamp = datetime;
        return datetime;
    }

*/











}
