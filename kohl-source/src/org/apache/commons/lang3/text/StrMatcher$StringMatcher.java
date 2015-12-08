// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.text;


// Referenced classes of package org.apache.commons.lang3.text:
//            StrMatcher

static final class chars extends StrMatcher
{

    private final char chars[];

    public int isMatch(char ac[], int i, int j, int k)
    {
        int l = chars.length;
        if (i + l <= k) goto _L2; else goto _L1
_L1:
        k = 0;
_L4:
        return k;
_L2:
        j = 0;
        do
        {
            k = l;
            if (j >= chars.length)
            {
                continue;
            }
            if (chars[j] != ac[i])
            {
                return 0;
            }
            j++;
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    (String s)
    {
        chars = s.toCharArray();
    }
}
