// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class ew extends Handler
{

    public ew()
    {
        super(Looper.getMainLooper());
    }

    public final void handleMessage(Message message)
    {
        ev ev1 = (ev)message.obj;
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            eq.c(ev1.a, ev1.b[0]);
            return;

        case 2: // '\002'
            eq.a();
            break;
        }
    }
}
