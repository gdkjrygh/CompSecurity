// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            CharMatcher

static final class stMatcher extends stMatcher
{

    final char val$match;

    public final boolean matches(char c)
    {
        return c == val$match;
    }

    public final CharMatcher negate()
    {
        return isNot(val$match);
    }

    public final CharMatcher or(CharMatcher charmatcher)
    {
        if (charmatcher.matches(val$match))
        {
            return charmatcher;
        } else
        {
            return super.or(charmatcher);
        }
    }

    stMatcher(String s, char c)
    {
        val$match = c;
        super(s);
    }
}
