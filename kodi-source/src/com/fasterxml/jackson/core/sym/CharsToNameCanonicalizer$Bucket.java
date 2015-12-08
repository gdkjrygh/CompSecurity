// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.sym;


// Referenced classes of package com.fasterxml.jackson.core.sym:
//            CharsToNameCanonicalizer

static final class length
{

    public final int length;
    public final symbol next;
    public final String symbol;

    public String has(char ac[], int i, int j)
    {
        if (symbol.length() == j) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        int k = 0;
        int l;
        do
        {
            if (symbol.charAt(k) != ac[i + k])
            {
                continue; /* Loop/switch isn't completed */
            }
            l = k + 1;
            k = l;
        } while (l < j);
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        return symbol;
    }

    public (String s,  )
    {
        symbol = s;
        next = ;
        int i;
        if ( == null)
        {
            i = 1;
        } else
        {
            i = .length + 1;
        }
        length = i;
    }
}
