// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            Hashing

final class RegularImmutableSet extends ImmutableSet.ArrayImmutableSet
{

    private final transient int hashCode;
    private final transient int mask;
    final transient Object table[];

    RegularImmutableSet(Object aobj[], int i, Object aobj1[], int j)
    {
        super(aobj);
        table = aobj1;
        mask = j;
        hashCode = i;
    }

    public boolean contains(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i = Hashing.smear(obj.hashCode());
        do
        {
            Object obj1 = table[mask & i];
            if (obj1 == null)
            {
                continue;
            }
            if (obj1.equals(obj))
            {
                return true;
            }
            i++;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public int hashCode()
    {
        return hashCode;
    }

    boolean isHashCodeFast()
    {
        return true;
    }
}
