// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.cell.settings;

import android.widget.CompoundButton;

// Referenced classes of package com.spotify.mobile.android.ui.cell.settings:
//            BroadcastSettingsCell

final class a
    implements android.widget.ChangeListener
{

    private BroadcastSettingsCell a;

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (flag != BroadcastSettingsCell.b(a))
        {
            BroadcastSettingsCell.a(a, flag);
            a.a(null);
        }
    }

    I(BroadcastSettingsCell broadcastsettingscell)
    {
        a = broadcastsettingscell;
        super();
    }
}
