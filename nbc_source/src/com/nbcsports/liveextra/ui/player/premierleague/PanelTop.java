// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.nbcsports.liveextra.library.preferences.AppPreferences;
import com.nbcsports.liveextra.ui.player.premierleague.schedule.ScheduleView;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague:
//            PremierLeagueEngine, PremierLeagueComponent

public class PanelTop extends RelativeLayout
    implements com.nbcsports.liveextra.ui.player.premierleague.schedule.ScheduleView.Callback
{

    View hideIcon;
    private boolean isLoaded;
    AppPreferences preferences;
    View progress;
    ScheduleView schedule;
    View showIcon;
    View showScores;

    public PanelTop(Context context)
    {
        this(context, null);
    }

    public PanelTop(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PanelTop(Context context, AttributeSet attributeset, int i)
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
        if (isInEditMode())
        {
            return;
        }
        ButterKnife.bind(this);
        schedule.registerCallback(this);
        if (preferences.showPLScores())
        {
            onShowScores();
            return;
        } else
        {
            onHideScores();
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        schedule.unregisterCallback(this);
        ButterKnife.unbind(this);
    }

    public void onHideScores()
    {
        showScores.setVisibility(0);
        schedule.setVisibility(8);
        showIcon.setVisibility(0);
        hideIcon.setVisibility(8);
        progress.setVisibility(8);
        preferences.showPLScores(false);
    }

    public void onListUpdated()
    {
        isLoaded = true;
        progress.setVisibility(8);
    }

    public void onShowScores()
    {
        showScores.setVisibility(8);
        schedule.setVisibility(0);
        showIcon.setVisibility(8);
        hideIcon.setVisibility(0);
        if (!isLoaded)
        {
            progress.setVisibility(0);
        }
        preferences.showPLScores(true);
    }
}
