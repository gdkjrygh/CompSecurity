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

class Jq extends Handler
{

    final b Jq;

    public void handleMessage(Message message)
    {
        if (message.what != 1)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        com.google.android.gms.common.api.b.a(Jq).lock();
        boolean flag;
        if (Jq.isConnected() || Jq.isConnecting())
        {
            break MISSING_BLOCK_LABEL_52;
        }
        flag = com.google.android.gms.common.api.b.e(Jq);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        com.google.android.gms.common.api.b.a(Jq).unlock();
        return;
        com.google.android.gms.common.api.b.h(Jq);
        Jq.connect();
        com.google.android.gms.common.api.b.a(Jq).unlock();
        return;
        message;
        com.google.android.gms.common.api.b.a(Jq).unlock();
        throw message;
        Log.wtf("GoogleApiClientImpl", "Don't know how to handle this message.");
        return;
    }

    (b b1, Looper looper)
    {
        Jq = b1;
        super(looper);
    }
}
