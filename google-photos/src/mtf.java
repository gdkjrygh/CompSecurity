// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.SparseArray;
import java.util.concurrent.Executor;

public class mtf
{

    private final Context a;
    private int b;
    public String d;
    mtg e;
    int f;
    public boolean g;
    public boolean h;
    public int i;

    public mtf(Context context, String s)
    {
        i = muf.b;
        if (context != null)
        {
            context = context.getApplicationContext();
        } else
        {
            context = null;
        }
        a = context;
        d = s;
        if (s == null)
        {
            throw new IllegalArgumentException("BackgroundTask tag cannot be null.");
        } else
        {
            return;
        }
    }

    public mtf(String s)
    {
        this(null, s);
    }

    public mtf a(boolean flag)
    {
        g = flag;
        return this;
    }

    public mue a()
    {
        return null;
    }

    public mue a(Context context)
    {
        return null;
    }

    public String b(Context context)
    {
        return null;
    }

    public void b()
    {
    }

    public Executor c()
    {
        return null;
    }

    final void c(Context context)
    {
        boolean flag;
        if (context != null || a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        if (context == null)
        {
            context = a;
        }
        if (h && b == 0)
        {
            b = muc.a(context).a();
        }
    }

    public final Context d()
    {
        p.b(a, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
        return a;
    }

    final void d(Context context)
    {
        muc muc1;
        android.os.PowerManager.WakeLock wakelock;
        int j;
        boolean flag;
        if (context != null || a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        if (context == null)
        {
            context = a;
        }
        if (b == 0) goto _L2; else goto _L1
_L1:
        muc1 = muc.a(context);
        j = b;
        context = muc1.a;
        context;
        JVM INSTR monitorenter ;
        wakelock = (android.os.PowerManager.WakeLock)muc1.a.get(j);
        if (wakelock == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        wakelock.release();
        muc1.a.remove(j);
        context;
        JVM INSTR monitorexit ;
_L2:
        return;
        Exception exception;
        exception;
        context;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String e()
    {
        return null;
    }

    final mue e(Context context)
    {
        mue mue1;
        mue mue2;
        boolean flag;
        if (context != null || a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "You must provide a Context with your background task, or if you're using deprecated methods, you must provide your BackgroundTask with a Context.");
        mue2 = a();
        mue1 = mue2;
        if (mue2 == null)
        {
            mue1 = mue2;
            if (context != null)
            {
                mue1 = a(context);
            }
        }
        if (mue1 == null)
        {
            context = String.valueOf(getClass());
            throw new AssertionError((new StringBuilder(String.valueOf(context).length() + 31)).append("Null result in BackgroundTask: ").append(context).toString());
        } else
        {
            mue1.f = i;
            mue1.g = pux.a();
            return mue1;
        }
    }

    final void f(Context context)
    {
        Object obj = new mue(false);
        mue mue1 = e(context);
        e.a(this, mue1);
        d(context);
        return;
        obj;
        d(context);
        throw obj;
        Object obj1;
        obj1;
        Thread.UncaughtExceptionHandler uncaughtexceptionhandler = Thread.getDefaultUncaughtExceptionHandler();
        if (uncaughtexceptionhandler == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        uncaughtexceptionhandler.uncaughtException(Thread.currentThread(), ((Throwable) (obj1)));
        e.a(this, ((mue) (obj)));
        d(context);
        return;
        throw new RuntimeException(((Throwable) (obj1)));
        obj1;
        e.a(this, ((mue) (obj)));
        d(context);
        throw obj1;
        Exception exception;
        exception;
        d(context);
        throw exception;
        exception;
        d(context);
        throw exception;
    }
}
