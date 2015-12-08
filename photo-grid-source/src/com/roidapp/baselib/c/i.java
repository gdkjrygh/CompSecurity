// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.c;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.roidapp.baselib.c:
//            h, c

final class i extends Handler
{

    private i()
    {
    }

    i(byte byte0)
    {
        this();
    }

    public final void handleMessage(Message message)
    {
        h h1 = (h)message.obj;
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            c.access$600(h1.a, h1.b[0]);
            return;

        case 2: // '\002'
            h1.a.onProgressUpdate(h1.b);
            break;
        }
    }
}
