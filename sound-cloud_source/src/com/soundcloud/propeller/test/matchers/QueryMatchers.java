// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller.test.matchers;


// Referenced classes of package com.soundcloud.propeller.test.matchers:
//            RowCountMatcher

public final class QueryMatchers
{

    private QueryMatchers()
    {
    }

    public static RowCountMatcher counts(int i)
    {
        return new RowCountMatcher(i);
    }

    public static RowCountMatcher isEmpty()
    {
        return new RowCountMatcher(0);
    }
}
