// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.internal:
//            jl, jm

final class MQ extends Handler
{

    final jl MQ;

    public void handleMessage(Message message)
    {
        if (message.what == 1 && !MQ.isConnecting())
        {
            message = (Connecting)message.obj;
            message.hx();
            message.unregister();
            return;
        }
        if (message.what == 3)
        {
            jl.a(MQ).b(new ConnectionResult(((Integer)message.obj).intValue(), null));
            return;
        }
        if (message.what == 4)
        {
            jl.a(MQ, 4, null);
            jl.a(MQ).aE(((Integer)message.obj).intValue());
            jl.a(MQ, 4, 1, null);
            return;
        }
        if (message.what == 2 && !MQ.isConnected())
        {
            message = (Connected)message.obj;
            message.hx();
            message.unregister();
            return;
        }
        if (message.what == 2 || message.what == 1)
        {
            ((unregister)message.obj).hy();
            return;
        } else
        {
            Log.wtf("GmsClient", "Don't know how to handle this message.");
            return;
        }
    }

    public ionResult(jl jl1, Looper looper)
    {
        MQ = jl1;
        super(looper);
    }
}
