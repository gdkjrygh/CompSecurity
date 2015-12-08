// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.ax.a;
import com.google.android.m4b.maps.ax.e;
import com.google.android.m4b.maps.ax.f;
import com.google.android.m4b.maps.ax.h;
import com.google.android.m4b.maps.az.c;
import com.google.android.m4b.maps.az.i;
import com.google.android.m4b.maps.bo.ag;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bq.d;
import com.google.android.m4b.maps.bw.g;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            b

static final class e
    implements h
{

    private final h a;
    private final int b;
    private d c;
    private c d;
    private final i e;

    public final e a(ah ah, boolean flag, ag ag, g g)
    {
        return new e(ah, ag, g);
    }

    public final f a(ah ah, int j, boolean flag, ag ag, g g)
    {
        ah = a.a(ah, j, flag, ag, g);
        if (c == null)
        {
            c = com.google.android.m4b.maps.bq.d.a();
        }
        if (d == null)
        {
            d = e.f;
        }
        return new a(ah, d, c, b, e);
    }

    public (h h1, int j, i k)
    {
        a = h1;
        b = j;
        e = k;
    }
}
