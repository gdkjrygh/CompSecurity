// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.events;

import android.view.View;
import com.nbcsports.liveextra.content.models.overlay.premierleague.TeamInfo;
import com.nbcsports.liveextra.ui.player.AbstractPresenterListener;
import com.nbcsports.liveextra.ui.player.PlayerPresenter;
import com.nbcsports.liveextra.ui.player.PlayerPresenterListener;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.PremierLeagueOverlayPresenter;
import com.nbcsports.liveextra.ui.player.premierleague.gameinfo.TeamInfoProvider;
import java.util.List;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.events:
//            EventsTimelineProvider, EventsView

public class EventsPresenter extends PremierLeagueOverlayPresenter
    implements com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine.Listener
{

    private final TeamInfoProvider teamInfoProvider;
    private final EventsTimelineProvider timelineProvider;

    public EventsPresenter(PremierLeagueEngine premierleagueengine, PlayerPresenter playerpresenter, TeamInfoProvider teaminfoprovider, EventsTimelineProvider eventstimelineprovider)
    {
        super(premierleagueengine, playerpresenter);
        teamInfoProvider = teaminfoprovider;
        timelineProvider = eventstimelineprovider;
    }

    private void loadEvents()
    {
        addSubscription(timelineProvider.getEvents().onBackpressureDrop().observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

            final EventsPresenter this$0;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
            }

            public volatile void onNext(Object obj)
            {
                onNext((List)obj);
            }

            public void onNext(List list)
            {
                if (!hasView() || list == null)
                {
                    return;
                } else
                {
                    ((EventsView)access$300).update(list);
                    return;
                }
            }

            
            {
                this$0 = EventsPresenter.this;
                super();
            }
        }));
    }

    private void loadPrematch()
    {
        addSubscription(teamInfoProvider.getTeamInfo().observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

            final EventsPresenter this$0;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
            }

            public void onNext(TeamInfo teaminfo)
            {
                if (!hasView())
                {
                    return;
                }
                ((EventsView)).bindPrematch(teaminfo.getTeamHome().getAbbreviation(), teaminfo.getTeamAway().getAbbreviation());
                teaminfo = (EventsView);
                boolean flag;
                if (!EventsPresenter.this.TeamInfo$Team.isInAdBreak())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                teaminfo.enablePrematch(flag);
            }

            public volatile void onNext(Object obj)
            {
                onNext((TeamInfo)obj);
            }

            
            {
                this$0 = EventsPresenter.this;
                super();
            }
        }));
    }

    protected PlayerPresenterListener getPresenterListener()
    {
        return new AbstractPresenterListener() {

            final EventsPresenter this$0;

            public void onAdBreakComplete()
            {
                super.onAdBreakComplete();
                if (!hasView())
                {
                    return;
                } else
                {
                    ((EventsView)enablePrematch).enablePrematch(true);
                    return;
                }
            }

            public void onAdBreakStart()
            {
                super.onAdBreakStart();
                if (!hasView())
                {
                    return;
                } else
                {
                    ((EventsView)enablePrematch).enablePrematch(false);
                    return;
                }
            }

            public void onPlayComplete()
            {
                super.onPlayComplete();
                if (!hasView())
                {
                    return;
                } else
                {
                    ((EventsView)enablePrematch).enablePrematch(false);
                    return;
                }
            }

            
            {
                this$0 = EventsPresenter.this;
                super();
            }
        };
    }

    public void goLive()
    {
        engine.goLive();
    }

    protected void load()
    {
        if (!hasView())
        {
            return;
        } else
        {
            loadEvents();
            loadPrematch();
            return;
        }
    }

    public void seek()
    {
        engine.seekTo(engine.getEncoderStartTime());
    }

    protected void setupView()
    {
        super.setupView();
        ((EventsView)view).setupRecyclerView();
    }

    public void showGoLive(boolean flag)
    {
        if (hasView())
        {
            ((EventsView)view).showGoLive(flag);
        }
    }







}
