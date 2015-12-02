// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.service;


// Referenced classes of package com.facebook.analytics.service:
//            c, a, b

class d
    implements Runnable
{

    final c a;

    private d(c c1)
    {
        a = c1;
        super();
    }

    d(c c1, b b)
    {
        this(c1);
    }

    public void run()
    {
        com.facebook.analytics.service.a.g(a.a);
    }
}
