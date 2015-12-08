// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.crop;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.roidapp.imagelib.filter.av;

// Referenced classes of package com.roidapp.imagelib.crop:
//            n, j, CropImageView, q, 
//            p

final class k extends Handler
{

    final j a;

    k(j j1)
    {
        a = j1;
        super();
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 4: default 40
    //                   0 41
    //                   1 74
    //                   2 232
    //                   3 265
    //                   4 355;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return;
_L2:
        (new Thread(new n(a, a.d, message.arg2))).start();
        return;
_L3:
        if (j.a(a) != null)
        {
            if (message.obj != null)
            {
                j.a(a, (Bitmap)message.obj);
                j.c(a).setImageBitmap(j.b(a));
                j.c(a).a(j.b(a));
                if (j.d(a))
                {
                    j.a(a, 1, 1);
                } else
                {
                    j.a(a, j.e(a)[0], j.e(a)[1]);
                }
                j.a(a).b();
            } else
            {
                j.a(a).a((Throwable)message.obj, "");
            }
            j.f(a);
            return;
        }
          goto _L1
_L4:
        (new Thread(new q(a, message.arg1, message.arg2, android.graphics.Bitmap.CompressFormat.JPEG))).start();
        return;
_L5:
        p p1 = (p)message.obj;
        if (message.arg1 == 1)
        {
            message = android.graphics.Bitmap.CompressFormat.PNG;
        } else
        {
            message = android.graphics.Bitmap.CompressFormat.JPEG;
        }
        if (j.a(a) != null)
        {
            j.a(a).a(p1.a, p1.b.getPath(), a.h, a.g, j.g(a));
        }
        j.f(a);
        return;
_L6:
        a.f = (Uri)message.obj;
        if (j.a(a) != null)
        {
            if (a.f != null)
            {
                j.a(a).a(0, a.f.getPath(), a.h, a.g, j.g(a));
            } else
            {
                j.a(a).a(0, a.a, a.h, a.g, j.g(a));
            }
        }
        j.f(a);
        return;
    }
}
