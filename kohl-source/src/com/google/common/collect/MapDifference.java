// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Map;

public interface MapDifference
{
    public static interface ValueDifference
    {

        public abstract boolean equals(Object obj);

        public abstract int hashCode();

        public abstract Object leftValue();

        public abstract Object rightValue();
    }


    public abstract boolean areEqual();

    public abstract Map entriesDiffering();

    public abstract Map entriesInCommon();

    public abstract Map entriesOnlyOnLeft();

    public abstract Map entriesOnlyOnRight();

    public abstract boolean equals(Object obj);

    public abstract int hashCode();
}
