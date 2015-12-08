// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.a;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.roidapp.baselib.gl.c;
import com.roidapp.imagelib.filter.FilterListView;

// Referenced classes of package com.roidapp.imagelib.a:
//            x, i, a, z, 
//            y

final class j extends Handler
{

    final i a;

    j(i k)
    {
        a = k;
        super();
    }

    public final void handleMessage(Message message)
    {
        super.handleMessage(message);
        message.what;
        JVM INSTR tableswitch 1 7: default 52
    //                   1 94
    //                   2 184
    //                   3 203
    //                   4 222
    //                   5 248
    //                   6 53
    //                   7 79;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        return;
_L7:
        (new Thread(new x(a, message.arg1))).start();
        return;
_L8:
        i.a(a, (Bitmap)message.obj);
        return;
_L2:
        i.a(a, true);
        i.a(a, (String)message.obj);
        i.a(a).b(false);
        if (c.a().c())
        {
            (new Thread(new x(a, 0))).start();
            return;
        } else
        {
            (new Thread(new z(a, 0))).start();
            return;
        }
_L3:
        i.a(a, new Exception("Image Capture Error"), "");
        return;
_L4:
        i.a(a, new Exception("Preview error and return"), "");
        return;
_L5:
        (new Thread(new z(a, message.arg1))).start();
        return;
_L6:
        Object obj = (Uri)message.obj;
        if (i.b(a) != null && obj != null)
        {
            y y1;
            String s;
            if (com.roidapp.imagelib.a.i.c(a) == null)
            {
                message = "ManualSelType";
            } else
            {
                message = com.roidapp.imagelib.a.i.c(a).b();
            }
            y1 = i.b(a);
            obj = ((Uri) (obj)).getPath();
            s = a.b;
            y1.a(((String) (obj)), i.a(a).d(), i.a(a).f(), message);
            return;
        }
        if (true) goto _L1; else goto _L9
_L9:
    }
}
