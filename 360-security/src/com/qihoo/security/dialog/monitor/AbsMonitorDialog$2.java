// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.dialog.monitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.qihoo.security.dialog.monitor:
//            AbsMonitorDialog

class a extends BroadcastReceiver
{

    final AbsMonitorDialog a;

    public void onReceive(Context context, Intent intent)
    {
        if (intent == null)
        {
            return;
        }
        if ("com.qihoo.action.MONITOR_UPDATE".equals(intent.getAction()))
        {
            AbsMonitorDialog.b(a);
            return;
        } else
        {
            a.finish();
            return;
        }
    }

    (AbsMonitorDialog absmonitordialog)
    {
        a = absmonitordialog;
        super();
    }
}
