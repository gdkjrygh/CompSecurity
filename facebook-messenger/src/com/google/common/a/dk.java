// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;


// Referenced classes of package com.google.common.a:
//            w, bj

final class dk extends w
{

    final Object a;
    Object b;
    final bj c;

    dk(bj bj1, Object obj, Object obj1)
    {
        c = bj1;
        super();
        a = obj;
        b = obj1;
    }

    public boolean equals(Object obj)
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

    public Object getKey()
    {
        return a;
    }

    public Object getValue()
    {
        return b;
    }

    public int hashCode()
    {
        return a.hashCode() ^ b.hashCode();
    }

    public Object setValue(Object obj)
    {
        Object obj1 = c.put(a, obj);
        b = obj;
        return obj1;
    }
}
