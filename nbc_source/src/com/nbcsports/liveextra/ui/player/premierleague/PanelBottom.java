// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import java.util.List;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague:
//            PremierLeagueEngine, PremierLeagueComponent

public class PanelBottom extends RelativeLayout
    implements android.support.design.widget.TabLayout.OnTabSelectedListener
{

    View highlights;
    private android.support.design.widget.TabLayout.Tab highlightsTab;
    TextView info;
    private android.support.design.widget.TabLayout.Tab infoTab;
    TabLayout tabs;
    AssetViewModel viewModel;
    List views;

    public PanelBottom(Context context)
    {
        this(context, null);
    }

    public PanelBottom(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PanelBottom(Context context, AttributeSet attributeset, int i)
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

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ButterKnife.bind(this);
        tabs.setOnTabSelectedListener(this);
        highlightsTab = tabs.newTab().setText(0x7f07014a);
        tabs.addTab(highlightsTab);
        infoTab = tabs.newTab().setText(0x7f07014c);
        tabs.addTab(infoTab);
        info.setText(viewModel.asset().getInfo());
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        ButterKnife.unbind(this);
    }

    public void onTabReselected(android.support.design.widget.TabLayout.Tab tab)
    {
    }

    public void onTabSelected(android.support.design.widget.TabLayout.Tab tab)
    {
        ButterKnife.apply(views, new butterknife.ButterKnife.Action() {

            final PanelBottom this$0;

            public void apply(View view, int i)
            {
                view.setVisibility(8);
            }

            
            {
                this$0 = PanelBottom.this;
                super();
            }
        });
        if (tab.equals(highlightsTab))
        {
            highlights.setVisibility(0);
        } else
        if (tab.equals(infoTab))
        {
            info.setVisibility(0);
            return;
        }
    }

    public void onTabUnselected(android.support.design.widget.TabLayout.Tab tab)
    {
    }
}
