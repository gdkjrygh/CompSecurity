// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Objects;

// Referenced classes of package com.google.common.a:
//            hx

class it
    implements hx
{

    private final Object a;
    private final Object b;

    private it(Object obj, Object obj1)
    {
        a = obj;
        b = obj1;
    }

    static hx a(Object obj, Object obj1)
    {
        return new it(obj, obj1);
    }

    public Object a()
    {
        return a;
    }

    public Object b()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof hx)
        {
            obj = (hx)obj;
            flag = flag1;
            if (Objects.equal(a, ((hx) (obj)).a()))
            {
                flag = flag1;
                if (Objects.equal(b, ((hx) (obj)).b()))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            a, b
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append("(").append(a).append(", ").append(b).append(")").toString();
    }
}
