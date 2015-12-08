// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.EnumMap;
import java.util.List;

public final class jah
{

    private final EnumMap a = new EnumMap(jai);

    public jah()
    {
    }

    public final jag a()
    {
        return new jag(a);
    }

    public final jah a(List list)
    {
        a(jai.a, list);
        return this;
    }

    void a(jai jai1, List list)
    {
        boolean flag;
        if (list != null && !list.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "list cannot be null or empty.");
        a.put(jai1, list);
    }

    public final jah b(List list)
    {
        a(jai.b, list);
        return this;
    }

    public final jah c(List list)
    {
        a(jai.c, list);
        return this;
    }
}
