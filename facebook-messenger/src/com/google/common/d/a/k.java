// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.d.a;

import com.google.common.base.Function;

// Referenced classes of package com.google.common.d.a:
//            i, s

final class k
    implements Function
{

    final Function a;

    k(Function function)
    {
        a = function;
        super();
    }

    public s a(Object obj)
    {
        return i.a(a.apply(obj));
    }

    public Object apply(Object obj)
    {
        return a(obj);
    }
}
