// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.b;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.google.android.gms.internal:
//            cf, cu, ab, hi, 
//            ad, gv, gm

final class a
    implements cf
{

    final ab a;
    final l.client.b.a b;

    public final void a(hi hi, Map map)
    {
label0:
        {
            synchronized (cu.c(b.b))
            {
                if (b.b.b() != -1 && b.b.b() != 1)
                {
                    break label0;
                }
            }
            return;
        }
        cu.a(b.b, 0);
        cu.d(b.b).b(a);
        b.b.b(a);
        cu.a(b.b, b.b);
        com.google.android.gms.ads.internal.util.client.b.a(2);
        hi;
        JVM INSTR monitorexit ;
        return;
        map;
        hi;
        JVM INSTR monitorexit ;
        throw map;
    }

    a(a a1, ab ab)
    {
        b = a1;
        a = ab;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/cu$1

/* anonymous class */
    final class cu._cls1
        implements Runnable
    {

        final cu.e a;
        final cu b;

        public final void run()
        {
            ad ad1 = new ad(cu.a(b), com.google.android.gms.internal.cu.b(b), null);
            ad1.a(new cu._cls1._cls1(ad1));
            ad1.a("/jsLoaded", new cu._cls1._cls2(this, ad1));
            gv gv1 = new gv();
            cf cf1 = new cu._cls1._cls3(ad1, gv1);
            gv1.a(cf1);
            ad1.a("/requestReload", cf1);
            if (cu.f(b).endsWith(".js"))
            {
                ad1.a(cu.f(b));
            } else
            if (cu.f(b).startsWith("<html>"))
            {
                ad1.c(cu.f(b));
            } else
            {
                ad1.b(cu.f(b));
            }
            (new Timer()).schedule(new cu._cls1._cls4(ad1), cu.a.a);
        }

            
            {
                b = cu1;
                a = e;
                super();
            }

        // Unreferenced inner class com/google/android/gms/internal/cu$1$1

/* anonymous class */
        final class cu._cls1._cls1
            implements ab.a
        {

            final ab a;
            final cu._cls1 b;

            public final void a()
            {
                (new Timer()).schedule(new cu._cls1._cls1._cls1(this), com.google.android.gms.internal.cu.a.b);
            }

                    
                    {
                        b = cu._cls1.this;
                        a = ab1;
                        super();
                    }
        }


        // Unreferenced inner class com/google/android/gms/internal/cu$1$1$1

/* anonymous class */
        final class cu._cls1._cls1._cls1 extends TimerTask
        {

            final cu._cls1._cls1 a;

            public final void run()
            {
label0:
                {
                    synchronized (cu.c(a.b.b))
                    {
                        if (a.b.a.e() != -1 && a.b.a.e() != 1)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                a.b.a.d();
                gm.a(new cu._cls1._cls1._cls1._cls1(this));
                com.google.android.gms.ads.internal.util.client.b.a(2);
                obj;
                JVM INSTR monitorexit ;
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

                    
                    {
                        a = _pcls1;
                        super();
                    }
        }


        // Unreferenced inner class com/google/android/gms/internal/cu$1$1$1$1

/* anonymous class */
        final class cu._cls1._cls1._cls1._cls1
            implements Runnable
        {

            final cu._cls1._cls1._cls1 a;

            public final void run()
            {
                a.a.a.a();
            }

                    
                    {
                        a = _pcls1;
                        super();
                    }
        }


        // Unreferenced inner class com/google/android/gms/internal/cu$1$3

/* anonymous class */
        final class cu._cls1._cls3
            implements cf
        {

            final ab a;
            final gv b;
            final cu._cls1 c;

            public final void a(hi hi, Map map)
            {
                synchronized (cu.c(c.b))
                {
                    com.google.android.gms.ads.internal.util.client.b.b("JS Engine is requesting an update");
                    if (cu.e(c.b) == 0)
                    {
                        com.google.android.gms.ads.internal.util.client.b.b("Starting reload.");
                        cu.a(c.b, 2);
                        c.b.a();
                    }
                    a.b("/requestReload", (cf)b.a());
                }
                return;
                map;
                hi;
                JVM INSTR monitorexit ;
                throw map;
            }

                    
                    {
                        c = cu._cls1.this;
                        a = ab1;
                        b = gv1;
                        super();
                    }
        }


        // Unreferenced inner class com/google/android/gms/internal/cu$1$4

/* anonymous class */
        final class cu._cls1._cls4 extends TimerTask
        {

            final ab a;
            final cu._cls1 b;

            public final void run()
            {
label0:
                {
                    synchronized (cu.c(b.b))
                    {
                        if (b.a.e() != -1 && b.a.e() != 1)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                b.a.d();
                gm.a(new cu._cls1._cls4._cls1(this));
                com.google.android.gms.ads.internal.util.client.b.a(2);
                obj;
                JVM INSTR monitorexit ;
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

                    
                    {
                        b = cu._cls1.this;
                        a = ab1;
                        super();
                    }
        }


        // Unreferenced inner class com/google/android/gms/internal/cu$1$4$1

/* anonymous class */
        final class cu._cls1._cls4._cls1
            implements Runnable
        {

            final cu._cls1._cls4 a;

            public final void run()
            {
                a.a.a();
            }

                    
                    {
                        a = _pcls4;
                        super();
                    }
        }

    }

}
