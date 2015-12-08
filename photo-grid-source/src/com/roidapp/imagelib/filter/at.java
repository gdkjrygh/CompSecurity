// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import java.util.List;

// Referenced classes of package com.roidapp.imagelib.filter:
//            aj, aq, aw, as, 
//            av, az, bi, bg, 
//            b, au

final class at extends Handler
{

    final aj a;

    private at(aj aj1)
    {
        a = aj1;
        super();
    }

    at(aj aj1, byte byte0)
    {
        this(aj1);
    }

    public final void handleMessage(Message message)
    {
        super.handleMessage(message);
        if (a.isAdded()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (message.what)
        {
        default:
            return;

        case 1029: 
            continue; /* Loop/switch isn't completed */

        case 1024: 
            Object obj = message.obj;
            if (obj instanceof aq)
            {
                (new Thread(new aw(a, message.arg2, (aq)obj))).start();
                return;
            }
            continue; /* Loop/switch isn't completed */

        case 1027: 
            (new Thread(new as(a, a.a, message.arg2))).start();
            return;

        case 1028: 
            aj.a(a, (Bitmap)message.obj);
            if (aj.a(a) != null)
            {
                if (message.obj != null)
                {
                    aj.a(a).b();
                } else
                {
                    aj.a(a).a((Throwable)message.obj, "");
                }
            }
            aj.b(a, aj.b(a));
            return;

        case 1025: 
            a.o = (Uri)message.obj;
            android.graphics.Bitmap.CompressFormat compressformat;
            if (message.arg2 == 1)
            {
                compressformat = android.graphics.Bitmap.CompressFormat.PNG;
            } else
            {
                obj1 = android.graphics.Bitmap.CompressFormat.JPEG;
            }
            if (aj.a(a) != null)
            {
                Object obj1 = aj.c(a).B();
                int i;
                if (aj.d(a) == null)
                {
                    i = 100;
                } else
                {
                    i = aj.d(a).a();
                }
                if (message.arg1 != 1)
                {
                    if (message.arg1 == 0)
                    {
                        aj.a(a).a(a.o, a.a, aj.e(a).g(), ((com.roidapp.imagelib.filter.groupinfo.IGroupInfo) (obj1)), i);
                        return;
                    }
                    if (message.arg1 == 2)
                    {
                        aj.a(a).a(1, a.h, aj.e(a).g(), ((com.roidapp.imagelib.filter.groupinfo.IGroupInfo) (obj1)), i);
                        return;
                    }
                }
            }
            continue; /* Loop/switch isn't completed */

        case 1026: 
            if (aj.a(a) != null)
            {
                if (message.obj == null)
                {
                    aj.a(a).b();
                    a.l = message.arg1;
                    a.m = message.arg2;
                } else
                {
                    aj.a(a).a((Throwable)message.obj, "");
                }
            }
            if (aj.d(a) != null)
            {
                aj.d(a).invalidate();
                return;
            }
            continue; /* Loop/switch isn't completed */

        case 1030: 
            message = (List)message.obj;
            if (aj.c(a) != null)
            {
                int k = message.size();
                int j = 0;
                while (j < k) 
                {
                    aj.c(a).a((b)message.get(j), aj.f(a), new au(this));
                    j++;
                }
            }
            break;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (aj.a(a) == null) goto _L1; else goto _L4
_L4:
        aj.a(a).a(message.arg1);
        return;
    }
}
