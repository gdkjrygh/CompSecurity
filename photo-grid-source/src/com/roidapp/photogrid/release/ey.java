// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.roidapp.photogrid.release:
//            ev

final class ey extends Handler
{

    final ev a;

    ey(ev ev1)
    {
        a = ev1;
        super();
    }

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            ev.b(a, message.arg1);
            message = Message.obtain();
            message.what = 1;
            message.arg1 = 50;
            sendMessageDelayed(message, 200L);
            return;

        case 2: // '\002'
            ev.c(a, message.arg1);
            message = Message.obtain();
            message.what = 2;
            message.arg1 = 50;
            sendMessageDelayed(message, 200L);
            return;

        case 3: // '\003'
            removeMessages(1);
            return;

        case 4: // '\004'
            removeMessages(2);
            break;
        }
    }
}
