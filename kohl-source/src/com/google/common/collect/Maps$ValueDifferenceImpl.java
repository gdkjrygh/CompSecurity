// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Objects;

// Referenced classes of package com.google.common.collect:
//            Maps

static class right
    implements ence
{

    private final Object left;
    private final Object right;

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof ence)
        {
            obj = (ence)obj;
            flag = flag1;
            if (Objects.equal(left, ((ence) (obj)).leftValue()))
            {
                flag = flag1;
                if (Objects.equal(right, ((ence) (obj)).rightValue()))
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
            left, right
        });
    }

    public Object leftValue()
    {
        return left;
    }

    public Object rightValue()
    {
        return right;
    }

    public String toString()
    {
        return (new StringBuilder()).append("(").append(left).append(", ").append(right).append(")").toString();
    }

    ence(Object obj, Object obj1)
    {
        left = obj;
        right = obj1;
    }
}
