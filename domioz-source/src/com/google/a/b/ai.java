// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.Iterator;

// Referenced classes of package com.google.a.b:
//            ah

final class ai extends ah
{

    final Iterable a;

    ai(Iterable iterable, Iterable iterable1)
    {
        a = iterable1;
        super(iterable);
    }

    public final Iterator iterator()
    {
        return a.iterator();
    }
}
