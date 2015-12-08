// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.d.a;

import com.google.b.b.b;
import com.google.b.b.b.a;
import com.google.b.b.b.e;
import com.google.b.d;
import com.google.b.h;
import java.util.Map;

// Referenced classes of package com.google.b.d.a:
//            a, b

public final class c
{

    private final com.google.b.b.b.c a;

    public c()
    {
        a = new com.google.b.b.b.c(a.h);
    }

    private void a(byte abyte0[], int i, int j, int k, int l)
    {
        boolean flag = false;
        int k1 = j + k;
        int ai[];
        int i1;
        if (l == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 2;
        }
        ai = new int[k1 / i1];
        for (int j1 = 0; j1 < k1; j1++)
        {
            if (l == 0 || j1 % 2 == l - 1)
            {
                ai[j1 / i1] = abyte0[j1 + i] & 0xff;
            }
        }

        try
        {
            a.a(ai, k / i1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw d.a();
        }
        for (k = ((flag) ? 1 : 0); k < j; k++)
        {
            if (l == 0 || k % 2 == l - 1)
            {
                abyte0[k + i] = (byte)ai[k / i1];
            }
        }

    }

    public com.google.b.b.e a(b b1, Map map)
    {
        int i;
        map = (new com.google.b.d.a.a(b1)).a();
        a(((byte []) (map)), 0, 10, 10, 0);
        i = map[0] & 0xf;
        i;
        JVM INSTR tableswitch 2 5: default 60
    //                   2 64
    //                   3 64
    //                   4 64
    //                   5 122;
           goto _L1 _L2 _L2 _L2 _L3
_L1:
        throw h.a();
_L2:
        a(((byte []) (map)), 20, 84, 40, 1);
        a(((byte []) (map)), 20, 84, 40, 2);
        b1 = new byte[94];
_L5:
        System.arraycopy(map, 0, b1, 0, 10);
        System.arraycopy(map, 20, b1, 10, b1.length - 10);
        return com.google.b.d.a.b.a(b1, i);
_L3:
        a(((byte []) (map)), 20, 68, 56, 1);
        a(((byte []) (map)), 20, 68, 56, 2);
        b1 = new byte[78];
        if (true) goto _L5; else goto _L4
_L4:
    }
}
