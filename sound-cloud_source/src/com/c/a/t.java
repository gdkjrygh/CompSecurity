// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a;

import com.c.a.a.a;
import com.c.a.a.b;
import com.c.a.a.d;
import com.c.a.a.h;
import com.c.a.a.i;
import java.net.CookieHandler;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

// Referenced classes of package com.c.a:
//            v, l, u, n, 
//            c, e, f, b, 
//            j, w

public class t
    implements Cloneable
{

    static final List a;
    static final List b;
    private static SSLSocketFactory z;
    private c A;
    final h c;
    n d;
    public Proxy e;
    public List f;
    public List g;
    final List h;
    public final List i;
    public ProxySelector j;
    public CookieHandler k;
    b l;
    public SocketFactory m;
    public SSLSocketFactory n;
    public HostnameVerifier o;
    public f p;
    public com.c.a.b q;
    public j r;
    d s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;
    public int y;

    public t()
    {
        h = new ArrayList();
        i = new ArrayList();
        t = true;
        u = true;
        v = true;
        c = new h();
        d = new n();
    }

    t(t t1)
    {
        h = new ArrayList();
        i = new ArrayList();
        t = true;
        u = true;
        v = true;
        c = t1.c;
        d = t1.d;
        e = t1.e;
        f = t1.f;
        g = t1.g;
        h.addAll(t1.h);
        i.addAll(t1.i);
        j = t1.j;
        k = t1.k;
        A = t1.A;
        b b1;
        if (A != null)
        {
            b1 = A.a;
        } else
        {
            b1 = t1.l;
        }
        l = b1;
        m = t1.m;
        n = t1.n;
        o = t1.o;
        p = t1.p;
        q = t1.q;
        r = t1.r;
        s = t1.s;
        t = t1.t;
        u = t1.u;
        v = t1.v;
        w = t1.w;
        x = t1.x;
        y = t1.y;
    }

    static d a(t t1)
    {
        return t1.s;
    }

    public final e a(w w1)
    {
        return new e(this, w1);
    }

    final SSLSocketFactory a()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = z;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        obj = SSLContext.getInstance("TLS");
        ((SSLContext) (obj)).init(null, null, null);
        z = ((SSLContext) (obj)).getSocketFactory();
        obj = z;
        this;
        JVM INSTR monitorexit ;
        return ((SSLSocketFactory) (obj));
        Object obj1;
        obj1;
        throw new AssertionError();
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public final t b()
    {
        t t1;
        try
        {
            t1 = (t)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new AssertionError();
        }
        return t1;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return b();
    }

    static 
    {
        a = com.c.a.a.i.a(new v[] {
            com.c.a.v.d, v.c, com.c.a.v.b
        });
        b = com.c.a.a.i.a(new l[] {
            com.c.a.l.a, com.c.a.l.b, l.c
        });
        a.b = new u();
    }
}
