// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.standings;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import butterknife.ButterKnife;
import com.nbcsports.liveextra.library.preferences.AppPreferences;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueComponent;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import java.util.List;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.standings:
//            StandingsViewModel, StandingsItemView, StandingsPresenter

public class StandingsView extends RelativeLayout
{

    ScrollView contentBlade;
    private LayoutInflater inflater;
    AppPreferences preferences;
    StandingsPresenter presenter;
    LinearLayout showStandingsView;
    TableLayout standings;

    public StandingsView(Context context)
    {
        this(context, null);
    }

    public StandingsView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public StandingsView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (isInEditMode())
        {
            return;
        } else
        {
            inflater = LayoutInflater.from(getContext());
            PremierLeagueEngine.component().inject(this);
            return;
        }
    }

    public void bind(List list)
    {
        standings.removeAllViews();
        setUpTable();
        for (int i = 0; i < list.size(); i++)
        {
            StandingsViewModel standingsviewmodel = (StandingsViewModel)list.get(i);
            StandingsItemView standingsitemview = (StandingsItemView)inflater.inflate(0x7f040088, standings, false);
            if (i % 2 != 0)
            {
                standingsitemview.setBackgroundColor(Color.parseColor("#11ffffff"));
            }
            standings.addView(standingsitemview);
            standingsitemview.bind(standingsviewmodel, i + 1);
        }

    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (!isInEditMode())
        {
            ButterKnife.bind(this);
            presenter.takeView(this);
            if (preferences.showLiveTable())
            {
                showStandings();
                return;
            }
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        presenter.release();
    }

    public void setUpTable()
    {
        TableRow tablerow = (TableRow)inflater.inflate(0x7f040089, standings, false);
        standings.addView(tablerow);
        tablerow.setBackgroundColor(getResources().getColor(0x7f0e000a));
    }

    void showStandings()
    {
        contentBlade.setVisibility(0);
        showStandingsView.setVisibility(8);
        preferences.showLiveTable(true);
    }
}
