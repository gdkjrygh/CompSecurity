// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.o;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.common.internal:
//            ad, aa

final class ac extends Handler
{

    final aa a;

    public ac(aa aa1, Looper looper)
    {
        a = aa1;
        super(looper);
    }

    private static void a(Message message)
    {
        ((ad)message.obj).c();
    }

    private static boolean b(Message message)
    {
        return message.what == 2 || message.what == 1 || message.what == 5 || message.what == 6;
    }

    public final void handleMessage(Message message)
    {
        if (a.c.get() != message.arg1)
        {
            if (b(message))
            {
                a(message);
            }
            return;
        }
        if ((message.what == 1 || message.what == 5 || message.what == 6) && !a.isConnecting())
        {
            a(message);
            return;
        }
        if (message.what == 3)
        {
            message = new ConnectionResult(message.arg2, null);
            aa.a(a).a(message);
            aa.g_();
            return;
        }
        if (message.what == 4)
        {
            aa.a(a, 4);
            if (aa.b(a) != null)
            {
                aa.b(a).onConnectionSuspended(message.arg2);
            }
            int i = message.arg2;
            aa.c();
            aa.a(a, 4, 1, null);
            return;
        }
        if (message.what == 2 && !a.isConnected())
        {
            a(message);
            return;
        }
        if (b(message))
        {
            ((ad)message.obj).b();
            return;
        } else
        {
            Log.wtf("GmsClient", (new StringBuilder("Don't know how to handle message: ")).append(message.what).toString(), new Exception());
            return;
        }
    }
}
