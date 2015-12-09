// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class bnb extends bnd
{

    final bnn a;

    public bnb(bnf bnf1, bng bng1)
    {
        super(bnf1);
        btl.a(bng1);
        a = bng1.c(bnf1);
    }

    public final long a(bnh bnh)
    {
        m();
        btl.a(bnh);
        bnf.i();
        long l = a.b(bnh);
        if (l == 0L)
        {
            a.a(bnh);
        }
        return l;
    }

    protected final void a()
    {
        a.n();
    }

    public final void a(int i)
    {
        m();
        b("setLocalDispatchPeriod (sec)", Integer.valueOf(i));
        super.f.b().a(new Runnable(i) {

            private int a;
            private bnb b;

            public final void run()
            {
                b.a.a((long)a * 1000L);
            }

            
            {
                b = bnb.this;
                a = i;
                super();
            }
        });
    }

    public final void a(bmj bmj)
    {
        btl.a(bmj);
        m();
        b("Hit delivery requested", bmj);
        super.f.b().a(new Runnable(bmj) {

            private bmj a;
            private bnb b;

            public final void run()
            {
                b.a.a(a);
            }

            
            {
                b = bnb.this;
                a = bmj;
                super();
            }
        });
    }

    public final void a(bnx bnx)
    {
        m();
        super.f.b().a(new Runnable(bnx) {

            private bnx a;
            private bnb b;

            public final void run()
            {
                b.a.a(a);
            }

            
            {
                b = bnb.this;
                a = bnx;
                super();
            }
        });
    }

    public final void b()
    {
        m();
        Context context = super.f.a;
        if (blo.a(context) && blp.a(context))
        {
            Intent intent = new Intent(context, blp);
            intent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            context.startService(intent);
            return;
        } else
        {
            a(((bnx) (null)));
            return;
        }
    }

    public final boolean c()
    {
        m();
        Future future = super.f.b().a(new Callable() {

            private bnb a;

            public final Object call()
            {
                a.a.f();
                return null;
            }

            
            {
                a = bnb.this;
                super();
            }
        });
        try
        {
            future.get(4L, TimeUnit.SECONDS);
        }
        catch (InterruptedException interruptedexception)
        {
            d("syncDispatchLocalHits interrupted", interruptedexception);
            return false;
        }
        catch (ExecutionException executionexception)
        {
            e("syncDispatchLocalHits failed", executionexception);
            return false;
        }
        catch (TimeoutException timeoutexception)
        {
            d("syncDispatchLocalHits timed out", timeoutexception);
            return false;
        }
        return true;
    }

    public final void d()
    {
        m();
        cpf.b();
        a.e();
    }

    final void e()
    {
        bnf.i();
        a.d();
    }

    final void f()
    {
        bnf.i();
        bnn bnn1 = a;
        bnf.i();
        bnn1.a = ((bnc) (bnn1)).f.c.a();
    }

    // Unreferenced inner class bnb$2

/* anonymous class */
    final class _cls2
        implements Runnable
    {

        private bnb a;

        public final void run()
        {
            a.a.g();
        }

            
            {
                a = bnb.this;
                super();
            }
    }


    // Unreferenced inner class bnb$3

/* anonymous class */
    public final class _cls3
        implements Runnable
    {

        private String a;
        private Runnable b;
        private bnb c;

        public final void run()
        {
            c.a.a(a);
            if (b != null)
            {
                b.run();
            }
        }

            public 
            {
                c = bnb.this;
                a = s;
                b = runnable;
                super();
            }
    }

}
