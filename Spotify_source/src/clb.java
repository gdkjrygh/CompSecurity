// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;
import java.util.Set;

final class clb
    implements cdi
{

    private ckx a;

    private clb(ckx ckx1)
    {
        a = ckx1;
        super();
    }

    clb(ckx ckx1, byte byte0)
    {
        this(ckx1);
    }

    public final void a(ckw ckw, Map map)
    {
        if (map.keySet().contains("start"))
        {
            ckx.a(a);
        } else
        {
            if (map.keySet().contains("stop"))
            {
                ckx.b(a);
                return;
            }
            if (map.keySet().contains("cancel"))
            {
                ckx.c(a);
                return;
            }
        }
    }
}
