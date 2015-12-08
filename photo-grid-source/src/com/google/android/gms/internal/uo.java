// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

// Referenced classes of package com.google.android.gms.internal:
//            uj, up

final class uo extends Handler
{

    final uj a;

    uo(uj uj1, Looper looper)
    {
        a = uj1;
        super(looper);
    }

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            Log.w("GoogleApiClientImpl", (new StringBuilder("Unknown message id: ")).append(message.what).toString());
            return;

        case 1: // '\001'
            uj.e(a);
            return;

        case 2: // '\002'
            uj.d(a);
            return;

        case 3: // '\003'
            ((up)message.obj).a(a);
            return;

        case 4: // '\004'
            throw (RuntimeException)message.obj;
        }
    }
}
