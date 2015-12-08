// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.h;

import com.kik.g.p;
import com.kik.g.r;
import com.kik.n.a.a.a;
import kik.a.d.c;
import kik.a.e.v;
import org.c.b;

// Referenced classes of package kik.android.h:
//            a

final class g extends r
{

    final kik.android.h.a a;

    g(kik.android.h.a a1)
    {
        a = a1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (a)obj;
        if (obj != null)
        {
            boolean flag = ((a) (obj)).b().booleanValue();
            obj = new c(Boolean.valueOf(flag));
            kik.android.h.a.a(a, ((c) (obj)));
            if (flag)
            {
                kik.android.h.a.b(a).c("AddressIntegration.MATCHING_OPT_IN_KEY", "true");
            } else
            {
                kik.android.h.a.b(a).c("AddressIntegration.MATCHING_OPT_IN_KEY", "false");
            }
            a.a.a(obj);
        }
    }

    public final void a(Throwable throwable)
    {
        kik.android.h.a.i().b("Failed to load address book settings", throwable);
        a.a.a(throwable);
    }
}
