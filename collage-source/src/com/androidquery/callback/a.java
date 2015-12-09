// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.androidquery.callback;

import java.io.Closeable;
import java.io.File;
import java.util.Date;
import org.apache.http.Header;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HttpContext;

public class a
{

    private int a;
    private String b;
    private String c;
    private byte d[];
    private File e;
    private Date f;
    private boolean g;
    private DefaultHttpClient h;
    private long i;
    private int j;
    private long k;
    private boolean l;
    private boolean m;
    private boolean n;
    private String o;
    private HttpContext p;
    private Header q[];
    private Closeable r;

    public a()
    {
        a = 200;
        b = "OK";
        f = new Date();
        j = 1;
        k = System.currentTimeMillis();
    }

    public a a()
    {
        i = System.currentTimeMillis() - k;
        l = true;
        n = false;
        return this;
    }

    protected a a(int i1)
    {
        j = i1;
        return this;
    }

    protected a a(File file)
    {
        e = file;
        return this;
    }

    protected a a(String s)
    {
        o = s;
        return this;
    }

    protected a a(Date date)
    {
        f = date;
        return this;
    }

    protected a a(DefaultHttpClient defaulthttpclient)
    {
        h = defaulthttpclient;
        return this;
    }

    protected a a(HttpContext httpcontext)
    {
        p = httpcontext;
        return this;
    }

    protected a a(boolean flag)
    {
        g = flag;
        return this;
    }

    protected a a(byte abyte0[])
    {
        d = abyte0;
        return this;
    }

    protected a a(Header aheader[])
    {
        q = aheader;
        return this;
    }

    protected void a(Closeable closeable)
    {
        r = closeable;
    }

    protected a b()
    {
        i = System.currentTimeMillis() - k;
        l = false;
        c();
        return this;
    }

    public a b(int i1)
    {
        a = i1;
        return this;
    }

    public a b(String s)
    {
        b = s;
        return this;
    }

    protected a b(boolean flag)
    {
        n = flag;
        return this;
    }

    protected a c(String s)
    {
        c = s;
        return this;
    }

    public void c()
    {
        com.androidquery.util.a.a(r);
        r = null;
    }

    public String d(String s)
    {
        if (q == null)
        {
            return null;
        }
        int i1 = 0;
        do
        {
            if (i1 >= q.length)
            {
                return null;
            }
            if (s.equalsIgnoreCase(q[i1].getName()))
            {
                return q[i1].getValue();
            }
            i1++;
        } while (true);
    }

    protected boolean d()
    {
        return l;
    }

    protected boolean e()
    {
        return n;
    }

    protected boolean f()
    {
        return m;
    }

    public int g()
    {
        return a;
    }

    public String h()
    {
        return b;
    }

    protected byte[] i()
    {
        return d;
    }

    protected File j()
    {
        return e;
    }

    public int k()
    {
        return j;
    }

    public String l()
    {
        return o;
    }
}
