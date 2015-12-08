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
//            ff, fg

final class Dh extends Handler
{

    final ff Dh;

    public void handleMessage(Message message)
    {
        if (message.what == 1 && !Dh.isConnecting())
        {
            message = (Connecting)message.obj;
            message.dx();
            message.unregister();
            return;
        }
        if (message.what == 3)
        {
            ff.a(Dh).a(new ConnectionResult(((Integer)message.obj).intValue(), null));
            return;
        }
        if (message.what == 4)
        {
            ff.a(Dh, 1);
            ff.a(Dh, null);
            ff.a(Dh).O(((Integer)message.obj).intValue());
            return;
        }
        if (message.what == 2 && !Dh.isConnected())
        {
            message = (Connected)message.obj;
            message.dx();
            message.unregister();
            return;
        }
        if (message.what == 2 || message.what == 1)
        {
            ((unregister)message.obj).eN();
            return;
        } else
        {
            Log.wtf("GmsClient", "Don't know how to handle this message.");
            return;
        }
    }

    public ionResult(ff ff1, Looper looper)
    {
        Dh = ff1;
        super(looper);
    }
}
