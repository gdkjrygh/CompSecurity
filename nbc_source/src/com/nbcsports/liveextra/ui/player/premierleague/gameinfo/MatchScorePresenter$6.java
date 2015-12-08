// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.gameinfo;

import android.util.Pair;
import com.nbcsports.liveextra.ui.player.premierleague.standings.StandingsViewModel;
import rx.Subscriber;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.gameinfo:
//            MatchScorePresenter, MatchInfoViewModel, MatchScoreView

class val.viewModel extends Subscriber
{

    final MatchScorePresenter this$0;
    final MatchInfoViewModel val$viewModel;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
        Timber.d(throwable, "", new Object[0]);
    }

    public void onNext(Pair pair)
    {
        if (!hasView() || pair == null)
        {
            return;
        } else
        {
            val$viewModel.getAway().setPoints(((StandingsViewModel)pair.second).getPts());
            ((MatchScoreView)MatchScorePresenter.access$400(MatchScorePresenter.this)).bindStats(pair);
            unsubscribe();
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((Pair)obj);
    }

    mViewModel()
    {
        this$0 = final_matchscorepresenter;
        val$viewModel = MatchInfoViewModel.this;
        super();
    }
}
