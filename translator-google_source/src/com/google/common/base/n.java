// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.Iterator;

// Referenced classes of package com.google.common.base:
//            o

final class n
    implements Iterable
{

    final Iterable a;

    n(Iterable iterable)
    {
        a = iterable;
        super();
    }

    public final Iterator iterator()
    {
        return new o(this);
    }
}
