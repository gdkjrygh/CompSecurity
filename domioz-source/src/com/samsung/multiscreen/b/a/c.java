// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.b.a;

import com.samsung.multiscreen.b.f;
import com.samsung.multiscreen.net.b.b;
import java.net.URI;
import java.security.KeyPair;
import java.util.Map;
import org.java_websocket.a.a;

// Referenced classes of package com.samsung.multiscreen.b.a:
//            b, e, f

final class c extends a
{

    final com.samsung.multiscreen.b.a.b a;

    public c(com.samsung.multiscreen.b.a.b b1, URI uri)
    {
        a = b1;
        super(uri);
    }

    public final void a()
    {
        com.samsung.multiscreen.b.a.b.a(a);
        e e1 = com.samsung.multiscreen.b.a.b.b(a);
        if (e1 != null)
        {
            e1.a();
        }
    }

    public final void a(Exception exception)
    {
        if (com.samsung.multiscreen.b.a.b.f(a))
        {
            com.samsung.multiscreen.b.a.b.a(a);
            exception = com.samsung.multiscreen.b.a.b.g(a);
            if (exception != null)
            {
                exception.a(new f("Connection Failed", (byte)0));
            }
        } else
        if (com.samsung.multiscreen.b.a.b.h(a))
        {
            com.samsung.multiscreen.b.a.b.a(a, false);
            e e1 = com.samsung.multiscreen.b.a.b.i(a);
            if (e1 != null)
            {
                e1.b(new f((new StringBuilder("Error closing: ")).append(exception.getLocalizedMessage()).toString(), (byte)0));
                return;
            }
        }
    }

    public final void a(String s)
    {
        s = com.samsung.multiscreen.net.b.b.a(s);
        if ((Boolean)s.c().get(b.e) == Boolean.TRUE)
        {
            String s1 = com.samsung.multiscreen.b.a.f.b((String)s.c().get(b.d), com.samsung.multiscreen.b.a.b.c(a).getPrivate());
            s.c().put(b.d, s1);
        }
        e e1 = com.samsung.multiscreen.b.a.b.d(a);
        if (e1 != null)
        {
            e1.a(s);
        }
    }

    public final void b()
    {
        com.samsung.multiscreen.b.a.b.a(a, true);
        e e1 = com.samsung.multiscreen.b.a.b.e(a);
        if (e1 != null)
        {
            e1.b();
        }
    }

    public final void c()
    {
        com.samsung.multiscreen.b.a.b.a(a, true);
    }
}
