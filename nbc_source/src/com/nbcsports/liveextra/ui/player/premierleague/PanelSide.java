// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague:
//            PremierLeagueEngine, PremierLeagueComponent

public class PanelSide extends RelativeLayout
    implements android.support.design.widget.TabLayout.OnTabSelectedListener
{

    private android.support.design.widget.TabLayout.Tab playByPlayTab;
    View playerBlade;
    private android.support.design.widget.TabLayout.Tab playerTab;
    View playsBlade;
    View statsBlade;
    private android.support.design.widget.TabLayout.Tab statsTab;
    View tableBlade;
    private android.support.design.widget.TabLayout.Tab tableTab;
    TabLayout tabs;

    public PanelSide(Context context)
    {
        this(context, null);
    }

    public PanelSide(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (isInEditMode())
        {
            return;
        } else
        {
            PremierLeagueEngine.component().inject(this);
            return;
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
            tabs.setOnTabSelectedListener(this);
            playerTab = tabs.newTab().setText(0x7f07014f);
            playerTab.setTag(playerBlade);
            playerTab.select();
            tabs.addTab(playerTab);
            statsTab = tabs.newTab().setText(0x7f070157);
            statsTab.setTag(statsBlade);
            tabs.addTab(statsTab);
            playByPlayTab = tabs.newTab().setText(0x7f07014e);
            playByPlayTab.setTag(playsBlade);
            tabs.addTab(playByPlayTab);
            tableTab = tabs.newTab().setText(0x7f070156);
            tableTab.setTag(tableBlade);
            tabs.addTab(tableTab);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        ButterKnife.bind(this);
    }

    public void onTabReselected(android.support.design.widget.TabLayout.Tab tab)
    {
    }

    public void onTabSelected(android.support.design.widget.TabLayout.Tab tab)
    {
        tab = ((android.support.design.widget.TabLayout.Tab) (tab.getTag()));
        if (tab == null)
        {
            return;
        } else
        {
            ((View)tab).setVisibility(0);
            return;
        }
    }

    public void onTabUnselected(android.support.design.widget.TabLayout.Tab tab)
    {
        tab = ((android.support.design.widget.TabLayout.Tab) (tab.getTag()));
        if (tab == null)
        {
            return;
        } else
        {
            ((View)tab).setVisibility(8);
            return;
        }
    }
}
