// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.c.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.a:
//            c, b, i

public abstract class a extends c
{

    volatile b a;
    volatile b b;
    long c;
    long d;
    Handler e;

    public a(Context context)
    {
        super(context);
        d = -10000L;
    }

    protected void a()
    {
        super.a();
        b();
        a = new b(this);
        c();
    }

    void a(b b1, Object obj)
    {
        a(obj);
        if (b == b1)
        {
            d = SystemClock.uptimeMillis();
            b = null;
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
            android.support.v4.c.e.a(c, printwriter);
            printwriter.print(" mLastLoadCompleteTime=");
            android.support.v4.c.e.a(d, SystemClock.uptimeMillis(), printwriter);
            printwriter.println();
        }
    }

    void b(b b1, Object obj)
    {
        if (a != b1)
        {
            a(b1, obj);
            return;
        }
        if (g())
        {
            a(obj);
            return;
        } else
        {
            d = SystemClock.uptimeMillis();
            a = null;
            b(obj);
            return;
        }
    }

    public boolean b()
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

    void c()
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
        a.a(i.d, (Void[])null);
    }

    public abstract Object d();

    protected Object e()
    {
        return d();
    }
}
