// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import com.phunware.nbc.sochi.system.AppSharedPreferences;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            SochiApplicationSettingsFragment

class this._cls0
    implements android.content.tingsFragment._cls15
{

    final SochiApplicationSettingsFragment this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        AppSharedPreferences.addSetting(getActivity().getBaseContext(), "event_alert_interval", (new StringBuilder()).append("").append(i).toString());
        SochiApplicationSettingsFragment.access$1100(SochiApplicationSettingsFragment.this);
        dialoginterface.dismiss();
    }

    ()
    {
        this$0 = SochiApplicationSettingsFragment.this;
        super();
    }
}
