// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.base.broadcast:
//            b

public class n extends b
{

    protected final Context a;
    protected final String b;

    public n(Context context, String s)
    {
        a = (Context)Preconditions.checkNotNull(context);
        b = (String)Preconditions.checkNotNull(s);
    }

    protected void a(BroadcastReceiver broadcastreceiver)
    {
        a.unregisterReceiver(broadcastreceiver);
    }

    protected void a(BroadcastReceiver broadcastreceiver, IntentFilter intentfilter, Handler handler)
    {
        a.registerReceiver(broadcastreceiver, intentfilter, b, handler);
    }

    public void a(Intent intent)
    {
        a.sendBroadcast(intent, b);
    }
}
