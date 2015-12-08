// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.stats;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableInt;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.nbcsports.liveextra.databinding.pl.HighLevelStatsBinding;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueComponent;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.stats:
//            StatsAdapter, StatsPresenter, StatsItemViewModel

public class StatsView extends RelativeLayout
{
    public class Binder extends BaseObservable
    {

        public ObservableInt awayColor;
        public ObservableArrayList ballLocations;
        public ObservableInt homeColor;
        public ObservableArrayList statsList;
        final StatsView this$0;

        public Binder()
        {
            this$0 = StatsView.this;
            super();
            homeColor = new ObservableInt();
            awayColor = new ObservableInt();
            ballLocations = new ObservableArrayList();
            statsList = new ObservableArrayList();
            ballLocations.addAll(Arrays.asList(new Double[] {
                Double.valueOf(0.0D), Double.valueOf(0.0D), Double.valueOf(0.0D)
            }));
            statsview = Arrays.asList(new com.nbcsports.liveextra.content.models.overlay.premierleague.TeamBoxScore.Score[] {
                new com.nbcsports.liveextra.content.models.overlay.premierleague.TeamBoxScore.Score("H"), new com.nbcsports.liveextra.content.models.overlay.premierleague.TeamBoxScore.Score("A")
            });
            statsList.addAll(StatsItemViewModel.getStats(StatsView.this, null, null));
        }
    }


    private StatsAdapter adapter;
    private Binder binder;
    private HighLevelStatsBinding binding;
    StatsPresenter presenter;

    public StatsView(Context context)
    {
        this(context, null);
    }

    public StatsView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public StatsView(Context context, AttributeSet attributeset, int i)
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

    public static void bindStats(RecyclerView recyclerview, List list)
    {
        StatsAdapter statsadapter1 = (StatsAdapter)recyclerview.getAdapter();
        StatsAdapter statsadapter = statsadapter1;
        if (statsadapter1 == null)
        {
            statsadapter = new StatsAdapter(recyclerview.getContext());
            recyclerview.setAdapter(statsadapter);
        }
        statsadapter.update(list);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            presenter.takeView(binder);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        presenter.release();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            binding = HighLevelStatsBinding.bind(this);
            binding.statsList.setLayoutManager(new LinearLayoutManager(getContext()));
            adapter = new StatsAdapter(getContext());
            binding.statsList.setAdapter(adapter);
            binder = new Binder();
            binding.setBinder(binder);
            return;
        }
    }
}
