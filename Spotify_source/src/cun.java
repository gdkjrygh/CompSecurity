// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableBiMap;
import java.util.Map;

public final class cun extends cur
{

    public cun()
    {
    }

    public final ImmutableMap a()
    {
        switch (b)
        {
        default:
            return new RegularImmutableBiMap(b, a);

        case 0: // '\0'
            return ImmutableBiMap.g();

        case 1: // '\001'
            return ImmutableBiMap.a(a[0].getKey(), a[0].getValue());
        }
    }

    public final volatile cur a(Object obj, Object obj1)
    {
        super.a(obj, obj1);
        return this;
    }

    public final volatile cur a(Map map)
    {
        super.a(map);
        return this;
    }
}
