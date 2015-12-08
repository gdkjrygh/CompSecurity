// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            Splitter, CharMatcher

private static abstract class toSplit extends toSplit
{

    int limit;
    int offset;
    final boolean omitEmptyStrings;
    final CharSequence toSplit;
    final CharMatcher trimmer;

    protected volatile Object computeNext()
    {
        return computeNext();
    }

    protected String computeNext()
    {
        while (offset != -1) 
        {
            int l = offset;
            int k = separatorStart(offset);
            int i;
            if (k == -1)
            {
                i = toSplit.length();
                offset = -1;
            } else
            {
                i = k;
                offset = separatorEnd(k);
            }
            do
            {
                k = i;
                if (l >= i)
                {
                    break;
                }
                k = i;
                if (!trimmer.matches(toSplit.charAt(l)))
                {
                    break;
                }
                l++;
            } while (true);
            for (; k > l && trimmer.matches(toSplit.charAt(k - 1)); k--) { }
            if (!omitEmptyStrings || l != k)
            {
                if (limit == 1)
                {
                    int j = toSplit.length();
                    offset = -1;
                    do
                    {
                        k = j;
                        if (j <= l)
                        {
                            break;
                        }
                        k = j;
                        if (!trimmer.matches(toSplit.charAt(j - 1)))
                        {
                            break;
                        }
                        j--;
                    } while (true);
                } else
                {
                    limit = limit - 1;
                }
                return toSplit.subSequence(l, k).toString();
            }
        }
        return (String)endOfData();
    }

    abstract int separatorEnd(int i);

    abstract int separatorStart(int i);

    protected (Splitter splitter, CharSequence charsequence)
    {
        super(null);
        offset = 0;
        trimmer = Splitter.access$200(splitter);
        omitEmptyStrings = Splitter.access$300(splitter);
        limit = Splitter.access$400(splitter);
        toSplit = charsequence;
    }
}
