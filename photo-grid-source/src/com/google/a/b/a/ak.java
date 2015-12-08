// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.ag;
import com.google.a.am;
import com.google.a.d.a;
import com.google.a.d.e;
import com.google.a.d.f;
import java.util.BitSet;

// Referenced classes of package com.google.a.b.a:
//            az

final class ak extends am
{

    ak()
    {
    }

    private static BitSet b(a a1)
    {
        e e1;
        BitSet bitset;
        int i;
        if (a1.f() == e.i)
        {
            a1.j();
            return null;
        }
        bitset = new BitSet();
        a1.a();
        e1 = a1.f();
        i = 0;
_L2:
        boolean flag;
        if (e1 == e.b)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        switch (com.google.a.b.a.az.a[e1.ordinal()])
        {
        default:
            throw new ag((new StringBuilder("Invalid bitset value type: ")).append(e1).toString());

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
        e1 = a1.f();
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
            throw new ag((new StringBuilder("Error: Expecting: bitset number value (1, 0), Found: ")).append(s).toString());
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

    public final void a(f f1, Object obj)
    {
        obj = (BitSet)obj;
        if (obj == null)
        {
            f1.f();
            return;
        }
        f1.b();
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
            f1.a(j);
            i++;
        }
        f1.c();
    }
}
