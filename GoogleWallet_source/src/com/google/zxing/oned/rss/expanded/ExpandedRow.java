// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded;

import java.util.ArrayList;
import java.util.List;

final class ExpandedRow
{

    private final List pairs;
    private final int rowNumber;
    private final boolean wasReversed;

    ExpandedRow(List list, int i, boolean flag)
    {
        pairs = new ArrayList(list);
        rowNumber = i;
        wasReversed = flag;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof ExpandedRow)
        {
            if (pairs.equals(((ExpandedRow) (obj = (ExpandedRow)obj)).getPairs()) && wasReversed == ((ExpandedRow) (obj)).wasReversed)
            {
                return true;
            }
        }
        return false;
    }

    final List getPairs()
    {
        return pairs;
    }

    final int getRowNumber()
    {
        return rowNumber;
    }

    public final int hashCode()
    {
        return pairs.hashCode() ^ Boolean.valueOf(wasReversed).hashCode();
    }

    final boolean isEquivalent(List list)
    {
        return pairs.equals(list);
    }

    public final String toString()
    {
        return (new StringBuilder("{ ")).append(pairs).append(" }").toString();
    }
}
