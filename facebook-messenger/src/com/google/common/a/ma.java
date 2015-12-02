// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Objects;

// Referenced classes of package com.google.common.a:
//            ly

abstract class ma
    implements ly
{

    ma()
    {
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof ly)
            {
                if (!Objects.equal(a(), ((ly) (obj = (ly)obj)).a()) || !Objects.equal(b(), ((ly) (obj)).b()) || !Objects.equal(c(), ((ly) (obj)).c()))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            a(), b(), c()
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append("(").append(a()).append(",").append(b()).append(")=").append(c()).toString();
    }
}
