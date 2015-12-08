// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.stats;

import com.nbcsports.liveextra.content.models.overlay.premierleague.TeamBoxScore;
import com.nbcsports.liveextra.content.models.overlay.premierleague.TeamInfo;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import rx.functions.Func2;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.stats:
//            StatsPresenter, StatsItemViewModel

class this._cls0
    implements Func2
{

    final StatsPresenter this$0;

    public volatile Object call(Object obj, Object obj1)
    {
        return call((TeamInfo)obj, (List)obj1);
    }

    public List call(TeamInfo teaminfo, List list)
    {
        List list1 = list;
        if (CollectionUtils.isEmpty(list))
        {
            list1 = Arrays.asList(new com.nbcsports.liveextra.content.models.overlay.premierleague.e[] {
                TeamBoxScore.DEFAULT_HOME, TeamBoxScore.DEFAULT_AWAY
            });
        }
        StatsPresenter.access$002(StatsPresenter.this, StatsPresenter.access$100(StatsPresenter.this, teaminfo.getTeamHome()));
        StatsPresenter.access$202(StatsPresenter.this, StatsPresenter.access$100(StatsPresenter.this, teaminfo.getTeamAway()));
        return StatsItemViewModel.getStats(list1, StatsPresenter.access$000(StatsPresenter.this), StatsPresenter.access$200(StatsPresenter.this));
    }

    l()
    {
        this$0 = StatsPresenter.this;
        super();
    }
}
