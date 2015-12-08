// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.Context;
import android.support.v4.d.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.content:
//            s, r

public class p
{

    public int n;
    public s o;
    public r p;
    Context q;
    boolean r;
    boolean s;
    boolean t;
    boolean u;
    boolean v;

    public p(Context context)
    {
        r = false;
        s = false;
        t = true;
        u = false;
        v = false;
        q = context.getApplicationContext();
    }

    protected void a()
    {
    }

    public final void a(r r1)
    {
        if (p == null)
        {
            throw new IllegalStateException("No listener register");
        }
        if (p != r1)
        {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else
        {
            p = null;
            return;
        }
    }

    public final void a(s s1)
    {
        if (o == null)
        {
            throw new IllegalStateException("No listener register");
        }
        if (o != s1)
        {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else
        {
            o = null;
            return;
        }
    }

    public void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.print(s1);
        printwriter.print("mId=");
        printwriter.print(n);
        printwriter.print(" mListener=");
        printwriter.println(o);
        if (r || u || v)
        {
            printwriter.print(s1);
            printwriter.print("mStarted=");
            printwriter.print(r);
            printwriter.print(" mContentChanged=");
            printwriter.print(u);
            printwriter.print(" mProcessingChange=");
            printwriter.println(v);
        }
        if (s || t)
        {
            printwriter.print(s1);
            printwriter.print("mAbandoned=");
            printwriter.print(s);
            printwriter.print(" mReset=");
            printwriter.println(t);
        }
    }

    public void b(Object obj)
    {
        if (o != null)
        {
            o.a(this, obj);
        }
    }

    protected boolean b()
    {
        return false;
    }

    protected void f()
    {
    }

    protected void g()
    {
    }

    protected void h()
    {
    }

    public final void i()
    {
        r = true;
        t = false;
        s = false;
        f();
    }

    public final boolean j()
    {
        return b();
    }

    public final void k()
    {
        a();
    }

    public final void l()
    {
        r = false;
        g();
    }

    public final void m()
    {
        h();
        t = true;
        r = false;
        s = false;
        u = false;
        v = false;
    }

    public final void n()
    {
        if (r)
        {
            a();
            return;
        } else
        {
            u = true;
            return;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        d.a(this, stringbuilder);
        stringbuilder.append(" id=");
        stringbuilder.append(n);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
