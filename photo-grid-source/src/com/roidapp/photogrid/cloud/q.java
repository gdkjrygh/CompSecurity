// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.os.Message;
import com.roidapp.baselib.a.a;
import com.roidapp.baselib.c.x;
import com.roidapp.cloudlib.common.c;
import com.roidapp.photogrid.release.ig;
import com.roidapp.photogrid.release.ih;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            r

final class q
    implements Runnable
{

    private WeakReference a;
    private String b;
    private int c;
    private boolean d;
    private boolean e;

    private q(r r1, String s, int i, boolean flag, boolean flag1)
    {
        a = new WeakReference(r1);
        b = s;
        c = i;
        d = flag;
        e = flag1;
    }

    q(r r1, String s, int i, boolean flag, boolean flag1, byte byte0)
    {
        this(r1, s, i, flag, flag1);
    }

    public final void run()
    {
        if (a.get() != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        android.graphics.Bitmap bitmap1;
        android.graphics.Bitmap bitmap;
        ig aig[];
        r r1;
        if (d)
        {
            bitmap = com.roidapp.baselib.a.a.a(b, c, c, e, true);
        } else
        {
            bitmap = com.roidapp.cloudlib.common.c.a(b, c);
        }
        if (d)
        {
            break; /* Loop/switch isn't completed */
        }
        aig = ih.C().M();
        if (aig == null || aig.length <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        bitmap1 = com.roidapp.baselib.a.a.a(aig[0].n, c, c, e, true);
_L4:
        if (bitmap != null)
        {
            r1 = (r)a.get();
            if (r1 != null && !com.roidapp.photogrid.cloud.r.a(r1))
            {
                r1.obtainMessage(52226, new x(bitmap, bitmap1)).sendToTarget();
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        bitmap1 = null;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }
}
