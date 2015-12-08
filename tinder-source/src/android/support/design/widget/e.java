// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

final class e
{
    static interface a
    {
    }

    private static final class b
    {

        final WeakReference a;
        int b;

        final boolean a(a a1)
        {
            return a1 != null && a.get() == a1;
        }
    }


    private static e d;
    final Object a = new Object();
    b b;
    b c;
    private final Handler e = new Handler(Looper.getMainLooper(), new android.os.Handler.Callback() {

        final e a;

        public final boolean handleMessage(Message message)
        {
            e e1;
            switch (message.what)
            {
            default:
                return false;

            case 0: // '\0'
                e1 = a;
                break;
            }
            b b1 = (b)message.obj;
            synchronized (e1.a)
            {
                if (e1.b == b1 || e1.c == b1)
                {
                    e.a(b1);
                }
            }
            return true;
            exception;
            message;
            JVM INSTR monitorexit ;
            throw exception;
        }

            
            {
                a = e.this;
                super();
            }
    });

    private e()
    {
    }

    static e a()
    {
        if (d == null)
        {
            d = new e();
        }
        return d;
    }

    static boolean a(b b1)
    {
        return (a)b1.a.get() != null;
    }

    private void b(b b1)
    {
        int i;
        if (b1.b == -2)
        {
            return;
        }
        i = 2750;
        if (b1.b <= 0) goto _L2; else goto _L1
_L1:
        i = b1.b;
_L4:
        e.removeCallbacksAndMessages(b1);
        e.sendMessageDelayed(Message.obtain(e, 0, b1), i);
        return;
_L2:
        if (b1.b == -1)
        {
            i = 1500;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(a a1)
    {
        synchronized (a)
        {
            if (d(a1))
            {
                b(b);
            }
        }
        return;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public final void b(a a1)
    {
        synchronized (a)
        {
            if (d(a1))
            {
                e.removeCallbacksAndMessages(b);
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
        synchronized (a)
        {
            if (d(a1))
            {
                b(b);
            }
        }
        return;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    final boolean d(a a1)
    {
        return b != null && b.a(a1);
    }
}
