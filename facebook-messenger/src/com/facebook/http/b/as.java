// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import com.facebook.analytics.e.g;
import com.facebook.analytics.e.i;
import com.facebook.common.h.a;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.facebook.http.b:
//            f

public class as extends f
{

    private final i a;
    private final String b;
    private final String c = com.facebook.common.h.a.a().toString();
    private g d;
    private g e;
    private g f;

    public as(i j, String s)
    {
        a = j;
        b = s;
    }

    private g a(String s)
    {
        s = new g(s);
        HashMap hashmap = new HashMap();
        hashmap.put("hostname", b);
        hashmap.put("identifier", c);
        s.a(hashmap);
        a.a(s);
        return s;
    }

    private void a(g g1, IOException ioexception)
    {
        if (ioexception != null)
        {
            g1.j().put("exception_name", ioexception.toString());
        }
        a.b(g1);
    }

    private void b(IOException ioexception)
    {
        a(d, ioexception);
        d = null;
    }

    private void c(IOException ioexception)
    {
        a(e, ioexception);
        e = null;
    }

    private void d(IOException ioexception)
    {
        a(f, ioexception);
        f = null;
    }

    public void a()
    {
        d = a("DNSResolution");
    }

    public void a(IOException ioexception)
    {
        if (d != null)
        {
            b(ioexception);
        } else
        {
            if (e != null)
            {
                c(ioexception);
                return;
            }
            if (f != null)
            {
                d(ioexception);
                return;
            }
        }
    }

    public void b()
    {
        b(null);
    }

    public void c()
    {
        e = a("TCPConnect");
    }

    public void d()
    {
        c(null);
    }

    public void e()
    {
        f = a("TLSSetup");
    }

    public void f()
    {
        d(null);
    }
}
