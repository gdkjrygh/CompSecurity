// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.qihoo.security.ui.b:
//            a

class eiver extends BroadcastReceiver
{

    final a a;

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null)
        {
            context = intent.getAction();
            if ("com.qihoo.security.REBOOT_MAIN_SCREEN".equals(context))
            {
                a.a("locale changed");
                return;
            }
            if ("android.intent.action.LOCALE_CHANGED".equals(context))
            {
                a.a("system locale changed");
                return;
            }
        }
    }

    eiver(a a1)
    {
        a = a1;
        super();
    }
}
