// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            b

class Bs extends Handler
{

    final b Bs;

    public void handleMessage(Message message)
    {
        if (message.what != 1)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        com.google.android.gms.common.api.b.a(Bs).lock();
        if (!Bs.isConnected() && !Bs.isConnecting())
        {
            Bs.connect();
        }
        com.google.android.gms.common.api.b.a(Bs).unlock();
        return;
        message;
        com.google.android.gms.common.api.b.a(Bs).unlock();
        throw message;
        Log.wtf("GoogleApiClientImpl", "Don't know how to handle this message.");
        return;
    }

    (b b1, Looper looper)
    {
        Bs = b1;
        super(looper);
    }
}
