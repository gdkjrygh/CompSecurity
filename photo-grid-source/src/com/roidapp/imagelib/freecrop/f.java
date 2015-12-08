// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.freecrop;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.roidapp.imagelib.filter.av;

// Referenced classes of package com.roidapp.imagelib.freecrop:
//            j, e, k

final class f extends Handler
{

    final e a;

    f(e e1)
    {
        a = e1;
        super();
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 49
    //                   1: 82
    //                   1024: 164
    //                   1025: 193;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        (new Thread(new j(a, a.b, message.arg2))).start();
        return;
_L3:
        if (e.a(a) != null)
        {
            if (message.obj != null)
            {
                e.a(a, (Bitmap)message.obj);
                e.b(a);
                e.c(a);
                e.a(a).b();
                return;
            } else
            {
                e.a(a).a((Throwable)message.obj, "");
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        (new Thread(new k(a, e.d(a)))).start();
        return;
_L5:
        e.b(a);
        if (e.a(a) != null)
        {
            e.a(a).a((Uri)message.obj, null, null, null, 100);
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }
}
