// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus.list;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.qihoo.security.ui.antivirus.list:
//            VirusListActivity

class a extends BroadcastReceiver
{

    final VirusListActivity a;

    public void onReceive(Context context, Intent intent)
    {
        while (intent == null || !"com.qihoo.action.MONITOR_UPDATE".equals(intent.getAction())) 
        {
            return;
        }
        VirusListActivity.a(a);
    }

    (VirusListActivity viruslistactivity)
    {
        a = viruslistactivity;
        super();
    }
}
