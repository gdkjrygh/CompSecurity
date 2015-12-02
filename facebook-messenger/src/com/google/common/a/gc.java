// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            gf, gb, gg

final class gc extends gf
{

    final Iterable a;

    gc(Iterable iterable)
    {
        a = iterable;
        super();
    }

    public Iterator iterator()
    {
        return gg.e(gb.d(a));
    }
}
