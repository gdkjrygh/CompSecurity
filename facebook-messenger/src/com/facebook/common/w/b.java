// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.w;

import com.google.common.base.Preconditions;

public class b
{

    public b()
    {
    }

    public static boolean a(Comparable comparable, Comparable comparable1)
    {
        Preconditions.checkNotNull(comparable);
        Preconditions.checkNotNull(comparable1);
        return comparable.compareTo(comparable1) >= 0;
    }
}
