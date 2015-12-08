// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.cell.settings;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import com.spotify.mobile.android.ui.activity.dialog.ShowDialogAction;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import dmz;
import frb;

// Referenced classes of package com.spotify.mobile.android.ui.cell.settings:
//            SpinnerSettingsCell

final class a
    implements android.widget.ctedListener
{

    private SpinnerSettingsCell a;

    public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (SpinnerSettingsCell.a(a) != null && SpinnerSettingsCell.a(a).length > i && SpinnerSettingsCell.a(a)[i] != Reason.a)
        {
            dmz.a(frb);
            frb.a(SpinnerSettingsCell.b(a), SpinnerSettingsCell.a(a)[i], null, null).a(a.getContext());
            SpinnerSettingsCell.d(a).setSelection(SpinnerSettingsCell.c(a));
        } else
        {
            int j = SpinnerSettingsCell.c(a);
            SpinnerSettingsCell.a(a, i);
            if (j != SpinnerSettingsCell.c(a))
            {
                a.a();
                return;
            }
        }
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
        SpinnerSettingsCell.a(a, -1);
    }

    (SpinnerSettingsCell spinnersettingscell)
    {
        a = spinnersettingscell;
        super();
    }
}
