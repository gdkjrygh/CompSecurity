// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.os.Message;
import com.roidapp.photogrid.common.c;

// Referenced classes of package com.roidapp.photogrid.release:
//            rm, pi, ml

final class pj
    implements Runnable
{

    final rm a;
    final pi b;

    pj(pi pi1, rm rm1)
    {
        b = pi1;
        a = rm1;
        super();
    }

    public final void run()
    {
        Object obj = a.c();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_301;
        }
        if (obj[0] == null)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        if (!obj[0].equals("0"))
        {
            break MISSING_BLOCK_LABEL_160;
        }
        b.e = obj[1];
        if (b.e != null && !b.e.equals(""))
        {
            b.d.a(95, 1);
            b.a(b.b, b.e);
            return;
        }
        try
        {
            b.d.sendEmptyMessage(7);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((OutOfMemoryError) (obj)).printStackTrace();
            System.gc();
            System.gc();
            Message message;
            if (b.f == 480)
            {
                b.f = 320;
                b.q.sendEmptyMessage(1);
                return;
            } else
            {
                b.d.sendEmptyMessage(7);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).printStackTrace();
        }
        break MISSING_BLOCK_LABEL_213;
        if (obj[0] == null)
        {
            break MISSING_BLOCK_LABEL_253;
        }
        if (obj[0].equals("1"))
        {
            message = Message.obtain();
            message.what = 700;
            message.obj = obj[1];
            b.q.sendMessage(message);
            return;
        }
        break MISSING_BLOCK_LABEL_253;
        if ((new StringBuilder()).append(((Exception) (obj)).getMessage()).toString().contains("No space"))
        {
            b.q.sendEmptyMessage(702);
            return;
        }
        break MISSING_BLOCK_LABEL_329;
        if (obj[0] == null)
        {
            break MISSING_BLOCK_LABEL_354;
        }
        if (obj[0].equals("2"))
        {
            message = Message.obtain();
            message.what = 701;
            message.obj = obj[1];
            b.q.sendMessage(message);
            return;
        }
        break MISSING_BLOCK_LABEL_354;
        b.d.sendEmptyMessage(7);
        return;
        b.q.sendEmptyMessage(700);
        c.a(b.q, ((Throwable) (obj)));
    }
}
