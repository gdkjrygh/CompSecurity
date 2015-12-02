// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.w;

import java.util.Iterator;
import java.util.Set;

public class a
{

    private static final Class a = com/facebook/common/w/a;

    private a()
    {
    }

    public static long a(Enum enum)
    {
        return (long)(1 << enum.ordinal());
    }

    public static long a(Set set)
    {
        set = set.iterator();
        long l;
        for (l = 0L; set.hasNext(); l |= a((Enum)set.next())) { }
        return l;
    }

}
