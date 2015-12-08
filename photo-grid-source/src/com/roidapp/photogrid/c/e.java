// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.c;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.ThreadPoolExecutor;

// Referenced classes of package com.roidapp.photogrid.c:
//            d, c, b

final class e extends Handler
{

    final d a;

    e(d d1)
    {
        a = d1;
        super();
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 7: default 48
    //                   1 79
    //                   2 49
    //                   3 115
    //                   4 139
    //                   5 92
    //                   6 48
    //                   7 170;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L1 _L7
_L1:
        return;
_L3:
        d.b(a).a(new Integer[] {
            Integer.valueOf(d.a(a))
        });
        return;
_L2:
        d.b(a).h();
        return;
_L6:
        d.b(a).a(b.c, message.obj.toString());
        return;
_L4:
        if (message.obj != null)
        {
            d.b(a);
            message.obj.toString();
            return;
        }
          goto _L1
_L5:
        d.c();
        d.b(a).i();
        d.b.remove(d.c(a));
        return;
_L7:
        d.c();
        return;
    }
}
