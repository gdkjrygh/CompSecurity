// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import air.com.nbcuni.com.nbcsports.liveextra.NationalAlertsWizardActivity;
import android.content.Intent;
import android.view.View;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            SochiApplicationSettingsFragment

class this._cls0
    implements android.view.SettingsFragment._cls11
{

    final SochiApplicationSettingsFragment this$0;

    public void onClick(View view)
    {
        view = new Intent(getActivity(), air/com/nbcuni/com/nbcsports/liveextra/NationalAlertsWizardActivity);
        startActivity(view);
    }

    ()
    {
        this$0 = SochiApplicationSettingsFragment.this;
        super();
    }
}
