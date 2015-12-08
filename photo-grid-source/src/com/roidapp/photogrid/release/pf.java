// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.roidapp.photogrid.release:
//            pd, hw, ie, PhotoView, 
//            ml

final class pf
    implements Runnable
{

    final ie a;
    final int b;
    final pd c;

    pf(pd pd1, ie ie1, int i)
    {
        c = pd1;
        a = ie1;
        b = i;
        super();
    }

    public final void run()
    {
        boolean flag = hw.a(c.b);
        Object obj = a.c(true);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_422;
        }
        if (obj[0] == null) goto _L2; else goto _L1
_L1:
        if (!obj[0].equals("0")) goto _L2; else goto _L3
_L3:
        c.n = obj[1];
        if (c.n == null || c.n.equals("")) goto _L5; else goto _L4
_L4:
        c.b(95);
        obj = Message.obtain();
        obj.what = 8;
        obj.arg1 = b;
        obj.arg2 = 1;
        obj.obj = Boolean.valueOf(flag);
        c.q.sendMessage(((Message) (obj)));
_L6:
        if (c.g != null)
        {
            c.g.a = false;
        }
_L8:
        return;
_L5:
        c.m = 147;
        obj = Message.obtain();
        obj.what = 7;
        obj.arg1 = c.m;
        c.d.sendMessage(((Message) (obj)));
          goto _L6
        obj;
        ((OutOfMemoryError) (obj)).printStackTrace();
        System.gc();
        System.gc();
        obj = Message.obtain();
        obj.what = 8;
        obj.arg1 = b;
        obj.arg2 = 0;
        obj.obj = Boolean.valueOf(flag);
        c.q.sendMessage(((Message) (obj)));
        if (c.g == null) goto _L8; else goto _L7
_L7:
        c.g.a = false;
        return;
_L2:
        if (obj[0] == null) goto _L10; else goto _L9
_L9:
        if (!obj[0].equals("1")) goto _L10; else goto _L11
_L11:
        obj = Message.obtain();
        obj.what = 8;
        obj.arg1 = b;
        obj.arg2 = 0;
        obj.obj = Boolean.valueOf(flag);
        c.q.sendMessage(((Message) (obj)));
          goto _L6
        obj;
        if (c.g != null)
        {
            c.g.a = false;
        }
        throw obj;
_L10:
        if (obj[0] == null) goto _L6; else goto _L12
_L12:
        if (!obj[0].equals("2")) goto _L6; else goto _L13
_L13:
        Message message = Message.obtain();
        message.what = 8;
        message.arg1 = b;
        message.arg2 = 0;
        message.obj = Boolean.valueOf(flag);
        c.q.sendMessage(message);
          goto _L6
        c.m = 148;
        Message message1 = Message.obtain();
        message1.what = 7;
        message1.arg1 = c.m;
        c.d.sendMessage(message1);
          goto _L6
    }
}
