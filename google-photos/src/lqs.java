// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class lqs
    implements lpy
{

    private lqr a;

    lqs(lqr lqr1)
    {
        a = lqr1;
        super();
    }

    public final void a(Map map)
    {
        map = ((Map) (map.get("event")));
        if (map != null)
        {
            lqr.a(a, map.toString());
        }
    }
}
