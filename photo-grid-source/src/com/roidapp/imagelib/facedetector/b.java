// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.facedetector;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.roidapp.imagelib.facedetector:
//            d, a, LoadImageView, e

final class b extends Handler
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 3: default 36
    //                   0 37
    //                   1 70
    //                   2 36
    //                   3 193;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        return;
_L2:
        (new Thread(new d(a, com.roidapp.imagelib.facedetector.a.a(a), message.arg2))).start();
        return;
_L3:
        if (com.roidapp.imagelib.facedetector.a.b(a) != null)
        {
            if (message.obj != null)
            {
                com.roidapp.imagelib.facedetector.a.a(a, (Bitmap)message.obj);
                com.roidapp.imagelib.facedetector.a.c(a).getMeasuredWidth();
                com.roidapp.imagelib.facedetector.a.c(a).getMeasuredHeight();
                com.roidapp.imagelib.facedetector.a.c(a).a(com.roidapp.imagelib.facedetector.a.d(a), com.roidapp.imagelib.facedetector.a.e(a));
                com.roidapp.imagelib.facedetector.a.c(a).invalidate();
                com.roidapp.imagelib.facedetector.a.b(a).a();
                return;
            } else
            {
                com.roidapp.imagelib.facedetector.a.b(a).a((Throwable)message.obj, "");
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        message = (Uri)message.obj;
        if (com.roidapp.imagelib.facedetector.a.b(a) != null && message != null && com.roidapp.imagelib.facedetector.a.c(a) != null)
        {
            com.roidapp.imagelib.facedetector.a.b(a).a(message.getPath(), com.roidapp.imagelib.facedetector.a.c(a).a(), com.roidapp.imagelib.facedetector.a.c(a).b());
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }
}
