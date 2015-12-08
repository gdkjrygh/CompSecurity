// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ag;

import p.ae.c;
import p.ak.b;
import p.q.e;
import p.q.f;

// Referenced classes of package p.ag:
//            c, e, d

public class g
    implements b
{

    private final e a;
    private final e b;
    private final f c;
    private final p.q.b d;

    public g(b b1, b b2, p.t.c c1)
    {
        c1 = new p.ag.c(b1.b(), b2.b(), c1);
        a = new c(new p.ag.e(c1));
        b = c1;
        c = new d(b1.d(), b2.d());
        d = b1.c();
    }

    public e a()
    {
        return a;
    }

    public e b()
    {
        return b;
    }

    public p.q.b c()
    {
        return d;
    }

    public f d()
    {
        return c;
    }
}
