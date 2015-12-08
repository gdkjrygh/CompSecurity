// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.services.s3.model;

import com.amazonaws.b;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.amazonaws.services.s3.model:
//            ax, br, bz, bn

public class aq extends b
{

    private String a;
    private String b;
    private String c;
    private long d[];
    private List e;
    private List f;
    private Date g;
    private Date h;
    private br i;
    private com.amazonaws.a.b j;
    private boolean k;
    private bz l;

    public aq(String s, String s1)
    {
        this(s, s1, ((String) (null)));
    }

    public aq(String s, String s1, String s2)
    {
        e = new ArrayList();
        f = new ArrayList();
        b(s);
        d(s1);
        f(s2);
        a(false);
    }

    public aq(String s, String s1, boolean flag)
    {
        e = new ArrayList();
        f = new ArrayList();
        a = s;
        b = s1;
        k = flag;
    }

    public void a(long l1, long l2)
    {
        d = (new long[] {
            l1, l2
        });
    }

    public void a(com.amazonaws.a.b b1)
    {
        j = b1;
    }

    public void a(bn bn)
    {
        j = new ax(bn);
    }

    public void a(br br)
    {
        i = br;
    }

    public void a(bz bz)
    {
        l = bz;
    }

    public void a(Date date)
    {
        g = date;
    }

    public void a(List list)
    {
        e = list;
    }

    public void a(boolean flag)
    {
        k = flag;
    }

    public aq b(long l1, long l2)
    {
        a(l1, l2);
        return this;
    }

    public aq b(com.amazonaws.a.b b1)
    {
        a(b1);
        return this;
    }

    public aq b(bn bn)
    {
        a(bn);
        return this;
    }

    public aq b(br br)
    {
        a(br);
        return this;
    }

    public aq b(bz bz)
    {
        a(bz);
        return this;
    }

    public aq b(Date date)
    {
        a(date);
        return this;
    }

    public void b(String s)
    {
        a = s;
    }

    public void b(List list)
    {
        f = list;
    }

    public aq c(String s)
    {
        b(s);
        return this;
    }

    public void c(Date date)
    {
        h = date;
    }

    public aq d(Date date)
    {
        c(date);
        return this;
    }

    public void d(String s)
    {
        b = s;
    }

    public aq e(String s)
    {
        d(s);
        return this;
    }

    public String f()
    {
        return a;
    }

    public void f(String s)
    {
        c = s;
    }

    public aq g(String s)
    {
        f(s);
        return this;
    }

    public String g()
    {
        return b;
    }

    public aq h(String s)
    {
        e.add(s);
        return this;
    }

    public String h()
    {
        return c;
    }

    public aq i(String s)
    {
        f.add(s);
        return this;
    }

    public long[] i()
    {
        if (d == null)
        {
            return null;
        } else
        {
            return (long[])d.clone();
        }
    }

    public List j()
    {
        return e;
    }

    public List k()
    {
        return f;
    }

    public Date l()
    {
        return g;
    }

    public Date m()
    {
        return h;
    }

    public br n()
    {
        return i;
    }

    public bn o()
    {
        if (j instanceof ax)
        {
            return ((ax)j).a();
        } else
        {
            return null;
        }
    }

    public com.amazonaws.a.b p()
    {
        return j;
    }

    public boolean q()
    {
        return k;
    }

    public bz r()
    {
        return l;
    }
}
