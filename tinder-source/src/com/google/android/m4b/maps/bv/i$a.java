// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ac.c;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            i

static final class d
{

    int a;
    int b;
    int c;
    private int d;

    private static void a(int j, a a1, int k)
    {
        if (j > 0)
        {
            a1.a(k, j);
        }
    }

    final void a(a a1)
    {
        if (a())
        {
            return;
        } else
        {
            a1 = com.google.android.m4b.maps.ac.c.c(a1, 4);
            a(d, a1, 1);
            a(a, a1, 2);
            a(b, a1, 3);
            a(c, a1, 4);
            return;
        }
    }

    final boolean a()
    {
        return a <= 0 && b <= 0 && c <= 0;
    }

    (int j)
    {
        d = j;
    }
}
