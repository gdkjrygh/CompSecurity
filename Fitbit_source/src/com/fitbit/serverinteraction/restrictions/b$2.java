// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.restrictions;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.fitbit.serverinteraction.restrictions:
//            b

class a extends BroadcastReceiver
{

    final b a;

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if ("com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_FOREGROUND".equals(context))
        {
            a.a(false);
        } else
        if ("com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_BACKGROUND".equals(context))
        {
            b.b(a);
            return;
        }
    }

    (b b1)
    {
        a = b1;
        super();
    }
}
