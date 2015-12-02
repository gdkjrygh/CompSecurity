// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.io.Serializable;

// Referenced classes of package com.google.common.a:
//            jq

final class kj extends jq
    implements Serializable
{

    final jq a;

    kj(jq jq1)
    {
        a = (jq)Preconditions.checkNotNull(jq1);
    }

    public jq a()
    {
        return a;
    }

    public int compare(Object obj, Object obj1)
    {
        return a.compare(obj1, obj);
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof kj)
        {
            obj = (kj)obj;
            return a.equals(((kj) (obj)).a);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return -a.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append(a).append(".reverse()").toString();
    }
}
