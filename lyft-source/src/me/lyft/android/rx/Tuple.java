// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.rx;

import me.lyft.android.common.Objects;

public class Tuple
{

    public final Object item1;
    public final Object item2;

    public Tuple(Object obj, Object obj1)
    {
        item1 = obj;
        item2 = obj1;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof Tuple)
        {
            obj = (Tuple)obj;
            flag = flag1;
            if (Objects.equals(((Tuple) (obj)).item1, item1))
            {
                flag = flag1;
                if (Objects.equals(((Tuple) (obj)).item2, item2))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }
}
