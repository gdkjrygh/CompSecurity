// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.text;

import java.util.Arrays;

// Referenced classes of package org.apache.commons.lang3.text:
//            StrMatcher

static final class chars extends StrMatcher
{

    private final char chars[];

    public int isMatch(char ac[], int i, int j, int k)
    {
        return Arrays.binarySearch(chars, ac[i]) < 0 ? 0 : 1;
    }

    (char ac[])
    {
        chars = (char[])ac.clone();
        Arrays.sort(chars);
    }
}
