// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            a, av

public final class dt extends a
{

    public Object a(Enum enum, Object obj)
    {
        return super.put(enum, obj);
    }

    public volatile av b()
    {
        return super.b();
    }

    public volatile void clear()
    {
        super.clear();
    }

    public volatile boolean containsValue(Object obj)
    {
        return super.containsValue(obj);
    }

    public volatile Set d()
    {
        return super.d();
    }

    public volatile Set entrySet()
    {
        return super.entrySet();
    }

    public volatile Set keySet()
    {
        return super.keySet();
    }

    public Object put(Object obj, Object obj1)
    {
        return a((Enum)obj, obj1);
    }

    public volatile void putAll(Map map)
    {
        super.putAll(map);
    }

    public volatile Object remove(Object obj)
    {
        return super.remove(obj);
    }
}
