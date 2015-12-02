// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.settings;

import android.widget.CompoundButton;
import com.qihoo360.mobilesafe.share.SharedPref;

// Referenced classes of package com.qihoo.security.ui.settings:
//            CleanupSettingActivity

class a
    implements android.widget.hangeListener
{

    final CleanupSettingActivity a;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        SharedPref.a(a.getApplicationContext(), "remind_delpackage_swtich", flag);
    }

    (CleanupSettingActivity cleanupsettingactivity)
    {
        a = cleanupsettingactivity;
        super();
    }
}
