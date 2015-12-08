// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util;

import android.support.v4.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.util:
//            ArraySet

public final class CollectionUtils
{

    public static Map mapOfKeyValueArrays(Object aobj[], Object aobj1[])
    {
        if (8 != aobj1.length)
        {
            throw new IllegalArgumentException((new StringBuilder("Key and values array lengths not equal: 8")).append(" != ").append(aobj1.length).toString());
        }
        ArrayMap arraymap = new ArrayMap(8);
        for (int i = 0; i < 8; i++)
        {
            arraymap.put(aobj[i], aobj1[i]);
        }

        return Collections.unmodifiableMap(arraymap);
    }

    public static Set setOf(Object obj, Object obj1, Object obj2)
    {
        ArraySet arrayset = new ArraySet(3);
        arrayset.add(obj);
        arrayset.add(obj1);
        arrayset.add(obj2);
        return Collections.unmodifiableSet(arrayset);
    }
}
