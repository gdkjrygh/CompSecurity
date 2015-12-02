// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.common.a:
//            jq, ki, hq

final class jo extends jq
    implements Serializable
{

    static final jo a = new jo();

    private jo()
    {
    }

    public int a(Comparable comparable, Comparable comparable1)
    {
        Preconditions.checkNotNull(comparable1);
        if (comparable == comparable1)
        {
            return 0;
        } else
        {
            return comparable.compareTo(comparable1);
        }
    }

    public jq a()
    {
        return ki.a;
    }

    public List a(Iterable iterable)
    {
        iterable = hq.a(iterable);
        Collections.sort(iterable);
        return iterable;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((Comparable)obj, (Comparable)obj1);
    }

    public String toString()
    {
        return "Ordering.natural()";
    }

}
