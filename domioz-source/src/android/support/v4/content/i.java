// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.Context;
import android.support.v4.e.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.content:
//            j

public class i
{

    int a;
    j b;
    Context c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;

    public i(Context context)
    {
        d = false;
        e = false;
        f = true;
        g = false;
        h = false;
        c = context.getApplicationContext();
    }

    public final int a()
    {
        return a;
    }

    public final void a(int k, j j1)
    {
        if (b != null)
        {
            throw new IllegalStateException("There is already a listener registered");
        } else
        {
            b = j1;
            a = k;
            return;
        }
    }

    public final void a(j j1)
    {
        if (b == null)
        {
            throw new IllegalStateException("No listener register");
        }
        if (b != j1)
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

    public final boolean b()
    {
        return d;
    }

    public final boolean c()
    {
        return e;
    }

    public final void d()
    {
        d = true;
        f = false;
        e = false;
        e();
    }

    protected void e()
    {
    }

    public final void f()
    {
        d = false;
        g();
    }

    protected void g()
    {
    }

    public final void h()
    {
        e = true;
    }

    public final void i()
    {
        j();
        f = true;
        d = false;
        e = false;
        g = false;
        h = false;
    }

    protected void j()
    {
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        android.support.v4.e.d.a(this, stringbuilder);
        stringbuilder.append(" id=");
        stringbuilder.append(a);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
