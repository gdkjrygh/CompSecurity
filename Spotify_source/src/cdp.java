// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

public final class cdp
    implements cdi
{

    private final cdq a;

    public cdp(cdq cdq1)
    {
        a = cdq1;
    }

    public final void a(ckw ckw, Map map)
    {
        boolean flag;
        boolean flag1;
        flag = "1".equals(map.get("transparentBackground"));
        flag1 = "1".equals(map.get("blur"));
        if (map.get("blurRadius") == null) goto _L2; else goto _L1
_L1:
        float f = Float.parseFloat((String)map.get("blurRadius"));
_L4:
        a.b(flag);
        a.a(flag1, f);
        return;
        ckw;
        bka.b("Fail to parse float", ckw);
_L2:
        f = 0.0F;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
