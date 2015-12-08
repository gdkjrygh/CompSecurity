// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;


// Referenced classes of package com.google.android.m4b.maps.aa:
//            at, aw

final class b extends at
{

    private Object a;
    private Object b;
    private aw c;

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof java.util.ntry)
        {
            obj = (java.util.ntry)obj;
            flag = flag1;
            if (a.equals(((java.util.ntry) (obj)).getKey()))
            {
                flag = flag1;
                if (b.equals(((java.util.ntry) (obj)).getValue()))
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

    (aw aw1, Object obj, Object obj1)
    {
        c = aw1;
        super();
        a = obj;
        b = obj1;
    }
}
