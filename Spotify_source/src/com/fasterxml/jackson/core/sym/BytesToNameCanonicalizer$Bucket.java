// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.sym;


// Referenced classes of package com.fasterxml.jackson.core.sym:
//            Name

final class hash
{

    public final int hash;
    public final int length;
    public final Name name;
    public final next next;

    public final Name find(int i, int j, int k)
    {
        if (hash != i || !name.equals(j, k)) goto _L2; else goto _L1
_L1:
        Name name1 = name;
_L6:
        return name1;
_L2:
        hash hash1 = next;
_L7:
        if (hash1 == null) goto _L4; else goto _L3
_L3:
        Name name2;
        if (hash1.hash != i)
        {
            continue; /* Loop/switch isn't completed */
        }
        name2 = hash1.name;
        name1 = name2;
        if (name2.equals(j, k)) goto _L6; else goto _L5
_L5:
        hash1 = hash1.next;
          goto _L7
_L4:
        return null;
    }

    public final Name find(int i, int ai[], int j)
    {
        if (hash != i || !name.equals(ai, j)) goto _L2; else goto _L1
_L1:
        Name name1 = name;
_L6:
        return name1;
_L2:
        next next1 = next;
_L7:
        if (next1 == null) goto _L4; else goto _L3
_L3:
        Name name2;
        if (next1.hash != i)
        {
            continue; /* Loop/switch isn't completed */
        }
        name2 = next1.name;
        name1 = name2;
        if (name2.equals(ai, j)) goto _L6; else goto _L5
_L5:
        next1 = next1.next;
          goto _L7
_L4:
        return null;
    }

    (Name name1,  )
    {
        name = name1;
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
        hash = name1.hashCode();
    }
}
