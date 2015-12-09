// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

// Referenced classes of package com.google.android.gms.common.api:
//            aa

final class an extends Handler
{

    final aa a;

    an(aa aa1, Looper looper)
    {
        a = aa1;
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
            aa.m(a);
            return;

        case 2: // '\002'
            aa.l(a);
            break;
        }
    }
}
