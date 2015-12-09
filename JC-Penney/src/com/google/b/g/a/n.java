// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.g.a;

import com.google.b.b.b;
import com.google.b.b.b.a;
import com.google.b.b.b.c;
import com.google.b.b.b.e;
import com.google.b.d;
import com.google.b.h;
import java.util.Map;

// Referenced classes of package com.google.b.g.a:
//            a, p, b, m, 
//            r

public final class n
{

    private final c a;

    public n()
    {
        a = new c(a.e);
    }

    private com.google.b.b.e a(com.google.b.g.a.a a1, Map map)
    {
        s s = a1.b();
        o o = a1.a().a();
        a1 = com.google.b.g.a.b.a(a1.c(), s, o);
        int k = a1.length;
        int i = 0;
        int j = 0;
        for (; i < k; i++)
        {
            j += a1[i].a();
        }

        byte abyte0[] = new byte[j];
        int i1 = a1.length;
        j = 0;
        i = 0;
        for (; j < i1; j++)
        {
            com.google.b.g.a.b b1 = a1[j];
            byte abyte1[] = b1.b();
            int j1 = b1.a();
            a(abyte1, j1);
            for (int l = 0; l < j1;)
            {
                abyte0[i] = abyte1[l];
                l++;
                i++;
            }

        }

        return com.google.b.g.a.m.a(abyte0, s, o, map);
    }

    private void a(byte abyte0[], int i)
    {
        boolean flag = false;
        int l = abyte0.length;
        int ai[] = new int[l];
        for (int j = 0; j < l; j++)
        {
            ai[j] = abyte0[j] & 0xff;
        }

        int k = abyte0.length;
        try
        {
            a.a(ai, k - i);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw d.a();
        }
        for (k = ((flag) ? 1 : 0); k < i; k++)
        {
            abyte0[k] = (byte)ai[k];
        }

    }

    public com.google.b.b.e a(b b1, Map map)
    {
        com.google.b.g.a.a a1 = new com.google.b.g.a.a(b1);
        b1 = a(a1, map);
        return b1;
        h h1;
        h1;
        b1 = null;
_L1:
        a1.d();
        a1.a(true);
        a1.b();
        a1.a();
        a1.e();
        map = a(a1, map);
        map.a(new r(true));
        return map;
        map;
_L2:
        if (h1 != null)
        {
            throw h1;
        }
        break MISSING_BLOCK_LABEL_86;
        b1;
        h1 = null;
          goto _L1
        if (b1 != null)
        {
            throw b1;
        } else
        {
            throw map;
        }
        map;
          goto _L2
    }
}
