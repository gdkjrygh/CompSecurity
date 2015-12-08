// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.b;

import com.kik.g.k;
import com.kik.g.r;
import java.security.KeyPair;
import java.util.Map;

// Referenced classes of package kik.a.b:
//            a

final class e extends r
{

    final a a;

    e(a a1)
    {
        a = a1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (KeyPair)obj;
        kik.a.b.a.e(a).a(obj);
        synchronized (kik.a.b.a.f(a))
        {
            kik.a.b.a.f(a).clear();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(Throwable throwable)
    {
        synchronized (kik.a.b.a.g(a))
        {
            kik.a.b.a.h(a);
        }
        synchronized (kik.a.b.a.f(a))
        {
            kik.a.b.a.f(a).clear();
        }
        return;
        exception;
        throwable;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        throwable;
        JVM INSTR monitorexit ;
        throw exception1;
    }
}
