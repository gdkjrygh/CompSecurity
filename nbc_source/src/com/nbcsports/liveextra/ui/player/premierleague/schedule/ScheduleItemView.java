// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.schedule;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueComponent;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.TimeUtils;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.schedule:
//            ScheduleViewModel, ScheduleItemPresenter

public class ScheduleItemView extends CardView
{

    TextView awayScore;
    TextView awayTeam;
    TextView clock;
    TextView gameDate;
    TextView homeScore;
    TextView homeTeam;
    Picasso picasso;
    ScheduleItemPresenter presenter;
    ImageView providerIcon;
    TextView startTime;
    private ScheduleViewModel viewModel;

    public ScheduleItemView(Context context)
    {
        this(context, null);
    }

    public ScheduleItemView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ScheduleItemView(Context context, AttributeSet attributeset, int i)
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

    public void bind(ScheduleViewModel scheduleviewmodel)
    {
        homeTeam.setText(scheduleviewmodel.getHomeTeam());
        awayTeam.setText(scheduleviewmodel.getAwayTeam());
        if (homeScore != null)
        {
            homeScore.setText(Integer.toString(scheduleviewmodel.getHomeScore()));
        }
        if (awayScore != null)
        {
            awayScore.setText(Integer.toString(scheduleviewmodel.getAwayScore()));
        }
        if (startTime != null)
        {
            startTime.setText(scheduleviewmodel.getStartTime());
        }
        if (gameDate != null)
        {
            gameDate.setText(scheduleviewmodel.getGameDate());
        }
        if (clock != null)
        {
            byte byte0;
            if (scheduleviewmodel.viewType.contains("SecondHalf"))
            {
                byte0 = 2;
            } else
            {
                byte0 = 1;
            }
            clock.setText(TimeUtils.getGameTime(byte0, scheduleviewmodel.getClock()));
        }
        if (providerIcon != null && scheduleviewmodel.getProviderIcon() != 0)
        {
            picasso.load(scheduleviewmodel.getProviderIcon()).into(providerIcon);
        }
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

    public void setViewModel(ScheduleViewModel scheduleviewmodel)
    {
        viewModel = scheduleviewmodel;
        presenter.setViewModel(scheduleviewmodel);
    }
}
