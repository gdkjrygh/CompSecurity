// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.os.Message;
import com.roidapp.photogrid.common.c;

// Referenced classes of package com.roidapp.photogrid.release:
//            ol, ml

final class om
    implements Runnable
{

    final ol a;

    om(ol ol1)
    {
        a = ol1;
        super();
    }

    public final void run()
    {
        Object obj;
        try
        {
            Thread.sleep(1000L);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((InterruptedException) (obj)).printStackTrace();
        }
        ol.a(a);
        obj = ol.a(a, a.f, a.c());
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_386;
        }
        if (obj[0] == null)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        if (!obj[0].equals("0"))
        {
            break MISSING_BLOCK_LABEL_182;
        }
        a.e = obj[1];
        if (a.e != null && !a.e.equals(""))
        {
            a.a(a.b, a.e);
            return;
        }
        Message message;
        try
        {
            a.d.a(144);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            System.gc();
            System.gc();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).printStackTrace();
            Message message1;
            if ((new StringBuilder()).append(((Exception) (obj)).getMessage()).toString().contains("No space"))
            {
                a.q.sendEmptyMessage(702);
                return;
            } else
            {
                a.q.sendEmptyMessage(700);
                c.a(a.q, ((Throwable) (obj)));
                return;
            }
        }
        if (a.f == 480)
        {
            a.f = 320;
            a.q.sendEmptyMessage(1);
        } else
        if (a.f == 540)
        {
            a.f = 480;
            a.q.sendEmptyMessage(1);
        } else
        if (a.f == 720)
        {
            a.f = 540;
            a.q.sendEmptyMessage(1);
        } else
        if (a.f == 1024)
        {
            a.f = 720;
            a.q.sendEmptyMessage(1);
        } else
        if (a.f == 1080)
        {
            a.f = 1024;
            a.q.sendEmptyMessage(1);
        } else
        if (a.f == 1660)
        {
            a.f = 1080;
            a.q.sendEmptyMessage(1);
        } else
        if (a.f == 1920)
        {
            a.f = 1660;
            a.q.sendEmptyMessage(1);
        } else
        if (a.f == 2048)
        {
            a.f = 1920;
            a.q.sendEmptyMessage(1);
        } else
        if (a.f > 2048)
        {
            a.f = 2048;
            a.q.sendEmptyMessage(1);
        } else
        {
            a.d.a(146);
        }
        ((OutOfMemoryError) (obj)).printStackTrace();
        return;
        if (obj[0] == null)
        {
            break MISSING_BLOCK_LABEL_275;
        }
        if (obj[0].equals("1"))
        {
            message = Message.obtain();
            message.what = 700;
            message.obj = obj[1];
            a.q.sendMessage(message);
            return;
        }
        if (obj[0] == null)
        {
            break MISSING_BLOCK_LABEL_323;
        }
        if (obj[0].equals("2"))
        {
            message1 = Message.obtain();
            message1.what = 701;
            message1.obj = obj[1];
            a.q.sendMessage(message1);
            return;
        }
        if (obj[0] == null)
        {
            break MISSING_BLOCK_LABEL_355;
        }
        if (obj[0].equals("3"))
        {
            a.q.sendEmptyMessage(702);
            return;
        }
        message1 = Message.obtain();
        message1.what = 700;
        message1.obj = obj[1];
        a.q.sendMessage(message1);
        return;
        a.d.a(145);
        return;
    }
}
