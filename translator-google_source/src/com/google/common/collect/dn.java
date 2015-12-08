// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.c.a;

// Referenced classes of package com.google.common.collect:
//            Ordering, dm

final class dn extends Ordering
{

    dn()
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (dm)obj;
        return a.a(((dm)obj1).getCount(), ((dm) (obj)).getCount());
    }
}
