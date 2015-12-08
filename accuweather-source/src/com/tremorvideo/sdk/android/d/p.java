// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.d;

import android.os.Handler;

// Referenced classes of package com.tremorvideo.sdk.android.d:
//            o, x, v

class p
    implements Runnable
{

    final o a;

    p(o o1)
    {
        a = o1;
        super();
    }

    public void run()
    {
        boolean flag = a.e();
        if (o.a(a) != flag)
        {
            o.a(a, flag);
            a.a().a(x.a(o.a(a)));
        }
        o.b(a).postDelayed(this, 3000L);
    }
}
