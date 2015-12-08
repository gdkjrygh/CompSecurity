// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;


// Referenced classes of package com.google.inject.internal.util:
//            $Preconditions

final class $Hashing
{

    private static final int CUTOFF = 0x20000000;
    private static final int MAX_TABLE_SIZE = 0x40000000;

    private $Hashing()
    {
    }

    static int chooseTableSize(int i)
    {
        if (i < 0x20000000)
        {
            return Integer.highestOneBit(i) << 2;
        }
        boolean flag;
        if (i < 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $Preconditions.checkArgument(flag, "collection too large");
        return 0x40000000;
    }

    static int smear(int i)
    {
        i ^= i >>> 20 ^ i >>> 12;
        return i >>> 7 ^ i ^ i >>> 4;
    }
}
