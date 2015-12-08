// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.internal.fq;
import java.util.Comparator;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

private static final class BV
    implements Comparator
{

    private final String BV;

    public int a(HashMap hashmap, HashMap hashmap1)
    {
        hashmap = ((HashMap) (fq.f(hashmap.get(BV))));
        hashmap1 = ((HashMap) (fq.f(hashmap1.get(BV))));
        if (hashmap.equals(hashmap1))
        {
            return 0;
        }
        if (hashmap instanceof Boolean)
        {
            return ((Boolean)hashmap).compareTo((Boolean)hashmap1);
        }
        if (hashmap instanceof Long)
        {
            return ((Long)hashmap).compareTo((Long)hashmap1);
        }
        if (hashmap instanceof Integer)
        {
            return ((Integer)hashmap).compareTo((Integer)hashmap1);
        }
        if (hashmap instanceof String)
        {
            return ((String)hashmap).compareTo((String)hashmap1);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown type for lValue ").append(hashmap).toString());
        }
    }

    public int compare(Object obj, Object obj1)
    {
        return a((HashMap)obj, (HashMap)obj1);
    }

    (String s)
    {
        BV = (String)fq.f(s);
    }
}
