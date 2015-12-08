// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.os.Handler;
import android.os.Message;
import com.roidapp.baselib.a.a;
import com.roidapp.baselib.c.x;
import com.roidapp.cloudlib.common.c;
import com.roidapp.photogrid.release.ig;
import com.roidapp.photogrid.release.ih;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            PGShareActivity

final class bc
    implements Runnable
{

    final PGShareActivity a;
    private String b;
    private int c;
    private boolean d;
    private boolean e;

    private bc(PGShareActivity pgshareactivity, String s, int i, boolean flag)
    {
        a = pgshareactivity;
        super();
        b = s;
        c = i;
        d = flag;
        e = false;
    }

    bc(PGShareActivity pgshareactivity, String s, int i, boolean flag, byte byte0)
    {
        this(pgshareactivity, s, i, flag);
    }

    public final void run()
    {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap1;
        Object obj;
        if (d)
        {
            bitmap = com.roidapp.baselib.a.a.a(b, c, c, e, true);
        } else
        {
            bitmap = com.roidapp.cloudlib.common.c.a(b, c);
        }
        obj = null;
        bitmap1 = obj;
        if (!d)
        {
            ig aig[] = ih.C().M();
            bitmap1 = obj;
            if (aig != null)
            {
                bitmap1 = obj;
                if (aig.length > 0)
                {
                    bitmap1 = com.roidapp.baselib.a.a.a(aig[0].n, c, c, e, true);
                }
            }
        }
        if (bitmap != null && PGShareActivity.t(a) != null)
        {
            PGShareActivity.t(a).obtainMessage(52226, new x(bitmap, bitmap1)).sendToTarget();
        }
    }
}
