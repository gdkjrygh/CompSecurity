// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.gameinfo;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueComponent;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.standings.StandingsViewModel;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.util.Map;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.gameinfo:
//            MatchInfoViewModel, MatchScorePresenter

public class MatchScoreView extends CardView
{

    ImageView awayLogo;
    TextView awayPos;
    TextView awayScore;
    View awayStripe;
    TextView gameTime;
    ImageView homeLogo;
    TextView homePos;
    TextView homeScore;
    View homeStripe;
    TextView matchWeek;
    Picasso picasso;
    MatchScorePresenter presenter;

    public MatchScoreView(Context context)
    {
        this(context, null);
    }

    public MatchScoreView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public MatchScoreView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (isInEditMode())
        {
            return;
        } else
        {
            PremierLeagueEngine.component().inject(this);
            return;
        }
    }

    public void bindGameInfo(int i)
    {
        matchWeek.setText(getResources().getString(0x7f070126, new Object[] {
            Integer.valueOf(i)
        }));
    }

    public void bindStats(Pair pair)
    {
        StandingsViewModel standingsviewmodel = (StandingsViewModel)pair.first;
        pair = (StandingsViewModel)pair.second;
        homePos.setText(getResources().getString(0x7f070159, new Object[] {
            Integer.valueOf(standingsviewmodel.getViewPos()), Integer.valueOf(standingsviewmodel.getPts())
        }));
        awayPos.setText(getResources().getString(0x7f070159, new Object[] {
            Integer.valueOf(pair.getViewPos()), Integer.valueOf(pair.getPts())
        }));
    }

    public void bindTeamInfo(MatchInfoViewModel matchinfoviewmodel)
    {
        MatchInfoViewModel.TeamViewModel teamviewmodel = matchinfoviewmodel.getAway();
        matchinfoviewmodel = matchinfoviewmodel.getHome();
        awayStripe.setBackgroundColor(teamviewmodel.getColor());
        picasso.load(teamviewmodel.getIcon()).into(awayLogo);
        homeStripe.setBackgroundColor(matchinfoviewmodel.getColor());
        picasso.load(matchinfoviewmodel.getIcon()).into(homeLogo);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.bind(this);
            presenter.takeView(this);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        ButterKnife.unbind(this);
        presenter.release();
    }

    public void setClock(String s)
    {
        gameTime.setText(s);
    }

    public void updateScore(Map map)
    {
        homeScore.setText(Integer.toString(((Integer)map.get("H")).intValue()));
        awayScore.setText(Integer.toString(((Integer)map.get("A")).intValue()));
    }
}
