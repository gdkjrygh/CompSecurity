// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.succinct;


// Referenced classes of package com.google.android.apps.translatedecoder.succinct:
//            b, TrieNodeList

public final class a
{

    public static int a(TrieNodeList trienodelist, int i, int j, int k)
    {
        b b1 = new b((byte)0);
        for (j--; i <= j;)
        {
            int l = (i + j) / 2;
            trienodelist.fill(l, b1);
            int i1 = b1.a;
            if (k == i1)
            {
                return l;
            }
            if (k > i1)
            {
                i = l + 1;
            } else
            {
                j = l - 1;
            }
        }

        return -1;
    }
}
