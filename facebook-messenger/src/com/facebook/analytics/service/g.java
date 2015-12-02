// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.service;


// Referenced classes of package com.facebook.analytics.service:
//            a, b

final class g
    implements Runnable
{

    final a a;

    private g(a a1)
    {
        a = a1;
        super();
    }

    g(a a1, b b)
    {
        this(a1);
    }

    public void run()
    {
        String s;
        s = Thread.currentThread().getName();
        Thread.currentThread().setName("AnalyticsEventUploader");
        com.facebook.analytics.service.a.a(a);
        Thread.currentThread().setName(s);
        return;
        Exception exception;
        exception;
        Thread.currentThread().setName(s);
        throw exception;
    }
}
