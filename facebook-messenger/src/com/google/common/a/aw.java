// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;

// Referenced classes of package com.google.common.a:
//            jq

final class aw extends jq
    implements Serializable
{

    final Function a;
    final jq b;

    aw(Function function, jq jq1)
    {
        a = (Function)Preconditions.checkNotNull(function);
        b = (jq)Preconditions.checkNotNull(jq1);
    }

    public int compare(Object obj, Object obj1)
    {
        return b.compare(a.apply(obj), a.apply(obj1));
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof aw)
            {
                if (!a.equals(((aw) (obj = (aw)obj)).a) || !b.equals(((aw) (obj)).b))
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
            a, b
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append(b).append(".onResultOf(").append(a).append(")").toString();
    }
}
