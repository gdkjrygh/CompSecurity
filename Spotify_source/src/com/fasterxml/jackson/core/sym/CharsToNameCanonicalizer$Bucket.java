// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.sym;


final class length
{

    public final int length;
    public final symbol next;
    public final String symbol;

    public final String has(char ac[], int i, int j)
    {
        if (symbol.length() != j)
        {
            return null;
        }
        int k = 0;
        int l;
        do
        {
            if (symbol.charAt(k) != ac[i + k])
            {
                return null;
            }
            l = k + 1;
            k = l;
        } while (l < j);
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
