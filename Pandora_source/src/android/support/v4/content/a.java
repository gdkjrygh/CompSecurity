// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import p.e.i;

// Referenced classes of package android.support.v4.content:
//            i, k

public abstract class android.support.v4.content.a extends android.support.v4.content.i
{
    final class a extends k
        implements Runnable
    {

        Object a;
        boolean b;
        final android.support.v4.content.a c;
        private CountDownLatch e;

        protected volatile Object a(Object aobj[])
        {
            return a((Void[])aobj);
        }

        protected transient Object a(Void avoid[])
        {
            a = c.d();
            return a;
        }

        protected void a()
        {
            c.a(this, a);
            e.countDown();
            return;
            Exception exception;
            exception;
            e.countDown();
            throw exception;
        }

        protected void a(Object obj)
        {
            c.b(this, obj);
            e.countDown();
            return;
            obj;
            e.countDown();
            throw obj;
        }

        public void run()
        {
            b = false;
            c.b();
        }

        a()
        {
            c = android.support.v4.content.a.this;
            super();
            e = new CountDownLatch(1);
        }
    }


    volatile a a;
    volatile a b;
    long c;
    long d;
    Handler e;

    public android.support.v4.content.a(Context context)
    {
        super(context);
        d = -10000L;
    }

    void a(a a1, Object obj)
    {
        a(obj);
        if (b == a1)
        {
            rollbackContentChanged();
            d = SystemClock.uptimeMillis();
            b = null;
            b();
        }
    }

    public void a(Object obj)
    {
    }

    public boolean a()
    {
label0:
        {
            if (a != null)
            {
                if (b == null)
                {
                    break label0;
                }
                if (a.b)
                {
                    a.b = false;
                    e.removeCallbacks(a);
                }
                a = null;
            }
            return false;
        }
        if (a.b)
        {
            a.b = false;
            e.removeCallbacks(a);
            a = null;
            return false;
        }
        boolean flag = a.a(false);
        if (flag)
        {
            b = a;
        }
        a = null;
        return flag;
    }

    void b()
    {
label0:
        {
            if (b == null && a != null)
            {
                if (a.b)
                {
                    a.b = false;
                    e.removeCallbacks(a);
                }
                if (c <= 0L || SystemClock.uptimeMillis() >= d + c)
                {
                    break label0;
                }
                a.b = true;
                e.postAtTime(a, d + c);
            }
            return;
        }
        a.a(k.d, (Void[])null);
    }

    void b(a a1, Object obj)
    {
        if (a != a1)
        {
            a(a1, obj);
            return;
        }
        if (isAbandoned())
        {
            a(obj);
            return;
        } else
        {
            commitContentChanged();
            d = SystemClock.uptimeMillis();
            a = null;
            deliverResult(obj);
            return;
        }
    }

    public abstract Object c();

    protected Object d()
    {
        return c();
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.dump(s, filedescriptor, printwriter, as);
        if (a != null)
        {
            printwriter.print(s);
            printwriter.print("mTask=");
            printwriter.print(a);
            printwriter.print(" waiting=");
            printwriter.println(a.b);
        }
        if (b != null)
        {
            printwriter.print(s);
            printwriter.print("mCancellingTask=");
            printwriter.print(b);
            printwriter.print(" waiting=");
            printwriter.println(b.b);
        }
        if (c != 0L)
        {
            printwriter.print(s);
            printwriter.print("mUpdateThrottle=");
            i.a(c, printwriter);
            printwriter.print(" mLastLoadCompleteTime=");
            i.a(d, SystemClock.uptimeMillis(), printwriter);
            printwriter.println();
        }
    }

    protected void onForceLoad()
    {
        super.onForceLoad();
        a();
        a = new a();
        b();
    }
}
