// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.k;

// Referenced classes of package com.google.common.collect:
//            dm

abstract class do
    implements dm
{

    do()
    {
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof dm)
        {
            obj = (dm)obj;
            flag = flag1;
            if (getCount() == ((dm) (obj)).getCount())
            {
                flag = flag1;
                if (k.a(getElement(), ((dm) (obj)).getElement()))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        Object obj = getElement();
        int i;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        return i ^ getCount();
    }

    public String toString()
    {
        String s = String.valueOf(getElement());
        int i = getCount();
        if (i == 1)
        {
            return s;
        } else
        {
            return (new StringBuilder()).append(s).append(" x ").append(i).toString();
        }
    }
}
