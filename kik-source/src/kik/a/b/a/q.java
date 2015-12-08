// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.b.a;

import com.kik.g.p;
import com.kik.g.r;
import com.kik.m.o;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.util.List;
import kik.a.d.f;
import kik.a.d.s;
import kik.a.f.f.v;

// Referenced classes of package kik.a.b.a:
//            a

final class q extends r
{

    final s a;
    final f b;
    final p c;
    final a d;

    q(a a1, s s1, f f1, p p1)
    {
        d = a1;
        a = s1;
        b = f1;
        c = p1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (o)obj;
        if (v.a((List)((o) (obj)).b, (KeyPair)((o) (obj)).a) && a.o() == null)
        {
            byte abyte0[] = new byte[16];
            kik.a.b.a.a.d(d).nextBytes(abyte0);
            a.a(abyte0);
            b.a(a, a.c(), kik.a.b.a.a.a(d));
        }
        c.a(obj);
    }

    public final void a(Throwable throwable)
    {
        c.a(throwable);
    }
}
