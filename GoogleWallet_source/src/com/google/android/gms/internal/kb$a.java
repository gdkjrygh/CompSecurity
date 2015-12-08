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
//            kb, kc

final class VT extends Handler
{

    final kb VT;

    public final void handleMessage(Message message)
    {
        if (message.what == 1 && !VT.isConnecting())
        {
            message = (Connecting)message.obj;
            message.iQ();
            message.unregister();
            return;
        }
        if (message.what == 3)
        {
            kb.a(VT).b(new ConnectionResult(((Integer)message.obj).intValue(), null));
            return;
        }
        if (message.what == 4)
        {
            kb.a(VT, 4, null);
            kb.a(VT).dh(((Integer)message.obj).intValue());
            kb.a(VT, 4, 1, null);
            return;
        }
        if (message.what == 2 && !VT.isConnected())
        {
            message = (Connected)message.obj;
            message.iQ();
            message.unregister();
            return;
        }
        if (message.what == 2 || message.what == 1)
        {
            ((unregister)message.obj).iR();
            return;
        } else
        {
            Log.wtf("GmsClient", "Don't know how to handle this message.");
            return;
        }
    }

    public ionResult(kb kb1, Looper looper)
    {
        VT = kb1;
        super(looper);
    }
}
