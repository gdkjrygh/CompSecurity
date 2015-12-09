// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.af;
import com.google.b.d.a;
import com.google.b.d.c;
import com.google.b.d.d;
import java.util.BitSet;

// Referenced classes of package com.google.b.b.a:
//            ba

final class al extends com.google.b.al
{

    al()
    {
    }

    private static BitSet b(a a1)
    {
        c c1;
        BitSet bitset;
        int i;
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        }
        bitset = new BitSet();
        a1.a();
        c1 = a1.f();
        i = 0;
_L2:
        boolean flag;
        if (c1 == c.b)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        switch (com.google.b.b.a.ba.a[c1.ordinal()])
        {
        default:
            throw new af((new StringBuilder("Invalid bitset value type: ")).append(c1).toString());

        case 2: // '\002'
            break; /* Loop/switch isn't completed */

        case 3: // '\003'
            break MISSING_BLOCK_LABEL_147;

        case 1: // '\001'
            if (a1.m() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            break;
        }
_L3:
        if (flag)
        {
            bitset.set(i);
        }
        i++;
        c1 = a1.f();
        if (true) goto _L2; else goto _L1
_L1:
        flag = a1.i();
          goto _L3
        String s = a1.h();
        int j;
        try
        {
            j = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new af((new StringBuilder("Error: Expecting: bitset number value (1, 0), Found: ")).append(s).toString());
        }
        if (j != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L3
        a1.b();
        return bitset;
    }

    public final Object a(a a1)
    {
        return b(a1);
    }

    public final void a(d d1, Object obj)
    {
        obj = (BitSet)obj;
        if (obj == null)
        {
            d1.f();
            return;
        }
        d1.b();
        int i = 0;
        while (i < ((BitSet) (obj)).length()) 
        {
            int j;
            if (((BitSet) (obj)).get(i))
            {
                j = 1;
            } else
            {
                j = 0;
            }
            d1.a(j);
            i++;
        }
        d1.c();
    }
}
