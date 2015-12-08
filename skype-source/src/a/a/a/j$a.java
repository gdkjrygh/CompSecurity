// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a;

import com.microsoft.a.a;
import com.microsoft.a.c;
import com.microsoft.a.d;
import com.microsoft.a.j;
import com.microsoft.a.k;
import com.microsoft.a.l;
import java.util.ArrayList;

// Referenced classes of package a.a.a:
//            j

public static final class oft.a.d
{

    public static final j a;
    public static final d b;
    private static final d c;
    private static final d d;
    private static final d e;
    private static final d f;
    private static final d g;
    private static final d h;
    private static final d i;
    private static final d j;
    private static final d k;

    static d a()
    {
        return c;
    }

    public static l a(j j1)
    {
        short word0;
        l l1;
        l1 = new l();
        l1.a(a.k);
        word0 = 0;
_L3:
        if (word0 >= j1.a().size())
        {
            break MISSING_BLOCK_LABEL_63;
        }
        if (((k)j1.a().get(word0)).a() != b) goto _L2; else goto _L1
_L1:
        l1.a(word0);
        return l1;
_L2:
        word0++;
          goto _L3
        k k1 = new k();
        j1.a().add(k1);
        k1.a(b);
        c c1 = new c();
        c1.a((short)1);
        c1.a(c);
        c1.a().a(a.j);
        k1.b().add(c1);
        c1 = new c();
        c1.a((short)2);
        c1.a(d);
        c1.a().a(a.j);
        k1.b().add(c1);
        c1 = new c();
        c1.a((short)3);
        c1.a(e);
        c1.a().a(a.j);
        k1.b().add(c1);
        c1 = new c();
        c1.a((short)4);
        c1.a(f);
        c1.a().a(a.j);
        k1.b().add(c1);
        c1 = new c();
        c1.a((short)5);
        c1.a(g);
        c1.a().a(a.j);
        k1.b().add(c1);
        c1 = new c();
        c1.a((short)6);
        c1.a(h);
        c1.a(a.a.a.a(j1));
        k1.b().add(c1);
        c1 = new c();
        c1.a((short)7);
        c1.a(i);
        c1.a(a.a.a.a(j1));
        k1.b().add(c1);
        j1 = new c();
        j1.a((short)8);
        j1.a(j);
        j1.a().a(a.n);
        j1.a().b(new l());
        j1.a().a(new l());
        j1.a().b().a(a.j);
        j1.a().a().a(a.j);
        k1.b().add(j1);
        j1 = new c();
        j1.a((short)9);
        j1.a(k);
        j1.a().a(a.j);
        k1.b().add(j1);
          goto _L1
    }

    static d b()
    {
        return d;
    }

    static d c()
    {
        return e;
    }

    static d d()
    {
        return f;
    }

    static d e()
    {
        return g;
    }

    static d f()
    {
        return h;
    }

    static d g()
    {
        return i;
    }

    static d h()
    {
        return j;
    }

    static d i()
    {
        return k;
    }

    static 
    {
        Object obj = new d();
        b = ((d) (obj));
        ((d) (obj)).a("User");
        b.b("clienttelemetry.data.v3.User");
        obj = new d();
        c = ((d) (obj));
        ((d) (obj)).a("Username");
        obj = new d();
        d = ((d) (obj));
        ((d) (obj)).a("Prefix");
        obj = new d();
        e = ((d) (obj));
        ((d) (obj)).a("UiVersion");
        obj = new d();
        f = ((d) (obj));
        ((d) (obj)).a("Endpoint");
        obj = new d();
        g = ((d) (obj));
        ((d) (obj)).a("EndpointType");
        obj = new d();
        h = ((d) (obj));
        ((d) (obj)).a("Pstn");
        obj = new d();
        i = ((d) (obj));
        ((d) (obj)).a("EndpointComposite");
        obj = new d();
        j = ((d) (obj));
        ((d) (obj)).a("UserExtension");
        obj = new d();
        k = ((d) (obj));
        ((d) (obj)).a("Email");
        obj = new j();
        a = ((j) (obj));
        ((j) (obj)).a(a(((j) (obj))));
    }
}
