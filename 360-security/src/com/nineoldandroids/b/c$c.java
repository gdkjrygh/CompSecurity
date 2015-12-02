// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.b;

import java.util.ArrayList;

// Referenced classes of package com.nineoldandroids.b:
//            c

private static class b
{

    int a;
    ArrayList b;

    boolean a(int i)
    {
        if ((a & i) == 0 || b == null) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        k = b.size();
        j = 0;
_L5:
        if (j < k) goto _L3; else goto _L2
_L2:
        return false;
_L3:
        if (((b)b.get(j)).a == i)
        {
            b.remove(j);
            a = a & ~i;
            return true;
        }
        j++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    (int i, ArrayList arraylist)
    {
        a = i;
        b = arraylist;
    }
}
