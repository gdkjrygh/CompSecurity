// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import com.nbcsports.liveextra.ui.player.PlayerPresenter;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.PremierLeagueOverlayBindingPresenter;
import com.nbcsports.liveextra.ui.player.premierleague.gameinfo.MatchInfoViewModel;
import com.nbcsports.liveextra.ui.player.premierleague.gameinfo.TeamBoxScoreProvider;
import com.nbcsports.liveextra.ui.player.premierleague.gameinfo.TeamInfoProvider;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.CollectionUtils;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.player:
//            PlayerInfoProvider

public class PlayerCardsPresenter extends PremierLeagueOverlayBindingPresenter
{

    private final PlayerInfoProvider playerInfoProvider;
    private final TeamBoxScoreProvider scoreProvider;
    private final TeamInfoProvider teamInfoProvider;

    public PlayerCardsPresenter(PremierLeagueEngine premierleagueengine, PlayerPresenter playerpresenter, TeamInfoProvider teaminfoprovider, PlayerInfoProvider playerinfoprovider, TeamBoxScoreProvider teamboxscoreprovider)
    {
        super(premierleagueengine, playerpresenter);
        teamInfoProvider = teaminfoprovider;
        playerInfoProvider = playerinfoprovider;
        scoreProvider = teamboxscoreprovider;
    }

    private void loadAwayPlayers()
    {
        addSubscription(playerInfoProvider.getPlayers("A").observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

            final PlayerCardsPresenter this$0;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
                Timber.d(throwable, "", new Object[0]);
            }

            public volatile void onNext(Object obj)
            {
                onNext((List)obj);
            }

            public void onNext(List list)
            {
                if (!hasBinder() || CollectionUtils.isEmpty(list))
                {
                    return;
                } else
                {
                    ((PlayerCardsView.Binder)
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = PlayerCardsPresenter.this;
                super();
            }
        }));
    }

    private void loadFormations()
    {
        addSubscription(scoreProvider.getFormation().observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

            final PlayerCardsPresenter this$0;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
                Timber.d(throwable, "Error loading formation", new Object[0]);
            }

            public volatile void onNext(Object obj)
            {
                onNext((Map)obj);
            }

            public void onNext(Map map)
            {
                if (!hasBinder() || map == null)
                {
                    return;
                } else
                {
                    ((PlayerCardsView.Binder)
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = PlayerCardsPresenter.this;
                super();
            }
        }));
    }

    private void loadHomePlayers()
    {
        addSubscription(playerInfoProvider.getPlayers("H").observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

            final PlayerCardsPresenter this$0;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
                Timber.d(throwable, "", new Object[0]);
            }

            public volatile void onNext(Object obj)
            {
                onNext((List)obj);
            }

            public void onNext(List list)
            {
                if (!hasBinder() || CollectionUtils.isEmpty(list))
                {
                    return;
                } else
                {
                    ((PlayerCardsView.Binder)
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = PlayerCardsPresenter.this;
                super();
            }
        }));
    }

    private void loadTeamInfo()
    {
        addSubscription(teamInfoProvider.getTeamInfo().map(MatchInfoViewModel.fromTeamInfo()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

            final PlayerCardsPresenter this$0;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
                Timber.d(throwable, "", new Object[0]);
            }

            public void onNext(MatchInfoViewModel matchinfoviewmodel)
            {
                if (!hasBinder() || matchinfoviewmodel == null)
                {
                    return;
                } else
                {
                    ((PlayerCardsView.Binder)
// JavaClassFileOutputException: get_constant: invalid tag

            public volatile void onNext(Object obj)
            {
                onNext((MatchInfoViewModel)obj);
            }

            
            {
                this$0 = PlayerCardsPresenter.this;
                super();
            }
        }));
    }

    public void load()
    {
        loadTeamInfo();
        loadHomePlayers();
        loadAwayPlayers();
        loadFormations();
    }










}
