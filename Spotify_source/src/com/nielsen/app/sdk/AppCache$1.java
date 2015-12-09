// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;


// Referenced classes of package com.nielsen.app.sdk:
//            AppCache, c

class a
    implements Runnable
{

    final AppCache a;

    public void run()
    {
        try
        {
            if (!a.b())
            {
                c.a(13, 'E', "Failed setting up counters", new Object[0]);
            }
            if (a.c() > 0L)
            {
                a.c(0);
            }
            if (a.d() > 0L)
            {
                a.e(1);
                a.d(1);
            }
            AppCache.a(a, true);
            return;
        }
        catch (Exception exception)
        {
            c.a(exception, false, 13, 'W', "Could not setup cache", new Object[0]);
        }
    }

    (AppCache appcache)
    {
        a = appcache;
        super();
    }
}
