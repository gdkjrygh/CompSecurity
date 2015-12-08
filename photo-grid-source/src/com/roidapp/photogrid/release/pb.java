// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.os.Message;
import com.roidapp.photogrid.common.c;

// Referenced classes of package com.roidapp.photogrid.release:
//            ie, pa, ml, PhotoView

final class pb
    implements Runnable
{

    final ie a;
    final pa b;

    pb(pa pa1, ie ie1)
    {
        b = pa1;
        a = ie1;
        super();
    }

    public final void run()
    {
        Object obj = a.c(false);
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (obj[0] == null) goto _L4; else goto _L3
_L3:
        if (!obj[0].equals("0")) goto _L4; else goto _L5
_L5:
        b.e = obj[1];
        if (b.e == null || b.e.equals("")) goto _L7; else goto _L6
_L6:
        b.d.a(95, 1);
        b.a(b.b, b.e);
_L8:
        if (b.g != null)
        {
            b.g.a = false;
        }
_L12:
        return;
_L7:
        obj = Message.obtain();
        obj.what = 7;
        obj.arg1 = 144;
        b.d.sendMessage(((Message) (obj)));
          goto _L8
        obj;
        ((OutOfMemoryError) (obj)).printStackTrace();
        System.gc();
        System.gc();
        if (b.f != 480) goto _L10; else goto _L9
_L9:
        b.f = 320;
        b.q.sendEmptyMessage(1);
_L19:
        if (b.g == null) goto _L12; else goto _L11
_L11:
        b.g.a = false;
        return;
_L4:
        if (obj[0] == null) goto _L14; else goto _L13
_L13:
        if (!obj[0].equals("1")) goto _L14; else goto _L15
_L15:
        Message message = Message.obtain();
        message.what = 700;
        message.obj = obj[1];
        b.q.sendMessage(message);
          goto _L8
        obj;
        ((Exception) (obj)).printStackTrace();
        if (!(new StringBuilder()).append(((Exception) (obj)).getMessage()).toString().contains("No space"))
        {
            break MISSING_BLOCK_LABEL_763;
        }
        b.q.sendEmptyMessage(702);
_L20:
        if (b.g == null) goto _L12; else goto _L16
_L16:
        b.g.a = false;
        return;
_L14:
        if (obj[0] == null) goto _L8; else goto _L17
_L17:
        if (!obj[0].equals("2")) goto _L8; else goto _L18
_L18:
        Message message1 = Message.obtain();
        message1.what = 701;
        message1.obj = obj[1];
        b.q.sendMessage(message1);
          goto _L8
        obj;
        if (b.g != null)
        {
            b.g.a = false;
        }
        throw obj;
_L2:
        obj = Message.obtain();
        obj.what = 7;
        obj.arg1 = 145;
        b.d.sendMessage(((Message) (obj)));
          goto _L8
_L10:
label0:
        {
            if (b.f != 540)
            {
                break label0;
            }
            b.f = 480;
            b.q.sendEmptyMessage(1);
        }
          goto _L19
label1:
        {
            if (b.f != 720)
            {
                break label1;
            }
            b.f = 540;
            b.q.sendEmptyMessage(1);
        }
          goto _L19
label2:
        {
            if (b.f != 1024)
            {
                break label2;
            }
            b.f = 720;
            b.q.sendEmptyMessage(1);
        }
          goto _L19
label3:
        {
            if (b.f != 1080)
            {
                break label3;
            }
            b.f = 1024;
            b.q.sendEmptyMessage(1);
        }
          goto _L19
label4:
        {
            if (b.f != 1660)
            {
                break label4;
            }
            b.f = 1080;
            b.q.sendEmptyMessage(1);
        }
          goto _L19
label5:
        {
            if (b.f != 1920)
            {
                break label5;
            }
            b.f = 1080;
            b.q.sendEmptyMessage(1);
        }
          goto _L19
label6:
        {
            if (b.f != 2048)
            {
                break label6;
            }
            b.f = 1920;
            b.q.sendEmptyMessage(1);
        }
          goto _L19
label7:
        {
            if (b.f <= 2048)
            {
                break label7;
            }
            b.f = 2048;
            b.q.sendEmptyMessage(1);
        }
          goto _L19
        b.d.a(146);
          goto _L19
        c.a(b.q, ((Throwable) (obj)));
          goto _L20
    }
}
