// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import android.content.Context;
import android.os.Handler;
import java.io.Closeable;

// Referenced classes of package com.nielsen.app.sdk:
//            h, a, AppScheduler, c

class f
    implements Closeable
{

    public static final long a = 0x15180L;
    public static final long b = 3600L;
    public static final String c = "appSdkRefresh";
    public static final String d = "0";
    public static final String e = "AppRefresher";
    public static final int f = 0x493e0;
    public static final int g = 0;
    private static f q = null;
    private static Handler r = new Handler();
    private b h;
    private long i;
    private long j;
    private long k;
    private com.nielsen.app.sdk.a l;
    private AppScheduler m;
    private a n;
    private String o;
    private Context p;

    private f(String s, Context context)
    {
        h = null;
        i = 3600L;
        j = 0x15180L;
        k = 0L;
        l = null;
        m = null;
        n = null;
        o = "";
        p = null;
        o = s;
        p = context;
    }

    static long a(f f1, long l1)
    {
        f1.k = l1;
        return l1;
    }

    static Handler a()
    {
        return r;
    }

    static a a(f f1, a a1)
    {
        f1.l = a1;
        return a1;
    }

    static b a(f f1)
    {
        return f1.h;
    }

    static b a(f f1, b b1)
    {
        f1.h = b1;
        return b1;
    }

    public static f a(String s, Context context)
    {
        if (q == null)
        {
            q = new f(s, context);
        }
        return q;
    }

    static long b(f f1)
    {
        return f1.k;
    }

    static f b()
    {
        return q;
    }

    static a c(f f1)
    {
        return f1.l;
    }

    static Context d(f f1)
    {
        return f1.p;
    }

    static String e(f f1)
    {
        return f1.o;
    }

    static long f(f f1)
    {
        return f1.j;
    }

    static long g(f f1)
    {
        return f1.i;
    }

    public void a(long l1, long l2)
    {
        i = l2;
        j = l1;
        l1 = com.nielsen.app.sdk.h.g();
        k = j + l1;
        l = com.nielsen.app.sdk.a.k();
        m = com.nielsen.app.sdk.a.p();
        if (n != null && m != null)
        {
            m.b("AppRefresher");
        }
        n = new a(m, "AppRefresher", 0L, 0x493e0L);
        if (n == null)
        {
            throw new Exception("Could not instantiate the App SDK refresh task");
        }
        if (m != null)
        {
            m.a("AppRefresher");
        }
        com.nielsen.app.sdk.c.a('I', "Setup App SDK refresh task. Interval(%d), increment(%d), now(%d), next time(%d)", new Object[] {
            Long.valueOf(j), Long.valueOf(i), Long.valueOf(l1), Long.valueOf(k)
        });
    }

    public void close()
    {
        if (q != null && m != null)
        {
            m.b("AppRefresher");
        }
        q = null;
    }


    private class a extends AppScheduler.AppTask
    {

        final f a;

        public boolean execute()
        {
            f.a(a, a. new b());
            if (!f.a().post(f.a(a)))
            {
                com.nielsen.app.sdk.c.a('E', "Error while setting up the refresh event. Possible Cause - Looper processing the message queue may be exiting !", new Object[0]);
            }
            return true;
        }

        public a(AppScheduler appscheduler, String s, long l1, long l2)
        {
            a = f.this;
            appscheduler.getClass();
            super(appscheduler, s, l1, l2);
        }

        private class b
            implements Runnable
        {

            final f a;

            public void run()
            {
                long l1;
                if (f.b(a) <= 0L || f.c(a) == null)
                {
                    break MISSING_BLOCK_LABEL_195;
                }
                l1 = com.nielsen.app.sdk.h.g();
                if (l1 <= f.b(a))
                {
                    break MISSING_BLOCK_LABEL_195;
                }
                if (!com.nielsen.app.sdk.a.b())
                {
                    f.c(a).a();
                    f.a(a, com.nielsen.app.sdk.a.a(f.d(a), f.e(a), f.b()));
                    f.a(a, f.f(a) + l1);
                    com.nielsen.app.sdk.c.a('I', "New App SDK refresh. Now(%d), next time(%d)", new Object[] {
                        Long.valueOf(l1), Long.valueOf(f.b(a))
                    });
                    return;
                }
                try
                {
                    f.a(a, f.g(a) + l1);
                    com.nielsen.app.sdk.c.a('I', "Postponed the App SDK refresh. Now(%d), next time(%d)", new Object[] {
                        Long.valueOf(l1), Long.valueOf(f.b(a))
                    });
                    return;
                }
                catch (Exception exception)
                {
                    com.nielsen.app.sdk.c.a(exception, true, 'E', "Error while setting up the refresh event", new Object[0]);
                }
            }

            private b()
            {
                a = f.this;
                super();
            }

        }

    }

}
