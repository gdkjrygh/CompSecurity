// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleTextView;

// Referenced classes of package com.qihoo.security.ui.opti.sysclear:
//            PowerActivity

private class <init> extends BroadcastReceiver
{

    final PowerActivity a;

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null && "android.intent.action.BATTERY_CHANGED".equals(intent.getAction()))
        {
            int i = intent.getIntExtra("level", 0);
            int j = intent.getIntExtra("scale", 100);
            PowerActivity.g(a, (i * 100) / j);
            if (!a.isFinishing())
            {
                PowerActivity.v(a).setLocalText(a.o.a(0x7f0c0037, new Object[] {
                    Integer.valueOf(PowerActivity.u(a))
                }));
            }
        }
    }

    private _cls9(PowerActivity poweractivity)
    {
        a = poweractivity;
        super();
    }

    a(PowerActivity poweractivity, a a1)
    {
        this(poweractivity);
    }
}
