// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.base.broadcast.q;

// Referenced classes of package com.facebook.orca.app:
//            LoginReminderManager

class d extends q
{

    final LoginReminderManager a;

    d(LoginReminderManager loginremindermanager, Context context, IntentFilter intentfilter)
    {
        a = loginremindermanager;
        super(context, intentfilter);
    }

    public void a(Context context, Intent intent)
    {
        context = intent.getAction();
        if ("com.facebook.orca.login.AuthStateMachineMonitor.SHOWING_LOGIN_UI".equals(context))
        {
            a.b();
        } else
        {
            if ("com.facebook.orca.login.AuthStateMachineMonitor.LOGIN_COMPLETE".equals(context))
            {
                a.c();
                return;
            }
            if ("com.facebook.orca.login.AuthStateMachineMonitor.LOGOUT_COMPLETE".equals(context))
            {
                a.a();
                return;
            }
        }
    }
}
