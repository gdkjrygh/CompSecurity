// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;


// Referenced classes of package com.google.android.m4b.maps.bx:
//            ar

public static final class f
{

    final int a;
    final int b;
    final int c;
    final int d;
    final int e;
    final int f;
    boolean g;
    private int h[];

    final int[] a()
    {
        if (h == null)
        {
            if (g)
            {
                h = (new int[] {
                    12324, a, 12323, b, 12322, c, 12321, d, 12325, e, 
                    12326, f, 12352, 4, 12344
                });
            } else
            {
                h = (new int[] {
                    12324, a, 12323, b, 12322, c, 12321, d, 12325, e, 
                    12326, f, 12344
                });
            }
        }
        return h;
    }

    (int i, int j, int k, int l, int i1, int j1)
    {
        h = null;
        g = false;
        a = i;
        b = j;
        c = k;
        d = l;
        e = i1;
        f = j1;
    }

    f(f f1)
    {
        this(f1.a, f1.b, f1.c, f1.d, f1.e, f1.f);
    }
}
