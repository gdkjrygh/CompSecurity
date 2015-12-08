// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.Arrays;

// Referenced classes of package com.google.common.base:
//            CharMatcher

static final class it> extends CharMatcher
{

    final char val$chars[];

    public volatile boolean apply(Object obj)
    {
        return super.apply((Character)obj);
    }

    public boolean matches(char c)
    {
        return Arrays.binarySearch(val$chars, c) >= 0;
    }

    void setBits(kupTable kuptable)
    {
        char ac[] = val$chars;
        int j = ac.length;
        for (int i = 0; i < j; i++)
        {
            kuptable.set(ac[i]);
        }

    }

    kupTable(char ac[])
    {
        val$chars = ac;
        super();
    }
}
