// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

// Referenced classes of package com.fitbit.activity.ui:
//            f

class ceiver extends BroadcastReceiver
{

    final f a;

    public void onReceive(Context context, Intent intent)
    {
        if ((a.h() || a.g()) && f.b(a) != null)
        {
            f.d(a).removeCallbacks(f.c(a));
            f.d(a).postDelayed(f.c(a), 1000L);
        }
    }

    ceiver(f f1)
    {
        a = f1;
        super();
    }
}
