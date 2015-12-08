// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.gameinfo;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueComponent;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import java.text.NumberFormat;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.gameinfo:
//            GameInfoViewModel, GameInfoPresenter

public class GameInformationView extends LinearLayout
{

    TextView attendance;
    TextView capacityLabel;
    TextView date;
    GameInfoPresenter presenter;
    TextView referee;
    TextView refereeLabel;
    TextView stadium;

    public GameInformationView(Context context)
    {
        this(context, null);
    }

    public GameInformationView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public GameInformationView(Context context, AttributeSet attributeset, int i)
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

    public void bind(GameInfoViewModel gameinfoviewmodel)
    {
        byte byte1 = 4;
        stadium.setText(gameinfoviewmodel.getStadium());
        TextView textview = capacityLabel;
        byte byte0;
        if (gameinfoviewmodel.getCapacity() == 0)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
        textview = attendance;
        if (gameinfoviewmodel.getCapacity() == 0)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
        attendance.setText(NumberFormat.getInstance().format(gameinfoviewmodel.getCapacity()));
        date.setText(gameinfoviewmodel.getDate());
        textview = refereeLabel;
        if (TextUtils.isEmpty(gameinfoviewmodel.getReferee()))
        {
            byte0 = byte1;
        } else
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
        referee.setText(gameinfoviewmodel.getReferee());
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
        presenter.release();
    }
}
