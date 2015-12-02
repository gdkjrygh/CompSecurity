// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Type;
import java.util.Map;

public final class bly
    implements bkr
{

    private final blc a;
    private final boolean b;

    public bly(blc blc1, boolean flag)
    {
        a = blc1;
        b = flag;
    }

    private static bkq a(bjw bjw1, Type type)
    {
        if (type == Boolean.TYPE || type == java/lang/Boolean)
        {
            return bmh.f;
        } else
        {
            return bjw1.a(bmj.get(type));
        }
    }

    static boolean a(bly bly1)
    {
        return bly1.b;
    }

    public final bkq create(bjw bjw1, bmj bmj1)
    {
        Type type = bmj1.getType();
        if (!java/util/Map.isAssignableFrom(bmj1.getRawType()))
        {
            return null;
        } else
        {
            Type atype[] = bky.b(type, bky.b(type));
            bkq bkq = a(bjw1, atype[0]);
            bkq bkq1 = bjw1.a(bmj.get(atype[1]));
            bmj1 = a.a(bmj1);
            return new blz(this, bjw1, atype[0], bkq, atype[1], bkq1, bmj1);
        }
    }
}
