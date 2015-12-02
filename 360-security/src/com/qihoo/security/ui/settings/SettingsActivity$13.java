// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.settings;

import android.widget.CompoundButton;
import com.qihoo360.mobilesafe.share.SharedPref;

// Referenced classes of package com.qihoo.security.ui.settings:
//            SettingsActivity

class a
    implements android.widget.ckedChangeListener
{

    final SettingsActivity a;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (SettingsActivity.j(a) == flag)
        {
            return;
        } else
        {
            SettingsActivity.g(a, flag);
            SharedPref.a(a.p, "user_ex", flag);
            return;
        }
    }

    er(SettingsActivity settingsactivity)
    {
        a = settingsactivity;
        super();
    }
}
