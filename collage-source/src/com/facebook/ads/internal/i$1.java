// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal;

import android.os.Handler;
import com.facebook.ads.internal.util.g;

// Referenced classes of package com.facebook.ads.internal:
//            i

class a
    implements Runnable
{

    final i a;

    public void run()
    {
        if (g.a(i.a(a)))
        {
            a.a();
            return;
        } else
        {
            i.c(a).postDelayed(i.b(a), 5000L);
            return;
        }
    }

    .g(i j)
    {
        a = j;
        super();
    }
}
