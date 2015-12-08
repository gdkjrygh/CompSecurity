// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dz;

import p.ea.d;
import p.ec.a;
import p.ec.b;

// Referenced classes of package p.dz:
//            b, a

public class c extends p.dz.b
{

    public c()
    {
    }

    public a.b a(a a1)
        throws d
    {
        if (b(a1) == 13)
        {
            return p.dz.a.b.a;
        } else
        {
            return p.dz.a.b.b;
        }
    }

    public b a(b b1)
    {
        super.a(b1);
        b1.a("Sec-WebSocket-Version", "13");
        return b1;
    }

    public p.dz.a c()
    {
        return new c();
    }
}
