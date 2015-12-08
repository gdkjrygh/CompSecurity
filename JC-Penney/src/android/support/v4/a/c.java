// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a;

import android.support.v4.f.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.a:
//            e, d

public class c
{

    int a;
    e b;
    android.support.v4.a.d c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;

    public String a(Object obj)
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        android.support.v4.f.d.a(obj, stringbuilder);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public final void a()
    {
        d = true;
        f = false;
        e = false;
        b();
    }

    public void a(int i, e e1)
    {
        if (b != null)
        {
            throw new IllegalStateException("There is already a listener registered");
        } else
        {
            b = e1;
            a = i;
            return;
        }
    }

    public void a(android.support.v4.a.d d1)
    {
        if (c != null)
        {
            throw new IllegalStateException("There is already a listener registered");
        } else
        {
            c = d1;
            return;
        }
    }

    public void a(e e1)
    {
        if (b == null)
        {
            throw new IllegalStateException("No listener register");
        }
        if (b != e1)
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
        if (d || g || h)
        {
            printwriter.print(s);
            printwriter.print("mStarted=");
            printwriter.print(d);
            printwriter.print(" mContentChanged=");
            printwriter.print(g);
            printwriter.print(" mProcessingChange=");
            printwriter.println(h);
        }
        if (e || f)
        {
            printwriter.print(s);
            printwriter.print("mAbandoned=");
            printwriter.print(e);
            printwriter.print(" mReset=");
            printwriter.println(f);
        }
    }

    protected void b()
    {
    }

    public void b(android.support.v4.a.d d1)
    {
        if (c == null)
        {
            throw new IllegalStateException("No listener register");
        }
        if (c != d1)
        {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else
        {
            c = null;
            return;
        }
    }

    public void c()
    {
        d = false;
        d();
    }

    protected void d()
    {
    }

    public void e()
    {
        f();
        f = true;
        d = false;
        e = false;
        g = false;
        h = false;
    }

    protected void f()
    {
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        android.support.v4.f.d.a(this, stringbuilder);
        stringbuilder.append(" id=");
        stringbuilder.append(a);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
