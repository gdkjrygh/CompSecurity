// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.z;

import com.google.android.m4b.maps.y.h;
import com.google.android.m4b.maps.y.j;

// Referenced classes of package com.google.android.m4b.maps.z:
//            k

public final class m
    implements java.util.Map.Entry
{

    private final Object a;
    private final Object b;
    private final k c;

    m(Object obj, Object obj1, k k1)
    {
        a = obj;
        b = obj1;
        c = (k)j.a(k1);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            flag = flag1;
            if (h.a(getKey(), ((java.util.Map.Entry) (obj)).getKey()))
            {
                flag = flag1;
                if (h.a(getValue(), ((java.util.Map.Entry) (obj)).getValue()))
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
        int l = 0;
        Object obj = getKey();
        Object obj1 = getValue();
        int i;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        if (obj1 != null)
        {
            l = obj1.hashCode();
        }
        return l ^ i;
    }

    public final Object setValue(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final String toString()
    {
        return (new StringBuilder()).append(getKey()).append("=").append(getValue()).toString();
    }
}
