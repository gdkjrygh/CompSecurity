// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.j;
import com.google.android.gms.internal.io;
import com.google.android.gms.internal.ip;
import com.google.android.gms.internal.jz;
import com.google.android.gms.internal.kd;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bg, bs, br, ai, 
//            de, ak, da, bi, 
//            d, b, a

public final class db extends j
{
    private final class a
        implements da.a
    {

        final db a;

        public final void a()
        {
            if (db.e(a).a())
            {
                com.google.android.gms.tagmanager.db.g(a);
            }
        }

        public final void a(String s)
        {
            a.b(s);
        }

        public final String b()
        {
            return a.c();
        }

        private a()
        {
            a = db.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    static interface b
        extends f
    {

        public abstract void a(String s);

        public abstract void b(String s);
    }

    static interface c
        extends f
    {
    }


    private final io b;
    private final a c;
    private final Looper d;
    private final bi e;
    private final int f;
    private final Context g;
    private final d h;
    private final String i;
    private c j;
    private jz k;
    private volatile da l;
    private com.google.android.gms.internal.g.i m;
    private String n;
    private b o;

    private db(Context context, d d1, String s, c c1, b b1, jz jz1, io io, 
            bi bi)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            super(Looper.getMainLooper());
            g = context;
            h = d1;
            d = Looper.getMainLooper();
            i = s;
            f = -1;
            j = c1;
            o = b1;
            k = jz1;
            c = new a((byte)0);
            m = new com.google.android.gms.internal.g.i();
            b = io;
            e = bi;
            context = bg.a();
            if (context.b() != bg.a.b)
            {
                flag = flag1;
                if (context.b() != bg.a.c)
                {
                    break label0;
                }
            }
            flag = flag1;
            if (i.equals(context.d()))
            {
                flag = true;
            }
        }
        if (flag)
        {
            b(bg.a().c());
        }
    }

    public db(Context context, d d1, String s, de de1)
    {
        this(context, d1, s, ((c) (new bs(context, s))), ((b) (new br(context, s, de1))), new jz(context), ip.d(), ((bi) (new ai("refreshing", ip.d()))));
        k.a(de1.a());
    }

    static da a(db db1, da da1)
    {
        db1.l = da1;
        return da1;
    }

    static String a(db db1)
    {
        return db1.i;
    }

    static d b(db db1)
    {
        return db1.h;
    }

    static Looper c(db db1)
    {
        return db1.d;
    }

    static Context d(db db1)
    {
        return db1.g;
    }

    private void d()
    {
        this;
        JVM INSTR monitorenter ;
        if (o != null) goto _L2; else goto _L1
_L1:
        ak.b("Refresh requested, but no network load scheduler.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        o.a(m.c);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    static bi e(db db1)
    {
        return db1.e;
    }

    static da f(db db1)
    {
        return db1.l;
    }

    static void g(db db1)
    {
        db1.d();
    }

    protected final g a(Status status)
    {
        return c(status);
    }

    public final void a(String s)
    {
        Integer integer;
        if (f != -1)
        {
            integer = Integer.valueOf(f);
        } else
        {
            integer = null;
        }
        k.a(i, integer, s, new com.google.android.gms.internal.jz.a(s) {

            final String a;
            final db b;

            public final void a(kd kd1)
            {
                if (kd1.getStatus() != Status.a)
                {
                    ak.a((new StringBuilder("Load request failed for the container ")).append(db.a(b)).toString());
                    b.a(b.c(Status.c));
                    return;
                }
                com.google.android.gms.internal.ke.c c1 = kd1.a().e();
                if (c1 == null)
                {
                    ak.a("Response doesn't have the requested container");
                    b.a(b.c(new Status("Response doesn't have the requested container")));
                    return;
                } else
                {
                    long l1 = kd1.a().f();
                    db.a(b, new da(db.b(b), db.c(b), new com.google.android.gms.tagmanager.a(db.d(b), db.b(b).a(), db.a(b), l1, c1), new da.a(this) {

                        final _cls1 a;

                        public final void a()
                        {
                            if (db.e(a.b).a())
                            {
                                a.b.a(a.a);
                            }
                        }

                        public final void a(String s)
                        {
                            a.b.b(s);
                        }

                        public final String b()
                        {
                            return a.b.c();
                        }

            
            {
                a = _pcls1;
                super();
            }
                    }));
                    b.a(com.google.android.gms.tagmanager.db.f(b));
                    return;
                }
            }

            
            {
                b = db.this;
                a = s;
                super();
            }
        });
    }

    final void b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        n = s;
        if (o != null)
        {
            o.b(s);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    protected final com.google.android.gms.tagmanager.b c(Status status)
    {
        if (l != null)
        {
            return l;
        }
        if (status == Status.d)
        {
            ak.a("timer expired: setting result to failure");
        }
        return new da(status);
    }

    final String c()
    {
        this;
        JVM INSTR monitorenter ;
        String s = n;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }
}
