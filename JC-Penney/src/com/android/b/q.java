// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.b;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.android.b:
//            ae, f, j, s, 
//            w, t, r, z, 
//            c, ac, n, v

public abstract class q
    implements Comparable
{

    private static long o;
    private final ae a;
    private final int b;
    private final String c;
    private String d;
    private String e;
    private final int f;
    private final w g;
    private Integer h;
    private t i;
    private boolean j;
    private boolean k;
    private boolean l;
    private z m;
    private c n;

    public q(int i1, String s1, w w1)
    {
        ae ae1;
        if (ae.a)
        {
            ae1 = new ae();
        } else
        {
            ae1 = null;
        }
        a = ae1;
        j = true;
        k = false;
        l = false;
        n = null;
        b = i1;
        c = s1;
        e = a(i1, s1);
        g = w1;
        a(new f());
        f = d(s1);
    }

    private static String a(int i1, String s1)
    {
        s1 = (new StringBuilder()).append("Request:").append(i1).append(":").append(s1).append(":").append(System.currentTimeMillis()).append(":");
        long l1 = o;
        o = 1L + l1;
        return com.android.b.j.a(s1.append(l1).toString());
    }

    private byte[] a(Map map, String s1)
    {
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        try
        {
            for (map = map.entrySet().iterator(); map.hasNext(); stringbuilder.append('&'))
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                stringbuilder.append(URLEncoder.encode((String)entry.getKey(), s1));
                stringbuilder.append('=');
                stringbuilder.append(URLEncoder.encode((String)entry.getValue(), s1));
            }

        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw new RuntimeException((new StringBuilder()).append("Encoding not supported: ").append(s1).toString(), map);
        }
        map = stringbuilder.toString().getBytes(s1);
        return map;
    }

    static ae b(q q1)
    {
        return q1.a;
    }

    private static int d(String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            s1 = Uri.parse(s1);
            if (s1 != null)
            {
                s1 = s1.getHost();
                if (s1 != null)
                {
                    return s1.hashCode();
                }
            }
        }
        return 0;
    }

    public int a()
    {
        return b;
    }

    public int a(q q1)
    {
        s s1 = r();
        s s2 = q1.r();
        if (s1 == s2)
        {
            return h.intValue() - q1.h.intValue();
        } else
        {
            return s2.ordinal() - s1.ordinal();
        }
    }

    protected ac a(ac ac)
    {
        return ac;
    }

    public final q a(int i1)
    {
        h = Integer.valueOf(i1);
        return this;
    }

    public q a(c c1)
    {
        n = c1;
        return this;
    }

    public q a(t t1)
    {
        i = t1;
        return this;
    }

    public q a(z z1)
    {
        m = z1;
        return this;
    }

    public final q a(boolean flag)
    {
        j = flag;
        return this;
    }

    protected abstract v a(n n1);

    protected abstract void a(Object obj);

    public void a(String s1)
    {
        if (ae.a)
        {
            a.a(s1, Thread.currentThread().getId());
        }
    }

    public int b()
    {
        return f;
    }

    public void b(ac ac)
    {
        if (g != null)
        {
            g.a(ac);
        }
    }

    void b(String s1)
    {
        long l1;
label0:
        {
            if (i != null)
            {
                i.b(this);
            }
            if (ae.a)
            {
                l1 = Thread.currentThread().getId();
                if (Looper.myLooper() == Looper.getMainLooper())
                {
                    break label0;
                }
                (new Handler(Looper.getMainLooper())).post(new r(this, s1, l1));
            }
            return;
        }
        a.a(s1, l1);
        a.a(toString());
    }

    public String c()
    {
        if (d != null)
        {
            return d;
        } else
        {
            return c;
        }
    }

    public void c(String s1)
    {
        d = s1;
    }

    public int compareTo(Object obj)
    {
        return a((q)obj);
    }

    public String d()
    {
        return c;
    }

    public String e()
    {
        return c();
    }

    public c f()
    {
        return n;
    }

    public boolean g()
    {
        return k;
    }

    public Map h()
    {
        return Collections.emptyMap();
    }

    protected Map i()
    {
        return m();
    }

    protected String j()
    {
        return n();
    }

    public String k()
    {
        return o();
    }

    public byte[] l()
    {
        Map map = i();
        if (map != null && map.size() > 0)
        {
            return a(map, j());
        } else
        {
            return null;
        }
    }

    protected Map m()
    {
        return null;
    }

    protected String n()
    {
        return "UTF-8";
    }

    public String o()
    {
        return (new StringBuilder()).append("application/x-www-form-urlencoded; charset=").append(n()).toString();
    }

    public byte[] p()
    {
        Map map = m();
        if (map != null && map.size() > 0)
        {
            return a(map, n());
        } else
        {
            return null;
        }
    }

    public final boolean q()
    {
        return j;
    }

    public s r()
    {
        return s.b;
    }

    public final int s()
    {
        return m.a();
    }

    public z t()
    {
        return m;
    }

    public String toString()
    {
        String s2 = (new StringBuilder()).append("0x").append(Integer.toHexString(b())).toString();
        StringBuilder stringbuilder = new StringBuilder();
        String s1;
        if (k)
        {
            s1 = "[X] ";
        } else
        {
            s1 = "[ ] ";
        }
        return stringbuilder.append(s1).append(c()).append(" ").append(s2).append(" ").append(r()).append(" ").append(h).toString();
    }

    public void u()
    {
        l = true;
    }

    public boolean v()
    {
        return l;
    }
}
