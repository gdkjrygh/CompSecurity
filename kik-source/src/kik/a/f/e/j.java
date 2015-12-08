// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.e;

import kik.a.d.a.g;
import kik.a.d.a.i;
import kik.a.f.n;
import kik.a.f.o;

// Referenced classes of package kik.a.f.e:
//            g, i

public class j
    implements kik.a.f.e.g, kik.a.f.e.i
{

    public j()
    {
    }

    public final long a(o o1, g g1)
    {
        o1.b("pong", ((i)g1).a());
        return 0L;
    }

    public final g a(n n1)
    {
        if (n1.a("ping"))
        {
            return new i(n1.nextText());
        } else
        {
            return null;
        }
    }
}
