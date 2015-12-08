// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class da
{

    private int a;
    private dd b;
    public dc d;
    Context e;
    boolean f;
    public boolean g;
    boolean h;
    boolean i;
    boolean j;

    public da(Context context)
    {
        f = false;
        g = false;
        h = true;
        i = false;
        j = false;
        e = context.getApplicationContext();
    }

    protected void a()
    {
    }

    public final void a(int i1, dd dd1)
    {
        if (b != null)
        {
            throw new IllegalStateException("There is already a listener registered");
        } else
        {
            b = dd1;
            a = i1;
            return;
        }
    }

    public final void a(dc dc)
    {
        if (d == null)
        {
            throw new IllegalStateException("No listener register");
        }
        if (d != dc)
        {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else
        {
            d = null;
            return;
        }
    }

    public final void a(dd dd1)
    {
        if (b == null)
        {
            throw new IllegalStateException("No listener register");
        }
        if (b != dd1)
        {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else
        {
            b = null;
            return;
        }
    }

    public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.print(s);
        printwriter.print("mId=");
        printwriter.print(a);
        printwriter.print(" mListener=");
        printwriter.println(b);
        if (f || i || j)
        {
            printwriter.print(s);
            printwriter.print("mStarted=");
            printwriter.print(f);
            printwriter.print(" mContentChanged=");
            printwriter.print(i);
            printwriter.print(" mProcessingChange=");
            printwriter.println(j);
        }
        if (g || h)
        {
            printwriter.print(s);
            printwriter.print("mAbandoned=");
            printwriter.print(g);
            printwriter.print(" mReset=");
            printwriter.println(h);
        }
    }

    public void b(Object obj)
    {
        if (b != null)
        {
            b.a(obj);
        }
    }

    protected boolean b()
    {
        return false;
    }

    public void f()
    {
    }

    public void g()
    {
    }

    public void h()
    {
    }

    public final Context i()
    {
        return e;
    }

    public final boolean j()
    {
        return f;
    }

    public final boolean k()
    {
        return h;
    }

    public final void l()
    {
        f = true;
        h = false;
        g = false;
        f();
    }

    public final boolean m()
    {
        return b();
    }

    public final void n()
    {
        a();
    }

    public final void o()
    {
        f = false;
        g();
    }

    public final void p()
    {
        h();
        h = true;
        f = false;
        g = false;
        i = false;
        j = false;
    }

    public final boolean q()
    {
        boolean flag = i;
        i = false;
        j = j | flag;
        return flag;
    }

    public final void r()
    {
        if (f)
        {
            a();
            return;
        } else
        {
            i = true;
            return;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        he.a(this, stringbuilder);
        stringbuilder.append(" id=");
        stringbuilder.append(a);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
