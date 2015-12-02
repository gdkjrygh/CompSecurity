// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.b;

import com.qihoo.security.SecurityApplication;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.qihoo.security.opti.b:
//            b

public class com.qihoo.security.opti.b.a
{
    public static interface a
    {

        public abstract void a();

        public abstract void b();
    }

    public static class b extends Thread
    {

        private boolean a;
        private int b;
        private WeakReference c;

        public boolean a()
        {
            return a;
        }

        public void b()
        {
            a = true;
        }

        public void run()
        {
            int i = 0;
_L5:
            if (!a) goto _L2; else goto _L1
_L1:
            if (!a && c != null)
            {
                a a1 = (a)c.get();
                if (a1 != null)
                {
                    a1.a();
                }
            }
            a = true;
            return;
_L2:
            int j;
            try
            {
                sleep(60000L);
            }
            catch (InterruptedException interruptedexception)
            {
                interruptedexception.printStackTrace();
            }
            if (a) goto _L1; else goto _L3
_L3:
            j = i + 1;
            i = j;
            if (com.qihoo.security.opti.b.a.c())
            {
                break; /* Loop/switch isn't completed */
            }
            i = j;
            if (com.qihoo.security.opti.b.a.d())
            {
                break; /* Loop/switch isn't completed */
            }
            if (j >= b) goto _L1; else goto _L4
_L4:
            i = j;
            if (!com.qihoo.security.opti.b.a.e()) goto _L5; else goto _L1
        }

        public b(a a1)
        {
            b = 20;
            c = new WeakReference(a1);
        }
    }


    private static boolean a = false;
    private static boolean b;
    private static boolean c;
    private static boolean d;
    private static b e;
    private static a f = new a() {

        public void a()
        {
            com.qihoo.security.opti.b.b.a().b();
        }

        public void b()
        {
            com.qihoo.security.opti.b.b.a().c();
        }

    };

    public static void a()
    {
        if (c && b)
        {
            if (!d && (e == null || e.a() || !e.isAlive()))
            {
                e = new b(f);
                e.start();
            }
        } else
        {
            if (e != null && !e.a())
            {
                e.b();
                e = null;
            }
            if (f != null)
            {
                f.b();
                return;
            }
        }
    }

    public static void a(boolean flag)
    {
        d = flag;
    }

    public static void b()
    {
        long l = Math.round(20D * Math.random());
        (new Timer()).schedule(new TimerTask() {

            public void run()
            {
                com.qihoo.security.opti.b.b.a().e();
            }

        }, (5L + l) * 1000L);
    }

    public static void b(boolean flag)
    {
        b = flag;
    }

    public static void c(boolean flag)
    {
        c = flag;
        d = false;
    }

    public static boolean c()
    {
        return com.qihoo.security.opti.b.b.a().d();
    }

    public static boolean d()
    {
        return SharedPref.b(SecurityApplication.a(), "malware_is_scanning", false);
    }

    static boolean e()
    {
        return a;
    }

}
