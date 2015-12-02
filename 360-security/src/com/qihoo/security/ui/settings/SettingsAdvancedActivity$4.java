// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.settings;

import android.view.View;
import com.qihoo.security.widget.CheckBoxPreference;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.share.SharedPref;

// Referenced classes of package com.qihoo.security.ui.settings:
//            SettingsAdvancedActivity

class a
    implements android.view.dvancedActivity._cls4
{

    final SettingsAdvancedActivity a;

    public void onClick(View view)
    {
        SharedPref.a(a.p, "key_virus_scan_strict_mode", true);
        SettingsAdvancedActivity.j(a);
        SettingsAdvancedActivity.k(a).setEnabled(true);
        Utils.dismissDialog(SettingsAdvancedActivity.n(a));
    }

    (SettingsAdvancedActivity settingsadvancedactivity)
    {
        a = settingsadvancedactivity;
        super();
    }
}
