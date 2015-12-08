// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class lsp extends lqd
{

    private static final String b;
    private static final String c;
    private static final String d;

    public lsp()
    {
        super(b, new String[0]);
    }

    public final ksp a(Map map)
    {
        Object obj;
        obj = (ksp)map.get(c);
        map = (ksp)map.get(d);
        if (obj == null || obj == ltw.f() || map == null || map == ltw.f()) goto _L2; else goto _L1
_L1:
        obj = ltw.b(((ksp) (obj)));
        map = ltw.b(map);
        if (obj == ltw.d() || map == ltw.d()) goto _L2; else goto _L3
_L3:
        double d1;
        double d2;
        d2 = ((ltv) (obj)).doubleValue();
        d1 = map.doubleValue();
        if (d2 > d1) goto _L2; else goto _L4
_L4:
        return ltw.a(Long.valueOf(Math.round((d1 - d2) * Math.random() + d2)));
_L2:
        d1 = 2147483647D;
        d2 = 0.0D;
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final boolean b()
    {
        return false;
    }

    static 
    {
        b = kse.o.toString();
        c = ksf.A.toString();
        d = ksf.z.toString();
    }
}
