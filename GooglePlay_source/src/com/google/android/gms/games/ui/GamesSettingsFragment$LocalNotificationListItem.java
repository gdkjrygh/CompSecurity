// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.gms.games.internal.GamesLog;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesSettingsFragment

private final class mSetChecked extends mSetChecked
{

    private CheckBox mBox;
    private final int mNotificationId = 3;
    private Boolean mSetChecked;
    final GamesSettingsFragment this$0;

    public final void onBindView(View view)
    {
        TextView textview = (TextView)view.findViewById(0x7f0d0075);
        TextView textview1 = (TextView)view.findViewById(0x7f0d024a);
        view.findViewById(0x7f0d0292).setVisibility(0);
        mBox = (CheckBox)view.findViewById(0x7f0d00c3);
        if (mSetChecked != null)
        {
            setChecked(mSetChecked.booleanValue());
            mSetChecked = null;
        }
        textview.setText(0x7f10016b);
        textview1.setText(0x7f10016c);
    }

    public final void setChecked(boolean flag)
    {
        if (mBox != null)
        {
            mBox.setChecked(flag);
            mBox.setVisibility(0);
            return;
        } else
        {
            GamesLog.d("GamesSettings", "LocalNotificationListItem setChecked was called before onBindView, saving requested checked state for later.");
            mSetChecked = Boolean.valueOf(flag);
            return;
        }
    }

    public ()
    {
        this$0 = GamesSettingsFragment.this;
        super(GamesSettingsFragment.this, 3, 1, true);
        mSetChecked = null;
    }
}
