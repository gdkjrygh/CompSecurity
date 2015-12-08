// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.common.internal:
//            j

final class a extends Handler
{

    final j a;

    private static void a(Message message)
    {
        ((a)message.obj).c();
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
        if ((message.what == 1 || message.what == 5 || message.what == 6) && !a.j())
        {
            a(message);
            return;
        }
        if (message.what == 3)
        {
            message = new ConnectionResult(message.arg2, null);
            j.a(a).a(message);
            j.g_();
            return;
        }
        if (message.what == 4)
        {
            j.a(a, 4);
            if (j.b(a) != null)
            {
                j.b(a).a(message.arg2);
            }
            int i = message.arg2;
            j.g();
            j.a(a, 4, 1, null);
            return;
        }
        if (message.what == 2 && !a.b())
        {
            a(message);
            return;
        }
        if (b(message))
        {
            ((b)message.obj).b();
            return;
        } else
        {
            Log.wtf("GmsClient", (new StringBuilder("Don't know how to handle message: ")).append(message.what).toString(), new Exception());
            return;
        }
    }

    public ult(j j1, Looper looper)
    {
        a = j1;
        super(looper);
    }
}
