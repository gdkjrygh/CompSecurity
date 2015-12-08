// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.tremorvideo.sdk.android.d:
//            o

class q extends BroadcastReceiver
{

    final o a;
    private int b;

    q(o o1)
    {
        a = o1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("android.intent.action.CONFIGURATION_CHANGED"))
        {
            int i = o.c(a);
            if (i != b)
            {
                b = i;
                o.a(a, b);
            }
        }
    }
}
