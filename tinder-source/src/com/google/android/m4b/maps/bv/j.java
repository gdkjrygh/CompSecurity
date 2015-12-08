// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import com.google.android.m4b.maps.ay.m;
import com.google.android.m4b.maps.cg.ay;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            i

public final class j
{

    float a;
    boolean b;
    String c;
    int d;
    float e;
    float f;
    float g;
    float h;
    boolean i;
    private i j;
    private final m k;

    public j(m m)
    {
        a = -1F;
        b = false;
        c = "";
        k = m;
        j = new i(m);
    }

    final void a(int l, int i1, int j1)
    {
        while (b || j.a(d, l, i1, j1)) 
        {
            return;
        }
        j = new i(k);
        j.a(d, l, i1, j1);
    }

    final void a(ay ay1)
    {
        boolean flag;
        if (ay1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = flag;
        if (i)
        {
            e = ay1.a;
            f = ay1.b();
            g = ay1.c;
            h = ay1.c();
        }
    }
}
