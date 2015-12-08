// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

public final class kF
{

    public final Map mAdUnitToIndustryMap = ep.a();

    public kF()
    {
    }

    final void a(String s)
    {
        if (mAdUnitToIndustryMap.get(s) == null)
        {
            mAdUnitToIndustryMap.put(s, ep.a());
        }
    }
}
