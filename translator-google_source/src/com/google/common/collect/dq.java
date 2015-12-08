// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ei, dm, dp

final class dq extends ei
{

    final dp a;

    dq(dp dp, Iterator iterator)
    {
        a = dp;
        super(iterator);
    }

    final Object a(Object obj)
    {
        return ((dm)obj).getElement();
    }
}
