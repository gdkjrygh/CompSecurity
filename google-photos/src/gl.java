// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class gl extends Handler
{

    private gk a;

    public gl(gk gk1, Looper looper)
    {
        a = gk1;
        super(looper);
    }

    public final void a(int i, Object obj)
    {
        obtainMessage(i, obj).sendToTarget();
    }

    public final void handleMessage(Message message)
    {
        if (!gk.b(a))
        {
            return;
        }
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            Object obj = message.obj;
            message.getData();
            return;

        case 2: // '\002'
            a.a((ib)message.obj);
            return;

        case 3: // '\003'
            a.a((fw)message.obj);
            return;

        case 5: // '\005'
            message = ((Message) (message.obj));
            return;

        case 6: // '\006'
            message = ((Message) (message.obj));
            return;

        case 7: // '\007'
            message = ((Message) (message.obj));
            return;

        case 4: // '\004'
            message = ((Message) (message.obj));
            return;

        case 8: // '\b'
            a.a();
            break;
        }
    }
}
