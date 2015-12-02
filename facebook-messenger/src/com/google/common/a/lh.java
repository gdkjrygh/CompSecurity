// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Comparator;
import java.util.List;

// Referenced classes of package com.google.common.a:
//            ld

final class lh extends ld
{

    lh(String s, int i)
    {
        super(s, i, null);
    }

    public int resultIndex(Comparator comparator, Object obj, List list, int i)
    {
        return LAST_PRESENT.resultIndex(comparator, obj, list, i) + 1;
    }
}
