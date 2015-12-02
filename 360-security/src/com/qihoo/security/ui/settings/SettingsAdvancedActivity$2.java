// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.settings;

import android.widget.CompoundButton;
import com.qihoo.security.widget.CheckBoxPreference;
import com.qihoo360.mobilesafe.share.SharedPref;

// Referenced classes of package com.qihoo.security.ui.settings:
//            SettingsAdvancedActivity

class a
    implements android.widget.ngeListener
{

    final SettingsAdvancedActivity a;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (flag)
        {
            SettingsAdvancedActivity.l(a);
            return;
        } else
        {
            SharedPref.a(a.p, "key_virus_scan_strict_mode", false);
            SettingsAdvancedActivity.j(a);
            SettingsAdvancedActivity.k(a).setEnabled(false);
            return;
        }
    }

    (SettingsAdvancedActivity settingsadvancedactivity)
    {
        a = settingsadvancedactivity;
        super();
    }
}
