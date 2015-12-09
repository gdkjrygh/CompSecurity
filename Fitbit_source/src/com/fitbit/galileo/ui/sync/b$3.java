// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.ui.sync;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

// Referenced classes of package com.fitbit.galileo.ui.sync:
//            b

class er extends BroadcastReceiver
{

    final b a;

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (context != null && ("android.bluetooth.adapter.action.STATE_CHANGED".equals(context) || "android.net.conn.CONNECTIVITY_CHANGE".equals(context)))
        {
            b.d(a).post(b.c(a));
        }
    }

    er(b b1)
    {
        a = b1;
        super();
    }
}
