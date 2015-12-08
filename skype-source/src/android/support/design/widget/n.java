// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

final class n
{
    static interface a
    {
    }

    private static final class b
    {

        private final WeakReference a;
        private int b;

        static WeakReference a(b b1)
        {
            return b1.a;
        }

        static int b(b b1)
        {
            return b1.b;
        }

        final boolean a(a a1)
        {
            return a1 != null && a.get() == a1;
        }
    }


    private static n a;
    private final Object b = new Object();
    private final Handler c = new Handler(Looper.getMainLooper(), new android.os.Handler.Callback() {

        final n a;

        public final boolean handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return false;

            case 0: // '\0'
                n.a(a, (b)message.obj);
                break;
            }
            return true;
        }

            
            {
                a = n.this;
                super();
            }
    });
    private b d;
    private b e;

    private n()
    {
    }

    static n a()
    {
        if (a == null)
        {
            a = new n();
        }
        return a;
    }

    static void a(n n1, b b1)
    {
        synchronized (n1.b)
        {
            if (n1.d == b1 || n1.e == b1)
            {
                a(b1);
            }
        }
        return;
        n1;
        obj;
        JVM INSTR monitorexit ;
        throw n1;
    }

    private static boolean a(b b1)
    {
        return (a)b.a(b1).get() != null;
    }

    private void b(b b1)
    {
        int i;
        if (b.b(b1) == -2)
        {
            return;
        }
        i = 2750;
        if (b.b(b1) <= 0) goto _L2; else goto _L1
_L1:
        i = b.b(b1);
_L4:
        c.removeCallbacksAndMessages(b1);
        c.sendMessageDelayed(Message.obtain(c, 0, b1), i);
        return;
_L2:
        if (b.b(b1) == -1)
        {
            i = 1500;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean f(a a1)
    {
        return d != null && d.a(a1);
    }

    public final void a(a a1)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (!f(a1)) goto _L2; else goto _L1
_L1:
        a(d);
_L4:
        return;
_L2:
        boolean flag;
        if (e != null && e.a(a1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        a(e);
          goto _L4
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public final void b(a a1)
    {
        synchronized (b)
        {
            if (f(a1))
            {
                d = null;
                if (e != null && e != null)
                {
                    d = e;
                    e = null;
                    if ((a)b.a(d).get() == null)
                    {
                        d = null;
                    }
                }
            }
        }
        return;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public final void c(a a1)
    {
        synchronized (b)
        {
            if (f(a1))
            {
                b(d);
            }
        }
        return;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public final void d(a a1)
    {
        synchronized (b)
        {
            if (f(a1))
            {
                c.removeCallbacksAndMessages(d);
            }
        }
        return;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public final void e(a a1)
    {
        synchronized (b)
        {
            if (f(a1))
            {
                b(d);
            }
        }
        return;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }
}
