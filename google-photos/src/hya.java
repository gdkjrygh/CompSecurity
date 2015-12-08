// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.EnumMap;

public class hya
{

    private static final EnumMap a;

    public hya()
    {
    }

    public static msm a(hsw hsw1)
    {
        return new msm((msp)a.get(hsw1));
    }

    static 
    {
        EnumMap enummap = new EnumMap(hsw);
        a = enummap;
        enummap.put(hsw.a, pwy.e);
        a.put(hsw.b, pwy.f);
        a.put(hsw.c, pwy.g);
        a.put(hsw.d, pwy.k);
    }
}
