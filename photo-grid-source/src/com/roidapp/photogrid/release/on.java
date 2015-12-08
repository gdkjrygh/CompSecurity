// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.roidapp.photogrid.release:
//            ol, hw, ml, PhotoView

final class on
    implements Runnable
{

    final int a;
    final ol b;

    on(ol ol1, int i)
    {
        b = ol1;
        a = i;
        super();
    }

    public final void run()
    {
        Object obj;
        boolean flag;
        flag = hw.a(b.b);
        try
        {
            Thread.sleep(1000L);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((InterruptedException) (obj)).printStackTrace();
        }
        b.b(15);
        obj = ol.a(b, a);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_388;
        }
        if (obj[0] == null) goto _L2; else goto _L1
_L1:
        if (!obj[0].equals("0")) goto _L2; else goto _L3
_L3:
        b.n = obj[1];
        if (b.n == null || b.n.equals("")) goto _L5; else goto _L4
_L4:
        obj = Message.obtain();
        obj.what = 8;
        obj.arg1 = a;
        obj.arg2 = 1;
        obj.obj = Boolean.valueOf(flag);
        b.q.sendMessage(((Message) (obj)));
_L7:
        return;
_L5:
        try
        {
            b.m = 147;
            obj = Message.obtain();
            obj.what = 7;
            obj.arg1 = b.m;
            b.d.sendMessage(((Message) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            System.gc();
        }
        System.gc();
        if (b.g != null)
        {
            b.g.a = false;
        }
        Message message2 = Message.obtain();
        message2.what = 8;
        message2.arg1 = a;
        message2.arg2 = 0;
        message2.obj = Boolean.valueOf(flag);
        b.q.sendMessage(message2);
        ((OutOfMemoryError) (obj)).printStackTrace();
        return;
_L2:
        if (obj[0] == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (obj[0].equals("1"))
        {
            obj = Message.obtain();
            obj.what = 8;
            obj.arg1 = a;
            obj.arg2 = 0;
            obj.obj = Boolean.valueOf(flag);
            b.q.sendMessage(((Message) (obj)));
            return;
        }
        if (obj[0] == null) goto _L7; else goto _L6
_L6:
        if (!obj[0].equals("2")) goto _L7; else goto _L8
_L8:
        Message message = Message.obtain();
        message.what = 8;
        message.arg1 = a;
        message.arg2 = 0;
        message.obj = Boolean.valueOf(flag);
        b.q.sendMessage(message);
        return;
        b.m = 148;
        Message message1 = Message.obtain();
        message1.what = 7;
        message1.arg1 = b.m;
        b.d.sendMessage(message1);
        return;
    }
}
