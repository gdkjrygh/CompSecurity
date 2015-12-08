// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.j;

import com.kik.g.r;
import java.util.Map;

// Referenced classes of package kik.a.j:
//            u

final class ah extends r
{

    final u.b a;

    ah(u.b b)
    {
        a = b;
        super();
    }

    public final void a(Object obj)
    {
        obj = (Map)obj;
        u.a(a.a, u.b.a(a), ((Map) (obj)));
        synchronized (u.a(a.a))
        {
            u.a(a.a).remove(u.b.a(a));
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
