// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;


// Referenced classes of package com.google.android.gms.common.internal:
//            CharMatcher

static final class it> extends CharMatcher
{

    final char val$endInclusive;
    final char val$startInclusive;

    public final boolean matches(char c)
    {
        return val$startInclusive <= c && c <= val$endInclusive;
    }

    (char c, char c1)
    {
        val$startInclusive = c;
        val$endInclusive = c1;
        super();
    }
}
