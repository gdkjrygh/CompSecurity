// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import java.util.TimerTask;

// Referenced classes of package com.roidapp.photogrid.release:
//            id, PhotoView

final class pq extends TimerTask
{

    int a;
    boolean b;
    id c;
    float d[] = {
        0.7F, 0.8F, 0.9F, 1.0F, 1.1F, 1.2F, 1.3F
    };
    final PhotoView e;

    pq(PhotoView photoview)
    {
        e = photoview;
        super();
        a = 4;
        b = true;
    }

    public final void run()
    {
        if (c != null)
        {
            c.a(d[a]);
        } else
        {
            cancel();
        }
        if (b)
        {
            a = a + 1;
        } else
        {
            a = a - 1;
        }
        if (a != d.length) goto _L2; else goto _L1
_L1:
        a = a - 2;
        b = false;
_L4:
        e.postInvalidate();
        return;
_L2:
        if (a < 0)
        {
            a = 1;
            b = true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
