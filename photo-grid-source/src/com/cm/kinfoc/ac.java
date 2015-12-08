// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.kinfoc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

// Referenced classes of package com.cm.kinfoc:
//            z

final class ac extends BroadcastReceiver
{

    final z a;

    ac(z z1)
    {
        a = z1;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("com.roidapp.photogrid.common.kinfoc.ActivityTimer") && z.b(a) != null)
        {
            if (z.d())
            {
                z.a((new StringBuilder("REPORT=")).append(System.currentTimeMillis()).toString());
            }
            z.b(a).post(z.c(a));
        }
    }
}
