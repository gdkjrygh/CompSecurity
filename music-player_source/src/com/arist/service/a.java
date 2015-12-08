// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arist.activity.MyApplication;
import com.arist.c.g;

// Referenced classes of package com.arist.service:
//            DeskLrcService

final class a extends BroadcastReceiver
{

    final DeskLrcService a;

    a(DeskLrcService desklrcservice)
    {
        a = desklrcservice;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (com.arist.c.a.j.equals(intent.getAction()))
        {
            a.a(MyApplication.g());
        } else
        {
            if (com.arist.c.a.r.equals(intent.getAction()))
            {
                int i = intent.getIntExtra("musicProgress", 0);
                a.b(i);
                return;
            }
            if (com.arist.c.a.C.equals(intent.getAction()))
            {
                if (intent.getBooleanExtra("dismiss", false) || g.a(context))
                {
                    DeskLrcService.a(a, false);
                    return;
                } else
                {
                    DeskLrcService.a(a, true);
                    return;
                }
            }
        }
    }
}
