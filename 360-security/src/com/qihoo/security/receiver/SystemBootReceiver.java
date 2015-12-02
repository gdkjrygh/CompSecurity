// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.receiver;

import android.content.Context;
import android.content.Intent;
import com.qihoo.security.app.DaemonMain;
import com.qihoo.security.service.SecurityService;
import com.qihoo.utils.notice.c;
import com.qihoo360.mobilesafe.b.a;
import com.qihoo360.mobilesafe.share.SharedPref;

// Referenced classes of package com.qihoo.security.receiver:
//            BootReceiver

public class SystemBootReceiver extends BootReceiver
{

    public SystemBootReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        super.onReceive(context, intent);
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction()))
        {
            DaemonMain.a(context);
            if (SharedPref.b(context, "setting_auto_start", true) && SharedPref.b(context, "license", false) && SecurityService.a && c.a(context))
            {
                a.g(context);
            }
        }
    }
}
