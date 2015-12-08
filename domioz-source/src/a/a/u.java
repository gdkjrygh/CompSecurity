// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.c.b;
import com.appboy.f.a;
import java.util.concurrent.Semaphore;

// Referenced classes of package a.a:
//            o, at

public final class u
    implements b
{

    final Semaphore a = null;
    final o b;

    public u(o o1)
    {
        b = o1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (Throwable)obj;
        o.j(b).a(((Throwable) (obj)));
        if (a != null)
        {
            a.release();
        }
_L2:
        return;
        obj;
        com.appboy.f.a.c(a.a.o.a(), "Failed to log error.", ((Throwable) (obj)));
        if (a == null) goto _L2; else goto _L1
_L1:
        a.release();
        return;
        obj;
        if (a != null)
        {
            a.release();
        }
        throw obj;
    }
}
