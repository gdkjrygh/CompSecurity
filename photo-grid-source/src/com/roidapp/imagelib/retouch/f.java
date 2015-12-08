// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.retouch;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.roidapp.imagelib.retouch:
//            e, a, t, BlemishImageView

final class f extends Handler
{

    final a a;

    private f(a a1)
    {
        a = a1;
        super();
    }

    f(a a1, byte byte0)
    {
        this(a1);
    }

    public final void handleMessage(Message message)
    {
        super.handleMessage(message);
        message.what;
        JVM INSTR tableswitch 0 3: default 40
    //                   0 41
    //                   1 110
    //                   2 88
    //                   3 215;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        (new Thread(new e(a, a.c, message.arg2, com.roidapp.imagelib.retouch.a.a(a), com.roidapp.imagelib.retouch.a.b(a)))).start();
        return;
_L4:
        com.roidapp.imagelib.retouch.a.c(a).a(new OutOfMemoryError(), "");
        return;
_L3:
        if (com.roidapp.imagelib.retouch.a.c(a) != null)
        {
            if (message.obj != null)
            {
                com.roidapp.imagelib.retouch.a.a(a, (Bitmap)message.obj);
                a.b.setImageBitmap(com.roidapp.imagelib.retouch.a.d(a));
                a.b.a(false);
                a.b.invalidate();
                com.roidapp.imagelib.retouch.a.c(a).b();
                return;
            } else
            {
                com.roidapp.imagelib.retouch.a.c(a).a((Throwable)message.obj, "");
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (com.roidapp.imagelib.retouch.a.c(a) != null)
        {
            if (message.obj != null)
            {
                com.roidapp.imagelib.retouch.a.c(a).a((Uri)message.obj);
                return;
            } else
            {
                com.roidapp.imagelib.retouch.a.c(a).a((Throwable)message.obj, "");
                return;
            }
        }
        if (true) goto _L1; else goto _L6
_L6:
    }
}
