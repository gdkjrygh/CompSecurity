// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.emoji;

import android.content.res.Resources;
import com.facebook.common.w.j;

// Referenced classes of package com.facebook.orca.emoji:
//            af, ag

public class ae
{

    private final Resources a;
    private final af b;

    public ae(Resources resources, af af1)
    {
        a = resources;
        b = af1;
    }

    public ag a(int i, int k, boolean flag)
    {
        int i2 = j.a(a, b.d());
        int l1 = j.a(a, b.f());
        int k2 = j.a(a, b.e());
        int l2 = j.a(a, b.g());
        int l = j.a(a, b.c());
        int i3 = j.a(a, b.h());
        int j2 = k - i3;
        k = i / l;
        int i1 = k;
        if (k > b.a())
        {
            i1 = Math.max(b.a(), k - 2);
        }
        k = j2 / l;
        int j1;
        int k1;
        if (k <= 0)
        {
            k = (int)Math.ceil((double)j2 / (double)l);
        }
        j1 = k;
        if (!flag)
        {
            j1 = k;
            if (k > b.b())
            {
                j1 = b.b();
            }
        }
        k1 = i / i1;
        if (k1 > l)
        {
            k = k1 - l;
            i = i2 + (k / 2 + k % 2);
            k = l1 + k / 2;
        } else
        {
            k1 = l;
            i = i2;
            k = l1;
        }
        j2 /= j1;
        if (j2 > l)
        {
            i2 = j2 - l;
            l1 = i2 / 2 + i2 % 2 + k2;
            i2 = i2 / 2 + l2;
        } else
        {
            i2 = l2;
            l1 = k2;
            j2 = l;
        }
        return new ag(i1, j1, i, k, l1, i2, k2, l2, k1, j2, l, j1 * k1 + i3);
    }
}
