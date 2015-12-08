// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.i;
import com.bumptech.glide.load.engine.executor.a;
import com.bumptech.glide.request.f;

// Referenced classes of package com.bumptech.glide.load.engine:
//            a, j

class EngineRunnable
    implements com.bumptech.glide.load.engine.executor.a, Runnable
{
    static interface a
        extends f
    {

        public abstract void b(EngineRunnable enginerunnable);
    }

    private static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        private static final b c[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/bumptech/glide/load/engine/EngineRunnable$b, s);
        }

        public static b[] values()
        {
            return (b[])c.clone();
        }

        static 
        {
            a = new b("CACHE", 0);
            b = new b("SOURCE", 1);
            c = (new b[] {
                a, b
            });
        }

        private b(String s, int k)
        {
            super(s, k);
        }
    }


    private final i a;
    private final a b;
    private final com.bumptech.glide.load.engine.a c;
    private b d;
    private volatile boolean e;

    public EngineRunnable(a a1, com.bumptech.glide.load.engine.a a2, i k)
    {
        b = a1;
        c = a2;
        d = com.bumptech.glide.load.engine.b.a;
        a = k;
    }

    private void a(j j1)
    {
        b.a(j1);
    }

    private void a(Exception exception)
    {
        if (c())
        {
            d = b.b;
            b.b(this);
            return;
        } else
        {
            b.a(exception);
            return;
        }
    }

    private boolean c()
    {
        return d == com.bumptech.glide.load.engine.b.a;
    }

    private j d()
        throws Exception
    {
        if (c())
        {
            return e();
        } else
        {
            return f();
        }
    }

    private j e()
        throws Exception
    {
        j j1;
        j j2;
        try
        {
            j1 = c.a();
        }
        catch (Exception exception)
        {
            if (Log.isLoggable("EngineRunnable", 3))
            {
                Log.d("EngineRunnable", (new StringBuilder()).append("Exception decoding result from cache: ").append(exception).toString());
            }
            exception = null;
        }
        j2 = j1;
        if (j1 == null)
        {
            j2 = c.b();
        }
        return j2;
    }

    private j f()
        throws Exception
    {
        return c.c();
    }

    public void a()
    {
        e = true;
        c.d();
    }

    public int b()
    {
        return a.ordinal();
    }

    public void run()
    {
        Exception exception = null;
        if (!e)
        {
            j j1;
            try
            {
                j1 = d();
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception)
            {
                if (Log.isLoggable("EngineRunnable", 2))
                {
                    Log.v("EngineRunnable", "Exception decoding", exception);
                }
                j1 = null;
            }
            if (e)
            {
                if (j1 != null)
                {
                    j1.d();
                    return;
                }
            } else
            if (j1 == null)
            {
                a(exception);
                return;
            } else
            {
                a(j1);
                return;
            }
        }
    }
}
