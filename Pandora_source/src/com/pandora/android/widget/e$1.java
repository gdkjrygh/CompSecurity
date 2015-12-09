// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.widget;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;

// Referenced classes of package com.pandora.android.widget:
//            e

class er extends BroadcastReceiver
{

    final e a;

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals(PandoraIntent.a("show_waiting")))
        {
            intent = intent.getStringExtra("intent_waiting_msg");
            context = intent;
            if (s.a(intent))
            {
                context = b.a.h().getString(0x7f0801c0);
            }
            e.a(a, context);
        }
    }

    ndoraIntent(e e1)
    {
        a = e1;
        super();
    }
}
