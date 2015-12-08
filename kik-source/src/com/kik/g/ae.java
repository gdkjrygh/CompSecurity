// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.g;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.kik.g:
//            as

final class ae
    implements as
{

    final as a;

    ae(as as1)
    {
        a = as1;
        super();
    }

    public final Object a(Object obj)
    {
        obj = (Map)obj;
        HashMap hashmap = new HashMap();
        Object obj1;
        Object obj2;
        for (Iterator iterator = ((Map) (obj)).keySet().iterator(); iterator.hasNext(); hashmap.put(obj1, a.a(obj2)))
        {
            obj1 = iterator.next();
            obj2 = ((Map) (obj)).get(obj1);
        }

        return hashmap;
    }
}
