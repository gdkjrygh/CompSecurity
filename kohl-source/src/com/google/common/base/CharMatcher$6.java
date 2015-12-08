// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.Arrays;

// Referenced classes of package com.google.common.base:
//            CharMatcher, Preconditions

static final class  extends CharMatcher
{

    public CharMatcher and(CharMatcher charmatcher)
    {
        return (CharMatcher)Preconditions.checkNotNull(charmatcher);
    }

    public volatile boolean apply(Object obj)
    {
        return super.apply((Character)obj);
    }

    public String collapseFrom(CharSequence charsequence, char c)
    {
        if (charsequence.length() == 0)
        {
            return "";
        } else
        {
            return String.valueOf(c);
        }
    }

    public int countIn(CharSequence charsequence)
    {
        return charsequence.length();
    }

    public int indexIn(CharSequence charsequence)
    {
        return charsequence.length() != 0 ? 0 : -1;
    }

    public int indexIn(CharSequence charsequence, int i)
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

    public int lastIndexIn(CharSequence charsequence)
    {
        return charsequence.length() - 1;
    }

    public boolean matches(char c)
    {
        return true;
    }

    public boolean matchesAllOf(CharSequence charsequence)
    {
        Preconditions.checkNotNull(charsequence);
        return true;
    }

    public boolean matchesNoneOf(CharSequence charsequence)
    {
        return charsequence.length() == 0;
    }

    public CharMatcher negate()
    {
        return NONE;
    }

    public CharMatcher or(CharMatcher charmatcher)
    {
        Preconditions.checkNotNull(charmatcher);
        return this;
    }

    public CharMatcher precomputed()
    {
        return this;
    }

    public String removeFrom(CharSequence charsequence)
    {
        Preconditions.checkNotNull(charsequence);
        return "";
    }

    public String replaceFrom(CharSequence charsequence, char c)
    {
        charsequence = new char[charsequence.length()];
        Arrays.fill(charsequence, c);
        return new String(charsequence);
    }

    public String replaceFrom(CharSequence charsequence, CharSequence charsequence1)
    {
        StringBuilder stringbuilder = new StringBuilder(charsequence.length() * charsequence1.length());
        for (int i = 0; i < charsequence.length(); i++)
        {
            stringbuilder.append(charsequence1);
        }

        return stringbuilder.toString();
    }

    public String trimFrom(CharSequence charsequence)
    {
        Preconditions.checkNotNull(charsequence);
        return "";
    }

    ()
    {
    }
}
