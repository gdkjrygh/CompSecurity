// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.concurrent.Semaphore;

// Referenced classes of package com.facebook.orca.sms:
//            w, u

class v extends BroadcastReceiver
{

    final long a;
    final w b;
    final Semaphore c;
    final u d;

    v(u u, long l, w w1, Semaphore semaphore)
    {
        d = u;
        a = l;
        b = w1;
        c = semaphore;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        context = (Uri)intent.getParcelableExtra("uri");
        int i = intent.getIntExtra("state", 0);
        if (context != null && context.getLastPathSegment().equals(Long.toString(a)))
        {
            w.a(b, i);
            c.release();
        }
    }
}
