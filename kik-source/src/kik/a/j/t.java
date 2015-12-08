// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.j;

import com.kik.g.p;
import com.kik.g.r;
import com.kik.g.s;
import kik.a.h.o;

// Referenced classes of package kik.a.j:
//            o

final class t extends r
{

    final byte a[];
    final byte b[];
    final String c;
    final String d;
    final Long e;
    final p f;
    final kik.a.j.o g;

    t(kik.a.j.o o1, byte abyte0[], byte abyte1[], String s1, String s2, Long long1, p p1)
    {
        g = o1;
        a = abyte0;
        b = abyte1;
        c = s1;
        d = s2;
        e = long1;
        f = p1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (byte[])obj;
        obj = o.a(a, ((byte []) (obj)), b);
        s.b(g.b(c, d, ((com.b.a.n) (obj)), e), f);
    }

    public final void a(Throwable throwable)
    {
        f.a(throwable);
    }
}
