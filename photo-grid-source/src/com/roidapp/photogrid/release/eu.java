// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.roidapp.photogrid.release:
//            el

final class eu extends Handler
{

    final el a;

    eu(el el1)
    {
        a = el1;
        super();
    }

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            el.b(a, message.arg1);
            message = Message.obtain();
            message.what = 1;
            message.arg1 = 500;
            sendMessageDelayed(message, 200L);
            return;

        case 2: // '\002'
            el.c(a, message.arg1);
            message = Message.obtain();
            message.what = 2;
            message.arg1 = 500;
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
