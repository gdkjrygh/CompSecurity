// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.support.v4.c.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class f
{
    public static interface a
    {
    }


    int a;
    a b;
    boolean c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;

    public String a(Object obj)
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        android.support.v4.c.d.a(obj, stringbuilder);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public final void a()
    {
        c = true;
        e = false;
        d = false;
        b();
    }

    public void a(int i, a a1)
    {
        if (b != null)
        {
            throw new IllegalStateException("There is already a listener registered");
        } else
        {
            b = a1;
            a = i;
            return;
        }
    }

    public void a(a a1)
    {
        if (b == null)
        {
            throw new IllegalStateException("No listener register");
        }
        if (b != a1)
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
        if (c || f || g)
        {
            printwriter.print(s);
            printwriter.print("mStarted=");
            printwriter.print(c);
            printwriter.print(" mContentChanged=");
            printwriter.print(f);
            printwriter.print(" mProcessingChange=");
            printwriter.println(g);
        }
        if (d || e)
        {
            printwriter.print(s);
            printwriter.print("mAbandoned=");
            printwriter.print(d);
            printwriter.print(" mReset=");
            printwriter.println(e);
        }
    }

    protected void b()
    {
    }

    public void c()
    {
        c = false;
        d();
    }

    protected void d()
    {
    }

    public void e()
    {
        f();
        e = true;
        c = false;
        d = false;
        f = false;
        g = false;
    }

    protected void f()
    {
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        android.support.v4.c.d.a(this, stringbuilder);
        stringbuilder.append(" id=");
        stringbuilder.append(a);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
