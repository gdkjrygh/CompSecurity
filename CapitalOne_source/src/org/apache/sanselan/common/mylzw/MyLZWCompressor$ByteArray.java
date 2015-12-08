// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.common.mylzw;


final class 
{

    private final byte a[];
    private final int b;
    private final int c;
    private final int d;

    public final boolean equals(Object obj)
    {
        obj = ()obj;
        break MISSING_BLOCK_LABEL_5;
_L2:
        do
        {
            return false;
        } while ((() (obj)).d != d || ((d) (obj)).c != c);
        int i = 0;
        do
        {
            if (i >= c)
            {
                return true;
            }
            if (((c) (obj)).a[((a) (obj)).b + i] != a[b + i])
            {
                continue;
            }
            i++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final int hashCode()
    {
        return d;
    }
}
