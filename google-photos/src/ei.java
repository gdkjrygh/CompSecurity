// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class ei
{

    public int c;
    public el d;
    public ek e;
    public Context f;
    public boolean g;
    public boolean h;
    public boolean i;
    boolean j;
    boolean k;

    public ei(Context context)
    {
        g = false;
        h = false;
        i = true;
        j = false;
        k = false;
        f = context.getApplicationContext();
    }

    protected void a()
    {
    }

    public final void a(ek ek)
    {
        if (e == null)
        {
            throw new IllegalStateException("No listener register");
        }
        if (e != ek)
        {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else
        {
            e = null;
            return;
        }
    }

    public final void a(el el1)
    {
        if (d == null)
        {
            throw new IllegalStateException("No listener register");
        }
        if (d != el1)
        {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else
        {
            d = null;
            return;
        }
    }

    public void a(Object obj)
    {
        if (d != null)
        {
            d.a(this, obj);
        }
    }

    public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.print(s);
        printwriter.print("mId=");
        printwriter.print(c);
        printwriter.print(" mListener=");
        printwriter.println(d);
        if (g || j || k)
        {
            printwriter.print(s);
            printwriter.print("mStarted=");
            printwriter.print(g);
            printwriter.print(" mContentChanged=");
            printwriter.print(j);
            printwriter.print(" mProcessingChange=");
            printwriter.println(k);
        }
        if (h || i)
        {
            printwriter.print(s);
            printwriter.print("mAbandoned=");
            printwriter.print(h);
            printwriter.print(" mReset=");
            printwriter.println(i);
        }
    }

    protected boolean b()
    {
        return false;
    }

    public final void e()
    {
        g = true;
        i = false;
        h = false;
        f();
    }

    public void f()
    {
    }

    public final boolean g()
    {
        return b();
    }

    public final void h()
    {
        a();
    }

    public final void i()
    {
        g = false;
        j();
    }

    public void j()
    {
    }

    public final void k()
    {
        h = true;
        l();
    }

    public void l()
    {
    }

    public final void m()
    {
        n();
        i = true;
        g = false;
        h = false;
        j = false;
        k = false;
    }

    public void n()
    {
    }

    public final boolean o()
    {
        boolean flag = j;
        j = false;
        k = k | flag;
        return flag;
    }

    public final void p()
    {
        if (g)
        {
            a();
            return;
        } else
        {
            j = true;
            return;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        b.a(this, stringbuilder);
        stringbuilder.append(" id=");
        stringbuilder.append(c);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
