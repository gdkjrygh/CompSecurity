// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.k;

import com.facebook.location.g;
import com.google.common.base.Function;
import java.util.List;

// Referenced classes of package com.facebook.orca.k:
//            d, b

class c
    implements Function
{

    final b a;

    c(b b)
    {
        a = b;
        super();
    }

    public d a(List list)
    {
        return new d((g)list.get(1), (g)list.get(0));
    }

    public Object apply(Object obj)
    {
        return a((List)obj);
    }
}
