// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.s;

import android.util.Log;
import p.al.g;
import p.v.b;

// Referenced classes of package p.s:
//            a, k

class i
    implements Runnable, p.v.b
{
    static interface a
        extends g
    {

        public abstract void b(i j);
    }

    private static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        private static final b c[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(p/s/i$b, s);
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

        private b(String s, int j)
        {
            super(s, j);
        }
    }


    private final p.l.i a;
    private final a b;
    private final p.s.a c;
    private b d;
    private volatile boolean e;

    public i(a a1, p.s.a a2, p.l.i j)
    {
        b = a1;
        c = a2;
        d = b.a;
        a = j;
    }

    private void a(Exception exception)
    {
        if (c())
        {
            d = p.s.b.b;
            b.b(this);
            return;
        } else
        {
            b.a(exception);
            return;
        }
    }

    private void a(k k1)
    {
        b.a(k1);
    }

    private boolean c()
    {
        return d == b.a;
    }

    private k d()
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

    private k e()
        throws Exception
    {
        k k1;
        k k2;
        try
        {
            k1 = c.a();
        }
        catch (Exception exception)
        {
            if (Log.isLoggable("EngineRunnable", 3))
            {
                Log.d("EngineRunnable", (new StringBuilder()).append("Exception decoding result from cache: ").append(exception).toString());
            }
            exception = null;
        }
        k2 = k1;
        if (k1 == null)
        {
            k2 = c.b();
        }
        return k2;
    }

    private k f()
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
            k k1;
            try
            {
                k1 = d();
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception)
            {
                if (Log.isLoggable("EngineRunnable", 2))
                {
                    Log.v("EngineRunnable", "Exception decoding", exception);
                }
                k1 = null;
            }
            if (e)
            {
                if (k1 != null)
                {
                    k1.d();
                    return;
                }
            } else
            if (k1 == null)
            {
                a(exception);
                return;
            } else
            {
                a(k1);
                return;
            }
        }
    }
}
