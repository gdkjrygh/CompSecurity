// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;

public final class ced
{

    final Object a;
    final Context b;
    final String c;
    final VersionInfoParcel d;
    cef e;
    cei f;
    int g;
    private cef h;

    public ced(Context context, VersionInfoParcel versioninfoparcel, String s)
    {
        a = new Object();
        g = 1;
        c = s;
        b = context.getApplicationContext();
        d = versioninfoparcel;
        e = new ceg();
        h = new ceg();
    }

    public ced(Context context, VersionInfoParcel versioninfoparcel, String s, cef cef, cef cef1)
    {
        this(context, versioninfoparcel, s);
        e = cef;
        h = cef1;
    }

    protected final cei a()
    {
        cei cei1 = new cei(h);
        cjj.a(new Runnable(cei1) {

            final cei a;
            final ced b;

            public final void run()
            {
                cad cad1 = new cad(b.b, b.d, null);
                cad1.a(new cab(this, cad1) {

                    final caa a;
                    final _cls1 b;

                    public final void a()
                    {
                        cjj.a.postDelayed(new Runnable(this) {

                            final _cls1 a;

                            public final void run()
                            {
label0:
                                {
                                    synchronized (a.b.b.a)
                                    {
                                        if (((ckq) (a.b.a)).b != -1 && ((ckq) (a.b.a)).b != 1)
                                        {
                                            break label0;
                                        }
                                    }
                                    return;
                                }
                                a.b.a.d();
                                cjj.a(new Runnable(this) {

                                    private _cls1 a;

                                    public final void run()
                                    {
                                        a.a.a.a();
                                    }

            
            {
                a = _pcls1;
                super();
            }
                                });
                                bka.d("Could not receive loaded message in a timely manner. Rejecting.");
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
                        }, cee.b);
                    }

            
            {
                b = _pcls1;
                a = caa;
                super();
            }
                });
                cad1.a("/jsLoaded", new cdi(this, cad1) {

                    private caa a;
                    private _cls1 b;

                    public final void a(ckw ckw, Map map)
                    {
label0:
                        {
                            synchronized (b.b.a)
                            {
                                if (((ckq) (b.a)).b != -1 && ((ckq) (b.a)).b != 1)
                                {
                                    break label0;
                                }
                            }
                            return;
                        }
                        b.b.g = 0;
                        b.b.e.a(a);
                        b.a.a(a);
                        b.b.f = b.a;
                        bka.d("Successfully loaded JS Engine.");
                        ckw;
                        JVM INSTR monitorexit ;
                        return;
                        map;
                        ckw;
                        JVM INSTR monitorexit ;
                        throw map;
                    }

            
            {
                b = _pcls1;
                a = caa;
                super();
            }
                });
                cke cke1 = new cke();
                cdi cdi = new cdi(this, cad1, cke1) {

                    private caa a;
                    private cke b;
                    private _cls1 c;

                    public final void a(ckw ckw, Map map)
                    {
                        synchronized (c.b.a)
                        {
                            bka.c("JS Engine is requesting an update");
                            if (c.b.g == 0)
                            {
                                bka.c("Starting reload.");
                                c.b.g = 2;
                                c.b.a();
                            }
                            a.b("/requestReload", (cdi)b.a);
                        }
                        return;
                        map;
                        ckw;
                        JVM INSTR monitorexit ;
                        throw map;
                    }

            
            {
                c = _pcls1;
                a = caa1;
                b = cke1;
                super();
            }
                };
                cke1.a = cdi;
                cad1.a("/requestReload", cdi);
                if (b.c.endsWith(".js"))
                {
                    cad1.a(b.c);
                } else
                if (b.c.startsWith("<html>"))
                {
                    cad1.c(b.c);
                } else
                {
                    cad1.b(b.c);
                }
                cjj.a.postDelayed(new Runnable(this, cad1) {

                    final caa a;
                    private _cls1 b;

                    public final void run()
                    {
label0:
                        {
                            synchronized (b.b.a)
                            {
                                if (((ckq) (b.a)).b != -1 && ((ckq) (b.a)).b != 1)
                                {
                                    break label0;
                                }
                            }
                            return;
                        }
                        b.a.d();
                        cjj.a(new Runnable(this) {

                            private _cls4 a;

                            public final void run()
                            {
                                a.a.a();
                            }

            
            {
                a = _pcls4;
                super();
            }
                        });
                        bka.d("Could not receive loaded message in a timely manner. Rejecting.");
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
                a = caa;
                super();
            }
                }, cee.a);
            }

            
            {
                b = ced.this;
                a = cei1;
                super();
            }
        });
        cei1.a(new ckp(cei1) {

            private cei a;
            private ced b;

            public final void a(Object obj)
            {
                synchronized (b.a)
                {
                    b.g = 0;
                    if (b.f != null && a != b.f)
                    {
                        bka.d("New JS engine is loaded, marking previous one as destroyable.");
                        b.f.c();
                    }
                    b.f = a;
                }
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                b = ced.this;
                a = cei1;
                super();
            }
        }, new ckn(cei1) {

            private cei a;
            private ced b;

            public final void a()
            {
                synchronized (b.a)
                {
                    b.g = 1;
                    bka.d("Failed loading new engine. Marking new engine destroyable.");
                    a.c();
                }
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                b = ced.this;
                a = cei1;
                super();
            }
        });
        return cei1;
    }

    public final ceh b()
    {
label0:
        {
            ceh ceh;
            synchronized (a)
            {
                if (f != null && ((ckq) (f)).b != -1)
                {
                    break label0;
                }
                g = 2;
                f = a();
                ceh = f.a();
            }
            return ceh;
        }
        ceh ceh1;
        if (g != 0)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        ceh1 = f.a();
        obj;
        JVM INSTR monitorexit ;
        return ceh1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (g != 1)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        g = 2;
        a();
        exception = f.a();
        obj;
        JVM INSTR monitorexit ;
        return exception;
        if (g != 2)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        exception = f.a();
        obj;
        JVM INSTR monitorexit ;
        return exception;
        exception = f.a();
        obj;
        JVM INSTR monitorexit ;
        return exception;
    }
}
