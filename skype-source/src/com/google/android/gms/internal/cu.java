// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.y;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.google.android.gms.internal:
//            gm, hd, ae, af, 
//            ab, ad, gv, cf, 
//            hi

public final class cu
{
    static final class a
    {

        static int a = 60000;
        static int b = 10000;

    }

    public static interface b
    {

        public abstract void a(Object obj);
    }

    public static final class c
        implements b
    {

        public final void a(Object obj)
        {
        }

        public c()
        {
        }
    }

    public static final class d extends hd
    {

        private final Object d = new Object();
        private final e e;
        private boolean f;

        static e a(d d1)
        {
            return d1.e;
        }

        public final void a()
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
            a(new hc.c(this) {

                final d a;

                public final void a(Object obj)
                {
                    obj = (ae)obj;
                    com.google.android.gms.ads.internal.util.client.b.a(2);
                    ((af)obj).a();
                }

            
            {
                a = d1;
                super();
            }
            }, ((hc.a) (new hc.b())));
            a(new hc.c(this) {

                final d a;

                public final void a(Object obj)
                {
                    com.google.android.gms.ads.internal.util.client.b.a(2);
                    d.a(a).b();
                }

            
            {
                a = d1;
                super();
            }
            }, new hc.a(this) {

                final d a;

                public final void a()
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

    public static final class e extends hd
    {

        private final Object d = new Object();
        private b e;
        private boolean f;
        private int g;

        static b a(e e1)
        {
            return e1.e;
        }

        private void f()
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
            y.a(flag);
            if (!f || g != 0)
            {
                break MISSING_BLOCK_LABEL_61;
            }
            com.google.android.gms.ads.internal.util.client.b.a(2);
            a(new hc.c(this) {

                final e a;

                public final void a(Object obj)
                {
                    gm.a(new Runnable(this, (ab)obj) {

                        final ab a;
                        final e._cls3 b;

                        public final void run()
                        {
                            e.a(b.a).a(a);
                            a.a();
                        }

            
            {
                b = _pcls3;
                a = ab1;
                super();
            }
                    });
                }

            
            {
                a = e1;
                super();
            }
            }, new hc.b());
_L2:
            obj;
            JVM INSTR monitorexit ;
            return;
            com.google.android.gms.ads.internal.util.client.b.a(2);
            if (true) goto _L2; else goto _L1
_L1:
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final d a()
        {
            d d1 = new d(this);
            Object obj = d;
            obj;
            JVM INSTR monitorenter ;
            a(new hc.c(this, d1) {

                final d a;
                final e b;

                public final void a(Object obj)
                {
                    obj = (ab)obj;
                    com.google.android.gms.ads.internal.util.client.b.a(2);
                    a.a(((ab) (obj)).b());
                }

            
            {
                b = e1;
                a = d1;
                super();
            }
            }, new hc.a(this, d1) {

                final d a;
                final e b;

                public final void a()
                {
                    com.google.android.gms.ads.internal.util.client.b.a(2);
                    a.d();
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
            y.a(flag);
            g = g + 1;
            obj;
            JVM INSTR monitorexit ;
            return d1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected final void b()
        {
            Object obj = d;
            obj;
            JVM INSTR monitorenter ;
            Exception exception;
            boolean flag;
            if (g > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            y.a(flag);
            com.google.android.gms.ads.internal.util.client.b.a(2);
            g = g - 1;
            f();
            obj;
            JVM INSTR monitorexit ;
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void c()
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
            y.a(flag);
            com.google.android.gms.ads.internal.util.client.b.a(2);
            f = true;
            f();
            return;
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

    public cu(Context context, VersionInfoParcel versioninfoparcel, String s)
    {
        a = new Object();
        h = 1;
        c = s;
        b = context.getApplicationContext();
        d = versioninfoparcel;
        e = new c();
        f = new c();
    }

    public cu(Context context, VersionInfoParcel versioninfoparcel, String s, b b1, b b2)
    {
        this(context, versioninfoparcel, s);
        e = b1;
        f = b2;
    }

    static int a(cu cu1, int i)
    {
        cu1.h = i;
        return i;
    }

    static Context a(cu cu1)
    {
        return cu1.b;
    }

    static e a(cu cu1, e e1)
    {
        cu1.g = e1;
        return e1;
    }

    static VersionInfoParcel b(cu cu1)
    {
        return cu1.d;
    }

    static Object c(cu cu1)
    {
        return cu1.a;
    }

    static b d(cu cu1)
    {
        return cu1.e;
    }

    static int e(cu cu1)
    {
        return cu1.h;
    }

    static String f(cu cu1)
    {
        return cu1.c;
    }

    static e g(cu cu1)
    {
        return cu1.g;
    }

    protected final e a()
    {
        e e1 = new e(f);
        gm.a(new Runnable(e1) {

            final e a;
            final cu b;

            public final void run()
            {
                ad ad1 = new ad(cu.a(b), cu.b(b), null);
                ad1.a(new ab.a(this, ad1) {

                    final ab a;
                    final _cls1 b;

                    public final void a()
                    {
                        (new Timer()).schedule(new TimerTask(this) {

                            final _cls1 a;

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
                                gm.a(new Runnable(this) {

                                    final _cls1 a;

                                    public final void run()
                                    {
                                        a.a.a.a();
                                    }

            
            {
                a = _pcls1;
                super();
            }
                                });
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
                        }, a.b);
                    }

            
            {
                b = _pcls1;
                a = ab;
                super();
            }
                });
                ad1.a("/jsLoaded", new cf(this, ad1) {

                    final ab a;
                    final _cls1 b;

                    public final void a(hi hi, Map map)
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
                        cu.a(b.b, 0);
                        cu.d(b.b).a(a);
                        b.a.a(a);
                        cu.a(b.b, b.a);
                        com.google.android.gms.ads.internal.util.client.b.a(2);
                        hi;
                        JVM INSTR monitorexit ;
                        return;
                        map;
                        hi;
                        JVM INSTR monitorexit ;
                        throw map;
                    }

            
            {
                b = _pcls1;
                a = ab;
                super();
            }
                });
                gv gv1 = new gv();
                cf cf = new cf(this, ad1, gv1) {

                    final ab a;
                    final gv b;
                    final _cls1 c;

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
                c = _pcls1;
                a = ab1;
                b = gv1;
                super();
            }
                };
                gv1.a(cf);
                ad1.a("/requestReload", cf);
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
                (new Timer()).schedule(new TimerTask(this, ad1) {

                    final ab a;
                    final _cls1 b;

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
                        gm.a(new Runnable(this) {

                            final _cls4 a;

                            public final void run()
                            {
                                a.a.a();
                            }

            
            {
                a = _pcls4;
                super();
            }
                        });
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
                b = _pcls1;
                a = ab;
                super();
            }
                }, a.a);
            }

            
            {
                b = cu.this;
                a = e1;
                super();
            }
        });
        e1.a(new hc.c(e1) {

            final e a;
            final cu b;

            public final void a(Object obj)
            {
                synchronized (cu.c(b))
                {
                    cu.a(b, 0);
                    if (cu.g(b) != null && a != cu.g(b))
                    {
                        com.google.android.gms.ads.internal.util.client.b.a(2);
                        cu.g(b).c();
                    }
                    cu.a(b, a);
                }
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                b = cu.this;
                a = e1;
                super();
            }
        }, new hc.a(e1) {

            final e a;
            final cu b;

            public final void a()
            {
                synchronized (cu.c(b))
                {
                    cu.a(b, 1);
                    com.google.android.gms.ads.internal.util.client.b.a(2);
                    a.c();
                }
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                b = cu.this;
                a = e1;
                super();
            }
        });
        return e1;
    }

    public final d b()
    {
label0:
        {
            d d1;
            synchronized (a)
            {
                if (g != null && g.e() != -1)
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
