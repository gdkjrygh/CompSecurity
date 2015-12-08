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
//            c

public static final class oft.a.d
{

    public static final j a;
    public static final d b;
    private static final d c;
    private static final d d;
    private static final d e;

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
        j1 = new c();
        j1.a((short)1);
        j1.a(c);
        j1.a().a(a.j);
        k1.b().add(j1);
        j1 = new c();
        j1.a((short)2);
        j1.a(d);
        j1.a().a(a.j);
        k1.b().add(j1);
        j1 = new c();
        j1.a((short)3);
        j1.a(e);
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

    static 
    {
        Object obj = new d();
        b = ((d) (obj));
        ((d) (obj)).a("ExceptionInfo");
        b.b("clienttelemetry.data.v3.ExceptionInfo");
        obj = new d();
        c = ((d) (obj));
        ((d) (obj)).a("Type");
        obj = new d();
        d = ((d) (obj));
        ((d) (obj)).a("Message");
        obj = new d();
        e = ((d) (obj));
        ((d) (obj)).a("FullInfo");
        obj = new j();
        a = ((j) (obj));
        ((j) (obj)).a(a(((j) (obj))));
    }
}
