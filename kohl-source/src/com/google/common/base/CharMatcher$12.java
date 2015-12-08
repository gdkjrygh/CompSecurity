// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            CharMatcher

static final class it> extends CharMatcher
{

    final char val$endInclusive;
    final char val$startInclusive;

    public volatile boolean apply(Object obj)
    {
        return super.apply((Character)obj);
    }

    public boolean matches(char c)
    {
        return val$startInclusive <= c && c <= val$endInclusive;
    }

    public CharMatcher precomputed()
    {
        return this;
    }

    void setBits(kupTable kuptable)
    {
        char c = val$startInclusive;
        do
        {
            kuptable.set(c);
            char c1 = (char)(c + 1);
            if (c == val$endInclusive)
            {
                return;
            }
            c = c1;
        } while (true);
    }

    kupTable(char c, char c1)
    {
        val$startInclusive = c;
        val$endInclusive = c1;
        super();
    }
}
