// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.h;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.m4b.maps.h:
//            h

final class a extends Handler
{

    private h a;

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 61
    //                   2 108;
           goto _L1 _L2 _L3
_L1:
        int i = message.what;
        Log.w("GoogleApiClientImpl", (new StringBuilder(31)).append("Unknown message id: ").append(i).toString());
        return;
_L2:
        message = a;
        ((h) (message)).a.lock();
        if (message.g())
        {
            message.b();
        }
        ((h) (message)).a.unlock();
        return;
        Exception exception;
        exception;
        ((h) (message)).a.unlock();
        throw exception;
_L3:
        h.a(a);
        return;
    }

    (h h1, Looper looper)
    {
        a = h1;
        super(looper);
    }
}
