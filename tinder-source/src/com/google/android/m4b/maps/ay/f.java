// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.util.Log;
import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.cq.g;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            k, ab, m, af

public class f
{
    public static interface a
    {

        public abstract com.google.android.m4b.maps.ac.a a();

        public abstract void a(com.google.android.m4b.maps.ac.a a1);

        public abstract void b();
    }


    private static final String a = com/google/android/m4b/maps/ay/f.getSimpleName();
    private static final HashSet b;
    private static k c = new k();
    private static long d;
    private a e;
    private m f;
    private volatile int g;
    private int h;

    public f(a a1, m m1)
    {
        h = 0;
        e = a1;
        f = m1;
    }

    static com.google.android.m4b.maps.ac.a a(com.google.android.m4b.maps.ac.a a1, int i)
    {
        int j = a1.j(2);
        i = Math.min(i, j);
        com.google.android.m4b.maps.ac.a a2 = new com.google.android.m4b.maps.ac.a(g.a);
        for (; i < j; i++)
        {
            a2.a(2, a1.c(2, i));
        }

        if (a1.i(3) && a2.i(2))
        {
            a2.a(3, a1.e(3));
        }
        return a2;
    }

    private void a(int i, String s, String s1, long l)
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.m4b.maps.ac.a a2;
        if (com.google.android.m4b.maps.ay.ab.a(a, 3))
        {
            Log.d(a, (new StringBuilder(String.valueOf(s).length() + 41 + String.valueOf(s1).length())).append("Event: type=").append(i).append(", status: ").append(s).append(", data: ").append(s1).toString());
        }
        a2 = e.a();
        com.google.android.m4b.maps.ac.a a1;
        a1 = a2;
        if (a2 != null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        g();
        a1 = e.a();
        com.google.android.m4b.maps.ac.a a3 = new com.google.android.m4b.maps.ac.a(g.b);
        a3.a(1, i);
        a3.a(7, l);
        a3.b(3, s);
        a3.b(4, s1);
        a3.a(6, false);
        a1.a(2, a3);
        e.a(a1);
        if (a1.b() > 1200)
        {
            e();
            if (h > 1)
            {
                d();
            }
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    static void a(f f1)
    {
        f1.f();
    }

    static void a(f f1, int i, String s, String s1, long l)
    {
        f1.a(i, s, s1, l);
    }

    private static byte[] a(com.google.android.m4b.maps.ac.a a1)
    {
        int j = a1.j(2);
        com.google.android.m4b.maps.ac.a a4 = new com.google.android.m4b.maps.ac.a(g.a);
        if (a1.i(3))
        {
            a4.a(3, a1.e(3));
        }
        long l = 0L;
        for (int i = 0; i < j; i++)
        {
            com.google.android.m4b.maps.ac.a a3 = a1.c(2, i);
            if (!a3.h(7))
            {
                continue;
            }
            long l1 = a3.e(7);
            l = l1 - l;
            com.google.android.m4b.maps.ac.a a2 = a3;
            if (i > 0)
            {
                a2 = a3;
                if (l >= 0L)
                {
                    a2 = a3;
                    if (l <= 0x63ff9cL)
                    {
                        a2 = a3.a();
                        a2.e(7, 0);
                        a2.a(2, l / 100L);
                    }
                }
            }
            a4.a(2, a2);
            l = l1;
        }

        a1 = new ByteArrayOutputStream();
        DataOutputStream dataoutputstream = new DataOutputStream(a1);
        try
        {
            byte abyte0[] = a4.c();
            dataoutputstream.writeInt(abyte0.length);
            dataoutputstream.write(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.m4b.maps.ac.a a1)
        {
            return (new byte[] {
                0
            });
        }
        return a1.toByteArray();
    }

    private static com.google.android.m4b.maps.ac.a b(com.google.android.m4b.maps.ac.a a1)
    {
        com.google.android.m4b.maps.ac.a a2 = new com.google.android.m4b.maps.ac.a(g.a);
        for (int i = 0; i < a1.j(2); i++)
        {
            com.google.android.m4b.maps.ac.a a3 = a1.c(2, i);
            if (a3.b(6))
            {
                a2.a(2, a3);
            }
        }

        if (a2.i(2) && a1.i(3))
        {
            a2.a(3, a1.e(3));
        }
        return a2;
    }

    static a b(f f1)
    {
        return f1.e;
    }

    static int c(f f1)
    {
        return f1.g;
    }

    private static com.google.android.m4b.maps.ac.a c(com.google.android.m4b.maps.ac.a a1)
    {
        com.google.android.m4b.maps.ac.a a2;
        int j;
        j = a1.a(false) - 800;
        a2 = a1;
        if (j <= 0) goto _L2; else goto _L1
_L1:
        int i = 0;
_L7:
        a2 = a1;
        if (i >= a1.j(2)) goto _L2; else goto _L3
_L3:
        j -= a1.c(2, i).a(false) + 2;
        if (j > 0) goto _L5; else goto _L4
_L4:
        a2 = a(a1, i + 1);
_L2:
        return a2;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static String c()
    {
        return a;
    }

    private void d()
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.m4b.maps.ac.a a1 = b(e.a());
        int i = a1.j(2);
        a1 = c(a1);
        int j = a1.j(2);
        g = g - (i - j);
        if (g < 0)
        {
            g = 0;
        }
        e.a(a1);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void d(com.google.android.m4b.maps.ac.a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (a1.j(2) != 0) goto _L2; else goto _L1
_L1:
        h = 0;
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        com.google.android.m4b.maps.ac.a a2;
        a1.a(3, k.b());
        a2 = new com.google.android.m4b.maps.ac.a(g.a);
        int i = 0;
_L5:
        com.google.android.m4b.maps.ac.a a3;
        long l;
        if (i >= a1.j(2))
        {
            break MISSING_BLOCK_LABEL_106;
        }
        a3 = a1.c(2, i);
        if (!a3.i(7))
        {
            break MISSING_BLOCK_LABEL_206;
        }
        l = a3.e(7);
        boolean flag;
        if (k.b() - l > d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        a2.a(2, a3);
        break MISSING_BLOCK_LABEL_206;
        if (a2.i(2) && a1.i(3))
        {
            a2.a(3, a1.e(3));
        }
        a1 = a(a2);
        a2 = b(a2);
        if (a2.i(2))
        {
            break MISSING_BLOCK_LABEL_190;
        }
        g();
_L4:
        g = a2.j(2);
        a1 = new af(a1) {

            private f a;

            public final void a()
            {
                a.b();
            }

            public final void b()
            {
                this;
                JVM INSTR monitorenter ;
                if (f.b(a).a() == null) goto _L2; else goto _L1
_L1:
                com.google.android.m4b.maps.ac.a a4 = com.google.android.m4b.maps.ay.f.a(f.b(a).a(), f.c(a));
                f.b(a).a(a4);
_L4:
                a.b();
                this;
                JVM INSTR monitorexit ;
                return;
_L2:
                if (!com.google.android.m4b.maps.ay.ab.a(f.c(), 5)) goto _L4; else goto _L3
_L3:
                Log.w(f.c(), "Could not find events in the store.");
                  goto _L4
                Exception exception;
                exception;
                throw exception;
            }

            
            {
                a = f.this;
                super(125, abyte0, false);
            }
        };
        f.c(a1);
          goto _L3
        a1;
        throw a1;
        e.a(c(a2));
          goto _L4
        i++;
          goto _L5
    }

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        h = h + 1;
        if (h == 1)
        {
            f();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void f()
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.m4b.maps.ac.a a1 = e.a();
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        d(a1);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void g()
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.m4b.maps.ac.a a1 = new com.google.android.m4b.maps.ac.a(g.a);
        e.a(a1);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        e.b();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (h <= 1) goto _L2; else goto _L1
_L1:
        h = 1;
        (new Thread(new Runnable() {

            private f a;

            public final void run()
            {
                com.google.android.m4b.maps.ay.f.a(a);
            }

            
            {
                a = f.this;
                super();
            }
        })).start();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        h = 0;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    static 
    {
        HashSet hashset = new HashSet();
        b = hashset;
        hashset.add(Short.valueOf((short)18));
        b.add(Short.valueOf((short)81));
        b.add(Short.valueOf((short)91));
        b.add(Short.valueOf((short)92));
        b.add(Short.valueOf((short)1));
        b.add(Short.valueOf((short)4));
        b.add(Short.valueOf((short)61));
        b.add(Short.valueOf((short)104));
        b.add(Short.valueOf((short)67));
        b.add(Short.valueOf((short)16));
        b.add(Short.valueOf((short)69));
        b.add(Short.valueOf((short)101));
        b.add(Short.valueOf((short)84));
        b.add(Short.valueOf((short)87));
        b.add(Short.valueOf((short)55));
        b.add(Short.valueOf((short)85));
        b.add(Short.valueOf((short)97));
        b.add(Short.valueOf((short)5));
        b.add(Short.valueOf((short)79));
        b.add(Short.valueOf((short)57));
        b.add(Short.valueOf((short)112));
        b.add(Short.valueOf((short)114));
        b.add(Short.valueOf((short)118));
        b.add(Short.valueOf((short)115));
        d = TimeUnit.DAYS.toMillis(30L);
    }

    // Unreferenced inner class com/google/android/m4b/maps/ay/f$1

/* anonymous class */
    public final class _cls1
        implements Runnable
    {

        private int a;
        private String b;
        private String c;
        private long d;
        private f e;

        public final void run()
        {
            com.google.android.m4b.maps.ay.f.a(e, a, b, c, d);
        }

            public 
            {
                e = f.this;
                a = 113;
                b = s;
                c = s1;
                d = l;
                super();
            }
    }

}
