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
//            hc, hd

final class Gf extends Handler
{

    final hc Gf;

    public void handleMessage(Message message)
    {
        if (message.what == 1 && !Gf.isConnecting())
        {
            message = (Connecting)message.obj;
            message.fp();
            message.unregister();
            return;
        }
        if (message.what == 3)
        {
            hc.a(Gf).a(new ConnectionResult(((Integer)message.obj).intValue(), null));
            return;
        }
        if (message.what == 4)
        {
            hc.a(Gf, 1);
            hc.a(Gf, null);
            hc.a(Gf).ao(((Integer)message.obj).intValue());
            return;
        }
        if (message.what == 2 && !Gf.isConnected())
        {
            message = (Connected)message.obj;
            message.fp();
            message.unregister();
            return;
        }
        if (message.what == 2 || message.what == 1)
        {
            ((unregister)message.obj).fq();
            return;
        } else
        {
            Log.wtf("GmsClient", "Don't know how to handle this message.");
            return;
        }
    }

    public ionResult(hc hc1, Looper looper)
    {
        Gf = hc1;
        super(looper);
    }
}
