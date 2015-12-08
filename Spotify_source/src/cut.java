// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import java.util.Comparator;
import java.util.Map;

public final class cut extends cur
{

    private final Comparator c;

    public cut(Comparator comparator)
    {
        c = (Comparator)ctz.a(comparator);
    }

    public final volatile ImmutableMap a()
    {
        return ImmutableSortedMap.a(c, b, a);
    }

    public final volatile cur a(Object obj, Object obj1)
    {
        super.a(obj, obj1);
        return this;
    }

    public final volatile cur a(java.util.Map.Entry entry)
    {
        super.a(entry);
        return this;
    }

    public final volatile cur a(Map map)
    {
        super.a(map);
        return this;
    }
}
