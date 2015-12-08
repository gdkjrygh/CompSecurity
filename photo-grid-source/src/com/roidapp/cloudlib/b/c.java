// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.b;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.roidapp.cloudlib.b:
//            a

final class c extends Handler
{

    final a a;

    c(a a1)
    {
        a = a1;
        super();
    }

    public final void handleMessage(Message message)
    {
        super.handleMessage(message);
        if (message.what == 0)
        {
            if (message.obj != null && ((String)message.obj).equals(com.roidapp.cloudlib.b.a.c(a)))
            {
                a.a(0);
            }
        } else
        if (message.what == 1 && message.obj != null && ((String)message.obj).equals(com.roidapp.cloudlib.b.a.c(a)))
        {
            a.a(1);
            return;
        }
    }
}
