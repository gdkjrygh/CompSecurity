// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.internal.io;
import com.google.android.gms.internal.ip;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ak

public final class e
{
    public static interface a
    {

        public abstract com.google.android.gms.ads.a.a.a a();
    }


    private static Object j = new Object();
    private static e k;
    private volatile long a;
    private volatile long b;
    private volatile boolean c;
    private volatile com.google.android.gms.ads.a.a.a d;
    private volatile long e;
    private final Context f;
    private final io g;
    private final Thread h;
    private a i = new a() {

        final e a;

        public final com.google.android.gms.ads.a.a.a a()
        {
            com.google.android.gms.ads.a.a.a a1;
            try
            {
                a1 = com.google.android.gms.ads.a.a.a(e.a(a));
            }
            catch (IllegalStateException illegalstateexception)
            {
                ak.b("IllegalStateException getting Advertising Id Info");
                return null;
            }
            catch (d d1)
            {
                ak.b("GooglePlayServicesRepairableException getting Advertising Id Info");
                return null;
            }
            catch (IOException ioexception)
            {
                ak.b("IOException getting Ad Id Info");
                return null;
            }
            catch (c c1)
            {
                ak.b("GooglePlayServicesNotAvailableException getting Advertising Id Info");
                return null;
            }
            catch (Exception exception)
            {
                ak.b("Unknown exception. Could not get the Advertising Id Info.");
                return null;
            }
            return a1;
        }

            
            {
                a = e.this;
                super();
            }
    };

    private e(Context context)
    {
        this(context, ip.d());
    }

    private e(Context context, io io1)
    {
        a = 0xdbba0L;
        b = 30000L;
        c = false;
        g = io1;
        if (context != null)
        {
            f = context.getApplicationContext();
        } else
        {
            f = context;
        }
        h = new Thread(new Runnable() {

            final e a;

            public final void run()
            {
                e.b(a);
            }

            
            {
                a = e.this;
                super();
            }
        });
    }

    static Context a(e e1)
    {
        return e1.f;
    }

    public static e a(Context context)
    {
        if (k == null)
        {
            synchronized (j)
            {
                if (k == null)
                {
                    context = new e(context);
                    k = context;
                    ((e) (context)).h.start();
                }
            }
        }
        return k;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void b(e e1)
    {
        Process.setThreadPriority(10);
        while (!e1.c) 
        {
            try
            {
                e1.d = e1.i.a();
                Thread.sleep(e1.a);
            }
            catch (InterruptedException interruptedexception)
            {
                com.google.android.gms.tagmanager.ak.c("sleep interrupted in AdvertiserDataPoller thread; continuing");
            }
        }
    }

    private void c()
    {
        if (g.a() - e < b)
        {
            return;
        } else
        {
            h.interrupt();
            e = g.a();
            return;
        }
    }

    public final String a()
    {
        c();
        if (d == null)
        {
            return null;
        } else
        {
            return d.a();
        }
    }

    public final boolean b()
    {
        c();
        if (d == null)
        {
            return true;
        } else
        {
            return d.b();
        }
    }

}
