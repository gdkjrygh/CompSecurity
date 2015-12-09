// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ab;

import p.ak.b;
import p.q.e;
import p.q.f;
import p.x.h;

// Referenced classes of package p.ab:
//            m

public class n
    implements b
{

    private final m a;
    private final e b;
    private final f c;
    private final h d;

    public n(b b1, b b2)
    {
        c = b1.d();
        d = new h(b1.c(), b2.c());
        b = b1.a();
        a = new m(b1.b(), b2.b());
    }

    public e a()
    {
        return b;
    }

    public e b()
    {
        return a;
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
