// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;

import com.google.a.b.u;
import com.google.a.c.a;
import com.google.a.d.f;

// Referenced classes of package com.google.a:
//            am, k, al, z, 
//            w, af, an

final class ak extends am
{

    private final af a;
    private final w b;
    private final k c;
    private final a d;
    private final an e;
    private am f;

    private ak(af af1, w w1, k k1, a a1, an an)
    {
        a = af1;
        b = w1;
        c = k1;
        d = a1;
        e = an;
    }

    ak(af af1, w w1, k k1, a a1, an an, byte byte0)
    {
        this(af1, w1, k1, a1, an);
    }

    private am a()
    {
        am am1 = f;
        if (am1 != null)
        {
            return am1;
        } else
        {
            am am2 = c.a(e, d);
            f = am2;
            return am2;
        }
    }

    public static an a(a a1, Object obj)
    {
        return new al(obj, a1, false, (byte)0);
    }

    public final Object a(com.google.a.d.a a1)
    {
        if (b == null)
        {
            return a().a(a1);
        }
        a1 = u.a(a1);
        if (a1 instanceof z)
        {
            return null;
        } else
        {
            return b.a(a1, d.b());
        }
    }

    public final void a(f f1, Object obj)
    {
        if (a == null)
        {
            a().a(f1, obj);
            return;
        }
        if (obj == null)
        {
            f1.f();
            return;
        } else
        {
            u.a(a.a(obj), f1);
            return;
        }
    }
}
