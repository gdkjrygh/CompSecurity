// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            v, MapMakerInternalMap

final class cy extends v
{

    final Object a;
    Object b;
    final MapMakerInternalMap c;

    cy(MapMakerInternalMap mapmakerinternalmap, Object obj, Object obj1)
    {
        c = mapmakerinternalmap;
        super();
        a = obj;
        b = obj1;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            flag = flag1;
            if (a.equals(((java.util.Map.Entry) (obj)).getKey()))
            {
                flag = flag1;
                if (b.equals(((java.util.Map.Entry) (obj)).getValue()))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final Object getKey()
    {
        return a;
    }

    public final Object getValue()
    {
        return b;
    }

    public final int hashCode()
    {
        return a.hashCode() ^ b.hashCode();
    }

    public final Object setValue(Object obj)
    {
        Object obj1 = c.put(a, obj);
        b = obj;
        return obj1;
    }
}
