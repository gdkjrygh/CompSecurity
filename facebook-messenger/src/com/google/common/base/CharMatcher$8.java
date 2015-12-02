// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            CharMatcher

final class nit> extends CharMatcher
{

    final char val$match;

    public volatile boolean apply(Object obj)
    {
        return super.apply((Character)obj);
    }

    public boolean matches(char c)
    {
        return c == val$match;
    }

    public CharMatcher negate()
    {
        return isNot(val$match);
    }

    public CharMatcher or(CharMatcher charmatcher)
    {
        if (charmatcher.matches(val$match))
        {
            return charmatcher;
        } else
        {
            return super.or(charmatcher);
        }
    }

    public CharMatcher precomputed()
    {
        return this;
    }

    void setBits(okupTable okuptable)
    {
        okuptable.set(val$match);
    }

    okupTable()
    {
        val$match = c;
        super();
    }
}
