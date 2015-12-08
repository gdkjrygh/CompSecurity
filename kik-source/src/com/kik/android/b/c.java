// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.android.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.kik.android.b:
//            a

final class c extends BroadcastReceiver
{

    final a a;

    c(a a1)
    {
        a = a1;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        if ("android.intent.action.SCREEN_ON".equals(intent.getAction()))
        {
            com.kik.android.b.a.c();
            com.kik.android.b.a.a(a, true);
        } else
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()))
        {
            com.kik.android.b.a.c();
            com.kik.android.b.a.a(a, false);
            return;
        }
    }
}
