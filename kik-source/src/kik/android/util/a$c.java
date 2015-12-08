// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package kik.android.util:
//            a

private final class nit> extends Handler
{

    final a a;

    public final void handleMessage(Message message)
    {
        super.handleMessage(message);
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            removeMessages(1, message.obj);
            removeMessages(2, message.obj);
            message = (j)message.obj;
            kik.android.util.a.a(a, message, 1);
            return;

        case 2: // '\002'
            removeMessages(2, message.obj);
            message = (j)message.obj;
            kik.android.util.a.a(a, message, 2);
            return;

        case 3: // '\003'
            message = (a)message.obj;
            break;
        }
        kik.android.util.a.a(a, a(message), b(message), c(message));
    }

    public (a a1, Looper looper)
    {
        a = a1;
        super(looper);
    }
}
