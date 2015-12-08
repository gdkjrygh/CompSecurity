// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;

import java.io.Serializable;
import java.util.Comparator;

public final class Range
    implements Serializable
{
    private static final class ComparableComparator extends Enum
        implements Comparator
    {

        private static final ComparableComparator $VALUES[];
        public static final ComparableComparator INSTANCE;

        public static ComparableComparator valueOf(String s)
        {
            return (ComparableComparator)Enum.valueOf(org/apache/commons/lang3/Range$ComparableComparator, s);
        }

        public static ComparableComparator[] values()
        {
            return (ComparableComparator[])$VALUES.clone();
        }

        public int compare(Object obj, Object obj1)
        {
            return ((Comparable)obj).compareTo(obj1);
        }

        static 
        {
            INSTANCE = new ComparableComparator("INSTANCE", 0);
            $VALUES = (new ComparableComparator[] {
                INSTANCE
            });
        }

        private ComparableComparator(String s, int i)
        {
            super(s, i);
        }
    }


    private transient int hashCode;
    private final Object maximum;
    private final Object minimum;
    private transient String toString;

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj == null || obj.getClass() != getClass())
            {
                return false;
            }
            obj = (Range)obj;
            if (!minimum.equals(((Range) (obj)).minimum) || !maximum.equals(((Range) (obj)).maximum))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int i = hashCode;
        if (hashCode == 0)
        {
            i = ((getClass().hashCode() + 629) * 37 + minimum.hashCode()) * 37 + maximum.hashCode();
            hashCode = i;
        }
        return i;
    }

    public String toString()
    {
        String s = toString;
        Object obj = s;
        if (s == null)
        {
            obj = new StringBuilder(32);
            ((StringBuilder) (obj)).append('[');
            ((StringBuilder) (obj)).append(minimum);
            ((StringBuilder) (obj)).append("..");
            ((StringBuilder) (obj)).append(maximum);
            ((StringBuilder) (obj)).append(']');
            obj = ((StringBuilder) (obj)).toString();
            toString = ((String) (obj));
        }
        return ((String) (obj));
    }
}
