// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.cell.settings;

import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;
import com.spotify.mobile.android.ui.activity.dialog.ShowDialogAction;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import dmz;
import frb;
import fub;

// Referenced classes of package com.spotify.mobile.android.ui.cell.settings:
//            ToggleButtonSettingsCell

final class a
    implements android.widget.ngeListener
{

    private ToggleButtonSettingsCell a;

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (flag != ToggleButtonSettingsCell.b(a))
        {
            if (ToggleButtonSettingsCell.c(a) != Reason.a)
            {
                dmz.a(frb);
                frb.a(ToggleButtonSettingsCell.d(a), ToggleButtonSettingsCell.c(a), null, null).a(a.getContext());
                ToggleButtonSettingsCell.a(a).setChecked(ToggleButtonSettingsCell.b(a));
            } else
            {
                a.a();
                if (ToggleButtonSettingsCell.e(a) != null)
                {
                    ToggleButtonSettingsCell.e(a).a(flag);
                    return;
                }
            }
        }
    }

    (ToggleButtonSettingsCell togglebuttonsettingscell)
    {
        a = togglebuttonsettingscell;
        super();
    }
}
