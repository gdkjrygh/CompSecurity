// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.settings;

import android.widget.CompoundButton;
import com.qihoo.security.support.b;
import com.qihoo360.mobilesafe.share.SharedPref;

// Referenced classes of package com.qihoo.security.ui.settings:
//            SettingsActivity

class a
    implements android.widget.ckedChangeListener
{

    final SettingsActivity a;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (SettingsActivity.h(a) != flag)
        {
            SettingsActivity.e(a, flag);
            SharedPref.a(a.p, "setting_auto_start", flag);
            b.c(19009);
            if (flag)
            {
                b.c(14019);
            }
            if (!SharedPref.a("malware_find_issue_time"))
            {
                SharedPref.a(a.p, "malware_find_issue_time", 0L);
                return;
            }
        }
    }

    er(SettingsActivity settingsactivity)
    {
        a = settingsactivity;
        super();
    }
}
