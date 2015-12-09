// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.z;

// Referenced classes of package com.google.android.gms.internal:
//            gw, ae, ac, hn, 
//            ag, af

public class cw
{
    static class a
    {

        static int a = 60000;
        static int b = 10000;

    }

    public static interface b
    {

        public abstract void zzc(Object obj);
    }

    public static class c
        implements b
    {

        public void zzc(Object obj)
        {
        }

        public c()
        {
        }
    }

    public static class d extends hn
    {

        private final Object d = new Object();
        private final e e;
        private boolean f;

        static e a(d d1)
        {
            return d1.e;
        }

        public void a()
        {
label0:
            {
                synchronized (d)
                {
                    if (!f)
                    {
                        break label0;
                    }
                }
                return;
            }
            f = true;
            a(new hm.c(this) {

                final d a;

                public void a(af af1)
                {
                    zzb.v("Ending javascript session.");
                    ((ag)af1).a();
                }

                public void zzc(Object obj)
                {
                    a((af)obj);
                }

            
            {
                a = d1;
                super();
            }
            }, ((hm.a) (new hm.b())));
            a(new hm.c(this) {

                final d a;

                public void a(af af1)
                {
                    zzb.v("Releasing engine reference.");
                    d.a(a).b();
                }

                public void zzc(Object obj)
                {
                    a((af)obj);
                }

            
            {
                a = d1;
                super();
            }
            }, new hm.a(this) {

                final d a;

                public void run()
                {
                    d.a(a).b();
                }

            
            {
                a = d1;
                super();
            }
            });
            obj;
            JVM INSTR monitorexit ;
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public d(e e1)
        {
            e = e1;
        }
    }

    public static class e extends hn
    {

        private final Object d = new Object();
        private b e;
        private boolean f;
        private int g;

        static b a(e e1)
        {
            return e1.e;
        }

        public d a()
        {
            d d1 = new d(this);
            Object obj = d;
            obj;
            JVM INSTR monitorenter ;
            a(new hm.c(this, d1) {

                final d a;
                final e b;

                public void a(ac ac1)
                {
                    zzb.v("Getting a new session for JS Engine.");
                    a.a(ac1.b());
                }

                public void zzc(Object obj)
                {
                    a((ac)obj);
                }

            
            {
                b = e1;
                a = d1;
                super();
            }
            }, new hm.a(this, d1) {

                final d a;
                final e b;

                public void run()
                {
                    zzb.v("Rejecting reference for JS Engine.");
                    a.e();
                }

            
            {
                b = e1;
                a = d1;
                super();
            }
            });
            Exception exception;
            boolean flag;
            if (g >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            z.a(flag);
            g = g + 1;
            obj;
            JVM INSTR monitorexit ;
            return d1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected void b()
        {
            boolean flag = true;
            Object obj = d;
            obj;
            JVM INSTR monitorenter ;
            Exception exception;
            if (g < 1)
            {
                flag = false;
            }
            z.a(flag);
            zzb.v("Releasing 1 reference for JS Engine");
            g = g - 1;
            d();
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void c()
        {
            boolean flag = true;
            Object obj = d;
            obj;
            JVM INSTR monitorenter ;
            Exception exception;
            if (g < 0)
            {
                flag = false;
            }
            z.a(flag);
            zzb.v("Releasing root reference. JS Engine will be destroyed once other references are released.");
            f = true;
            d();
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected void d()
        {
            Object obj = d;
            obj;
            JVM INSTR monitorenter ;
            Exception exception;
            boolean flag;
            if (g >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            z.a(flag);
            if (!f || g != 0)
            {
                break MISSING_BLOCK_LABEL_61;
            }
            zzb.v("No reference is left (including root). Cleaning up engine.");
            a(new hm.c(this) {

                final e a;

                public void a(ac ac1)
                {
                    gw.a(new zzdv.zze._cls3._cls1(this, ac1));
                }

                public void zzc(Object obj)
                {
                    a((ac)obj);
                }

            
            {
                a = e1;
                super();
            }
            }, new hm.b());
_L2:
            obj;
            JVM INSTR monitorexit ;
            return;
            zzb.v("There are still references to the engine. Not destroying.");
            if (true) goto _L2; else goto _L1
_L1:
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public e(b b1)
        {
            e = b1;
            f = false;
            g = 0;
        }
    }


    private final Object a;
    private final Context b;
    private final String c;
    private final VersionInfoParcel d;
    private b e;
    private b f;
    private e g;
    private int h;

    public cw(Context context, VersionInfoParcel versioninfoparcel, String s)
    {
        a = new Object();
        h = 1;
        c = s;
        b = context.getApplicationContext();
        d = versioninfoparcel;
        e = new c();
        f = new c();
    }

    public cw(Context context, VersionInfoParcel versioninfoparcel, String s, b b1, b b2)
    {
        this(context, versioninfoparcel, s);
        e = b1;
        f = b2;
    }

    static int a(cw cw1, int i)
    {
        cw1.h = i;
        return i;
    }

    static Context a(cw cw1)
    {
        return cw1.b;
    }

    static e a(cw cw1, e e1)
    {
        cw1.g = e1;
        return e1;
    }

    static VersionInfoParcel b(cw cw1)
    {
        return cw1.d;
    }

    private e c()
    {
        e e1 = new e(f);
        gw.a(new zzdv._cls1(this, e1));
        return e1;
    }

    static Object c(cw cw1)
    {
        return cw1.a;
    }

    static b d(cw cw1)
    {
        return cw1.e;
    }

    static int e(cw cw1)
    {
        return cw1.h;
    }

    static String f(cw cw1)
    {
        return cw1.c;
    }

    static e g(cw cw1)
    {
        return cw1.g;
    }

    protected ac a(Context context, VersionInfoParcel versioninfoparcel)
    {
        return new ae(context, versioninfoparcel, null);
    }

    protected e a()
    {
        e e1 = c();
        e1.a(new hm.c(e1) {

            final e a;
            final cw b;

            public void a(ac ac1)
            {
                synchronized (cw.c(b))
                {
                    cw.a(b, 0);
                    if (cw.g(b) != null && a != cw.g(b))
                    {
                        zzb.v("New JS engine is loaded, marking previous one as destroyable.");
                        cw.g(b).c();
                    }
                    cw.a(b, a);
                }
                return;
                exception;
                ac1;
                JVM INSTR monitorexit ;
                throw exception;
            }

            public void zzc(Object obj)
            {
                a((ac)obj);
            }

            
            {
                b = cw.this;
                a = e1;
                super();
            }
        }, new hm.a(e1) {

            final e a;
            final cw b;

            public void run()
            {
                synchronized (cw.c(b))
                {
                    cw.a(b, 1);
                    zzb.v("Failed loading new engine. Marking new engine destroyable.");
                    a.c();
                }
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                b = cw.this;
                a = e1;
                super();
            }
        });
        return e1;
    }

    public d b()
    {
label0:
        {
            d d1;
            synchronized (a)
            {
                if (g != null && g.f() != -1)
                {
                    break label0;
                }
                h = 2;
                g = a();
                d1 = g.a();
            }
            return d1;
        }
        d d2;
        if (h != 0)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        d2 = g.a();
        obj;
        JVM INSTR monitorexit ;
        return d2;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (h != 1)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        h = 2;
        a();
        exception = g.a();
        obj;
        JVM INSTR monitorexit ;
        return exception;
        if (h != 2)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        exception = g.a();
        obj;
        JVM INSTR monitorexit ;
        return exception;
        exception = g.a();
        obj;
        JVM INSTR monitorexit ;
        return exception;
    }
}
