// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class lsd extends lqd
{

    private static final String b;
    private static final String c;

    public lsd()
    {
        super(b, new String[] {
            c
        });
    }

    public final ksp a(Map map)
    {
        return ltw.a(ltw.a((ksp)map.get(c)).toLowerCase());
    }

    public final boolean b()
    {
        return true;
    }

    static 
    {
        b = kse.D.toString();
        c = ksf.f.toString();
    }
}
