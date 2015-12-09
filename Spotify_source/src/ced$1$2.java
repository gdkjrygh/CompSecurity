// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.Map;

final class g.Object
    implements cdi
{

    private caa a;
    private g.String b;

    public final void a(ckw ckw, Map map)
    {
label0:
        {
            synchronized (b.b.a)
            {
                if (((ckq) (b.b)).b != -1 && ((ckq) (b.b)).b != 1)
                {
                    break label0;
                }
            }
            return;
        }
        b.b.g = 0;
        b.b.e.a(a);
        b.b.a(a);
        b.b.f = b.b;
        bka.d("Successfully loaded JS Engine.");
        ckw;
        JVM INSTR monitorexit ;
        return;
        map;
        ckw;
        JVM INSTR monitorexit ;
        throw map;
    }

    ( , caa caa)
    {
        b = ;
        a = caa;
        super();
    }

    // Unreferenced inner class ced$1

/* anonymous class */
    final class ced._cls1
        implements Runnable
    {

        final cei a;
        final ced b;

        public final void run()
        {
            cad cad1 = new cad(b.b, b.d, null);
            cad1.a(new ced._cls1._cls1(cad1));
            cad1.a("/jsLoaded", new ced._cls1._cls2(this, cad1));
            cke cke1 = new cke();
            cdi cdi1 = new ced._cls1._cls3(cad1, cke1);
            cke1.a = cdi1;
            cad1.a("/requestReload", cdi1);
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
            cjj.a.postDelayed(new ced._cls1._cls4(cad1), cee.a);
        }

            
            {
                b = ced1;
                a = cei1;
                super();
            }

        // Unreferenced inner class ced$1$1

/* anonymous class */
        final class ced._cls1._cls1
            implements cab
        {

            final caa a;
            final ced._cls1 b;

            public final void a()
            {
                cjj.a.postDelayed(new ced._cls1._cls1._cls1(this), cee.b);
            }

                    
                    {
                        b = ced._cls1.this;
                        a = caa1;
                        super();
                    }
        }


        // Unreferenced inner class ced$1$1$1

/* anonymous class */
        final class ced._cls1._cls1._cls1
            implements Runnable
        {

            final ced._cls1._cls1 a;

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
                cjj.a(new ced._cls1._cls1._cls1._cls1(this));
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
        }


        // Unreferenced inner class ced$1$1$1$1

/* anonymous class */
        final class ced._cls1._cls1._cls1._cls1
            implements Runnable
        {

            private ced._cls1._cls1._cls1 a;

            public final void run()
            {
                a.a.a.a();
            }

                    
                    {
                        a = _pcls1;
                        super();
                    }
        }


        // Unreferenced inner class ced$1$3

/* anonymous class */
        final class ced._cls1._cls3
            implements cdi
        {

            private caa a;
            private cke b;
            private ced._cls1 c;

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
                        c = ced._cls1.this;
                        a = caa1;
                        b = cke1;
                        super();
                    }
        }


        // Unreferenced inner class ced$1$4

/* anonymous class */
        final class ced._cls1._cls4
            implements Runnable
        {

            final caa a;
            private ced._cls1 b;

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
                cjj.a(new ced._cls1._cls4._cls1(this));
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
                        b = ced._cls1.this;
                        a = caa1;
                        super();
                    }
        }


        // Unreferenced inner class ced$1$4$1

/* anonymous class */
        final class ced._cls1._cls4._cls1
            implements Runnable
        {

            private ced._cls1._cls4 a;

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
