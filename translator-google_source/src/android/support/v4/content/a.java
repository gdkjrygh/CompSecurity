// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.d.o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

// Referenced classes of package android.support.v4.content:
//            p, ModernAsyncTask, b, r, 
//            w, z

public abstract class a extends p
{

    volatile b a;
    volatile b b;
    long c;
    long d;
    Handler e;
    private final Executor f;

    public a(Context context)
    {
        this(context, ModernAsyncTask.c);
    }

    private a(Context context, Executor executor)
    {
        super(context);
        d = -10000L;
        f = executor;
    }

    protected final void a()
    {
        super.a();
        j();
        a = new b(this);
        c();
    }

    final void a(b b1, Object obj)
    {
        a(obj);
        if (b == b1)
        {
            if (super.v)
            {
                super.u = true;
            }
            d = SystemClock.uptimeMillis();
            b = null;
            if (super.p != null)
            {
                super.p.d();
            }
            c();
        }
    }

    public void a(Object obj)
    {
    }

    public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
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
        if (b != null)
        {
            printwriter.print(s);
            printwriter.print("mCancellingTask=");
            printwriter.print(b);
            printwriter.print(" waiting=");
            printwriter.println(b.a);
        }
        if (c != 0L)
        {
            printwriter.print(s);
            printwriter.print("mUpdateThrottle=");
            o.a(c, printwriter);
            printwriter.print(" mLastLoadCompleteTime=");
            o.a(d, SystemClock.uptimeMillis(), printwriter);
            printwriter.println();
        }
    }

    protected final boolean b()
    {
label0:
        {
            if (a != null)
            {
                if (b == null)
                {
                    break label0;
                }
                if (a.a)
                {
                    a.a = false;
                    e.removeCallbacks(a);
                }
                a = null;
            }
            return false;
        }
        if (a.a)
        {
            a.a = false;
            e.removeCallbacks(a);
            a = null;
            return false;
        }
        boolean flag = ((ModernAsyncTask) (a)).e.cancel(false);
        if (flag)
        {
            b = a;
            e();
        }
        a = null;
        return flag;
    }

    final void c()
    {
        b b1;
        Executor executor;
label0:
        {
            if (b == null && a != null)
            {
                if (a.a)
                {
                    a.a = false;
                    e.removeCallbacks(a);
                }
                if (c <= 0L || SystemClock.uptimeMillis() >= d + c)
                {
                    break label0;
                }
                a.a = true;
                e.postAtTime(a, d + c);
            }
            return;
        }
        b1 = a;
        executor = f;
        if (((ModernAsyncTask) (b1)).f == ModernAsyncTask.Status.PENDING) goto _L2; else goto _L1
_L1:
        w.a[((ModernAsyncTask) (b1)).f.ordinal()];
        JVM INSTR tableswitch 1 2: default 152
    //                   1 178
    //                   2 188;
           goto _L2 _L3 _L4
_L2:
        b1.f = ModernAsyncTask.Status.RUNNING;
        ((ModernAsyncTask) (b1)).d.b = null;
        executor.execute(((ModernAsyncTask) (b1)).e);
        return;
_L3:
        throw new IllegalStateException("Cannot execute task: the task is already running.");
_L4:
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    public abstract Object d();

    public void e()
    {
    }
}
