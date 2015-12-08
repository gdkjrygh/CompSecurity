// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.widget.TextView;
import com.adobe.adobepass.accessenabler.models.Mvpd;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            SochiApplicationSettingsFragment

class val.mvpd
    implements Runnable
{

    final SochiApplicationSettingsFragment this$0;
    final Mvpd val$mvpd;

    public void run()
    {
        if (SochiApplicationSettingsFragment.access$700(SochiApplicationSettingsFragment.this) == null || isActivityDead())
        {
            return;
        }
        if (val$mvpd != null)
        {
            SochiApplicationSettingsFragment.access$700(SochiApplicationSettingsFragment.this).setText((new StringBuilder()).append(val$mvpd.getDisplayName()).append(" (").append(getString(0x7f070124)).append(")").toString());
        } else
        {
            SochiApplicationSettingsFragment.access$700(SochiApplicationSettingsFragment.this).setText(getString(0x7f070197));
        }
        SochiApplicationSettingsFragment.access$502(SochiApplicationSettingsFragment.this, true);
    }

    ()
    {
        this$0 = final_sochiapplicationsettingsfragment;
        val$mvpd = Mvpd.this;
        super();
    }
}
