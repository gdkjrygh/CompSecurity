// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.games.logging.GamesLogflowLogger;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesSettingsFragment, GamesSettingsActivity

private final class <init> extends <init>
{

    private TextView mStatusView;
    final GamesSettingsFragment this$0;

    public final void onBindView(View view)
    {
        TextView textview = (TextView)view.findViewById(0x7f0d0075);
        mStatusView = (TextView)view.findViewById(0x7f0d024b);
        textview.setText(0x7f100172);
        setProfileVisibility(GamesSettingsFragment.access$100(GamesSettingsFragment.this));
    }

    public final void setProfileVisibility(boolean flag)
    {
        Object obj = GamesSettingsFragment.access$200(GamesSettingsFragment.this).getResources();
        boolean flag1;
        if (flag)
        {
            mStatusView.setText(0x7f100174);
            mStatusView.setTextColor(((Resources) (obj)).getColor(0x7f0b008f));
        } else
        {
            mStatusView.setText(0x7f100173);
            mStatusView.setTextColor(((Resources) (obj)).getColor(0x7f0b008e));
        }
        flag1 = GamesSettingsFragment.access$100(GamesSettingsFragment.this);
        GamesSettingsFragment.access$102(GamesSettingsFragment.this, flag);
        if (flag1 != flag)
        {
            obj = GamesSettingsFragment.access$000(GamesSettingsFragment.this);
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ((GamesLogflowLogger) (obj)).logSettingChangeEvent(104, flag1, flag, true);
        }
    }

    private Q()
    {
        this$0 = GamesSettingsFragment.this;
        super(GamesSettingsFragment.this, 10, 2, true);
    }

    this._cls0(byte byte0)
    {
        this();
    }
}
