// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.Context;
import android.support.v4.util.DebugUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class Loader
{

    int a;
    OnLoadCompleteListener b;
    OnLoadCanceledListener c;
    Context d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;

    public Loader(Context context)
    {
        e = false;
        f = false;
        g = true;
        h = false;
        i = false;
        d = context.getApplicationContext();
    }

    public int a()
    {
        return a;
    }

    public void a(int i1, OnLoadCompleteListener onloadcompletelistener)
    {
        if (b != null)
        {
            throw new IllegalStateException("There is already a listener registered");
        } else
        {
            b = onloadcompletelistener;
            a = i1;
            return;
        }
    }

    public void a(OnLoadCanceledListener onloadcanceledlistener)
    {
        if (c != null)
        {
            throw new IllegalStateException("There is already a listener registered");
        } else
        {
            c = onloadcanceledlistener;
            return;
        }
    }

    public void a(OnLoadCompleteListener onloadcompletelistener)
    {
        if (b == null)
        {
            throw new IllegalStateException("No listener register");
        }
        if (b != onloadcompletelistener)
        {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else
        {
            b = null;
            return;
        }
    }

    public void a(Object obj)
    {
        if (b != null)
        {
            b.onLoadComplete(this, obj);
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

    public String b(Object obj)
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        DebugUtils.a(obj, stringbuilder);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public void b(OnLoadCanceledListener onloadcanceledlistener)
    {
        if (c == null)
        {
            throw new IllegalStateException("No listener register");
        }
        if (c != onloadcanceledlistener)
        {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else
        {
            c = null;
            return;
        }
    }

    public boolean b()
    {
        return e;
    }

    public boolean c()
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

    public boolean f()
    {
        return g();
    }

    protected boolean g()
    {
        return false;
    }

    public void h()
    {
        e = false;
        i();
    }

    protected void i()
    {
    }

    public void j()
    {
        f = true;
        k();
    }

    protected void k()
    {
    }

    public void l()
    {
        m();
        g = true;
        e = false;
        f = false;
        h = false;
        i = false;
    }

    protected void m()
    {
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        DebugUtils.a(this, stringbuilder);
        stringbuilder.append(" id=");
        stringbuilder.append(a);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    private class OnLoadCompleteListener
    {

        public abstract void onLoadComplete(Loader loader, Object obj);
    }

}
