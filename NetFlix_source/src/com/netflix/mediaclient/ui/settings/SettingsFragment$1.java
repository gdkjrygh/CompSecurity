// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.settings;

import android.preference.Preference;
import com.netflix.mediaclient.util.LogUtils;

// Referenced classes of package com.netflix.mediaclient.ui.settings:
//            SettingsFragment

class this._cls0
    implements android.preference.enceClickListener
{

    final SettingsFragment this$0;

    public boolean onPreferenceClick(Preference preference)
    {
        LogUtils.reportUiModalViewChanged(SettingsFragment.access$000(SettingsFragment.this), com.netflix.mediaclient.servicemgr.lView.privacyPolicy);
        return false;
    }

    View()
    {
        this$0 = SettingsFragment.this;
        super();
    }
}
