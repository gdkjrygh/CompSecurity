// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.gameinfo;

import android.view.View;
import com.nbcsports.liveextra.ui.player.PlayerPresenter;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.PremierLeagueOverlayPresenter;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.gameinfo:
//            GameInfoProvider, GameInfoViewModel, GameInformationView

public class GameInfoPresenter extends PremierLeagueOverlayPresenter
{

    private final GameInfoProvider provider;

    public GameInfoPresenter(PremierLeagueEngine premierleagueengine, PlayerPresenter playerpresenter, GameInfoProvider gameinfoprovider)
    {
        super(premierleagueengine, playerpresenter);
        provider = gameinfoprovider;
    }

    protected void load()
    {
        addSubscription(provider.getGameInfo().map(GameInfoViewModel.fromGameInfo()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

            final GameInfoPresenter this$0;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
                Timber.d(throwable, "", new Object[0]);
            }

            public void onNext(GameInfoViewModel gameinfoviewmodel)
            {
                if (!hasView() || gameinfoviewmodel == null)
                {
                    return;
                } else
                {
                    ((GameInformationView)).bind(gameinfoviewmodel);
                    return;
                }
            }

            public volatile void onNext(Object obj)
            {
                onNext((GameInfoViewModel)obj);
            }

            
            {
                this$0 = GameInfoPresenter.this;
                super();
            }
        }));
    }

}
