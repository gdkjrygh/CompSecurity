// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

// Referenced classes of package com.google.inject.internal.util:
//            $ImmutableEntry

public final class $Maps
{

    private $Maps()
    {
    }

    public static java.util.Map.Entry immutableEntry(Object obj, Object obj1)
    {
        return new $ImmutableEntry(obj, obj1);
    }

    public static HashMap newHashMap()
    {
        return new HashMap();
    }

    public static IdentityHashMap newIdentityHashMap()
    {
        return new IdentityHashMap();
    }

    public static LinkedHashMap newLinkedHashMap()
    {
        return new LinkedHashMap();
    }

    public static TreeMap newTreeMap()
    {
        return new TreeMap();
    }
}
