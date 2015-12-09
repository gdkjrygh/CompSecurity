// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            CharMatcher, Preconditions

static final class heckNotNull extends CharMatcher
{

    final CharMatcher first;
    final CharMatcher second;

    public final volatile boolean apply(Object obj)
    {
        return super.apply((Character)obj);
    }

    public final boolean matches(char c)
    {
        return first.matches(c) || second.matches(c);
    }

    final CharMatcher withToString(String s)
    {
        return new <init>(first, second, s);
    }

    (CharMatcher charmatcher, CharMatcher charmatcher1)
    {
        this(charmatcher, charmatcher1, (new StringBuilder("CharMatcher.or(")).append(charmatcher).append(", ").append(charmatcher1).append(")").toString());
    }

    private <init>(CharMatcher charmatcher, CharMatcher charmatcher1, String s)
    {
        super(s);
        first = (CharMatcher)Preconditions.checkNotNull(charmatcher);
        second = (CharMatcher)Preconditions.checkNotNull(charmatcher1);
    }
}
