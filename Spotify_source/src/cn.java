// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.SystemClock;
import android.support.v4.content.ModernAsyncTask;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

public abstract class cn extends da
{

    volatile co a;
    volatile co b;
    long c;
    private final Executor k;

    public cn(Context context)
    {
        this(context, ModernAsyncTask.b);
    }

    private cn(Context context, Executor executor)
    {
        super(context);
        c = -10000L;
        k = executor;
    }

    protected final void a()
    {
        super.a();
        m();
        a = new co(this);
        c();
    }

    final void a(co co1, Object obj)
    {
        a(obj);
        if (b == co1)
        {
            if (super.j)
            {
                super.i = true;
            }
            c = SystemClock.uptimeMillis();
            b = null;
            if (super.d != null)
            {
                super.d.d();
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
        if (0L != 0L)
        {
            printwriter.print(s);
            printwriter.print("mUpdateThrottle=");
            hu.a(printwriter);
            printwriter.print(" mLastLoadCompleteTime=");
            hu.a(c, SystemClock.uptimeMillis(), printwriter);
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
                    co co1 = a;
                    throw new NullPointerException();
                }
                a = null;
            }
            return false;
        }
        if (a.a)
        {
            a.a = false;
            co co2 = a;
            throw new NullPointerException();
        }
        boolean flag = ((ModernAsyncTask) (a)).d.cancel(false);
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
        co co3;
        Executor executor;
        if (b == null && a != null)
        {
            if (a.a)
            {
                a.a = false;
                co co1 = a;
                throw new NullPointerException();
            }
            if (0L > 0L && SystemClock.uptimeMillis() < c)
            {
                a.a = true;
                co co2 = a;
                long l = c;
                throw new NullPointerException();
            }
        } else
        {
            return;
        }
        co3 = a;
        executor = k;
        if (((ModernAsyncTask) (co3)).e == android.support.v4.content.ModernAsyncTask.Status.a) goto _L2; else goto _L1
_L1:
        android.support.v4.content.ModernAsyncTask._cls4.a[((ModernAsyncTask) (co3)).e.ordinal()];
        JVM INSTR tableswitch 1 2: default 144
    //                   1 167
    //                   2 177;
           goto _L2 _L3 _L4
_L2:
        co3.e = android.support.v4.content.ModernAsyncTask.Status.b;
        dj dj = ((ModernAsyncTask) (co3)).c;
        executor.execute(((ModernAsyncTask) (co3)).d);
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
