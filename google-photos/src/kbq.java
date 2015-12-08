// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicInteger;

final class kbq extends Handler
{

    private kbo a;

    public kbq(kbo kbo1, Looper looper)
    {
        a = kbo1;
        super(looper);
    }

    private static void a(Message message)
    {
        ((kbr)message.obj).c();
    }

    private static boolean b(Message message)
    {
        return message.what == 2 || message.what == 1 || message.what == 5 || message.what == 6;
    }

    public final void handleMessage(Message message)
    {
        if (a.i.get() != message.arg1)
        {
            if (b(message))
            {
                a(message);
            }
            return;
        }
        if ((message.what == 1 || message.what == 5 || message.what == 6) && !a.m())
        {
            a(message);
            return;
        }
        if (message.what == 3)
        {
            message = new ConnectionResult(message.arg2, null);
            kbo.a(a).a(message);
            a.a(message);
            return;
        }
        if (message.what == 4)
        {
            kbo.a(a, 4, null);
            if (kbo.b(a) != null)
            {
                kbo.b(a).a(message.arg2);
            }
            int i = message.arg2;
            kbo.l();
            kbo.a(a, 4, 1, null);
            return;
        }
        if (message.what == 2 && !a.j())
        {
            a(message);
            return;
        }
        if (b(message))
        {
            ((kbr)message.obj).b();
            return;
        } else
        {
            Log.wtf("GmsClient", "Don't know how to handle this message.");
            return;
        }
    }
}
