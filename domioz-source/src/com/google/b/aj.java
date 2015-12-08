// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.b.b.ag;
import com.google.b.c.a;
import com.google.b.d.d;

// Referenced classes of package com.google.b:
//            al, k, ak, y, 
//            v, ae, am

final class aj extends al
{

    private final ae a;
    private final v b;
    private final k c;
    private final a d;
    private final am e;
    private al f;

    private aj(ae ae1, v v1, k k1, a a1, am am)
    {
        a = ae1;
        b = v1;
        c = k1;
        d = a1;
        e = am;
    }

    aj(ae ae1, v v1, k k1, a a1, am am, byte byte0)
    {
        this(ae1, v1, k1, a1, am);
    }

    private al a()
    {
        al al1 = f;
        if (al1 != null)
        {
            return al1;
        } else
        {
            al al2 = c.a(e, d);
            f = al2;
            return al2;
        }
    }

    public static am a(a a1, Object obj)
    {
        return new ak(obj, a1, false, (byte)0);
    }

    public static am b(a a1, Object obj)
    {
        boolean flag;
        if (a1.getType() == a1.getRawType())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new ak(obj, a1, flag, (byte)0);
    }

    public final Object a(com.google.b.d.a a1)
    {
        if (b == null)
        {
            return a().a(a1);
        }
        a1 = ag.a(a1);
        if (a1 instanceof y)
        {
            return null;
        } else
        {
            return b.deserialize(a1, d.getType(), c.a);
        }
    }

    public final void a(d d1, Object obj)
    {
        if (a == null)
        {
            a().a(d1, obj);
            return;
        }
        if (obj == null)
        {
            d1.f();
            return;
        } else
        {
            ag.a(a.serialize(obj, d.getType(), c.b), d1);
            return;
        }
    }
}
