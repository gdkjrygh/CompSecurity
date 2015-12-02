// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.support.v4.a.e;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.base.broadcast:
//            b

public class m extends b
{

    private final e a;

    public m(Context context)
    {
        a = e.a((Context)Preconditions.checkNotNull(context));
    }

    protected void a(BroadcastReceiver broadcastreceiver)
    {
        a.a(broadcastreceiver);
    }

    protected void a(BroadcastReceiver broadcastreceiver, IntentFilter intentfilter, Handler handler)
    {
        a.a(broadcastreceiver, intentfilter);
    }

    public void a(Intent intent)
    {
        a.a(intent);
    }

    protected boolean b()
    {
        return false;
    }
}
