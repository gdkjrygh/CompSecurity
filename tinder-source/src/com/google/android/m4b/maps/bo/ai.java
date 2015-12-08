// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ak.a;
import java.io.DataInput;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            bb, ae, k, w, 
//            am, o, d, t

public final class ai
    implements bb
{

    public final k a;
    public final t b;
    public final int c;
    public final int d;
    private final int e;
    private final int f;
    private final String g;
    private final int h[];

    private ai(int i, k k1, t t, int j, String s, int l, int i1, 
            int ai1[])
    {
        e = i;
        a = k1;
        b = t;
        f = j;
        g = s;
        d = l;
        c = i1;
        h = ai1;
    }

    public static bb a(DataInput datainput, ae ae1, o o1)
    {
        k k1 = com.google.android.m4b.maps.bo.k.a(datainput, ae1.b);
        ae1 = com.google.android.m4b.maps.bo.w.a(datainput, ae1);
        int j = com.google.android.m4b.maps.bo.am.a(datainput);
        int l = datainput.readInt();
        int i1 = com.google.android.m4b.maps.bo.am.a(datainput);
        int ai1[] = new int[i1];
        for (int i = 0; i < i1; i++)
        {
            ai1[i] = com.google.android.m4b.maps.bo.am.a(datainput);
        }

        return new ai(o1.a, k1, ((w) (ae1)).a, ((w) (ae1)).c, ((w) (ae1)).b, j, l, ai1);
    }

    public final int a()
    {
        return 9;
    }

    public final a b()
    {
        return a.a;
    }

    public final t d()
    {
        return b;
    }

    public final int e()
    {
        return 0;
    }

    public final int[] f()
    {
        return h;
    }

    public final int g()
    {
        return a.f() + 44 + com.google.android.m4b.maps.bo.d.a(g) + com.google.android.m4b.maps.bo.d.a(b);
    }
}
