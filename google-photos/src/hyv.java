// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class hyv
{

    private Map a;

    public hyv()
    {
        a = new HashMap();
    }

    public final Collection a(int i)
    {
        return (Collection)a.remove(Integer.valueOf(i));
    }

    public final void a(int i, Collection collection)
    {
        p.b(collection, "mediaSelected cannot be null");
        a.put(Integer.valueOf(i), collection);
    }

    public final boolean b(int i)
    {
        return a.containsKey(Integer.valueOf(i));
    }
}
