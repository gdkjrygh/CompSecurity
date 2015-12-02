// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.a;

import com.facebook.debug.log.b;

// Referenced classes of package com.facebook.analytics.a:
//            a, b

class f
    implements Runnable
{

    final a a;

    private f(a a1)
    {
        a = a1;
        super();
    }

    f(a a1, com.facebook.analytics.a.b b1)
    {
        this(a1);
    }

    public void run()
    {
        b.a(com.facebook.analytics.a.a.e(), "SendRunnable.run()");
        com.facebook.analytics.a.a.a(a);
    }
}
