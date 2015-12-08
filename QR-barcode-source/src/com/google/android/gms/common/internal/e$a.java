// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//            e, f

final class LF extends Handler
{

    final e LF;

    public void handleMessage(Message message)
    {
        if (message.what == 1 && !LF.isConnecting())
        {
            message = (Connecting)message.obj;
            message.gT();
            message.unregister();
            return;
        }
        if (message.what == 3)
        {
            e.a(LF).b(new ConnectionResult(((Integer)message.obj).intValue(), null));
            return;
        }
        if (message.what == 4)
        {
            e.a(LF, 1);
            e.a(LF, null);
            e.a(LF).aB(((Integer)message.obj).intValue());
            return;
        }
        if (message.what == 2 && !LF.isConnected())
        {
            message = (Connected)message.obj;
            message.gT();
            message.unregister();
            return;
        }
        if (message.what == 2 || message.what == 1)
        {
            ((unregister)message.obj).gU();
            return;
        } else
        {
            Log.wtf("GmsClient", "Don't know how to handle this message.");
            return;
        }
    }

    public ult(e e1, Looper looper)
    {
        LF = e1;
        super(looper);
    }
}
