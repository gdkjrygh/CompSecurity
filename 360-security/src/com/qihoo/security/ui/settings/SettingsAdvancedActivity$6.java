// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.settings;

import android.content.DialogInterface;
import com.qihoo.security.widget.CheckBoxPreference;

// Referenced classes of package com.qihoo.security.ui.settings:
//            SettingsAdvancedActivity

class a
    implements android.content.tener
{

    final SettingsAdvancedActivity a;

    public void onCancel(DialogInterface dialoginterface)
    {
        SettingsAdvancedActivity.o(a).a(false);
        SettingsAdvancedActivity.k(a).setEnabled(false);
    }

    (SettingsAdvancedActivity settingsadvancedactivity)
    {
        a = settingsadvancedactivity;
        super();
    }
}
