// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;


// Referenced classes of package com.google.android.gms.common.internal:
//            CharMatcher

static final class it> extends CharMatcher
{

    final char val$match1;
    final char val$match2;

    public final boolean matches(char c)
    {
        return c == val$match1 || c == val$match2;
    }

    (char c, char c1)
    {
        val$match1 = c;
        val$match2 = c1;
        super();
    }
}
