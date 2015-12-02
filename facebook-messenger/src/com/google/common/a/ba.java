// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Referenced classes of package com.google.common.a:
//            jq, hq

final class ba extends jq
    implements Serializable
{

    final Comparator a;

    ba(Comparator comparator)
    {
        a = (Comparator)Preconditions.checkNotNull(comparator);
    }

    public List a(Iterable iterable)
    {
        iterable = hq.a(iterable);
        Collections.sort(iterable, a);
        return iterable;
    }

    public int compare(Object obj, Object obj1)
    {
        return a.compare(obj, obj1);
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof ba)
        {
            obj = (ba)obj;
            return a.equals(((ba) (obj)).a);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public String toString()
    {
        return a.toString();
    }
}
