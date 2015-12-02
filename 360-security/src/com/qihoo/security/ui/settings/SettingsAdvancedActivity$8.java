// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.settings;

import android.view.View;
import com.qihoo360.common.utils.Utils;

// Referenced classes of package com.qihoo.security.ui.settings:
//            SettingsAdvancedActivity

class a
    implements android.view.dvancedActivity._cls8
{

    final SettingsAdvancedActivity a;

    public void onClick(View view)
    {
        Utils.dismissDialog(SettingsAdvancedActivity.p(a));
    }

    (SettingsAdvancedActivity settingsadvancedactivity)
    {
        a = settingsadvancedactivity;
        super();
    }
}
