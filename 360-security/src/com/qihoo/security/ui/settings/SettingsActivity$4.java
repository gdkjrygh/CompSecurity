// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.settings;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.qihoo.security.ui.settings:
//            SettingsActivity

class a extends BroadcastReceiver
{

    final SettingsActivity a;

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null)
        {
            context = intent.getAction();
            if ("com.qihoo.security.FINISH_MAIN_SCREEN".equals(context) || "com.qihoo.security.REBOOT_MAIN_SCREEN".equals(context))
            {
                a.finish();
                return;
            }
            if ("com.qihoo.security.v5.APPVersionRedPointHelper.HasNewVersion".equals(context))
            {
                SettingsActivity.k(a);
                return;
            }
            if ("com.qihoo.security.v5.APPVersionRedPointHelper.ClickedReadPoint".equals(context))
            {
                SettingsActivity.k(a);
                return;
            }
        }
    }

    (SettingsActivity settingsactivity)
    {
        a = settingsactivity;
        super();
    }
}
