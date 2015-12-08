// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bq;

import com.google.android.m4b.maps.bd.d;
import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.ah;

// Referenced classes of package com.google.android.m4b.maps.bq:
//            b

public static final class g
    implements g
{

    final ac a;
    final d b;
    final boolean c;
    final a d;
    final boolean e;
    final boolean f;
    final boolean g;
    final ah h;
    int i;
    volatile boolean j;
    a k;

    static void a(g g1, int l, aa aa)
    {
        g1.b.a(g1.a, l, aa);
    }

    public final void a()
    {
        j = true;
    }

    final void a(j j1)
    {
        j1.k = k;
        k = j1;
    }

    public final String toString()
    {
        String s = String.valueOf(h);
        String s1 = String.valueOf(a);
        return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append("/").append(s1).toString();
    }

    protected (ah ah, ac ac, d d1)
    {
        this(ah, ac, d1, b, false, false, -1, false);
    }

    protected b(ah ah, ac ac, d d1, byte byte0)
    {
        this(ah, ac, d1, b, false, true, -1, false);
    }

    protected b(ah ah, ac ac, d d1, b b1, boolean flag, boolean flag1, int l, 
            boolean flag2)
    {
        boolean flag3 = false;
        super();
        j = false;
        k = null;
        h = ah;
        a = ac;
        b = d1;
        d = b1;
        if (b1.equals(e) || b1.equals(com.google.android.m4b.maps.bq.d))
        {
            flag3 = true;
        }
        c = flag3;
        e = flag;
        i = l;
        f = flag1;
        g = flag2;
    }
}
