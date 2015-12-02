// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Objects;

// Referenced classes of package com.google.common.a:
//            jg

abstract class ji
    implements jg
{

    ji()
    {
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof jg)
        {
            obj = (jg)obj;
            flag = flag1;
            if (b() == ((jg) (obj)).b())
            {
                flag = flag1;
                if (Objects.equal(a(), ((jg) (obj)).a()))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        Object obj = a();
        int i;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        return i ^ b();
    }

    public String toString()
    {
        String s = String.valueOf(a());
        int i = b();
        if (i == 1)
        {
            return s;
        } else
        {
            return (new StringBuilder()).append(s).append(" x ").append(i).toString();
        }
    }
}
