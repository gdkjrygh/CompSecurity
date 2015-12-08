// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.core;

import android.os.Handler;
import android.os.Message;
import com.roidapp.videolib.c;
import com.roidapp.videolib.core.a.a;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.videolib.core:
//            VideoEncodeService, b

final class k extends Handler
{

    final VideoEncodeService a;

    k(VideoEncodeService videoencodeservice)
    {
        a = videoencodeservice;
        super();
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 43520 43521: default 28
    //                   43520 29
    //                   43521 158;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        com.roidapp.videolib.core.VideoEncodeService.a(a, message.replyTo);
        a a1 = com.roidapp.videolib.core.a.a.a(message.getData());
        b b1 = new b(a.getApplicationContext());
        com.roidapp.videolib.core.VideoEncodeService.a(a, new WeakReference(b1));
        int i = a1.d();
        Object obj = a;
        float f = i;
        com.roidapp.baselib.a.a.a();
        obj = com.roidapp.baselib.a.a.a(((android.content.Context) (obj)), c.p, f * 0.2F);
        com.roidapp.baselib.a.a.a().a(((android.graphics.Bitmap) (obj)));
        boolean flag;
        if (message.arg1 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b1.a(flag, a1, VideoEncodeService.b(a));
        return;
_L3:
        if (com.roidapp.videolib.core.VideoEncodeService.a(a) != null)
        {
            message = (com.roidapp.videolib.core.a.c)com.roidapp.videolib.core.VideoEncodeService.a(a).get();
            if (message != null)
            {
                message.a();
                return;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
