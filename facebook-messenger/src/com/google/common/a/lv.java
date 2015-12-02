// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            lw, lt, lj, ax, 
//            lu

class lv extends lw
{

    final lt a;

    lv(lt lt1)
    {
        a = lt1;
        super(lt1.a, null);
    }

    public boolean contains(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            flag = flag1;
            if (((java.util.Map.Entry) (obj)).getKey() != null)
            {
                flag = flag1;
                if (((java.util.Map.Entry) (obj)).getValue() instanceof Map)
                {
                    flag = flag1;
                    if (ax.a(a.a.a.entrySet(), obj))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public Iterator iterator()
    {
        return new lu(a);
    }

    public boolean remove(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            flag = flag1;
            if (((java.util.Map.Entry) (obj)).getKey() != null)
            {
                flag = flag1;
                if (((java.util.Map.Entry) (obj)).getValue() instanceof Map)
                {
                    flag = flag1;
                    if (a.a.a.entrySet().remove(obj))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public int size()
    {
        return a.a.a.size();
    }
}
