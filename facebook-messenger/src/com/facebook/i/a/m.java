// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.i.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.debug.log.b;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.facebook.i.a:
//            d, a, s, e

class m extends Handler
{

    final d a;

    private m(d d1, Looper looper)
    {
        a = d1;
        super(looper);
    }

    m(d d1, Looper looper, e e)
    {
        this(d1, looper);
    }

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 37
    //                   1 111;
           goto _L1 _L2 _L3
_L1:
        com.facebook.i.a.d.b(a, message);
_L5:
        return;
_L2:
        message = com.facebook.i.a.a.a(message.getData());
        if (d.l(a).containsKey(Integer.valueOf(((a) (message)).b)))
        {
            b.b(com/facebook/i/a/d, "%s received peer connecting reply from process %s but it has already been connected.", new Object[] {
                a.b().c, ((a) (message)).c
            });
            return;
        } else
        {
            d.a(a, message, s.Outgoing);
            return;
        }
_L3:
        message = d.a(a, message);
        if (message != null)
        {
            d.a(a, message);
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }
}
