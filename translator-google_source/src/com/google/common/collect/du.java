// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            Ordering, MapMaker, dv

final class du extends Ordering
{

    private Map a;

    du()
    {
        a = (new MapMaker()).a(MapMakerInternalMap.Strength.WEAK).a(new dv(this));
    }

    public final int compare(Object obj, Object obj1)
    {
        byte byte0 = -1;
        if (obj != obj1) goto _L2; else goto _L1
_L1:
        int i = 0;
_L4:
        return i;
_L2:
        i = byte0;
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (obj1 == null)
        {
            return 1;
        }
        int k = System.identityHashCode(obj);
        int l = System.identityHashCode(obj1);
        if (k == l)
        {
            break; /* Loop/switch isn't completed */
        }
        i = byte0;
        if (k >= l)
        {
            return 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        int j = ((Integer)a.get(obj)).compareTo((Integer)a.get(obj1));
        i = j;
        if (j == 0)
        {
            throw new AssertionError();
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final String toString()
    {
        return "Ordering.arbitrary()";
    }
}
