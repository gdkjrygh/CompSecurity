// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.af;
import com.amazonaws.services.s3.internal.l;
import com.amazonaws.services.s3.internal.n;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class bi
    implements af, l, n, Cloneable
{

    public static final String a = "AES256";
    private Map b;
    private Map c;
    private Date d;
    private Date e;
    private String f;
    private Boolean g;
    private Date h;

    public bi()
    {
        b = new HashMap();
        c = new HashMap();
    }

    private bi(bi bi1)
    {
        Object obj1 = null;
        super();
        Object obj;
        if (bi1.b == null)
        {
            obj = null;
        } else
        {
            obj = new HashMap(bi1.b);
        }
        b = ((Map) (obj));
        if (bi1.c == null)
        {
            obj = obj1;
        } else
        {
            obj = new HashMap(bi1.c);
        }
        c = ((Map) (obj));
        e = bi1.e;
        f = bi1.f;
        d = bi1.d;
        g = bi1.g;
        h = bi1.h;
    }

    public Date a()
    {
        return e;
    }

    public void a(long l1)
    {
        c.put("Content-Length", Long.valueOf(l1));
    }

    public void a(String s1)
    {
        f = s1;
    }

    public void a(String s1, Object obj)
    {
        c.put(s1, obj);
    }

    public void a(String s1, String s2)
    {
        b.put(s1, s2);
    }

    public void a(Date date)
    {
        e = date;
    }

    public void a(Map map)
    {
        b = map;
    }

    public void a(boolean flag)
    {
        g = Boolean.valueOf(flag);
    }

    public String b()
    {
        return f;
    }

    public void b(String s1)
    {
        c.put("x-amz-server-side-encryption", s1);
    }

    public void b(Date date)
    {
        h = date;
    }

    public Date c()
    {
        return h;
    }

    public void c(String s1)
    {
        c.put("x-amz-server-side-encryption-customer-algorithm", s1);
    }

    public void c(Date date)
    {
        c.put("Last-Modified", date);
    }

    public String c_()
    {
        return (String)c.get("x-amz-server-side-encryption");
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return t();
    }

    public Boolean d()
    {
        return g;
    }

    public void d(String s1)
    {
        c.put("x-amz-server-side-encryption-customer-key-MD5", s1);
    }

    public void d(Date date)
    {
        d = date;
    }

    public String d_()
    {
        return (String)c.get("x-amz-server-side-encryption-customer-algorithm");
    }

    public Object e(String s1)
    {
        return c.get(s1);
    }

    public String e()
    {
        return (String)c.get("x-amz-server-side-encryption-customer-key-MD5");
    }

    public Map f()
    {
        return b;
    }

    public void f(String s1)
    {
        c.put("Content-Type", s1);
    }

    public Map g()
    {
        return Collections.unmodifiableMap(new HashMap(c));
    }

    public void g(String s1)
    {
        c.put("Content-Encoding", s1);
    }

    public Date h()
    {
        return (Date)c.get("Last-Modified");
    }

    public void h(String s1)
    {
        c.put("Cache-Control", s1);
    }

    public long i()
    {
        Long long1 = (Long)c.get("Content-Length");
        if (long1 == null)
        {
            return 0L;
        } else
        {
            return long1.longValue();
        }
    }

    public void i(String s1)
    {
        if (s1 == null)
        {
            c.remove("Content-MD5");
            return;
        } else
        {
            c.put("Content-MD5", s1);
            return;
        }
    }

    public long j()
    {
        String s1 = (String)c.get("Content-Range");
        if (s1 != null)
        {
            int i1 = s1.lastIndexOf("/");
            if (i1 >= 0)
            {
                return Long.parseLong(s1.substring(i1 + 1));
            }
        }
        return i();
    }

    public void j(String s1)
    {
        c.put("Content-Disposition", s1);
    }

    public String k()
    {
        return (String)c.get("Content-Type");
    }

    public void k(String s1)
    {
        c.put("x-amz-server-side-encryption", s1);
    }

    public String l()
    {
        return (String)c.get("Content-Encoding");
    }

    public String l(String s1)
    {
        if (b == null)
        {
            return null;
        } else
        {
            return (String)b.get(s1);
        }
    }

    public String m()
    {
        return (String)c.get("Cache-Control");
    }

    public String n()
    {
        return (String)c.get("Content-MD5");
    }

    public String o()
    {
        return (String)c.get("Content-Disposition");
    }

    public String p()
    {
        return (String)c.get("ETag");
    }

    public String q()
    {
        return (String)c.get("x-amz-version-id");
    }

    public String r()
    {
        return (String)c.get("x-amz-server-side-encryption");
    }

    public Date s()
    {
        return d;
    }

    public bi t()
    {
        return new bi(this);
    }
}
