// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            CharMatcher

static final class tMatcher extends tMatcher
{

    final char val$match1;
    final char val$match2;

    public final boolean matches(char c)
    {
        return c == val$match1 || c == val$match2;
    }

    tMatcher(String s, char c, char c1)
    {
        val$match1 = c;
        val$match2 = c1;
        super(s);
    }
}
