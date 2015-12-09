// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.services.s3.model;

import com.amazonaws.b;
import java.io.File;
import java.io.InputStream;

// Referenced classes of package com.amazonaws.services.s3.model:
//            ax, bz, bn

public class cm extends b
{

    private int a;
    private int b;
    private String c;
    private String d;
    private String e;
    private int f;
    private long g;
    private String h;
    private InputStream i;
    private File j;
    private long k;
    private com.amazonaws.a.b l;
    private boolean m;
    private bz n;

    public cm()
    {
    }

    public void a(int i1)
    {
        a = i1;
    }

    public void a(long l1)
    {
        g = l1;
    }

    public void a(com.amazonaws.a.b b1)
    {
        l = b1;
    }

    public void a(bn bn)
    {
        l = new ax(bn);
    }

    public void a(bz bz)
    {
        n = bz;
    }

    public void a(File file)
    {
        j = file;
    }

    public void a(InputStream inputstream)
    {
        i = inputstream;
    }

    public void a(boolean flag)
    {
        m = flag;
    }

    public cm b(int i1)
    {
        a = i1;
        return this;
    }

    public cm b(long l1)
    {
        g = l1;
        return this;
    }

    public cm b(com.amazonaws.a.b b1)
    {
        a(b1);
        return this;
    }

    public cm b(bn bn)
    {
        a(bn);
        return this;
    }

    public cm b(bz bz)
    {
        a(bz);
        return this;
    }

    public cm b(File file)
    {
        a(file);
        return this;
    }

    public cm b(InputStream inputstream)
    {
        a(inputstream);
        return this;
    }

    public cm b(boolean flag)
    {
        a(flag);
        return this;
    }

    public void b(String s1)
    {
        c = s1;
    }

    public cm c(String s1)
    {
        c = s1;
        return this;
    }

    public void c(int i1)
    {
        b = i1;
    }

    public void c(long l1)
    {
        k = l1;
    }

    public cm d(int i1)
    {
        b = i1;
        return this;
    }

    public cm d(long l1)
    {
        c(l1);
        return this;
    }

    public void d(String s1)
    {
        d = s1;
    }

    public cm e(String s1)
    {
        d = s1;
        return this;
    }

    public void e(int i1)
    {
        f = i1;
    }

    public int f()
    {
        return a;
    }

    public cm f(int i1)
    {
        f = i1;
        return this;
    }

    public void f(String s1)
    {
        e = s1;
    }

    public int g()
    {
        return b;
    }

    public cm g(String s1)
    {
        e = s1;
        return this;
    }

    public InputStream h()
    {
        return i;
    }

    public void h(String s1)
    {
        h = s1;
    }

    public cm i(String s1)
    {
        h = s1;
        return this;
    }

    public String i()
    {
        return c;
    }

    public String j()
    {
        return d;
    }

    public String k()
    {
        return e;
    }

    public int l()
    {
        return f;
    }

    public long m()
    {
        return g;
    }

    public String n()
    {
        return h;
    }

    public File o()
    {
        return j;
    }

    public long p()
    {
        return k;
    }

    public bn q()
    {
        if (l instanceof ax)
        {
            return ((ax)l).a();
        } else
        {
            return null;
        }
    }

    public boolean r()
    {
        return m;
    }

    public bz s()
    {
        return n;
    }

    public com.amazonaws.a.b t()
    {
        return l;
    }
}
