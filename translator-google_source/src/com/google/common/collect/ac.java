// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            dr, aa, dl

final class ac extends dr
{

    final aa a;

    ac(aa aa1)
    {
        a = aa1;
        super();
    }

    final dl a()
    {
        return a;
    }

    public final Iterator iterator()
    {
        return a.entryIterator();
    }

    public final int size()
    {
        return a.distinctElements();
    }
}
