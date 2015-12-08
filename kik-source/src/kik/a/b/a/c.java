// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.b.a;

import com.kik.g.p;
import com.kik.g.r;
import com.kik.g.s;
import com.kik.m.o;
import java.security.KeyPair;
import java.util.List;
import kik.a.d.k;
import kik.a.d.n;
import kik.a.e.f;
import kik.a.f.f.v;

// Referenced classes of package kik.a.b.a:
//            a

final class c extends r
{

    final k a;
    final kik.a.d.s b;
    final p c;
    final a d;

    c(a a1, k k, kik.a.d.s s1, p p)
    {
        d = a1;
        a = k;
        b = s1;
        c = p;
        super();
    }

    public final void a(Object obj)
    {
        List list = null;
        o o1 = (o)obj;
        if (o1 != null)
        {
            obj = (KeyPair)o1.a;
            list = (List)o1.b;
        } else
        {
            obj = null;
        }
        if (a != null && (a instanceof n))
        {
            obj = v.a(b, list, ((KeyPair) (obj)), kik.a.b.a.a.e(d), d);
        } else
        {
            obj = v.b(b, list, ((KeyPair) (obj)), kik.a.b.a.a.e(d), d);
        }
        s.b(s.b(kik.a.b.a.a.f(d).a(((kik.a.f.f.z) (obj)))), c);
        synchronized (kik.a.b.a.a.g(d))
        {
            kik.a.b.a.a.g(d).remove(b);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(Throwable throwable)
    {
        synchronized (kik.a.b.a.a.g(d))
        {
            kik.a.b.a.a.g(d).add(b);
        }
        return;
        exception;
        throwable;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
