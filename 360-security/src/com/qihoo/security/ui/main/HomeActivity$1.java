// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.qihoo.security.ui.fragment.utils.FragmentAction;

// Referenced classes of package com.qihoo.security.ui.main:
//            HomeActivity

class a extends BroadcastReceiver
{

    final HomeActivity a;

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null)
        {
            context = intent.getAction();
            if ("com.qihoo.security.FINISH_MAIN_SCREEN".equals(context))
            {
                a.finish();
                return;
            }
            if ("com.qihoo.security.REBOOT_MAIN_SCREEN".equals(context))
            {
                a.finish();
                a.startActivity(new Intent(a, com/qihoo/security/ui/main/HomeActivity));
                return;
            }
            if ("com.qihoo.security.RESET_MAIN_SCREEN".equals(context))
            {
                a.a(FragmentAction.RESULT_ACTION_FINISH, null);
                return;
            }
            if ("com.qihoo.security.v5.APPVersionRedPointHelper.HasNewVersion".equals(context))
            {
                HomeActivity.a(a);
                return;
            }
            if ("com.qihoo.security.v5.APPVersionRedPointHelper.ClickedReadPoint".equals(context))
            {
                HomeActivity.a(a);
                return;
            }
        }
    }

    entAction(HomeActivity homeactivity)
    {
        a = homeactivity;
        super();
    }
}
