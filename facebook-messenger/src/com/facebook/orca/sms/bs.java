// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Semaphore;

// Referenced classes of package com.facebook.orca.sms:
//            bu, br

class bs extends BroadcastReceiver
{

    final bu a;
    final Semaphore b;
    final br c;

    bs(br br, bu bu1, Semaphore semaphore)
    {
        c = br;
        a = bu1;
        b = semaphore;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        bu.a(a, getResultCode());
        b.release();
    }
}
