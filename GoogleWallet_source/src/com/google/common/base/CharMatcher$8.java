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
        return charsequence.toString();
    }

    public final int indexIn(CharSequence charsequence)
    {
        Preconditions.checkNotNull(charsequence);
        return -1;
    }

    public final int indexIn(CharSequence charsequence, int i)
    {
        Preconditions.checkPositionIndex(i, charsequence.length());
        return -1;
    }

    public final boolean matches(char c)
    {
        return false;
    }

    public final boolean matchesAllOf(CharSequence charsequence)
    {
        return charsequence.length() == 0;
    }

    public final boolean matchesNoneOf(CharSequence charsequence)
    {
        Preconditions.checkNotNull(charsequence);
        return true;
    }

    public final CharMatcher negate()
    {
        return ANY;
    }

    public final CharMatcher or(CharMatcher charmatcher)
    {
        return (CharMatcher)Preconditions.checkNotNull(charmatcher);
    }

    public final String trimLeadingFrom(CharSequence charsequence)
    {
        return charsequence.toString();
    }

    public final String trimTrailingFrom(CharSequence charsequence)
    {
        return charsequence.toString();
    }

    stMatcher(String s)
    {
        super(s);
    }
}
