// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Function;
import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            gf, gg

final class ge extends gf
{

    final Iterable a;
    final Function b;

    ge(Iterable iterable, Function function)
    {
        a = iterable;
        b = function;
        super();
    }

    public Iterator iterator()
    {
        return gg.a(a.iterator(), b);
    }
}
