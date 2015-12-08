// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.tuple;

import java.io.Serializable;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.builder.CompareToBuilder;

public abstract class Pair
    implements Serializable, Comparable, java.util.Map.Entry
{

    public Pair()
    {
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((Pair)obj);
    }

    public int compareTo(Pair pair)
    {
        return (new CompareToBuilder()).append(getLeft(), pair.getLeft()).append(getRight(), pair.getRight()).toComparison();
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                if (!ObjectUtils.equals(getKey(), ((java.util.Map.Entry) (obj = (java.util.Map.Entry)obj)).getKey()) || !ObjectUtils.equals(getValue(), ((java.util.Map.Entry) (obj)).getValue()))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final Object getKey()
    {
        return getLeft();
    }

    public abstract Object getLeft();

    public abstract Object getRight();

    public Object getValue()
    {
        return getRight();
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (getKey() == null)
        {
            i = 0;
        } else
        {
            i = getKey().hashCode();
        }
        if (getValue() != null)
        {
            j = getValue().hashCode();
        }
        return i ^ j;
    }

    public String toString()
    {
        return (new StringBuilder("(")).append(getLeft()).append(',').append(getRight()).append(')').toString();
    }
}
