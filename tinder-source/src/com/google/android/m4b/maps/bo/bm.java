// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ak.a;
import java.io.DataInput;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            bb, ae, k, w, 
//            am, bk, d, bn, 
//            o, t

public class bm
    implements bb
{

    public final a a;
    public final k b;
    public final bk c[];
    public final t d;
    public final float e;
    public final boolean f;
    public final int g[];
    private final int h;
    private final String i;
    private final int j;
    private final String k;
    private final int l;
    private final int m;

    public bm(int i1, a a1, k k1, bk abk[], t t, int j1, String s, 
            int l1, float f1, int i2, int ai[])
    {
        this(i1, a1, k1, abk, t, j1, s, l1, f1, i2, ai, false);
    }

    public bm(int i1, a a1, k k1, bk abk[], t t, int j1, String s, 
            int l1, float f1, int i2, int ai[], boolean flag)
    {
        h = i1;
        a = a1;
        b = k1;
        c = abk;
        i = null;
        d = t;
        j = j1;
        k = s;
        l = l1;
        e = f1;
        m = i2;
        g = ai;
        f = flag;
    }

    public static bm a(DataInput datainput, ae ae1, o o1)
    {
        return a(datainput, ae1, o1, false);
    }

    protected static bm a(DataInput datainput, ae ae1, o o1, boolean flag)
    {
        float f1;
        k k1;
        w w1;
        bk abk[];
        boolean flag1;
        int l1;
        int i2;
        flag1 = false;
        k1 = com.google.android.m4b.maps.bo.k.a(datainput, ae1.b);
        w1 = com.google.android.m4b.maps.bo.w.a(datainput, ae1);
        l1 = com.google.android.m4b.maps.bo.am.a(datainput);
        abk = new bk[l1];
        for (int i1 = 0; i1 < l1; i1++)
        {
            abk[i1] = com.google.android.m4b.maps.bo.bk.a(datainput, ae1, w1);
        }

        l1 = datainput.readByte();
        f1 = (float)datainput.readByte() / 4F;
        i2 = datainput.readInt();
        ae1 = null;
        if (!com.google.android.m4b.maps.bo.d.a(1, i2)) goto _L2; else goto _L1
_L1:
        ae1 = com.google.android.m4b.maps.ak.a.a(datainput);
_L4:
        int ai[];
        int j2 = com.google.android.m4b.maps.bo.am.a(datainput);
        ai = new int[j2];
        for (int j1 = ((flag1) ? 1 : 0); j1 < j2; j1++)
        {
            ai[j1] = com.google.android.m4b.maps.bo.am.a(datainput);
        }

        break; /* Loop/switch isn't completed */
_L2:
        if (com.google.android.m4b.maps.bo.d.a(2, i2))
        {
            ae1 = com.google.android.m4b.maps.ak.a.b(datainput);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (flag)
        {
            return new bn(o1.a, ae1, k1, abk, w1.a, w1.c, w1.b, l1, f1, i2, ai);
        } else
        {
            return new bm(o1.a, ae1, k1, abk, w1.a, w1.c, w1.b, l1, f1, i2, ai);
        }
    }

    public int a()
    {
        return 8;
    }

    public final a b()
    {
        return a;
    }

    public final t d()
    {
        return d;
    }

    public final int e()
    {
        return l;
    }

    public final int[] f()
    {
        return g;
    }

    public final int g()
    {
        int k1 = 0;
        int i1 = 0;
        int l1 = b.f();
        if (c != null)
        {
            bk abk[] = c;
            int i2 = abk.length;
            int j1 = 0;
            do
            {
                k1 = i1;
                if (j1 >= i2)
                {
                    break;
                }
                k1 = abk[j1].b();
                j1++;
                i1 = k1 + i1;
            } while (true);
        }
        return k1 + (com.google.android.m4b.maps.bo.d.a(a) + 60 + com.google.android.m4b.maps.bo.d.a(k) + com.google.android.m4b.maps.bo.d.a(d)) + l1;
    }
}
