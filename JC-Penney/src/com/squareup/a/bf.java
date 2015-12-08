// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.squareup.a:
//            ak, bg, be

class bf extends Handler
{

    private final be a;

    public bf(Looper looper, be be1)
    {
        super(looper);
        a = be1;
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            ak.a.post(new bg(this, message));
            return;

        case 0: // '\0'
            a.c();
            return;

        case 1: // '\001'
            a.d();
            return;

        case 2: // '\002'
            a.b(message.arg1);
            return;

        case 3: // '\003'
            a.c(message.arg1);
            return;

        case 4: // '\004'
            a.a((Long)message.obj);
            break;
        }
    }
}
