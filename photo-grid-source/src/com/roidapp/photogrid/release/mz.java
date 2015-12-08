// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.photogrid.release:
//            my, ic, ig, ml

final class mz
    implements Runnable
{

    final int a;
    final int b;
    final my c;

    mz(my my1, int i, int j)
    {
        c = my1;
        a = i;
        b = j;
        super();
    }

    public final void run()
    {
        int j = 0;
        Object obj = c.y;
        obj;
        JVM INSTR monitorenter ;
        int i = 0;
_L5:
        if (i >= c.y.size()) goto _L2; else goto _L1
_L1:
        Bitmap bitmap = ((ic)c.y.get(i)).a(c.h, c.i[i], a, b);
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        if (bitmap.isRecycled())
        {
            break MISSING_BLOCK_LABEL_211;
        }
          goto _L3
_L6:
        obj;
        JVM INSTR monitorexit ;
        if (i != 0)
        {
            Exception exception;
            try
            {
                my.a(c);
                obj = Message.obtain();
                obj.what = 703;
                obj.obj = c.i[j].n;
                c.K.sendMessage(((Message) (obj)));
                return;
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
            my.a(c);
            c.d(141);
            return;
        }
          goto _L4
_L3:
        c.l.a(i * 5 + 25, 0);
        i++;
          goto _L5
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L4:
        c.l.obtainMessage(3).sendToTarget();
        return;
_L2:
        i = 0;
          goto _L6
        boolean flag = true;
        j = i;
        i = ((flag) ? 1 : 0);
          goto _L6
    }
}
