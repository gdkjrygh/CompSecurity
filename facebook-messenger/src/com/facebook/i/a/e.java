// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.i.a;

import android.os.Handler;
import com.facebook.base.broadcast.j;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.i.a:
//            d

class e
    implements Runnable
{

    final d a;
    private int b;

    e(d d1)
    {
        a = d1;
        super();
        b = 0;
    }

    public void run()
    {
        long l = 60000L;
        Preconditions.checkNotNull(d.a(a));
        Preconditions.checkNotNull(d.b(a));
        d.c(a).a(d.a(a));
        b = b + 1;
        if (b < 5)
        {
            long l1 = (long)(1 << b) * 1000L;
            if (l1 <= 60000L)
            {
                l = l1;
            }
            d.b(a).postDelayed(d.d(a), l);
        }
    }
}
