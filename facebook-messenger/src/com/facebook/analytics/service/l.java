// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.service;


// Referenced classes of package com.facebook.analytics.service:
//            i, j

final class l
    implements Runnable
{

    final i a;

    private l(i j)
    {
        a = j;
        super();
    }

    l(i j, j j1)
    {
        this(j);
    }

    public void run()
    {
        Thread.currentThread().setName("AnalyticsEventsDataStore");
        i.a(a);
    }
}
