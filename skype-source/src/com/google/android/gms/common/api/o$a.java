// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

// Referenced classes of package com.google.android.gms.common.api:
//            o

final class a extends Handler
{

    final o a;

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            Log.w("GoogleApiClientImpl", (new StringBuilder("Unknown message id: ")).append(message.what).toString());
            return;

        case 1: // '\001'
            o.d(a);
            return;

        case 2: // '\002'
            o.c(a);
            return;

        case 3: // '\003'
            ((a)message.obj).a(a);
            return;

        case 4: // '\004'
            throw (RuntimeException)message.obj;
        }
    }

    (o o1, Looper looper)
    {
        a = o1;
        super(looper);
    }
}
