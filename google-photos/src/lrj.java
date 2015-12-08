// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class lrj extends lqd
{

    private static final String b;
    private final ltb c;

    public lrj(ltb ltb1)
    {
        super(b, new String[0]);
        c = ltb1;
    }

    public final ksp a(Map map)
    {
        map = c.a();
        if (map == null)
        {
            return ltw.f();
        } else
        {
            return ltw.a(map);
        }
    }

    public final boolean b()
    {
        return false;
    }

    static 
    {
        b = kse.j.toString();
    }
}
