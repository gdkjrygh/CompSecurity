// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.photogrid.release:
//            ne, ic, ig, ml

final class nf
    implements Runnable
{

    final int a;
    final int b;
    final ne c;

    nf(ne ne1, int i, int j)
    {
        c = ne1;
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
_L10:
        if (i >= c.y.size()) goto _L2; else goto _L1
_L1:
        Bitmap bitmap = ((ic)c.y.get(i)).a(c.h, c.i[i], a, b);
        if (bitmap == null) goto _L4; else goto _L3
_L3:
        if (!bitmap.isRecycled()) goto _L5; else goto _L4
_L8:
        obj;
        JVM INSTR monitorexit ;
        if (i != 0)
        {
            Exception exception;
            try
            {
                ne.b(c);
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
            ne.b(c);
            c.d(141);
            return;
        }
          goto _L6
_L5:
        c.l.a(i * 5 + 25, 0);
        if (!ne.a(c))
        {
            ne.a(c, i, bitmap);
        }
        break; /* Loop/switch isn't completed */
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L6:
        if (ne.a(c))
        {
            c.l.sendEmptyMessage(17);
            return;
        }
        c.l.sendEmptyMessage(3);
        return;
_L2:
        i = 0;
        continue; /* Loop/switch isn't completed */
_L4:
        boolean flag = true;
        j = i;
        i = ((flag) ? 1 : 0);
        if (true) goto _L8; else goto _L7
_L7:
        i++;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
