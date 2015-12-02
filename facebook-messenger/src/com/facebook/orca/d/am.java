// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.os.Handler;

// Referenced classes of package com.facebook.orca.d:
//            af, ao

class am
    implements Runnable
{

    final af a;

    am(af af1)
    {
        a = af1;
        super();
    }

    public void run()
    {
        af.f(a).postDelayed(af.g(a), 60000L);
        af.h(a);
        if (af.i(a))
        {
            af.c(a).a();
        }
    }
}
