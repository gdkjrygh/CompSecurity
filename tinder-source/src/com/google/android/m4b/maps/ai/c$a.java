// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ai;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.google.android.m4b.maps.ai:
//            c, b

final class init> extends BroadcastReceiver
{

    volatile boolean a;
    private c b;

    public final void onReceive(Context context, Intent intent)
    {
        if (c.a(context) && a)
        {
            c.a(b).a(b);
            context.unregisterReceiver(this);
            a = false;
        }
    }

    (c c1)
    {
        b = c1;
        super();
    }
}
