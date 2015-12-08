// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;

public final class gey
{

    final String a;
    public final gfa b;
    public boolean c;
    boolean d;
    private final Handler e;
    private final Runnable f;
    private final gfa g;
    private final gfa h;
    private final int i;
    private final gfa j;
    private int k;
    private boolean l;

    private gey(String s, Handler handler, Runnable runnable, gfa gfa1, gfa gfa2, gfa gfa3, int i1, 
            gfa gfa4)
    {
        a = s;
        e = handler;
        g = gfa1;
        b = gfa2;
        h = gfa3;
        i = i1;
        j = gfa4;
        f = new Runnable(runnable) {

            private Runnable a;
            private gey b;

            public final void run()
            {
                Logger.a("%s: Calling runnable", new Object[] {
                    b.a
                });
                b.d = true;
                a.run();
            }

            
            {
                b = gey.this;
                a = runnable;
                super();
            }
        };
    }

    gey(String s, Handler handler, Runnable runnable, gfa gfa1, gfa gfa2, gfa gfa3, int i1, 
            gfa gfa4, byte byte0)
    {
        this(s, handler, runnable, gfa1, gfa2, gfa3, i1, gfa4);
    }

    private boolean a(long l1, String s)
    {
        d = false;
        if (!c)
        {
            Logger.a("%s: Not scheduling due to %s since policy is stopped", new Object[] {
                a, s
            });
            return false;
        }
        e.removeCallbacks(f);
        String s1 = s;
        if (l)
        {
            s1 = (new StringBuilder("restart-")).append(s).toString();
            l = false;
            l1 = a(g);
        }
        if (l1 < 0L)
        {
            Logger.a("%s: Not scheduling due to %s (failures: %d)", new Object[] {
                a, s1, Integer.valueOf(k)
            });
            return false;
        } else
        {
            Logger.a("%s: Schedule try after %d ms, due to %s (failures: %d)", new Object[] {
                a, Long.valueOf(l1), s1, Integer.valueOf(k)
            });
            e.postDelayed(f, l1);
            return true;
        }
    }

    private boolean a(gfa gfa1, String s)
    {
        return a(a(gfa1), s);
    }

    public final long a(gfa gfa1)
    {
        if (gfa1 == null)
        {
            return -1L;
        } else
        {
            return gfa1.a(k);
        }
    }

    public final void a()
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (c)
        {
            flag = false;
        }
        Assertion.a(flag, "Policy is already running");
        Logger.a("%s: Started", new Object[] {
            a
        });
        c = true;
        k = 0;
        d = false;
        l = false;
        a(g, "start");
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(long l1)
    {
        this;
        JVM INSTR monitorenter ;
        k = 0;
        a(l1, "success");
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag) goto _L2; else goto _L1
_L1:
        d();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        e();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        Assertion.a(c, "Policy is not running");
        if (!l) goto _L2; else goto _L1
_L1:
        Logger.a("%s: Already waiting for result to restart", new Object[] {
            a
        });
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!d)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        Logger.a("%s: Postponing restart until a result", new Object[] {
            a
        });
        l = true;
          goto _L3
        Exception exception;
        exception;
        throw exception;
        k = 0;
        a(g, "restart");
          goto _L3
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        Assertion.a(c, "Policy is not running");
        Logger.a("%s: Stopped", new Object[] {
            a
        });
        c = false;
        e.removeCallbacks(f);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void d()
    {
        this;
        JVM INSTR monitorenter ;
        a(a(b));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void e()
    {
        this;
        JVM INSTR monitorenter ;
        k = k + 1;
        if (k > i && i > 0)
        {
            k = 1;
        }
        if (k >= i && i != 0) goto _L2; else goto _L1
_L1:
        a(h, "failure");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a(j, "max-failures");
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean f()
    {
        return k >= i && i > 0;
    }
}
