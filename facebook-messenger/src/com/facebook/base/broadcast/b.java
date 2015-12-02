// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.broadcast;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.base.broadcast:
//            j, d, k

public abstract class b
    implements j
{

    public b()
    {
    }

    public k a()
    {
        return new d(this);
    }

    protected abstract void a(BroadcastReceiver broadcastreceiver);

    protected abstract void a(BroadcastReceiver broadcastreceiver, IntentFilter intentfilter, Handler handler);

    public void a(String s)
    {
        Preconditions.checkNotNull(s);
        a(new Intent(s));
    }

    protected boolean b()
    {
        return true;
    }
}
