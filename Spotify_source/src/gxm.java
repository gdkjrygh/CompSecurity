// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class gxm extends gxk
{

    private Map b;

    gxm(Map map)
    {
        super(map);
        b = map;
    }

    public final Object a(int i)
    {
        return b.get(Integer.valueOf(i));
    }

    public final boolean b(int i)
    {
        return b.containsKey(Integer.valueOf(i));
    }
}
