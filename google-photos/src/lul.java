// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class lul extends lqd
{

    private static final String b;
    private final String c;

    public lul(String s)
    {
        super(b, new String[0]);
        c = s;
    }

    public final ksp a(Map map)
    {
        if (c == null)
        {
            return ltw.f();
        } else
        {
            return ltw.a(c);
        }
    }

    public final boolean b()
    {
        return true;
    }

    static 
    {
        b = kse.h.toString();
    }
}
