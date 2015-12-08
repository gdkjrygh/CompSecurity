// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;
import java.util.List;

final class nit> extends nit>
{

    public final int resultIndex(Comparator comparator, Object obj, List list, int i)
    {
        return FIRST_PRESENT.sultIndex(comparator, obj, list, i) - 1;
    }

    (String s, int i)
    {
        super(s, i, null);
    }
}
