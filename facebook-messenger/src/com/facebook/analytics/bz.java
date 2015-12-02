// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.analytics.h.e;

// Referenced classes of package com.facebook.analytics:
//            bt

class bz extends BroadcastReceiver
{

    final bt a;

    bz(bt bt1)
    {
        a = bt1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        bt.a(a, e.CLOCK_CHANGE, false);
    }
}
