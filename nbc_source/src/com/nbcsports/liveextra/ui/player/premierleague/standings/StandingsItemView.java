// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.standings;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.TableRow;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueComponent;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.standings:
//            StandingsViewModel

public class StandingsItemView extends TableRow
{

    TextView d;
    TextView l;
    TextView p;
    TextView pos;
    private int position;
    TextView pts;
    TextView team;
    private StandingsViewModel viewModel;
    TextView w;

    public StandingsItemView(Context context)
    {
        this(context, null);
    }

    public StandingsItemView(Context context, AttributeSet attributeset)
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

    public void bind(StandingsViewModel standingsviewmodel, int i)
    {
        viewModel = standingsviewmodel;
        position = i;
        if (pos == null)
        {
            return;
        }
        pos.setText(Integer.toString(i));
        team.setText(standingsviewmodel.getTeam());
        p.setText(Integer.toString(standingsviewmodel.getP()));
        w.setText(Integer.toString(standingsviewmodel.getW()));
        d.setText(Integer.toString(standingsviewmodel.getD()));
        l.setText(Integer.toString(standingsviewmodel.getL()));
        pts.setText(Integer.toString(standingsviewmodel.getPts()));
        if (i < 5)
        {
            pos.setCompoundDrawablesWithIntrinsicBounds(null, null, getResources().getDrawable(0x7f020123), null);
            return;
        }
        if (i == 5)
        {
            pos.setCompoundDrawablesWithIntrinsicBounds(null, null, getResources().getDrawable(0x7f020131), null);
            return;
        }
        if (i > 17)
        {
            pos.setCompoundDrawablesWithIntrinsicBounds(null, null, getResources().getDrawable(0x7f02012e), null);
            return;
        } else
        {
            pos.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (!isInEditMode())
        {
            ButterKnife.bind(this);
            if (viewModel != null)
            {
                bind(viewModel, position);
                return;
            }
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        ButterKnife.unbind(this);
    }
}
