// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arist.activity.MyApplication;
import com.arist.c.f;

// Referenced classes of package com.arist.service:
//            b, MusicPlayService

final class c extends BroadcastReceiver
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (intent.hasExtra("state"))
        {
            if (intent.getIntExtra("state", 0) == 0)
            {
                if (MyApplication.e.i() && MyApplication.d() && b.a(a) != null)
                {
                    b.a(a).a();
                }
            } else
            if (intent.getIntExtra("state", 0) == 1 && MyApplication.e.j() && !MyApplication.d() && b.a(a) != null)
            {
                b.a(a).a();
                return;
            }
        }
    }
}
