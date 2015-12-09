// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.pandora.android.ads:
//            c

class eiver extends BroadcastReceiver
{

    final c a;

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (context.equals("android.intent.action.USER_PRESENT"))
        {
            intent = a;
            if (c.g(a) == null)
            {
                context = "station_change";
            } else
            {
                context = "return";
            }
            intent.a(-1, context, true);
        } else
        {
            if (context.equals("android.intent.action.SCREEN_ON"))
            {
                c.b(a, true);
                a.a(-1, "screen_on", false);
                return;
            }
            if (context.equals("android.intent.action.SCREEN_OFF"))
            {
                c.b(a, false);
                return;
            }
        }
    }

    eiver(c c1)
    {
        a = c1;
        super();
    }
}
