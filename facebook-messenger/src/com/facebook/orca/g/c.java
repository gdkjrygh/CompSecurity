// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.g;

import com.google.common.base.Function;

// Referenced classes of package com.facebook.orca.g:
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

    public Long a(d d1)
    {
        return Long.valueOf(d.a(d1));
    }

    public Object apply(Object obj)
    {
        return a((d)obj);
    }
}
