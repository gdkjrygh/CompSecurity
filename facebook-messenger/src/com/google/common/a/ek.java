// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Map;

// Referenced classes of package com.google.common.a:
//            ew, ev, ej, jt

public final class ek extends ew
{

    public ek()
    {
    }

    public ej a()
    {
        ev ev1 = super.b();
        if (ev1.isEmpty())
        {
            return ej.e();
        } else
        {
            return new jt(ev1);
        }
    }

    public ek a(Object obj, Object obj1)
    {
        super.b(obj, obj1);
        return this;
    }

    public ek a(Map map)
    {
        super.b(map);
        return this;
    }

    public ev b()
    {
        return a();
    }

    public ew b(Object obj, Object obj1)
    {
        return a(obj, obj1);
    }

    public ew b(Map map)
    {
        return a(map);
    }
}
