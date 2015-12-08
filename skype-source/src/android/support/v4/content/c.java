// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class c
{
    public static interface a
    {
    }

    public static interface b
    {

        public abstract void a(c c1, Object obj);
    }


    int a;
    b b;
    a c;
    Context d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;

    public c(Context context)
    {
        e = false;
        f = false;
        g = true;
        h = false;
        i = false;
        d = context.getApplicationContext();
    }

    public final int a()
    {
        return a;
    }

    public final void a(int k, b b1)
    {
        if (b != null)
        {
            throw new IllegalStateException("There is already a listener registered");
        } else
        {
            b = b1;
            a = k;
            return;
        }
    }

    public final void a(a a1)
    {
        if (c != null)
        {
            throw new IllegalStateException("There is already a listener registered");
        } else
        {
            c = a1;
            return;
        }
    }

    public final void a(b b1)
    {
        if (b == null)
        {
            throw new IllegalStateException("No listener register");
        }
        if (b != b1)
        {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else
        {
            b = null;
            return;
        }
    }

    public final void a(Object obj)
    {
        if (b != null)
        {
            b.a(this, obj);
        }
    }

    public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.print(s);
        printwriter.print("mId=");
        printwriter.print(a);
        printwriter.print(" mListener=");
        printwriter.println(b);
        if (e || h || i)
        {
            printwriter.print(s);
            printwriter.print("mStarted=");
            printwriter.print(e);
            printwriter.print(" mContentChanged=");
            printwriter.print(h);
            printwriter.print(" mProcessingChange=");
            printwriter.println(i);
        }
        if (f || g)
        {
            printwriter.print(s);
            printwriter.print("mAbandoned=");
            printwriter.print(f);
            printwriter.print(" mReset=");
            printwriter.println(g);
        }
    }

    public final void b(a a1)
    {
        if (c == null)
        {
            throw new IllegalStateException("No listener register");
        }
        if (c != a1)
        {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else
        {
            c = null;
            return;
        }
    }

    public final boolean b()
    {
        return e;
    }

    public final boolean c()
    {
        return f;
    }

    public final void d()
    {
        e = true;
        g = false;
        f = false;
        e();
    }

    protected void e()
    {
    }

    public final void f()
    {
        e = false;
        g();
    }

    protected void g()
    {
    }

    public final void h()
    {
        f = true;
    }

    public final void i()
    {
        j();
        g = true;
        e = false;
        f = false;
        h = false;
        i = false;
    }

    protected void j()
    {
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        android.support.v4.util.c.a(this, stringbuilder);
        stringbuilder.append(" id=");
        stringbuilder.append(a);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
