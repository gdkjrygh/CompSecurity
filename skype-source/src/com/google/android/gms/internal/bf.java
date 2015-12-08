// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.ads.internal.g;
import com.google.android.gms.b.c;
import com.google.android.gms.b.d;

public final class bf extends bh.a
{

    private final g a;
    private final String b;
    private final String c;

    public bf(g g1, String s, String s1)
    {
        a = g1;
        b = s;
        c = s1;
    }

    public final String a()
    {
        return b;
    }

    public final void a(c c1)
    {
        if (c1 == null)
        {
            return;
        } else
        {
            a.b((View)com.google.android.gms.b.d.a(c1));
            return;
        }
    }

    public final String b()
    {
        return c;
    }

    public final void c()
    {
        a.x();
    }

    public final void d()
    {
        a.q();
    }
}
