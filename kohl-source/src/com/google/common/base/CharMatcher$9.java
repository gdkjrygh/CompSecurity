// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            CharMatcher

static final class nit> extends CharMatcher
{

    final char val$match;

    public CharMatcher and(CharMatcher charmatcher)
    {
        CharMatcher charmatcher1 = charmatcher;
        if (charmatcher.matches(val$match))
        {
            charmatcher1 = super.and(charmatcher);
        }
        return charmatcher1;
    }

    public volatile boolean apply(Object obj)
    {
        return super.apply((Character)obj);
    }

    public boolean matches(char c)
    {
        return c != val$match;
    }

    public CharMatcher negate()
    {
        return is(val$match);
    }

    public CharMatcher or(CharMatcher charmatcher)
    {
        Object obj = this;
        if (charmatcher.matches(val$match))
        {
            obj = ANY;
        }
        return ((CharMatcher) (obj));
    }

    (char c)
    {
        val$match = c;
        super();
    }
}
