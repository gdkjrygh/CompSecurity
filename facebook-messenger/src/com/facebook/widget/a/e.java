// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.a;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.facebook.widget.a:
//            c, a, i, h, 
//            j, b

class e extends Handler
{

    final a a;

    private e(a a1)
    {
        a = a1;
        super();
    }

    e(a a1, b b)
    {
        this(a1);
    }

    public void handleMessage(Message message)
    {
        int k;
        c c1 = (c)message.obj;
        a.a(c1.a, c1.c);
        if (c1.b == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        if (c1.c != null)
        {
            k = c1.c.b;
        } else
        {
            k = -1;
        }
        c1.b.a(k);
        message = ((Message) (com.facebook.widget.a.a.b(a)));
        message;
        JVM INSTR monitorenter ;
        Exception exception;
        if (com.facebook.widget.a.a.c(a) != null && com.facebook.widget.a.a.c(a).hasMessages(0xd0d0f00d))
        {
            k = 0;
        } else
        {
            k = 1;
        }
        message;
        JVM INSTR monitorexit ;
        if (k != 0)
        {
            c1.b.a(j.FINISHED);
        }
        return;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
