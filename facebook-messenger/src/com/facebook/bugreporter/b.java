// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter;

import android.net.Uri;
import com.google.common.a.ev;

// Referenced classes of package com.facebook.bugreporter:
//            BugReport

public class b
{

    private Uri a;
    private String b;
    private Uri c;
    private Uri d;
    private ev e;
    private ev f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;

    public b()
    {
    }

    public Uri a()
    {
        return a;
    }

    public b a(Uri uri)
    {
        a = uri;
        return this;
    }

    public b a(BugReport bugreport)
    {
        a = bugreport.a();
        b = bugreport.b();
        c = bugreport.c();
        d = bugreport.d();
        e = bugreport.e();
        f = bugreport.f();
        g = bugreport.g();
        h = bugreport.h();
        i = bugreport.i();
        j = bugreport.j();
        k = bugreport.k();
        l = bugreport.l();
        m = bugreport.m();
        n = bugreport.n();
        return this;
    }

    public b a(ev ev)
    {
        e = ev;
        return this;
    }

    public b a(String s)
    {
        b = s;
        return this;
    }

    public b b(Uri uri)
    {
        c = uri;
        return this;
    }

    public b b(ev ev)
    {
        f = ev;
        return this;
    }

    public b b(String s)
    {
        g = s;
        return this;
    }

    public String b()
    {
        return b;
    }

    public Uri c()
    {
        return c;
    }

    public b c(Uri uri)
    {
        d = uri;
        return this;
    }

    public b c(String s)
    {
        h = s;
        return this;
    }

    public Uri d()
    {
        return d;
    }

    public b d(String s)
    {
        i = s;
        return this;
    }

    public b e(String s)
    {
        j = s;
        return this;
    }

    public ev e()
    {
        return e;
    }

    public b f(String s)
    {
        k = s;
        return this;
    }

    public ev f()
    {
        return f;
    }

    public b g(String s)
    {
        l = s;
        return this;
    }

    public String g()
    {
        return g;
    }

    public b h(String s)
    {
        m = s;
        return this;
    }

    public String h()
    {
        return h;
    }

    public b i(String s)
    {
        n = s;
        return this;
    }

    public String i()
    {
        return i;
    }

    public String j()
    {
        return j;
    }

    public String k()
    {
        return k;
    }

    public String l()
    {
        return l;
    }

    public String m()
    {
        return m;
    }

    public String n()
    {
        return n;
    }

    public BugReport o()
    {
        return new BugReport(this);
    }
}
