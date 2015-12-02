// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.facebook.analytics:
//            bt

class bv extends BroadcastReceiver
{

    final bt a;

    bv(bt bt1)
    {
        a = bt1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        while (isInitialStickyBroadcast() || bt.a(a)) 
        {
            return;
        }
        bt.a(a, context);
    }
}
