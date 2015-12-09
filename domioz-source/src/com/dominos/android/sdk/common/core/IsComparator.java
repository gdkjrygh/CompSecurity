// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.core;


public class IsComparator
{

    private final Comparable obj;

    public IsComparator(Comparable comparable)
    {
        obj = comparable;
    }

    public boolean le(Comparable comparable)
    {
        return obj.compareTo(comparable) <= 0;
    }

    public boolean lt(Comparable comparable)
    {
        return obj.compareTo(comparable) < 0;
    }

    public boolean ne(Comparable comparable)
    {
        return obj.compareTo(comparable) == 0;
    }
}
