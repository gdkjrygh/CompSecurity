// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ak.a;
import java.io.DataInput;
import java.io.IOException;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            bb, ae, ak, am, 
//            g, w, d, o, 
//            t

public final class av
    implements bb
{

    private static final byte n[] = {
        1, 2, 4
    };
    private static final int o[] = {
        0, 1, 1, 2, 1, 2, 2, 3
    };
    public final a a;
    public final ak b;
    public final t c;
    public final int d;
    public final int e;
    public final int f;
    private final int g;
    private final ak h;
    private final byte i[];
    private final int j;
    private final String k;
    private final int l;
    private final int m[];

    private av(int i1, a a1, ak ak1, ak ak2, byte abyte0[], int j1, int k1, 
            t t, int l1, String s, int i2, int j2, int ai[])
    {
        g = i1;
        a = a1;
        b = ak1;
        h = ak2;
        i = abyte0;
        d = j1;
        e = k1;
        c = t;
        j = l1;
        k = s;
        l = i2;
        f = j2;
        m = ai;
    }

    public static av a(DataInput datainput, ae ae1, o o1)
    {
        ak ak1;
        ak ak2;
        int ai1[];
        w w1;
        int ai2[];
        int l1;
        int i2;
        byte byte0;
        int j2;
        ak1 = com.google.android.m4b.maps.bo.ak.a(datainput, ae1.b);
        l1 = com.google.android.m4b.maps.bo.am.a(datainput);
        if (l1 % 3 != 0)
        {
            throw new IOException((new StringBuilder(44)).append("Malformed TriangleList, ").append(l1).append(" vertices").toString());
        }
        int ai[] = new int[l1 * 3];
        ac ac = ae1.b;
        for (int i1 = 0; i1 < l1; i1++)
        {
            com.google.android.m4b.maps.bo.g.b(datainput, ac, ai, i1);
        }

        l1 = com.google.android.m4b.maps.bo.am.a(datainput);
        ai1 = new int[l1];
        for (int j1 = 0; j1 < l1; j1++)
        {
            ai1[j1] = com.google.android.m4b.maps.bo.am.a(datainput);
        }

        ak2 = new ak(ai, ai1);
        int k1;
        int k2;
        if (ak2.a() != 0)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (k1 != 0)
        {
            k1 = ak2.a();
        } else
        {
            k1 = ak1.a();
        }
        ai1 = new byte[k1];
        datainput.readFully(ai1);
        l1 = com.google.android.m4b.maps.bo.am.a(datainput);
        i2 = com.google.android.m4b.maps.bo.am.a(datainput);
        w1 = com.google.android.m4b.maps.bo.w.a(datainput, ae1);
        byte0 = datainput.readByte();
        j2 = datainput.readInt();
        ae1 = null;
        if (!com.google.android.m4b.maps.bo.d.a(1, j2)) goto _L2; else goto _L1
_L1:
        ae1 = com.google.android.m4b.maps.ak.a.a(datainput);
_L4:
        k2 = com.google.android.m4b.maps.bo.am.a(datainput);
        ai2 = new int[k2];
        for (k1 = 0; k1 < k2; k1++)
        {
            ai2[k1] = com.google.android.m4b.maps.bo.am.a(datainput);
        }

        break; /* Loop/switch isn't completed */
_L2:
        if (com.google.android.m4b.maps.bo.d.a(2, j2))
        {
            ae1 = com.google.android.m4b.maps.ak.a.b(datainput);
        }
        if (true) goto _L4; else goto _L3
_L3:
        return new av(o1.a, ae1, ak1, ak2, ai1, l1, i2, w1.a, w1.c, w1.b, byte0, j2, ai2);
    }

    public final int a()
    {
        return 4;
    }

    public final boolean a(int i1, int j1)
    {
        return (i[i1] & n[j1]) != 0;
    }

    public final a b()
    {
        return a;
    }

    public final int c()
    {
        int i1 = 0;
        int j1 = 0;
        for (; i1 < i.length; i1++)
        {
            j1 += o[i[i1] & 7];
        }

        return j1;
    }

    public final t d()
    {
        return c;
    }

    public final int e()
    {
        return l;
    }

    public final int[] f()
    {
        return m;
    }

    public final int g()
    {
        int j1 = b.b();
        int k1 = i.length;
        int i1;
        if (h == null)
        {
            i1 = 0;
        } else
        {
            i1 = h.b();
        }
        return i1 + com.google.android.m4b.maps.bo.d.a(a) + com.google.android.m4b.maps.bo.d.a(k) + com.google.android.m4b.maps.bo.d.a(c) + (k1 + (j1 + 68));
    }

}
