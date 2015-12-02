// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.io.Serializable;

// Referenced classes of package com.google.common.a:
//            jq

final class ki extends jq
    implements Serializable
{

    static final ki a = new ki();

    private ki()
    {
    }

    public int a(Comparable comparable, Comparable comparable1)
    {
        Preconditions.checkNotNull(comparable);
        if (comparable == comparable1)
        {
            return 0;
        } else
        {
            return comparable1.compareTo(comparable);
        }
    }

    public jq a()
    {
        return jq.b();
    }

    public int compare(Object obj, Object obj1)
    {
        return a((Comparable)obj, (Comparable)obj1);
    }

    public String toString()
    {
        return "Ordering.natural().reverse()";
    }

}
