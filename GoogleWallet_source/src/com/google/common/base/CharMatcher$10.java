// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            CharMatcher

static final class tMatcher extends tMatcher
{

    final char val$match;

    public final boolean matches(char c)
    {
        return c != val$match;
    }

    public final CharMatcher negate()
    {
        return is(val$match);
    }

    public final CharMatcher or(CharMatcher charmatcher)
    {
        Object obj = this;
        if (charmatcher.matches(val$match))
        {
            obj = ANY;
        }
        return ((CharMatcher) (obj));
    }

    tMatcher(String s, char c)
    {
        val$match = c;
        super(s);
    }
}
