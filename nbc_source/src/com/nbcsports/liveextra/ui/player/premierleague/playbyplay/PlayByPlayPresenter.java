// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.playbyplay;

import android.view.View;
import com.nbcsports.liveextra.ui.player.PlayerPresenter;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.PremierLeagueOverlayPresenter;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.playbyplay:
//            PlayByPlayProvider, PlayViewModel, PlayByPlayView

public class PlayByPlayPresenter extends PremierLeagueOverlayPresenter
{

    private final PlayByPlayProvider provider;

    public PlayByPlayPresenter(PremierLeagueEngine premierleagueengine, PlayerPresenter playerpresenter, PlayByPlayProvider playbyplayprovider)
    {
        super(premierleagueengine, playerpresenter);
        provider = playbyplayprovider;
    }

    protected void load()
    {
        addSubscription(provider.getPlayByPlay().map(PlayViewModel.fromPlayByPlay()).onBackpressureDrop().observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

            final PlayByPlayPresenter this$0;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
                Timber.w(throwable, "Error updating play by play", new Object[0]);
            }

            public volatile void onNext(Object obj)
            {
                onNext((List)obj);
            }

            public void onNext(List list)
            {
                while (!hasView() || CollectionUtils.isEmpty(list)) 
                {
                    return;
                }
                ((PlayByPlayView)).bind(list);
            }

            
            {
                this$0 = PlayByPlayPresenter.this;
                super();
            }
        }));
    }

    protected void setupView()
    {
        ((PlayByPlayView)view).setupRecyclerView();
    }

}
