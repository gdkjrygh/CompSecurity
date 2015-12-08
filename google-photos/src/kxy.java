// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;
import java.util.Set;

public final class kxy
    implements kuf
{

    private kxv a;

    public kxy(kxv kxv1)
    {
        a = kxv1;
        super();
    }

    public final void a(kxu kxu, Map map)
    {
        if (map.keySet().contains("start"))
        {
            kxv.a(a);
        } else
        {
            if (map.keySet().contains("stop"))
            {
                kxv.b(a);
                return;
            }
            if (map.keySet().contains("cancel"))
            {
                kxv.c(a);
                return;
            }
        }
    }
}
