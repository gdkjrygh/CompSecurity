// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.c;

import com.facebook.base.b;
import com.facebook.f.n;
import com.facebook.http.f.c;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.f;
import com.google.common.base.Objects;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.http.HttpHost;

// Referenced classes of package com.facebook.http.c:
//            e, b, c, f

public class a
    implements e
{

    private final d a;
    private final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    private final f c = new com.facebook.http.c.b(this);
    private boolean d;
    private boolean e;
    private HttpHost f;

    public a(d d1)
    {
        d = true;
        e = false;
        f = null;
        a = d1;
        a.a(c);
        a.a(new com.facebook.http.c.c(this));
    }

    static void a(a a1)
    {
        a1.c();
    }

    private void c()
    {
        boolean flag1 = true;
        boolean flag = false;
        boolean flag2 = e();
        if (flag2 != d)
        {
            d = flag2;
            flag = true;
        }
        HttpHost httphost = f();
        if (!Objects.equal(f, httphost))
        {
            f = httphost;
            flag = true;
        }
        flag2 = d();
        if (flag2 != e)
        {
            e = flag2;
            flag = flag1;
        }
        if (flag)
        {
            g();
        }
    }

    private boolean d()
    {
        if (!a.a())
        {
            return false;
        } else
        {
            com.facebook.prefs.shared.ae ae = n.a("fbandroid_ssl_cache_enabled");
            return a.a(ae, false);
        }
    }

    private boolean e()
    {
        boolean flag = true;
        if (a.a())
        {
            flag = a.a(c.f, true);
        }
        return flag;
    }

    private HttpHost f()
    {
        String s;
        int i;
        if (com.facebook.base.b.a())
        {
            if (!com.facebook.common.w.n.a(s = a.a(c.g, null)) && (i = s.indexOf(':')) != -1)
            {
                int j = Integer.parseInt(s.substring(i + 1));
                return new HttpHost(s.substring(0, i), j);
            }
        }
        return null;
    }

    private void g()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((com.facebook.http.c.f)iterator.next()).a()) { }
    }

    public HttpHost a()
    {
        return f;
    }

    public void a(com.facebook.http.c.f f1)
    {
        b.add(f1);
    }

    public boolean b()
    {
        return d;
    }
}
