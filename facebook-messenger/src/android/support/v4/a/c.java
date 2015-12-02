// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a;

import android.content.Context;
import android.support.v4.c.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.a:
//            d

public class c
{

    int f;
    d g;
    Context h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;

    public c(Context context)
    {
        i = false;
        j = false;
        k = true;
        l = false;
        h = context.getApplicationContext();
    }

    protected void a()
    {
    }

    public void a(int i1, d d1)
    {
        if (g != null)
        {
            throw new IllegalStateException("There is already a listener registered");
        } else
        {
            g = d1;
            f = i1;
            return;
        }
    }

    public void a(d d1)
    {
        if (g == null)
        {
            throw new IllegalStateException("No listener register");
        }
        if (g != d1)
        {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else
        {
            g = null;
            return;
        }
    }

    public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.print(s);
        printwriter.print("mId=");
        printwriter.print(f);
        printwriter.print(" mListener=");
        printwriter.println(g);
        printwriter.print(s);
        printwriter.print("mStarted=");
        printwriter.print(i);
        printwriter.print(" mContentChanged=");
        printwriter.print(l);
        printwriter.print(" mAbandoned=");
        printwriter.print(j);
        printwriter.print(" mReset=");
        printwriter.println(k);
    }

    public void b(Object obj)
    {
        if (g != null)
        {
            g.a(this, obj);
        }
    }

    public String c(Object obj)
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        android.support.v4.c.a.a(obj, stringbuilder);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public boolean f()
    {
        return i;
    }

    public boolean g()
    {
        return j;
    }

    public final void h()
    {
        i = true;
        k = false;
        j = false;
        i();
    }

    protected void i()
    {
    }

    public void j()
    {
        a();
    }

    public void k()
    {
        i = false;
        l();
    }

    protected void l()
    {
    }

    public void m()
    {
        j = true;
        n();
    }

    protected void n()
    {
    }

    public void o()
    {
        p();
        k = true;
        i = false;
        j = false;
        l = false;
    }

    protected void p()
    {
    }

    public void q()
    {
        if (i)
        {
            j();
            return;
        } else
        {
            l = true;
            return;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        android.support.v4.c.a.a(this, stringbuilder);
        stringbuilder.append(" id=");
        stringbuilder.append(f);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
