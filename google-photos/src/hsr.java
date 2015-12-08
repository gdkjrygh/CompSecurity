// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import java.util.Map;

public final class hsr
{

    final Map a;

    hsr(Map map)
    {
        a = map;
    }

    public static hss a()
    {
        return new hss(4);
    }

    public final List a(hsw hsw)
    {
        return (List)a.get(hsw);
    }
}
