// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.internal:
//            CharMatcher

static final class it> extends CharMatcher
{

    final char val$chars[];

    public final boolean matches(char c)
    {
        return Arrays.binarySearch(val$chars, c) >= 0;
    }

    (char ac[])
    {
        val$chars = ac;
        super();
    }
}
