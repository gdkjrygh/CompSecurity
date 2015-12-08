// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class luq extends lqd
{

    private static final String b;
    private static final String c;
    private static final String d;
    private final lpu e;

    public luq(lpu lpu1)
    {
        super(b, new String[] {
            c
        });
        e = lpu1;
    }

    public final ksp a(Map map)
    {
        Object obj = e.b(ltw.a((ksp)map.get(c)));
        if (obj == null)
        {
            map = (ksp)map.get(d);
            if (map != null)
            {
                return map;
            } else
            {
                return ltw.f();
            }
        } else
        {
            return ltw.a(obj);
        }
    }

    public final boolean b()
    {
        return false;
    }

    static 
    {
        b = kse.g.toString();
        c = ksf.B.toString();
        d = ksf.k.toString();
    }
}
