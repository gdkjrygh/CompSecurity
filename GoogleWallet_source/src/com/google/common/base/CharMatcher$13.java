// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            CharMatcher

static final class tMatcher extends tMatcher
{

    final char val$endInclusive;
    final char val$startInclusive;

    public final boolean matches(char c)
    {
        return val$startInclusive <= c && c <= val$endInclusive;
    }

    tMatcher(String s, char c, char c1)
    {
        val$startInclusive = c;
        val$endInclusive = c1;
        super(s);
    }
}
