// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.template;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;

public class TemplateInfo
    implements Parcelable, Cloneable
{

    private long a;
    private long b;
    private String c;
    private String d;
    private String e;
    private int f;
    private int g;
    private int h;
    private float i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private volatile boolean o;
    private volatile int p;
    private volatile WeakReference q;

    public TemplateInfo()
    {
        p = 0;
    }

    public final void a(float f1)
    {
        i = f1;
    }

    public final void a(int i1)
    {
        p = i1;
    }

    public final void a(long l1)
    {
        a = l1;
    }

    public final void a(ProgressBar progressbar)
    {
        if (q != null)
        {
            q.clear();
        }
        q = new WeakReference(progressbar);
        o = true;
    }

    public final void a(String s)
    {
        e = s;
    }

    public final void a(boolean flag)
    {
        j = flag;
    }

    public final boolean a()
    {
        return o;
    }

    public final void b()
    {
        o = false;
    }

    public final void b(int i1)
    {
        f = i1;
    }

    public final void b(long l1)
    {
        b = l1;
    }

    public final void b(String s)
    {
        c = s;
    }

    public final void b(boolean flag)
    {
        k = flag;
    }

    public final ProgressBar c()
    {
        if (q == null)
        {
            return null;
        } else
        {
            return (ProgressBar)q.get();
        }
    }

    public final void c(int i1)
    {
        h = i1;
    }

    public final void c(String s)
    {
        d = s;
    }

    public final void c(boolean flag)
    {
        l = flag;
    }

    public Object clone()
    {
        return r();
    }

    public final int d()
    {
        return p;
    }

    public final void d(int i1)
    {
        g = i1;
    }

    public final void d(boolean flag)
    {
        m = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public final long e()
    {
        return a;
    }

    public final void e(boolean flag)
    {
        n = flag;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof TemplateInfo))
            {
                return false;
            }
            if (((TemplateInfo)obj).a != a)
            {
                return false;
            }
        }
        return true;
    }

    public final float f()
    {
        return i;
    }

    public final String g()
    {
        return e;
    }

    public final String h()
    {
        return c;
    }

    public int hashCode()
    {
        int i1;
        if (j)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        return ((int)((float)((((i1 + 527) * 31 + h) * 31 + g) * 31) + i) * 31 + d.hashCode()) * 31 + c.hashCode();
    }

    public final String i()
    {
        return d;
    }

    public final int j()
    {
        return f;
    }

    public final int k()
    {
        return h;
    }

    public final int l()
    {
        return g;
    }

    public final boolean m()
    {
        return j;
    }

    public final boolean n()
    {
        return k;
    }

    public final boolean o()
    {
        return l;
    }

    public final boolean p()
    {
        return m;
    }

    public final boolean q()
    {
        return n;
    }

    public final TemplateInfo r()
    {
        TemplateInfo templateinfo = new TemplateInfo();
        templateinfo.a = a;
        templateinfo.d = d;
        templateinfo.b = b;
        templateinfo.c = c;
        templateinfo.e = e;
        templateinfo.f = f;
        templateinfo.g = g;
        templateinfo.h = h;
        templateinfo.i = i;
        templateinfo.j = j;
        templateinfo.k = k;
        templateinfo.l = l;
        templateinfo.m = m;
        templateinfo.q = null;
        templateinfo.o = false;
        templateinfo.p = 0;
        templateinfo.n = n;
        return templateinfo;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
    }
}
