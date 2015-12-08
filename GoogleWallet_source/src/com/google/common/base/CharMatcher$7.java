// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            CharMatcher, Preconditions

static final class stMatcher extends stMatcher
{

    public final String collapseFrom(CharSequence charsequence, char c)
    {
        if (charsequence.length() == 0)
        {
            return "";
        } else
        {
            return String.valueOf(c);
        }
    }

    public final int indexIn(CharSequence charsequence)
    {
        return charsequence.length() != 0 ? 0 : -1;
    }

    public final int indexIn(CharSequence charsequence, int i)
    {
        int k = charsequence.length();
        Preconditions.checkPositionIndex(i, k);
        int j = i;
        if (i == k)
        {
            j = -1;
        }
        return j;
    }

    public final boolean matches(char c)
    {
        return true;
    }

    public final boolean matchesAllOf(CharSequence charsequence)
    {
        Preconditions.checkNotNull(charsequence);
        return true;
    }

    public final boolean matchesNoneOf(CharSequence charsequence)
    {
        return charsequence.length() == 0;
    }

    public final CharMatcher negate()
    {
        return NONE;
    }

    public final CharMatcher or(CharMatcher charmatcher)
    {
        Preconditions.checkNotNull(charmatcher);
        return this;
    }

    stMatcher(String s)
    {
        super(s);
    }
}
