// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded;

import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;

final class ExpandedPair
{

    private final FinderPattern finderPattern;
    private final DataCharacter leftChar;
    private final boolean mayBeLast;
    private final DataCharacter rightChar;

    ExpandedPair(DataCharacter datacharacter, DataCharacter datacharacter1, FinderPattern finderpattern, boolean flag)
    {
        leftChar = datacharacter;
        rightChar = datacharacter1;
        finderPattern = finderpattern;
        mayBeLast = flag;
    }

    private static boolean equalsOrNull(Object obj, Object obj1)
    {
        if (obj == null)
        {
            return obj1 == null;
        } else
        {
            return obj.equals(obj1);
        }
    }

    private static int hashNotNull(Object obj)
    {
        if (obj == null)
        {
            return 0;
        } else
        {
            return obj.hashCode();
        }
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ExpandedPair)
        {
            if (equalsOrNull(leftChar, ((ExpandedPair) (obj = (ExpandedPair)obj)).leftChar) && equalsOrNull(rightChar, ((ExpandedPair) (obj)).rightChar) && equalsOrNull(finderPattern, ((ExpandedPair) (obj)).finderPattern))
            {
                return true;
            }
        }
        return false;
    }

    FinderPattern getFinderPattern()
    {
        return finderPattern;
    }

    DataCharacter getLeftChar()
    {
        return leftChar;
    }

    DataCharacter getRightChar()
    {
        return rightChar;
    }

    public int hashCode()
    {
        return hashNotNull(leftChar) ^ hashNotNull(rightChar) ^ hashNotNull(finderPattern);
    }

    boolean mayBeLast()
    {
        return mayBeLast;
    }

    public boolean mustBeLast()
    {
        return rightChar == null;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("[ ").append(leftChar).append(" , ").append(rightChar).append(" : ");
        Object obj;
        if (finderPattern == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(finderPattern.getValue());
        }
        return stringbuilder.append(obj).append(" ]").toString();
    }
}
