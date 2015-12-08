// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            av

static final class b extends AbstractMap
    implements Serializable, ConcurrentMap
{

    private static final long serialVersionUID = 0L;
    private final put a;
    private final put b;

    public final boolean containsKey(Object obj)
    {
        return false;
    }

    public final boolean containsValue(Object obj)
    {
        return false;
    }

    public final Set entrySet()
    {
        return Collections.emptySet();
    }

    public final Object get(Object obj)
    {
        return null;
    }

    public final Object put(Object obj, Object obj1)
    {
        j.a(obj);
        j.a(obj1);
        new <init>(obj, obj1, b);
        return null;
    }

    public final Object putIfAbsent(Object obj, Object obj1)
    {
        return put(obj, obj1);
    }

    public final Object remove(Object obj)
    {
        return null;
    }

    public final boolean remove(Object obj, Object obj1)
    {
        return false;
    }

    public final Object replace(Object obj, Object obj1)
    {
        j.a(obj);
        j.a(obj1);
        return null;
    }

    public final boolean replace(Object obj, Object obj1, Object obj2)
    {
        j.a(obj);
        j.a(obj2);
        return false;
    }

    (av av1)
    {
        a = av1.e();
        b = av1.i;
    }
}
