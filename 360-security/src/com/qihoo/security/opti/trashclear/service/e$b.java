// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.service;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.List;

// Referenced classes of package com.qihoo.security.opti.trashclear.service:
//            e, c, b

private class a extends Handler
{

    final e a;

    public void handleMessage(Message message)
    {
        super.handleMessage(message);
        message.what;
        JVM INSTR tableswitch 0 3: default 40
    //                   0 41
    //                   1 58
    //                   2 40
    //                   3 40;
           goto _L1 _L2 _L3 _L1 _L1
_L1:
        return;
_L2:
        message = (String)message.obj;
        a.a(message);
        return;
_L3:
        e.b(a);
        long l1;
        if (e.d(a) != null && !e.d(a).isEmpty())
        {
            int i = 0;
            long l = 0L;
            do
            {
                l1 = l;
                if (i >= e.d(a).size())
                {
                    break;
                }
                message = (c)e.d(a).get(i);
                l1 = l;
                if (message != null)
                {
                    l1 = l;
                    if (message.b() != null)
                    {
                        l += message.b().b;
                        l1 = l;
                        if (message != null)
                        {
                            message.c();
                            l1 = l;
                        }
                    }
                }
                i++;
                l = l1;
            } while (true);
        } else
        {
            l1 = 0L;
        }
        if (e.d(a) != null)
        {
            e.d(a).clear();
        }
        if (l1 > 0L && e.f(a) != null)
        {
            e.f(a).sendMessage(e.f(a).obtainMessage(0, Long.valueOf(l1)));
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public (e e1, Looper looper)
    {
        a = e1;
        super(looper);
    }
}
