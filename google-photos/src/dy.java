// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

public abstract class dy extends ei
{

    volatile dz a;
    long b;
    private final Executor l;
    private volatile dz m;

    public dy(Context context)
    {
        this(context, eq.b);
    }

    private dy(Context context, Executor executor)
    {
        super(context);
        b = -10000L;
        l = executor;
    }

    protected final void a()
    {
        super.a();
        g();
        a = new dz(this);
        c();
    }

    final void a(dz dz1, Object obj)
    {
        if (m == dz1)
        {
            if (super.k)
            {
                super.j = true;
            }
            b = SystemClock.uptimeMillis();
            m = null;
            if (super.e != null)
            {
                super.e.d();
            }
            c();
        }
    }

    public final void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.a(s, filedescriptor, printwriter, as);
        if (a != null)
        {
            printwriter.print(s);
            printwriter.print("mTask=");
            printwriter.print(a);
            printwriter.print(" waiting=");
            printwriter.println(a.a);
        }
        if (m != null)
        {
            printwriter.print(s);
            printwriter.print("mCancellingTask=");
            printwriter.print(m);
            printwriter.print(" waiting=");
            printwriter.println(m.a);
        }
        if (0L != 0L)
        {
            printwriter.print(s);
            printwriter.print("mUpdateThrottle=");
            kb.a(0L, printwriter);
            printwriter.print(" mLastLoadCompleteTime=");
            kb.a(b, SystemClock.uptimeMillis(), printwriter);
            printwriter.println();
        }
    }

    protected final boolean b()
    {
label0:
        {
            if (a != null)
            {
                if (m == null)
                {
                    break label0;
                }
                if (a.a)
                {
                    a.a = false;
                    dz dz1 = a;
                    throw new NullPointerException();
                }
                a = null;
            }
            return false;
        }
        if (a.a)
        {
            a.a = false;
            dz dz2 = a;
            throw new NullPointerException();
        }
        boolean flag = ((eq) (a)).d.cancel(false);
        if (flag)
        {
            m = a;
        }
        a = null;
        return flag;
    }

    final void c()
    {
        Executor executor;
        dz dz3;
        if (m == null && a != null)
        {
            if (a.a)
            {
                a.a = false;
                dz dz1 = a;
                throw new NullPointerException();
            }
            if (0L > 0L && SystemClock.uptimeMillis() < b)
            {
                a.a = true;
                dz dz2 = a;
                long l1 = b;
                throw new NullPointerException();
            }
        } else
        {
            return;
        }
        dz3 = a;
        executor = l;
        if (((eq) (dz3)).e == ex.a) goto _L2; else goto _L1
_L1:
        eu.a[((eq) (dz3)).e - 1];
        JVM INSTR tableswitch 1 2: default 140
    //                   1 166
    //                   2 176;
           goto _L2 _L3 _L4
_L2:
        dz3.e = ex.b;
        ((eq) (dz3)).c.a = null;
        executor.execute(((eq) (dz3)).d);
        return;
_L3:
        throw new IllegalStateException("Cannot execute task: the task is already running.");
_L4:
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    public abstract Object d();
}
