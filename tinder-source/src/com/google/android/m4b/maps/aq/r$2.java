// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aq;

import android.content.res.Resources;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bs.e;
import com.google.android.m4b.maps.bw.g;
import com.google.android.m4b.maps.bx.b;
import com.google.android.m4b.maps.bx.l;

// Referenced classes of package com.google.android.m4b.maps.aq:
//            r, g

final class d
    implements d
{

    private e a;
    private g b;
    private String c;
    private com.google.android.m4b.maps.aq.g d;

    public final b a(Resources resources)
    {
        return (b)l.a(resources, d.a, a, b);
    }

    public final l a(ah ah1, Resources resources)
    {
        return l.c(ah1, resources, a, b);
    }

    public final l a(l l1, Resources resources)
    {
        l1 = l.a(l1.o, ah.a, resources, a, b);
        r.a(l1, c);
        return l1;
    }

    public final l b(Resources resources)
    {
        resources = l.a(resources, ah.f, a, b);
        r.a(resources, c);
        return resources;
    }

    public final l b(ah ah1, Resources resources)
    {
        ah1 = l.a(ah1, resources, a, b);
        r.a(ah1, c);
        return ah1;
    }

    public final l c(ah ah1, Resources resources)
    {
        return l.b(ah1, resources, a, b);
    }

    (e e, g g1, String s, com.google.android.m4b.maps.aq.g g2)
    {
        a = e;
        b = g1;
        c = s;
        d = g2;
        super();
    }
}
