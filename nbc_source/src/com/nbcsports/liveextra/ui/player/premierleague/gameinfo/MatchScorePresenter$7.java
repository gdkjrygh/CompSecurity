// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.gameinfo;

import android.util.Pair;
import com.nbcsports.liveextra.ui.player.premierleague.standings.StandingsViewModel;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.gameinfo:
//            MatchScorePresenter, MatchInfoViewModel

class val.viewModel
    implements Func1
{

    final MatchScorePresenter this$0;
    final MatchInfoViewModel val$viewModel;

    public volatile Object call(Object obj)
    {
        return call((List)obj);
    }

    public Observable call(List list)
    {
        StandingsViewModel standingsviewmodel = (StandingsViewModel)CollectionUtils.find(list, new Predicate() {

            final MatchScorePresenter._cls7 this$1;

            public boolean evaluate(StandingsViewModel standingsviewmodel2)
            {
                return standingsviewmodel2.getId() == viewModel.getHome().getTeamId();
            }

            public volatile boolean evaluate(Object obj)
            {
                return evaluate((StandingsViewModel)obj);
            }

            
            {
                this$1 = MatchScorePresenter._cls7.this;
                super();
            }
        });
        StandingsViewModel standingsviewmodel1 = (StandingsViewModel)CollectionUtils.find(list, new Predicate() {

            final MatchScorePresenter._cls7 this$1;

            public boolean evaluate(StandingsViewModel standingsviewmodel2)
            {
                return standingsviewmodel2.getId() == viewModel.getAway().getTeamId();
            }

            public volatile boolean evaluate(Object obj)
            {
                return evaluate((StandingsViewModel)obj);
            }

            
            {
                this$1 = MatchScorePresenter._cls7.this;
                super();
            }
        });
        standingsviewmodel.setViewPos(list.indexOf(standingsviewmodel) + 1);
        standingsviewmodel1.setViewPos(list.indexOf(standingsviewmodel1) + 1);
        return Observable.just(new Pair(standingsviewmodel, standingsviewmodel1));
    }

    _cls2.this._cls1()
    {
        this$0 = final_matchscorepresenter;
        val$viewModel = MatchInfoViewModel.this;
        super();
    }
}
