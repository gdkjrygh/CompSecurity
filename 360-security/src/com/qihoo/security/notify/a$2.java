// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.notify;

import android.os.Handler;
import android.os.Message;
import com.qihoo.security.service.a;

// Referenced classes of package com.qihoo.security.notify:
//            a

class a
    implements Runnable
{

    final com.qihoo.security.notify.a a;

    public void run()
    {
        int i = 0;
        int j = com.qihoo.security.notify.a.c(a).c();
        i = j;
_L2:
        if (i >= 85)
        {
            Message message = new Message();
            message.what = 2;
            message.arg1 = i;
            com.qihoo.security.notify.a.d(a).sendMessage(message);
        }
        return;
        Exception exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    (com.qihoo.security.notify.a a1)
    {
        a = a1;
        super();
    }
}
