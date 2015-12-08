// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss;


// Referenced classes of package com.google.zxing.oned.rss:
//            DataCharacter, FinderPattern

final class Pair extends DataCharacter
{

    private int count;
    private final FinderPattern finderPattern;

    Pair(int i, int j, FinderPattern finderpattern)
    {
        super(i, j);
        finderPattern = finderpattern;
    }

    int getCount()
    {
        return count;
    }

    FinderPattern getFinderPattern()
    {
        return finderPattern;
    }

    void incrementCount()
    {
        count = count + 1;
    }
}
