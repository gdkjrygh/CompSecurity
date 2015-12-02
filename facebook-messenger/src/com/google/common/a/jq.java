// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Function;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Referenced classes of package com.google.common.a:
//            ba, jo, kj, aw, 
//            hq, es

public abstract class jq
    implements Comparator
{

    protected jq()
    {
    }

    public static jq a(Comparator comparator)
    {
        if (comparator instanceof jq)
        {
            return (jq)comparator;
        } else
        {
            return new ba(comparator);
        }
    }

    public static jq b()
    {
        return jo.a;
    }

    public jq a()
    {
        return new kj(this);
    }

    public jq a(Function function)
    {
        return new aw(function, this);
    }

    public List a(Iterable iterable)
    {
        iterable = hq.a(iterable);
        Collections.sort(iterable, this);
        return iterable;
    }

    public es b(Iterable iterable)
    {
        return es.a(a(iterable));
    }

    public abstract int compare(Object obj, Object obj1);
}
