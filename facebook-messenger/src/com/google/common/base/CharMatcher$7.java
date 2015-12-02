// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            CharMatcher, Preconditions

final class okupTable extends CharMatcher
{

    public volatile boolean apply(Object obj)
    {
        return super.apply((Character)obj);
    }

    public int indexIn(CharSequence charsequence)
    {
        Preconditions.checkNotNull(charsequence);
        return -1;
    }

    public boolean matches(char c)
    {
        return false;
    }

    public CharMatcher negate()
    {
        return ANY;
    }

    public CharMatcher or(CharMatcher charmatcher)
    {
        return (CharMatcher)Preconditions.checkNotNull(charmatcher);
    }

    public CharMatcher precomputed()
    {
        return this;
    }

    public String removeFrom(CharSequence charsequence)
    {
        return charsequence.toString();
    }

    void setBits(okupTable okuptable)
    {
    }

    public String trimFrom(CharSequence charsequence)
    {
        return charsequence.toString();
    }

    okupTable()
    {
    }
}
