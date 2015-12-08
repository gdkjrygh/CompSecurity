// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.a.a;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal:
//            m, i, t, q, 
//            r

public class n extends m
{
    final class a
    {

        final n a;
        private String b;
        private boolean c;

        public final String a()
        {
            return b;
        }

        public final boolean b()
        {
            return c;
        }

        public a(String s, boolean flag)
        {
            a = n.this;
            super();
            b = s;
            c = flag;
        }
    }

    private static final class b
        implements Runnable
    {

        private Context a;

        public final void run()
        {
            com.google.android.gms.ads.a.a a1;
            a1 = new com.google.android.gms.ads.a.a(a);
            a1.a();
            com/google/android/gms/internal/n;
            JVM INSTR monitorenter ;
            if (com.google.android.gms.internal.n.a() != null) goto _L2; else goto _L1
_L1:
            com.google.android.gms.internal.n.a(a1);
_L3:
            com/google/android/gms/internal/n;
            JVM INSTR monitorexit ;
_L4:
            com.google.android.gms.internal.n.c().countDown();
            return;
_L2:
            a1.c();
              goto _L3
            Exception exception;
            exception;
            com/google/android/gms/internal/n;
            JVM INSTR monitorexit ;
            try
            {
                throw exception;
            }
            catch (c c1)
            {
                n.b();
            }
            catch (IOException ioexception) { }
            catch (d d1) { }
              goto _L4
        }

        public b(Context context)
        {
            a = context.getApplicationContext();
            if (a == null)
            {
                a = context;
            }
        }
    }


    private static com.google.android.gms.ads.a.a e = null;
    private static CountDownLatch f = new CountDownLatch(1);
    private static boolean g;
    private boolean h;

    private n(Context context, q q, r r, boolean flag)
    {
        super(context, q, r);
        h = flag;
    }

    static com.google.android.gms.ads.a.a a()
    {
        return e;
    }

    static com.google.android.gms.ads.a.a a(com.google.android.gms.ads.a.a a1)
    {
        e = a1;
        return a1;
    }

    public static n a(String s, Context context, boolean flag)
    {
        i j;
        j = new i();
        a(s, context, ((q) (j)));
        if (!flag) goto _L2; else goto _L1
_L1:
        com/google/android/gms/internal/n;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            (new Thread(new b(context))).start();
        }
        com/google/android/gms/internal/n;
        JVM INSTR monitorexit ;
_L2:
        return new n(context, j, new t(), flag);
        s;
        com/google/android/gms/internal/n;
        JVM INSTR monitorexit ;
        throw s;
    }

    static boolean b()
    {
        g = true;
        return true;
    }

    static CountDownLatch c()
    {
        return f;
    }

    private a d()
        throws IOException
    {
        com/google/android/gms/internal/n;
        JVM INSTR monitorenter ;
        Object obj;
        if (f.await(2L, TimeUnit.SECONDS))
        {
            break MISSING_BLOCK_LABEL_57;
        }
        obj = new a(null, false);
        com/google/android/gms/internal/n;
        JVM INSTR monitorexit ;
        return ((a) (obj));
        Object obj1;
        obj1;
        obj1 = new a(null, false);
        com/google/android/gms/internal/n;
        JVM INSTR monitorexit ;
        return ((a) (obj1));
        obj1;
        com/google/android/gms/internal/n;
        JVM INSTR monitorexit ;
        throw obj1;
        if (e != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        obj1 = new a(null, false);
        com/google/android/gms/internal/n;
        JVM INSTR monitorexit ;
        return ((a) (obj1));
        obj1 = e.b();
        com/google/android/gms/internal/n;
        JVM INSTR monitorexit ;
        return new a(a(((com.google.android.gms.ads.a.a.a) (obj1)).a()), ((com.google.android.gms.ads.a.a.a) (obj1)).b());
    }

    protected final void b(Context context)
    {
        super.b(context);
        if (g || !h)
        {
            a(24, d(context));
            return;
        }
        String s;
        context = d();
        s = context.a();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        long l;
        if (context.b())
        {
            l = 1L;
        } else
        {
            l = 0L;
        }
        try
        {
            a(28, l);
            a(26, 5L);
            a(24, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
    }

}
